package com.jcj.microservice.hotel.adapters.driven.jpa.mysql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reservation")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReservationEntity {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hotel_id", referencedColumnName = "id")
    private HotelEntity hotel;

    private int people;
    private int nights;
    private int netValue;
    private boolean isActive = true;

    @PrePersist
    @PreUpdate
    private void calculateNetValue() {
        if (this.hotel != null && this.hotel.getPrice() > 0) {
            this.netValue = this.nights * this.hotel.getPrice();
        } else {
            this.netValue = 0;
        }
    }
}
