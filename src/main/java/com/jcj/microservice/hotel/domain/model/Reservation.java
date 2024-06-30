package com.jcj.microservice.hotel.domain.model;

public class Reservation {
    private final Long id;
    private final Hotel hotel;
    private final String roomNumber;
    private final boolean isActive;

    public Reservation(Long id, Hotel hotel, String roomNumber, boolean isActive) {
        this.id = id;
        this.hotel = hotel;
        this.roomNumber = roomNumber;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public boolean isActive() {
        return isActive;
    }
}
