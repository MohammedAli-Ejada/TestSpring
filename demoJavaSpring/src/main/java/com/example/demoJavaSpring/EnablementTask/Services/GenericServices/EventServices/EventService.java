package com.example.demoJavaSpring.EnablementTask.Services.GenericServices.EventServices;

import com.example.demoJavaSpring.EnablementTask.DTOs.EventToAddDto;
import com.example.demoJavaSpring.EnablementTask.DTOs.EventToEditDto;
import com.example.demoJavaSpring.EnablementTask.DTOs.EventToGetDto;
import com.example.demoJavaSpring.EnablementTask.DTOs.Identifier;
import com.example.demoJavaSpring.EnablementTask.ExceptionHandling.ResourceNotFoundException;
import com.example.demoJavaSpring.EnablementTask.Models.Event;
import com.example.demoJavaSpring.EnablementTask.Repositories.EventRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.sql.Timestamp;
import java.time.Instant;

@Service
@Validated
public class EventService implements IEventService{

    private EventRepository eventRepository;
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event addEvent(@Valid @NotNull EventToAddDto eventDto) {
        Event event=new Event();
        event.setName(eventDto.getName());
        event.setDescription(eventDto.getDescription());
        event.setEventSourceDevice(eventDto.getIdentifier().getEventSourceDevice());
        event.setSchema(eventDto.getIdentifier().getSchema());
        event.setCode("CodeTest");
        event.setCreationTime( Timestamp.from(Instant.now()));
        event.setLastUpdateTime(Timestamp.from(Instant.now()));
        event.setStatus("StatusTest");
        eventRepository.save(event);
        return event;
    }

    @Override
    public EventToGetDto getEventById(Long id) {

        Event event=eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found with ID: " + id));
        EventToGetDto eventToGetDto=new EventToGetDto(
                event.getId(),
                event.getName(),
                event.getDescription(),
                event.getCode(),
                new Identifier(event.getEventSourceDevice(),event.getSchema()),
                event.getStatus(),
                event.getCreationTime(),
                event.getLastUpdateTime()
        );

        return  eventToGetDto;
    }

    @Override
    public void deleteEventById(Long id) {
        Event event=eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found with ID: " + id));
        eventRepository.delete(event);
    }

    @Override
    public void EditEvent(Long id, EventToEditDto eventToEditDto) {
        Event event=eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found with ID: " + id));
        event.setLastUpdateTime(Timestamp.from(Instant.now()));
        event.setName(eventToEditDto.getName());
        event.setDescription(eventToEditDto.getDescription());

        eventRepository.save(event);
    }


}
