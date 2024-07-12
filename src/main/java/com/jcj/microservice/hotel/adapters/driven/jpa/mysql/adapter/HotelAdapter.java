package com.jcj.microservice.hotel.adapters.driven.jpa.mysql.adapter;

import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.entity.HotelEntity;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.exception.HotelAlreadyExistsException;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.exception.HotelNotFoundException;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.mapper.IHotelEntityMapper;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.repository.IHotelRepository;
import com.jcj.microservice.hotel.domain.model.Hotel;
import com.jcj.microservice.hotel.domain.spi.IHotelPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class HotelAdapter implements IHotelPersistencePort {

    private final IHotelRepository hotelRepository;
    private final IHotelEntityMapper hotelEntityMapper;

    @Override
    public void addHotel(Hotel hotel) {
        hotelRepository.findByNameIgnoreCaseAndTrim(hotel.getName()).ifPresent(h -> {
            if(h.getCity().equals(hotel.getCity()) && h.getAddress().equals(hotel.getAddress())) {
                throw new HotelAlreadyExistsException();
            }
        });
        hotelRepository.save(hotelEntityMapper.toEntity(hotel));
    }

    @Override
    public Hotel getHotel(Long hotelId) {
        HotelEntity hotel = hotelRepository.findById(hotelId).orElseThrow(HotelNotFoundException::new);
        return hotelEntityMapper.toModelList(hotel);
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelEntityMapper.toModelList(hotelRepository.findAll());
    }



}
