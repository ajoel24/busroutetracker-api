package com.andrewjoel.busroutetracker.core.models.entities;

import com.andrewjoel.busroutetracker.core.models.common.BaseEntity;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Bus extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 4709344699999898251L;

    @Column(name = "licence_plate_number", unique = true)
    private String licencePlateNumber;

    @Column
    private String name;

    @Column
    private Integer capacity;

    @Column
    private String status;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @OneToMany
    private Set<Passenger> passengers;

    @OneToMany
    private Set<Driver> drivers;

    @ManyToMany
    @JoinTable(
            name = "schedules",
            joinColumns = @JoinColumn(name = "bus_id"),
            inverseJoinColumns = @JoinColumn(name = "schedule_id"))
    private Set<Schedule> schedules;

    public String getLicencePlateNumber() {
        return licencePlateNumber;
    }

    public void setLicencePlateNumber(String licencePlateNumber) {
        this.licencePlateNumber = licencePlateNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Set<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(Set<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public Set<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(Set<Schedule> schedules) {
        this.schedules = schedules;
    }
}
