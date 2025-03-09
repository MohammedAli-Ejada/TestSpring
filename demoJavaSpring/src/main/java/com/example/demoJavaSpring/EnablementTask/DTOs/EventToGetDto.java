package com.example.demoJavaSpring.EnablementTask.DTOs;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventToGetDto {
    private Long id;
    private String name ;
    private String description ;
    private String code ;
    private Identifier identifier;
    private String status ;
    private Timestamp creationTime;
    private Timestamp lastUpdateTime;


}
