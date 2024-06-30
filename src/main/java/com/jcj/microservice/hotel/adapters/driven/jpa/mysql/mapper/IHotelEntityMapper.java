package com.jcj.microservice.hotel.adapters.driven.jpa.mysql.mapper;

import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.entity.HotelEntity;
import com.jcj.microservice.hotel.domain.model.Hotel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IHotelEntityMapper {
    HotelEntity toEntity(Hotel hotel);
    Hotel toModelList(HotelEntity entity);
    List<Hotel> toModelList(List<HotelEntity> hotelEntities);
}