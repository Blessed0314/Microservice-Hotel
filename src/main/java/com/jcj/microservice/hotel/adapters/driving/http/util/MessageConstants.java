package com.jcj.microservice.hotel.adapters.driving.http.util;

public class MessageConstants {
    MessageConstants() {
        throw new IllegalStateException("Utility class");
    }
    public static final String FIELD_NAME_NULL_MESSAGE = "Field 'name' cannot be null";
    public static final String FIELD_ADDRESS_NULL_MESSAGE = "Field 'address' cannot be null";
    public static final String FIELD_PHONE_NULL_MESSAGE = "Field 'phone' cannot be null";
    public static final String FIELD_PHONE_ONLY_NUMBERS_MESSAGE = "Field 'phone' can only have numbers or '+' before the number";
    public static final String FIELD_CITY_NULL_MESSAGE = "Field 'city' cannot be null";
    public static final String FIELD_PRICE_NULL_MESSAGE = "Field 'price' cannot be null";
    public static final String FIELD_ROOMS_NULL_MESSAGE = "Field 'rooms' cannot be null";
    public static final String FIELD_ID_NULL_MESSAGE = "Field 'id' cannot be null";
    public static final String FIELD_HOTEL_NULL_MESSAGE = "Field 'hotel' cannot be null";
    public static final String FIELD_PEOPLE_NULL_MESSAGE = "Field 'people' cannot be null";
    public static final String FIELD_NIGHTS_NULL_MESSAGE = "Field 'nights' cannot be null";
    public static final String NOT_NEGATIVE_MESSAGE = "Field cannot be negative";
}
