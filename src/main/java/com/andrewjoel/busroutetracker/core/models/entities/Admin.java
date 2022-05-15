package com.andrewjoel.busroutetracker.core.models.entities;

import com.andrewjoel.busroutetracker.core.models.common.Address;
import com.andrewjoel.busroutetracker.core.models.common.Auth;
import com.andrewjoel.busroutetracker.core.models.common.BaseEntity;
import com.andrewjoel.busroutetracker.core.models.common.Profile;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serial;
import java.io.Serializable;

@Entity
public class Admin extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -3389288464590831268L;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;

    @OneToOne
    @JoinColumn(name = "auth_id", referencedColumnName = "id")
    private Auth auth;

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
}
