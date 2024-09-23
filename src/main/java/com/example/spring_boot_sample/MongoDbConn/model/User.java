package com.example.spring_boot_sample.MongoDbConn.model;



import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    private String id;
    private String uuid;
    private String name;
    private String email;

}
