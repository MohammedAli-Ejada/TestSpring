package com.example.demoJavaSpring.EnablementTask.Repositories;

import com.example.demoJavaSpring.EnablementTask.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
}
