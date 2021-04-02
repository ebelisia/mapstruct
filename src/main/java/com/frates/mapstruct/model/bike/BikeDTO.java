package com.frates.mapstruct.model.bike;

import lombok.Data;

@Data
public class BikeDTO {

    private String make;
    private int seats;
    private BikeType type;

    public BikeDTO(String make, int seats, BikeType type) {
        this.make = make;
        this.seats = seats;
        this.type = type;
    }

}
