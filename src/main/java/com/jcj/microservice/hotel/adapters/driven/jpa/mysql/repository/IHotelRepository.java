package com.jcj.microservice.hotel.adapters.driven.jpa.mysql.repository;

import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IHotelRepository extends JpaRepository<HotelEntity, Long> {
    @Query("SELECT h FROM HotelEntity h WHERE TRIM(LOWER(h.name)) = TRIM(LOWER(:name))")
    Optional<HotelEntity> findByNameIgnoreCaseAndTrim(@Param("name") String name);
}
