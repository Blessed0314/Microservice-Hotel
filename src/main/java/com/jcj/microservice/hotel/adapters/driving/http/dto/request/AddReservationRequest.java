package com.jcj.microservice.hotel.adapters.driving.http.dto.request;

import com.jcj.microservice.hotel.adapters.driving.http.util.MessageConstants;
import com.jcj.microservice.hotel.domain.model.Hotel;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddReservationRequest {
    @NotNull(message = MessageConstants.FIELD_HOTEL_NULL_MESSAGE)
    private final Hotel hotel;
    @NotNull(message = MessageConstants.FIELD_PEOPLE_NULL_MESSAGE)
    @Positive(message = MessageConstants.NOT_NEGATIVE_MESSAGE)
    private final int people;
    @NotNull(message = MessageConstants.FIELD_NIGHTS_NULL_MESSAGE)
    @Positive(message = MessageConstants.NOT_NEGATIVE_MESSAGE)
    private final int nights;
}
