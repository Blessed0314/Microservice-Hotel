package com.jcj.microservice.hotel.adapters.driven.jpa.mysql.adapter;

import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.entity.ReservationEntity;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.exception.ReservationNotFoundException;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.mapper.IReservationEntityMapper;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.repository.IReservationRepository;
import com.jcj.microservice.hotel.domain.model.Reservation;
import com.jcj.microservice.hotel.domain.spi.IReservationPersistencePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReservationAdapter implements IReservationPersistencePort {

    private final IReservationRepository reservationRepository;
    private final IReservationEntityMapper reservationEntityMapper;

    @Override
    public void createReservation(Reservation reservation) {
        reservationRepository.save(reservationEntityMapper.toEntity(reservation));
    }

    @Override
    public Reservation getReservation(Long reservationId) {
        ReservationEntity reservation = reservationRepository.findById(reservationId).orElseThrow(ReservationNotFoundException::new);
        return reservationEntityMapper.toModel(reservation);
    }

    @Override
    public void deleteReservation(Long reservationId) {
        ReservationEntity reservation = reservationRepository.findById(reservationId).orElseThrow(ReservationNotFoundException::new);
        reservation.setActive(false);
        reservationRepository.save(reservation);
    }
}
