package com.project.book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.book.Entity.AttendanceEntity;

@Repository
public interface AttendanceRepo extends JpaRepository<AttendanceEntity, Long> {

}
