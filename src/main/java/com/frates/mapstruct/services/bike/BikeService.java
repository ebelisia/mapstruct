package com.frates.mapstruct.services.bike;

import com.frates.mapstruct.mappers.bike.BikeMapper;
import com.frates.mapstruct.model.bike.Bike;
import com.frates.mapstruct.model.bike.BikeDTO;
import com.frates.mapstruct.model.bike.BikeType;
import org.springframework.stereotype.Service;

@Service
public class BikeService {

    public BikeDTO getBike(){

        Bike bike = new Bike("MONARK", 1, BikeType.ROADS);
        BikeDTO bikeDTO = BikeMapper.INSTANCE.bikeToBikeDto(bike);

        return bikeDTO;

    }

}
