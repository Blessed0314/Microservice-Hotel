package com.jcj.microservice.hotel.adapters.driven.jpa.mysql.repository;

import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHotelRepository extends JpaRepository<HotelEntity, Long> {
}
