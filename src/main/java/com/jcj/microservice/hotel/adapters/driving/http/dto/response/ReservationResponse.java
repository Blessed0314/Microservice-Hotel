package com.jcj.microservice.hotel.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ReservationResponse {
    private final Long id;
    private final int people;
    private final int nights;
    private final int netValue;
    private final HotelToReservationResponse hotel;
}
