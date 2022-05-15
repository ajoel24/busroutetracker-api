package com.andrewjoel.busroutetracker.core.services;

import com.andrewjoel.busroutetracker.core.interfaces.CrudOperations;
import com.andrewjoel.busroutetracker.core.models.entities.Passenger;
import com.andrewjoel.busroutetracker.core.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PassengerCrudService implements CrudOperations<Passenger> {
    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public Optional<Passenger> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Passenger> findAll() {
        return null;
    }

    @Override
    public Passenger save(Passenger entity) {
        return null;
    }

    @Override
    public Iterable<Passenger> saveAll(Iterable<Passenger> entities) {
        return null;
    }

    @Override
    public void delete(Passenger entity) {

    }

    @Override
    public boolean findAndDelete(Long id) {
        return false;
    }
}
