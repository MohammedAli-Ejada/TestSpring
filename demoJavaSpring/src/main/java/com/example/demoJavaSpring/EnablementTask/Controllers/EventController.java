package com.example.demoJavaSpring.EnablementTask.Controllers;

import com.example.demoJavaSpring.EnablementTask.DTOs.EventToAddDto;
import com.example.demoJavaSpring.EnablementTask.DTOs.EventToEditDto;
import com.example.demoJavaSpring.EnablementTask.DTOs.EventToGetDto;
import com.example.demoJavaSpring.EnablementTask.Models.Event;
import com.example.demoJavaSpring.EnablementTask.Responses.GeneralResponse;
import com.example.demoJavaSpring.EnablementTask.Services.GenericServices.EventServices.EventService;
import com.example.demoJavaSpring.EnablementTask.Services.GenericServices.EventServices.IEventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventController {
    private IEventService eventService;
    public EventController(IEventService iEventService) {
        this.eventService = iEventService;
    }

    @PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse> Add(@Valid @RequestBody EventToAddDto eventDto){
        eventService.addEvent(eventDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new GeneralResponse("201","Added Successfully","EN","AR"));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> Get(@PathVariable Long id){
        EventToGetDto eventToGetDto=eventService.getEventById(id);
        return ResponseEntity.ok(eventService.getEventById(id));
    }

    @PatchMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> Edit(@PathVariable Long id, @RequestBody EventToEditDto eventToEditDto){
        eventService.EditEvent(id,eventToEditDto);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> Delete(@PathVariable Long id){
        eventService.deleteEventById(id);
        return ResponseEntity.noContent().build();
    }
}
