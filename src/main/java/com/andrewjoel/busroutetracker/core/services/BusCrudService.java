package com.andrewjoel.busroutetracker.core.services;

import com.andrewjoel.busroutetracker.core.interfaces.CrudOperations;
import com.andrewjoel.busroutetracker.core.models.entities.Bus;
import com.andrewjoel.busroutetracker.core.repositories.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BusCrudService implements CrudOperations<Bus> {
    @Autowired
    private BusRepository busRepository;

    @Override
    public Optional<Bus> findById(Long id) {
        return busRepository.findById(id);
    }

    @Override
    public Iterable<Bus> findAll() {
        return busRepository.findAll();
    }

    @Override
    public Bus save(Bus entity) {
        return busRepository.save(entity);
    }

    @Override
    public Iterable<Bus> saveAll(Iterable<Bus> entities) {
        return busRepository.saveAll(entities);
    }

    @Override
    public void delete(Bus entity) {
        busRepository.delete(entity);
    }

    @Override
    public boolean findAndDelete(Long id) {
        Optional<Bus> existingBus = busRepository.findById(id);

        if (existingBus.isEmpty()) {
            return false;
        }

        busRepository.delete(existingBus.get());
        return true;
    }
}
