<<<<<<< HEAD
package com.project.book.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "appeals")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppealEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false) // FK to EmployeeEntity
    private EmployeeEntity employee;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Status status = Status.PENDING; // Default status

    public enum Status {
        PENDING, APPROVED, REJECTED
    }
}
=======
package com.project.book.entity;

public class MessageEntity {

}
>>>>>>> 72b69e7dde00a799b9027a3fdf06798159ddff7b
