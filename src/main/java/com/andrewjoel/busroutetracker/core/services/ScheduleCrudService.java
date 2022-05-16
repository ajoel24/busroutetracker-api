package com.andrewjoel.busroutetracker.core.services;

import com.andrewjoel.busroutetracker.core.interfaces.CrudOperations;
import com.andrewjoel.busroutetracker.core.models.entities.Schedule;
import com.andrewjoel.busroutetracker.core.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScheduleCrudService implements CrudOperations<Schedule> {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public Optional<Schedule> findById(Long id) {
        return scheduleRepository.findById(id);
    }

    @Override
    public Iterable<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    @Override
    public Schedule save(Schedule entity) {
        return scheduleRepository.save(entity);
    }

    @Override
    public Iterable<Schedule> saveAll(Iterable<Schedule> entities) {
        return scheduleRepository.saveAll(entities);
    }

    @Override
    public void delete(Schedule entity) {
        scheduleRepository.delete(entity);
    }

    @Override
    public boolean findAndDelete(Long id) {
        Optional<Schedule> existingSchedule = scheduleRepository.findById(id);

        if (existingSchedule.isEmpty()) {
            return false;
        }

        scheduleRepository.delete(existingSchedule.get());
        return true;
    }
}
