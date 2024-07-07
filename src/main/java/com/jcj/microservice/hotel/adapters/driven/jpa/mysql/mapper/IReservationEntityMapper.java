package com.jcj.microservice.hotel.adapters.driven.jpa.mysql.mapper;

import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.entity.ReservationEntity;
import com.jcj.microservice.hotel.domain.model.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IReservationEntityMapper {
    ReservationEntity toEntity(Reservation reservation);
    Reservation toModel(ReservationEntity entity);
}
