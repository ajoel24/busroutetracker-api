package com.andrewjoel.busroutetracker.core.repositories;

import com.andrewjoel.busroutetracker.core.models.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
}
