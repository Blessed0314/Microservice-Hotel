package com.jcj.microservice.hotel.adapters.driving.http.mapper;

import com.jcj.microservice.hotel.adapters.driving.http.dto.response.HotelResponse;
import com.jcj.microservice.hotel.adapters.driving.http.dto.response.HotelToReservationResponse;
import com.jcj.microservice.hotel.domain.model.Hotel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IHotelResponseMapper {
    HotelToReservationResponse toHotelResponse(Hotel hotel);
    List<HotelResponse> toHotelResponseList(List<Hotel> hotels);
}
