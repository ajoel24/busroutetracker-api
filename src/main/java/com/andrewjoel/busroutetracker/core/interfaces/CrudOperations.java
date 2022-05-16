package com.andrewjoel.busroutetracker.core.interfaces;

import java.util.Optional;

public interface CrudOperations<T> {
    Optional<T> findById(Long id);

    Iterable<T> findAll();

    T save(T entity);

    Iterable<T> saveAll(Iterable<T> entities);

    void delete(T entity);

    boolean findAndDelete(Long id);
}
