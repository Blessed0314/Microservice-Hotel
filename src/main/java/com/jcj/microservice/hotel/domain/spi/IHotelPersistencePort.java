package com.jcj.microservice.hotel.domain.spi;

import com.jcj.microservice.hotel.domain.model.Hotel;

import java.util.List;

public interface IHotelPersistencePort {
    void addHotel (Hotel hotel);
    Hotel getHotel(Long hotelId);
    List<Hotel> getHotels();
}
