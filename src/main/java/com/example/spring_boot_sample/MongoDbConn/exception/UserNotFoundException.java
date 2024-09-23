package com.example.spring_boot_sample.MongoDbConn.exception;

//public class UserNotFoundException {
//}

//package com.example.spring_boot_sample.MongoDbConn;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
