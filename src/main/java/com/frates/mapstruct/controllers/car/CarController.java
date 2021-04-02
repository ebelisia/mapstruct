package com.frates.mapstruct.controllers.car;

import com.frates.mapstruct.model.car.CarDTO;
import com.frates.mapstruct.services.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public CarDTO getCar(){
        return carService.getCar();
    }

}
