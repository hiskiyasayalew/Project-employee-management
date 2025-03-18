package com.project.book.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;

import com.project.book.Entity.UserEntity;
import com.project.book.Repository.AppealRepo;
import com.project.book.Service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<UserEntity>> getAllUser() {
        List<UserEntity> users = userService.getAllUsers();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // localhost:8080/users/id

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneUser(@PathVariable Long id) {
        UserEntity user = userService.getUserById(id);

        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(Map.of("error", "user by id " + id + " no found"), HttpStatus.NOT_FOUND);
        }
    }

    // @PostMapping("/login")
    // public ResponseEntity<UserEntity> login(@RequestParam String username,
    // @RequestParam String password) {
    // if (username != null && password != null) {
    // UserEntity user = userService.getUserByUserName(username);
    // if (user.getUsername() == username && user.getPassword() == password) {
    // return new ResponseEntity<>(user, HttpStatus.OK);
    // }
    // }

    // return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    // }

    // // Endpoint for user registration
    // @PostMapping("/signup")
    // public ResponseEntity<UserEntity> signup(@RequestBody UserEntity user) {
    // UserEntity createdUser = userService.registerUser(user);
    // return ResponseEntity.ok(createdUser);
    // }

    // // Endpoint for user login
    // @PostMapping("/login")
    // public ResponseEntity<UserEntity> login(@RequestParam String username,
    // @RequestParam String password)
    // throws LoginException {
    // UserEntity loginResponse = userService.loginUser(username, password);

    // if (loginResponse.getUser() != null) {
    // return ResponseEntity.ok(loginResponse);
    // } else {
    // return ResponseEntity.status(401).body(loginResponse); // Unauthorized
    // }
    // }

}
