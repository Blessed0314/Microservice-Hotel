package com.jcj.microservice.hotel.domain.api;

import com.jcj.microservice.hotel.domain.model.Reservation;

public interface IReservationServicePort {
    void createReservation(Reservation reservation);
    Reservation getReservation(Long reservationId);
    void deleteReservation(Long reservationId);
}
