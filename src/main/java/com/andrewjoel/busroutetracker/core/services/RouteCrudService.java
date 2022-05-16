package com.andrewjoel.busroutetracker.core.services;

import com.andrewjoel.busroutetracker.core.interfaces.CrudOperations;
import com.andrewjoel.busroutetracker.core.models.entities.Route;
import com.andrewjoel.busroutetracker.core.repositories.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RouteCrudService implements CrudOperations<Route> {
    @Autowired
    private RouteRepository routeRepository;

    @Override
    public Optional<Route> findById(Long id) {
        return routeRepository.findById(id);
    }

    @Override
    public Iterable<Route> findAll() {
        return routeRepository.findAll();
    }

    @Override
    public Route save(Route entity) {
        return routeRepository.save(entity);
    }

    @Override
    public Iterable<Route> saveAll(Iterable<Route> entities) {
        return routeRepository.saveAll(entities);
    }

    @Override
    public void delete(Route entity) {
        routeRepository.delete(entity);
    }

    @Override
    public boolean findAndDelete(Long id) {
        Optional<Route> existingRoute = routeRepository.findById(id);

        if (existingRoute.isEmpty()) {
            return false;
        }

        routeRepository.delete(existingRoute.get());
        return true;
    }
}
