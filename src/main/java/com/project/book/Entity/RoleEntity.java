package com.project.book.Entity;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "roles")
=======
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "role")
>>>>>>> 72b69e7dde00a799b9027a3fdf06798159ddff7b
@Data
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

<<<<<<< HEAD
    @Column(nullable = false, unique = true, length = 50)
    private String name;

    @Column(length = 255)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false) // FK to EmployeeEntity
    private EmployeeEntity employee; // Reference to the EmployeeEntity
}
=======
}
>>>>>>> 72b69e7dde00a799b9027a3fdf06798159ddff7b
