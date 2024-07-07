package com.jcj.microservice.hotel.configuration;

public class Constants {
    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String HOTEL_NOT_FOUND_EXCEPTION_MESSAGE = "This hotel not found";
    public static final String RESERVATION_NOT_FOUND_EXCEPTION_MESSAGE = "This reservation not found";

}
