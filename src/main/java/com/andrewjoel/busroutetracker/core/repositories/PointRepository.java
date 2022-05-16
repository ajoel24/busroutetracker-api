package com.andrewjoel.busroutetracker.core.repositories;

import com.andrewjoel.busroutetracker.core.models.entities.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends JpaRepository<Point, Long> {
}
