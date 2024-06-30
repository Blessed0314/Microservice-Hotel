package com.jcj.microservice.hotel.domain.api.usecase;

import com.jcj.microservice.hotel.domain.api.IHotelServicePort;
import com.jcj.microservice.hotel.domain.model.Hotel;
import com.jcj.microservice.hotel.domain.spi.IHotelPersistencePort;

import java.util.List;

public class HotelUseCase implements IHotelServicePort {

    private final IHotelPersistencePort hotelPersistencePort;

    public HotelUseCase(IHotelPersistencePort hotelPersistencePort) {
        this.hotelPersistencePort = hotelPersistencePort;
    }

    @Override
    public void addHotel(Hotel hotel) {
        hotelPersistencePort.addHotel(hotel);
    }

    @Override
    public Hotel getHotel(Long hotelId) {
        return hotelPersistencePort.getHotel(hotelId);
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelPersistencePort.getHotels();
    }
}
