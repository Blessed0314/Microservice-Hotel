package com.jcj.microservice.hotel.adapters.driving.http.mapper;

import com.jcj.microservice.hotel.adapters.driving.http.dto.request.AddReservationRequest;
import com.jcj.microservice.hotel.domain.model.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IReservationRequestMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "hotel.id", source = "idHotel")
    Reservation addRequestToReservation(AddReservationRequest addReservationRequest);
}
