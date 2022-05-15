package com.andrewjoel.busroutetracker.core.services;

import com.andrewjoel.busroutetracker.core.interfaces.CrudOperations;
import com.andrewjoel.busroutetracker.core.models.entities.Driver;
import com.andrewjoel.busroutetracker.core.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DriverCrudService implements CrudOperations<Driver> {
    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Optional<Driver> findById(Long id) {
        return driverRepository.findById(id);
    }

    @Override
    public Iterable<Driver> findAll() {
        return driverRepository.findAll();
    }

    @Override
    public Driver save(Driver entity) {
        return driverRepository.save(entity);
    }

    @Override
    public Iterable<Driver> saveAll(Iterable<Driver> entities) {
        return driverRepository.saveAll(entities);
    }

    @Override
    public void delete(Driver entity) {
        driverRepository.delete(entity);
    }

    @Override
    public boolean findAndDelete(Long id) {
        Optional<Driver> existingDriver = driverRepository.findById(id);

        if (existingDriver.isEmpty()) {
            return false;
        }

        driverRepository.delete(existingDriver.get());
        return true;
    }
}
