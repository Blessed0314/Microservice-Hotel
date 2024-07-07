package com.jcj.microservice.hotel.configuration;

import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.adapter.HotelAdapter;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.adapter.ReservationAdapter;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.mapper.IHotelEntityMapper;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.mapper.IReservationEntityMapper;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.repository.IHotelRepository;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.repository.IReservationRepository;
import com.jcj.microservice.hotel.domain.api.IHotelServicePort;
import com.jcj.microservice.hotel.domain.api.IReservationServicePort;
import com.jcj.microservice.hotel.domain.api.usecase.HotelUseCase;
import com.jcj.microservice.hotel.domain.api.usecase.ReservationUseCase;
import com.jcj.microservice.hotel.domain.spi.IHotelPersistencePort;
import com.jcj.microservice.hotel.domain.spi.IReservationPersistencePort;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IReservationRepository reservationRepository;
    private final IReservationEntityMapper reservationEntityMapper;

    private final IHotelRepository hotelRepository;
    private final IHotelEntityMapper hotelEntityMapper;

    @Bean
    public IReservationPersistencePort reservationPersistencePort() {
        return new ReservationAdapter(reservationRepository, reservationEntityMapper, hotelRepository, hotelEntityMapper);
    }
    @Bean
    public IReservationServicePort reservationServicePort() {
        return new ReservationUseCase(reservationPersistencePort());
    }

    @Bean
    public IHotelPersistencePort hotelPersistencePort() {
        return new HotelAdapter(hotelRepository, hotelEntityMapper);
    }
    @Bean
    public IHotelServicePort hotelServicePort() {
        return new HotelUseCase(hotelPersistencePort());
    }
}
