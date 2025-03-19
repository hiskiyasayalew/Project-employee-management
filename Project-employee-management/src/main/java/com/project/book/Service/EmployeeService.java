package com.project.book.Service;

import com.project.book.dto.EmployeeDTO;
import com.project.book.Entity.EmployeeEntity;
import com.project.book.Repository.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    // Create or update employee
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setFirstName(employeeDTO.getFirstName());
        employeeEntity.setLastName(employeeDTO.getLastName());
        employeeEntity.setPhoneNumber(employeeDTO.getPhoneNumber());
        employeeEntity.setDepartment(employeeDTO.getDepartment());
        employeeEntity.setPosition(employeeDTO.getPosition());
        employeeEntity.setSalary(employeeDTO.getSalary());
        employeeEntity.setHireDate(employeeDTO.getHireDate());
        employeeEntity.setStatus(EmployeeEntity.Status.valueOf(employeeDTO.getStatus()));

        EmployeeEntity savedEmployee = employeeRepo.save(employeeEntity);
        return new EmployeeDTO(
            savedEmployee.getId(),
            savedEmployee.getFirstName(),
            savedEmployee.getLastName(),
            savedEmployee.getPhoneNumber(),
            savedEmployee.getDepartment(),
            savedEmployee.getPosition(),
            savedEmployee.getSalary(),
            savedEmployee.getHireDate(),
            savedEmployee.getStatus().name()
        );
    }

    // Get all employees
    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeEntity> employees = employeeRepo.findAll();
        return employees.stream().map(employee -> new EmployeeDTO(
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getPhoneNumber(),
            employee.getDepartment(),
            employee.getPosition(),
            employee.getSalary(),
            employee.getHireDate(),
            employee.getStatus().name()
        )).collect(Collectors.toList());
    }

    // Get employee by ID
    public EmployeeDTO getEmployeeById(Long id) {
        Optional<EmployeeEntity> employeeEntity = employeeRepo.findById(id);
        if (employeeEntity.isPresent()) {
            EmployeeEntity employee = employeeEntity.get();
            return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getPhoneNumber(),
                employee.getDepartment(),
                employee.getPosition(),
                employee.getSalary(),
                employee.getHireDate(),
                employee.getStatus().name()
            );
        }
        return null;  
    }

    // Delete employee by ID
    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }
}
