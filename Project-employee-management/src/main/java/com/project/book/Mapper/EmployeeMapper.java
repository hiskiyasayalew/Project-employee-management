package com.project.book.Mapper;

import com.project.book.Entity.EmployeeEntity;
import com.project.book.dto.EmployeeDTO;

public interface EmployeeMapper {
EmployeeEntity toDto(EmployeeDTO employee);
    
    EmployeeDTO toEntity(EmployeeDTO employeeDTO);
}
