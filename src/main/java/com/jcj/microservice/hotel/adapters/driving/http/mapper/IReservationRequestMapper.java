package com.jcj.microservice.hotel.adapters.driving.http.mapper;

import com.jcj.microservice.hotel.adapters.driving.http.dto.request.AddReservationRequest;
import com.jcj.microservice.hotel.domain.model.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IReservationRequestMapper {
    Reservation addRequestToReservation(AddReservationRequest addReservationRequest);
}
