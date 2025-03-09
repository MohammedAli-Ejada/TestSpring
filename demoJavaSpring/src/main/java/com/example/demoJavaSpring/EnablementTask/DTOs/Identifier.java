package com.example.demoJavaSpring.EnablementTask.DTOs;
import jakarta.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Identifier {
    @NotBlank(message = "Event Source Device is required")
    private String eventSourceDevice;

    @NotBlank(message = "Schema is required")
    private String schema;

}
