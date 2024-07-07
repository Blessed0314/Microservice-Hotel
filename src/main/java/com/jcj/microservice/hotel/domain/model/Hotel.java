package com.jcj.microservice.hotel.domain.model;

public class Hotel {
    private final Long id;
    private final String name;
    private final String address;
    private final String phone;
    private final String city;
    private final int price;
    private final int rooms;
    private final int reservations;
    private boolean isFull;

    public Hotel(Long id, String name, String address, String phone, String city, int price, int rooms, int reservations, boolean isFull) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.city = city;
        this.price = price;
        this.rooms = rooms;
        this.reservations = reservations;
        this.isFull = isFull;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public int getPrice() {
        return price;
    }

    public int getRooms() {
        return rooms;
    }

    public int getReservations() {
        return reservations;
    }

    public boolean isFull() {
        return isFull;
    }
}
