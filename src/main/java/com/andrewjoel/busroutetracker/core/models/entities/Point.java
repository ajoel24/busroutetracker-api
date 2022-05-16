package com.andrewjoel.busroutetracker.core.models.entities;

import com.andrewjoel.busroutetracker.core.models.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Point extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 5311447832821626113L;

    @Column
    private String latitude;

    @Column
    private String longitude;

    @Column
    private String name;

    @Column
    private String number;

    @Column(name = "area_name")
    private String areaName;

    @ManyToMany
    private Set<Route> routes;

    @ManyToMany
    private Set<Passenger> passengers;

    @ManyToMany
    private Set<Schedule> schedules;

    @Column
    private String landmark;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public Set<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<Route> routes) {
        this.routes = routes;
    }

    public Set<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(Set<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Set<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(Set<Schedule> schedules) {
        this.schedules = schedules;
    }
}
