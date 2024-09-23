package com.example.spring_boot_sample.MongoDbConn.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String id;
    private String uuid;
    private String name;
    private String email;
}
