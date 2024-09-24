package com.example.spring_boot_sample.MongoDbConn.service;

import com.example.spring_boot_sample.MongoDbConn.exception.UserNotFoundException;
import com.example.spring_boot_sample.MongoDbConn.model.User;
import com.example.spring_boot_sample.MongoDbConn.repository.UserRepository;
import com.example.spring_boot_sample.MongoDbConn.serviceInterface.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.spring_boot_sample.MongoDbConn.constants.UserConstant;

@Service
@Slf4j
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;


    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        List<User> user = userRepository.findAll();
        log.info(user.toString());
        return user;
    }


    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(() ->
                new UserNotFoundException(UserConstant.USER_NOT_FOUND));

    }

}
