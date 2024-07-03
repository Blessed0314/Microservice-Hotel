package com.jcj.microservice.hotel.domain.spi;

import com.jcj.microservice.hotel.domain.model.Reservation;

public  interface IReservationPersistencePort {
    Reservation createReservation(Reservation reservation);
    Reservation getReservation(Long reservationId);
    void deleteReservation(Long reservationId);
}
