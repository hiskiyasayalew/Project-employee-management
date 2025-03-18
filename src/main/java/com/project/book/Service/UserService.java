package com.project.book.Service;

import com.project.book.Entity.UserEntity;
import com.project.book.Repository.UserRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // public UserEntity getUserByUserName(String username) {
    // return userRepository.findByUsername(username).orElse(null);
    // }

}
