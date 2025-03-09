package com.example.demoJavaSpring.EnablementTask.Services.GenericServices.EventServices;

import com.example.demoJavaSpring.EnablementTask.DTOs.EventToAddDto;
import com.example.demoJavaSpring.EnablementTask.DTOs.EventToEditDto;
import com.example.demoJavaSpring.EnablementTask.DTOs.EventToGetDto;
import com.example.demoJavaSpring.EnablementTask.Models.Event;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface IEventService {

    public Event addEvent(@Valid @NotNull EventToAddDto eventDto);
    public EventToGetDto getEventById(Long id);
    public void deleteEventById(Long id);
    public void EditEvent(Long id, EventToEditDto eventToEditDto);
}
