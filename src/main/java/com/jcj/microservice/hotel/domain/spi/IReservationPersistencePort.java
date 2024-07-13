package com.jcj.microservice.hotel.domain.spi;

import com.jcj.microservice.hotel.domain.model.Reservation;
import io.swagger.v3.core.util.Json;

public  interface IReservationPersistencePort {
    Long createReservation(Reservation reservation);
    Reservation getReservation(Long reservationId);
    void deleteReservation(Long reservationId);

    Object bringNameHotel(Long reservationId);
}
