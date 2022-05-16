package com.andrewjoel.busroutetracker.core.models.entities;

import com.andrewjoel.busroutetracker.core.models.common.Address;
import com.andrewjoel.busroutetracker.core.models.common.Auth;
import com.andrewjoel.busroutetracker.core.models.common.BaseEntity;
import com.andrewjoel.busroutetracker.core.models.common.Profile;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Passenger extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 5405824228580532104L;

    @Column(unique = true)
    private String orgId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "auth_id", referencedColumnName = "id")
    private Auth auth;

    @Column
    private String type;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "close_relative_profile_id", referencedColumnName = "id")
    private Profile closeRelativeProfile;

    @Column(name = "is_verified")
    private boolean isVerified;

    @Column(name = "verified_at")
    private LocalDateTime verifiedAt;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "boarding_point_id")
    private Point boardingPoint;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Profile getCloseRelativeProfile() {
        return closeRelativeProfile;
    }

    public void setCloseRelativeProfile(Profile closeRelativeProfile) {
        this.closeRelativeProfile = closeRelativeProfile;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public LocalDateTime getVerifiedAt() {
        return verifiedAt;
    }

    public void setVerifiedAt(LocalDateTime verifiedAt) {
        this.verifiedAt = verifiedAt;
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

    public Point getBoardingPoint() {
        return boardingPoint;
    }

    public void setBoardingPoint(Point boardingPoint) {
        this.boardingPoint = boardingPoint;
    }
}
