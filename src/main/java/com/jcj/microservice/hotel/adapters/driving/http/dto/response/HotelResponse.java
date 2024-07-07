package com.jcj.microservice.hotel.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HotelResponse {
    private final Long id;
    private final String name;
    private final int price;
}
