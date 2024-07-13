package com.jcj.microservice.hotel.adapters.driving.http.controller;

import com.jcj.microservice.hotel.adapters.driving.http.dto.request.AddReservationRequest;
import com.jcj.microservice.hotel.adapters.driving.http.dto.response.ReservationResponse;
import com.jcj.microservice.hotel.adapters.driving.http.mapper.IReservationRequestMapper;
import com.jcj.microservice.hotel.adapters.driving.http.mapper.IReservationResponseMapper;
import com.jcj.microservice.hotel.domain.api.IReservationServicePort;
import io.swagger.v3.core.util.Json;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class IReservationRestControllerAdapter {

    private final IReservationServicePort reservationServicePort;
    private final IReservationRequestMapper reservationRequestMapper;
    private final IReservationResponseMapper reservationResponseMapper;

    @PostMapping("/")
    public Long createReservation(@Valid @RequestBody AddReservationRequest request){
        return reservationServicePort.createReservation(reservationRequestMapper.addRequestToReservation(request));
    }

    @GetMapping("/")
    public ResponseEntity<ReservationResponse> getReservation(@RequestParam Long idReservation){
        return ResponseEntity.ok(reservationResponseMapper.toReservationResponse(reservationServicePort.getReservation(idReservation)));
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id){
        reservationServicePort.deleteReservation(id);
    }

    @GetMapping("/nameHotel/{id}")
    public Object bringNameHotel(@PathVariable Long id){
        return reservationServicePort.bringNameHotel(id);
    }
}
