package com.andrewjoel.busroutetracker.core.models.entities;

import com.andrewjoel.busroutetracker.core.models.common.Address;
import com.andrewjoel.busroutetracker.core.models.common.Auth;
import com.andrewjoel.busroutetracker.core.models.common.BaseEntity;
import com.andrewjoel.busroutetracker.core.models.common.Profile;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
public class Driver extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 6281948338372614493L;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "auth_id", referencedColumnName = "id")
    private Auth auth;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}