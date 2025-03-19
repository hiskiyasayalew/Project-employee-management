package com.project.book.Mapper;

import com.project.book.Entity.AppealEntity;
import com.project.book.dto.AppealDTO;

public interface AppealMapper {
    AppealEntity toDto(AppealDTO employee);
    
    AppealDTO toEntity(AppealEntity employeeDTO);
}
