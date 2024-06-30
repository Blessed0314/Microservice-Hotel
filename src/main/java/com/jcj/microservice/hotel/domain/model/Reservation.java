package com.jcj.microservice.hotel.domain.model;

public class Reservation {
    private final Long id;
    private final Hotel hotel;
    private final int people;
    private final int nights;
    private final boolean isActive;

    public Reservation(Long id, Hotel hotel, int people, int nights, boolean isActive) {
        this.id = id;
        this.hotel = hotel;
        this.people = people;
        this.nights = nights;
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

    public boolean isActive() {
        return isActive;
    }
}
