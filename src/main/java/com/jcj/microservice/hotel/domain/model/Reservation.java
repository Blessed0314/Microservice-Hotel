package com.jcj.microservice.hotel.domain.model;

public class Reservation {
    private final Long id;
    private final Hotel hotel;
    private final int people;
    private final int nights;

    public void setActive(boolean active) {
        isActive = active;
    }

    private final int netValue;
    private  boolean isActive;

    public Reservation(Long id, Hotel hotel, int people, int nights, int netValue, boolean isActive) {
        this.id = id;
        this.hotel = hotel;
        this.people = people;
        this.nights = nights;
        this.netValue = netValue;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public int getPeople() {
        return people;
    }

    public int getNights() {
        return nights;
    }

    public int getNetValue() {
        return netValue;
    }

    public boolean isActive() {
        return isActive;
    }


}
