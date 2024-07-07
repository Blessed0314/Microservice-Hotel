package com.jcj.microservice.hotel.domain.api;

import com.jcj.microservice.hotel.domain.model.Hotel;

import java.util.List;

public interface IHotelServicePort {
    void addHotel (Hotel hotel);
    Hotel getHotel(Long hotelId);
    List<Hotel> getHotels();
}
