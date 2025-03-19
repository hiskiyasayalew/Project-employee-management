package com.project.book.Mapper;

import com.project.book.Entity.UserEntity;
import com.project.book.dto.UserDTO;

public interface UserMapper{
    UserEntity toDto(UserDTO employee);
    
    UserDTO toEntity( UserEntity employeeDTO);
}
