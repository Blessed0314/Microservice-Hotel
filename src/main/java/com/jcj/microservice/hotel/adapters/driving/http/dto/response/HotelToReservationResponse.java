package com.jcj.microservice.hotel.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HotelToReservationResponse {
    private final String name;
    private final String address;
    private final String phone;
    private final String city;
    private final int price;
}
