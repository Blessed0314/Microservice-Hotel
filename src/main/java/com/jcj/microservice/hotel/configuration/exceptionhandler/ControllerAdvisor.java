package com.jcj.microservice.hotel.configuration.exceptionhandler;

import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.exception.HotelNotFoundException;
import com.jcj.microservice.hotel.adapters.driven.jpa.mysql.exception.ReservationNotFoundException;
import com.jcj.microservice.hotel.configuration.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@RequiredArgsConstructor
public class ControllerAdvisor {

    @ExceptionHandler(BindException.class)
    public ResponseEntity<ExceptionResponse> handleValidationException(BindException bindException) {
        StringBuilder errorMessage = new StringBuilder();
        for (FieldError error : bindException.getFieldErrors()) {
            errorMessage.append(error.getDefaultMessage()).append("; ");
        }
        errorMessage.delete(errorMessage.length() - 2, errorMessage.length());
        return ResponseEntity.badRequest().body(new ExceptionResponse(
                errorMessage.toString(),
                HttpStatus.BAD_REQUEST.toString(),
                LocalDateTime.now()
        ));
    }

    @ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleHotelNotFoundException(HotelNotFoundException hotelNotFoundException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionResponse(
                Constants.HOTEL_NOT_FOUND_EXCEPTION_MESSAGE,
                HttpStatus.NOT_FOUND.toString(),
                LocalDateTime.now()
        ));
    }

    @ExceptionHandler(ReservationNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleReservationNotFoundException(ReservationNotFoundException reservationNotFoundException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionResponse(
                Constants.RESERVATION_NOT_FOUND_EXCEPTION_MESSAGE,
                HttpStatus.NOT_FOUND.toString(),
                LocalDateTime.now()
        ));
    }
}
