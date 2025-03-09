package com.example.demoJavaSpring.EnablementTask.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventToAddDto {
    @NotBlank(message = "Name is required")
    @Size(max = 200, message = "Name cannot exceed 200 characters")
    private String name ;

    @NotBlank(message = "Description is required")
    @Size(max = 250, message = "Description cannot exceed 250 characters")
    private String description ;

    @NotNull(message = "Identifier cannot be null")
    private Identifier identifier;

}
