package com.project.book.Mapper;

import com.project.book.Entity.AttendanceEntity;
import com.project.book.dto.AttendanceDTO;

public interface AttendanceMapper{
    AttendanceEntity toDto(AttendanceDTO employee);
    
    AttendanceDTO  toEntity( AttendanceEntity employeeDTO);
}
