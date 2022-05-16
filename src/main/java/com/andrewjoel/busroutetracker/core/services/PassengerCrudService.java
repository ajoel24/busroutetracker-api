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
        return passengerRepository.findById(id);
    }

    @Override
    public Iterable<Passenger> findAll() {
        return passengerRepository.findAll();
    }

    @Override
    public Passenger save(Passenger entity) {
        return passengerRepository.save(entity);
    }

    @Override
    public Iterable<Passenger> saveAll(Iterable<Passenger> entities) {
        return passengerRepository.saveAll(entities);
    }

    @Override
    public void delete(Passenger entity) {
        passengerRepository.delete(entity);
    }

    @Override
    public boolean findAndDelete(Long id) {
        Optional<Passenger> existingPassenger = passengerRepository.findById(id);

        if (existingPassenger.isEmpty()) {
            return false;
        }

        passengerRepository.delete(existingPassenger.get());
        return true;
    }
}
