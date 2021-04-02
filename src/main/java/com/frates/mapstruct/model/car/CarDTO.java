package com.frates.mapstruct.model.car;

import lombok.Data;

@Data
public class CarDTO {

    private String make;
    private int seatCount;
    private String type;

    public CarDTO(String test, int seatCount, String type) {
        this.make = test;
        this.seatCount = seatCount;
        this.type = type;
    }

}

