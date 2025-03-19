package com.project.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String department;
    private String position;
    private BigDecimal salary;
    private LocalDate hireDate;
    private String status;  // This could be either "ACTIVE" or "INACTIVE"

    // You may want to add constructors or methods to convert from Entity to DTO if necessary
}
