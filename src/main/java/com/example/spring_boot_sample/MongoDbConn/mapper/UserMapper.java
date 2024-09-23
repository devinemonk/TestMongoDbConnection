package com.example.spring_boot_sample.MongoDbConn.mapper;



import com.example.spring_boot_sample.MongoDbConn.dto.UserDTO;
import com.example.spring_boot_sample.MongoDbConn.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

//@Mapper
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);
    User userDTOToUser(UserDTO userDTO);
}
