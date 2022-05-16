package com.andrewjoel.busroutetracker.core.models.entities;

import com.andrewjoel.busroutetracker.core.models.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Schedule extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 7713055350777552728L;

    @Column
    private String timing;

    @ManyToMany
    private Set<Bus> buses;

    @ManyToMany
    private Set<Route> routes;

    @ManyToMany
    private Set<Point> points;

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public Set<Bus> getBuses() {
        return buses;
    }

    public void setBuses(Set<Bus> buses) {
        this.buses = buses;
    }

    public Set<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<Route> routes) {
        this.routes = routes;
    }

    public Set<Point> getPoints() {
        return points;
    }

    public void setPoints(Set<Point> points) {
        this.points = points;
    }
}
