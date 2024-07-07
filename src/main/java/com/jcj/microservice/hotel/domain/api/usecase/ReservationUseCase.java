package com.jcj.microservice.hotel.domain.api.usecase;

import com.jcj.microservice.hotel.domain.api.IReservationServicePort;
import com.jcj.microservice.hotel.domain.model.Reservation;
import com.jcj.microservice.hotel.domain.spi.IReservationPersistencePort;

public class ReservationUseCase implements IReservationServicePort {

    private final IReservationPersistencePort reservationPersistencePort;

    public ReservationUseCase(IReservationPersistencePort reservationPersistencePort) {
        this.reservationPersistencePort = reservationPersistencePort;
    }

    @Override
    public Long createReservation(Reservation reservation) {
        return reservationPersistencePort.createReservation(reservation);
    }

    @Override
    public Reservation getReservation(Long reservationId) {
        return reservationPersistencePort.getReservation(reservationId);
    }

    @Override
    public void deleteReservation(Long reservationId) {
        reservationPersistencePort.deleteReservation(reservationId);
    }
}
