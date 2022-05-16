package com.andrewjoel.busroutetracker.core.repositories;

import com.andrewjoel.busroutetracker.core.models.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
