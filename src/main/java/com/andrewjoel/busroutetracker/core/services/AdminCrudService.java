package com.andrewjoel.busroutetracker.core.services;

import com.andrewjoel.busroutetracker.core.interfaces.CrudOperations;
import com.andrewjoel.busroutetracker.core.models.entities.Admin;
import com.andrewjoel.busroutetracker.core.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminCrudService implements CrudOperations<Admin> {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Optional<Admin> findById(Long id) {
        return adminRepository.findById(id);
    }

    @Override
    public Iterable<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public Admin save(Admin entity) {
        return adminRepository.save(entity);
    }

    @Override
    public void delete(Admin entity) {
        adminRepository.delete(entity);
    }

    @Override
    public Iterable<Admin> saveAll(Iterable<Admin> entities) {
        return adminRepository.saveAll(entities);
    }

    @Override
    public boolean findAndDelete(Long id) {
        Optional<Admin> existingAdmin = adminRepository.findById(id);

        if (existingAdmin.isEmpty()) {
            return false;
        }

        adminRepository.delete(existingAdmin.get());
        return true;
    }
}
