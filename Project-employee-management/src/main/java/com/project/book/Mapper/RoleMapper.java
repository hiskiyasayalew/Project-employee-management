package com.project.book.Mapper;

import com.project.book.Entity.RoleEntity;
import com.project.book.dto.RoleDTO;

public interface RoleMapper{
    RoleEntity toDto(RoleDTO employee);
    
    RoleDTO toEntity( RoleEntity employeeDTO);
}
