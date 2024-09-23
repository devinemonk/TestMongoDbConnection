package com.example.spring_boot_sample.MongoDbConn.controller;

import com.example.spring_boot_sample.MongoDbConn.dto.UserDTO;
import com.example.spring_boot_sample.MongoDbConn.mapper.UserMapper;
import com.example.spring_boot_sample.MongoDbConn.model.User;
import com.example.spring_boot_sample.MongoDbConn.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private UserMapper userMapper;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userServiceImpl.addUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping
    public ResponseEntity<Object> getUsers() {
        List<User> users = userServiceImpl.getAllUsers();
        return ResponseEntity.ok().body(users);
    }


    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable String id) {
        User user = userServiceImpl.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(userMapper.userToUserDTO(user));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

