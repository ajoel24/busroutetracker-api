package com.andrewjoel.busroutetracker.core.repositories;

import com.andrewjoel.busroutetracker.core.models.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
}
