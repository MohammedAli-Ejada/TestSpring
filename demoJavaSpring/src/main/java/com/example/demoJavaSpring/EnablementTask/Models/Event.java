package com.example.demoJavaSpring.EnablementTask.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @SequenceGenerator(
            name = "EventSequence",
            allocationSize = 1,
            sequenceName = "EventSequence"
    )
    @GeneratedValue(
            generator = "EventSequence",
            strategy = GenerationType.SEQUENCE
    )
    @Id
    private Long id;
    @Column(length = 200, nullable = false)
    @NotBlank(message = "Event name cannot be blank")
    @Size(max = 200, message = "Event name cannot exceed 200 characters")
    private String name ;
    @Column(length = 250,nullable = false)
    @NotBlank(message = "Description is required")
    @Size(max = 250, message = "Description cannot exceed 250 characters")
    private String description ;
    @Column(
            length = 250,
            nullable = false
    )
    private String code ;
    @Column(
            length = 50,
            nullable = false
    )
    private String status ;
    @Column(
            length = 100,
            nullable = false
    )
    private String eventSourceDevice;
    @Column(
            length = 100,
            nullable = false
    )
    private String schema;
    @Column(
            nullable = false,
            updatable = false
    )
    private Timestamp creationTime;
    @Column(
            nullable = false
    )
    private Timestamp lastUpdateTime;

}
