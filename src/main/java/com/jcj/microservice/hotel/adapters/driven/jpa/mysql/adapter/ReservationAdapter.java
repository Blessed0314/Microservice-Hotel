package com.jcj.microservice.hotel.adapters.driven.jpa.mysql.adapter;

import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.entity.HotelEntity;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.entity.ReservationEntity;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.exception.HotelNotFoundException;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.exception.ReservationNotFoundException;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.mapper.IHotelEntityMapper;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.mapper.IReservationEntityMapper;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.repository.IHotelRepository;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.repository.IReservationRepository;
import com.jcj.microservice.hotel.domain.model.Reservation;
import com.jcj.microservice.hotel.domain.spi.IReservationPersistencePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReservationAdapter implements IReservationPersistencePort {

    private final IReservationRepository reservationRepository;
    private final IReservationEntityMapper reservationEntityMapper;

    private final IHotelRepository hotelRepository;
    private final IHotelEntityMapper hotelEntityMapper;

    @Override
    public Long createReservation(Reservation reservation) {
        HotelEntity hotel = hotelRepository.findById(reservation.getHotel().getId()).orElseThrow(HotelNotFoundException::new);
        reservation.setActive(true);
        ReservationEntity reservationEntity = reservationEntityMapper.toEntity(reservation);
        reservationEntity.setHotel(hotel);
        return reservationEntityMapper.toModel(reservationRepository.save(reservationEntity)).getId();
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
