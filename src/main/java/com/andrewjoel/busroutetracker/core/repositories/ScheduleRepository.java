package com.andrewjoel.busroutetracker.core.repositories;

import com.andrewjoel.busroutetracker.core.models.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
