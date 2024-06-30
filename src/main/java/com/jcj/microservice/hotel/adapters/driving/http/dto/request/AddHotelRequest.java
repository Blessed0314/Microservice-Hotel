package com.jcj.microservice.hotel.adapters.driving.http.dto.request;

import com.jcj.microservice.hotel.adapters.driving.http.util.MessageConstants;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddHotelRequest {
    @NotBlank(message = MessageConstants.FIELD_NAME_NULL_MESSAGE)
    private final String name;
    @NotBlank(message = MessageConstants.FIELD_ADDRESS_NULL_MESSAGE)
    private final String address;
    @NotBlank(message = MessageConstants.FIELD_PHONE_NULL_MESSAGE)
    @Pattern(regexp = "^(\\+)?\\d{1,13}$", message = MessageConstants.FIELD_PHONE_ONLY_NUMBERS_MESSAGE)
    private final String phone;
    @NotBlank(message = MessageConstants.FIELD_CITY_NULL_MESSAGE)
    private final String city;
    @NotNull(message = MessageConstants.FIELD_PRICE_NULL_MESSAGE)
    private final int price;
    @NotNull(message = MessageConstants.FIELD_ROOMS_NULL_MESSAGE)
    private final int rooms;
}
