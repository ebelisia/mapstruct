package com.frates.mapstruct.controllers.bike;

import com.frates.mapstruct.model.bike.BikeDTO;
import com.frates.mapstruct.services.bike.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @GetMapping("/bikes")
    public BikeDTO getBike(){
        return bikeService.getBike();
    }

}
