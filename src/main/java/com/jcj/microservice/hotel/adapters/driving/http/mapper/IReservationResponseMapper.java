package com.jcj.microservice.hotel.adapters.driving.http.mapper;

import com.jcj.microservice.hotel.adapters.driving.http.dto.response.ReservationResponse;
import com.jcj.microservice.hotel.domain.model.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IReservationResponseMapper {
    ReservationResponse toReservationResponse(Reservation reservation);
}
