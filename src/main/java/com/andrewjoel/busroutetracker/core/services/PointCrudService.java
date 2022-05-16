package com.andrewjoel.busroutetracker.core.services;

import com.andrewjoel.busroutetracker.core.interfaces.CrudOperations;
import com.andrewjoel.busroutetracker.core.models.entities.Point;
import com.andrewjoel.busroutetracker.core.repositories.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PointCrudService implements CrudOperations<Point> {
    @Autowired
    private PointRepository pointRepository;

    @Override
    public Optional<Point> findById(Long id) {
        return pointRepository.findById(id);
    }

    @Override
    public Iterable<Point> findAll() {
        return pointRepository.findAll();
    }

    @Override
    public Point save(Point entity) {
        return pointRepository.save(entity);
    }

    @Override
    public Iterable<Point> saveAll(Iterable<Point> entities) {
        return pointRepository.saveAll(entities);
    }

    @Override
    public void delete(Point entity) {
        pointRepository.delete(entity);
    }

    @Override
    public boolean findAndDelete(Long id) {
        Optional<Point> existingPoint = pointRepository.findById(id);

        if (existingPoint.isEmpty()) {
            return false;
        }

        pointRepository.delete(existingPoint.get());
        return true;
    }
}
