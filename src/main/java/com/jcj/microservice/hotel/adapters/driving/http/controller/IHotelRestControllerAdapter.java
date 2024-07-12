package com.jcj.microservice.hotel.adapters.driving.http.controller;

import com.jcj.microservice.hotel.adapters.driving.http.dto.request.AddHotelRequest;
import com.jcj.microservice.hotel.adapters.driving.http.dto.response.HotelResponse;
import com.jcj.microservice.hotel.adapters.driving.http.dto.response.HotelToReservationResponse;
import com.jcj.microservice.hotel.adapters.driving.http.mapper.IHotelRequestMapper;
import com.jcj.microservice.hotel.adapters.driving.http.mapper.IHotelResponseMapper;
import com.jcj.microservice.hotel.domain.api.IHotelServicePort;
import jakarta.validation.Valid;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
@RequiredArgsConstructor
public class IHotelRestControllerAdapter {

    private final IHotelServicePort hotelServicePort;
    private final IHotelRequestMapper hotelRequestMapper;
    private final IHotelResponseMapper hotelResponseMapper;

    @PostMapping("/")
    public ResponseEntity<Void> addHotel(@Valid @RequestBody AddHotelRequest request){
        hotelServicePort.addHotel(hotelRequestMapper.addRequestToHotel(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/")
    public ResponseEntity<List<HotelResponse>> getHotelList(){
        return ResponseEntity.ok(hotelResponseMapper.toHotelResponseList(hotelServicePort.getHotels()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HotelToReservationResponse> getHotelById(@PathVariable Long id){
        return ResponseEntity.ok(hotelResponseMapper.toHotelResponse(hotelServicePort.getHotel(id)));
    }


}
