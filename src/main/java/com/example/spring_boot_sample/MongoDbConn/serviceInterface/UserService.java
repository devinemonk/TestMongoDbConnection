package com.example.spring_boot_sample.MongoDbConn.serviceInterface;

import com.example.spring_boot_sample.MongoDbConn.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> getAllUsers();
    User getUserById(String id);
}
