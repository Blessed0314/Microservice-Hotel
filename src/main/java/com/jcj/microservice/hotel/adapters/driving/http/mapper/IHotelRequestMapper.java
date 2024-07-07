package com.jcj.microservice.hotel.adapters.driving.http.mapper;

import com.jcj.microservice.hotel.adapters.driving.http.dto.request.AddHotelRequest;
import com.jcj.microservice.hotel.domain.model.Hotel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IHotelRequestMapper {
    @Mapping(target = "id", ignore = true)
    Hotel addRequestToHotel(AddHotelRequest addHotelRequest);
}
