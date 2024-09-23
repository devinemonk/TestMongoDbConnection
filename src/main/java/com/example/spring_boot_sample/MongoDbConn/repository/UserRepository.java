package com.example.spring_boot_sample.MongoDbConn.repository;

import com.example.spring_boot_sample.MongoDbConn.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    // Additional query methods can be defined here
}
