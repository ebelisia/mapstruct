package com.frates.mapstruct.model.bike;

import lombok.Data;

@Data
public class Bike {

    private String make;
    private int numberOfSeats;
    private BikeType type;

    public Bike(String make, int numberOfSeats, BikeType type) {
        this.make = make;
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }

}
