package com.project.book.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.book.Entity.UserEntity;
import com.project.book.Service.UserService;

import java.util.List;

import javax.security.auth.login.LoginException;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    // Endpoint for user registration
    @PostMapping("/signup")
    public ResponseEntity<UserEntity> signup(@RequestBody UserEntity user) {
        UserEntity createdUser = userService.registerUser(user);
        return ResponseEntity.ok(createdUser);
    }

    // Endpoint for user login
    @PostMapping("/login")
    public ResponseEntity<UserEntity> login(@RequestParam String username, @RequestParam String password)
            throws LoginException {
        UserEntity loginResponse = userService.loginUser(username, password);

        if (loginResponse.getUser() != null) {
            return ResponseEntity.ok(loginResponse);
        } else {
            return ResponseEntity.status(401).body(loginResponse); // Unauthorized
        }
    }

}
