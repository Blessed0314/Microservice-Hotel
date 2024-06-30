package com.jcj.microservice.hotel.adapters.driven.jpa.mysql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hotel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String city;
    private int price;
    private int rooms;
    private int reservations = 0;
    private boolean isFull;

    @PrePersist
    @PreUpdate
    private void updateIsFull() {
        this.isFull = this.rooms == this.reservations;
    }
}
