package com.frates.mapstruct.mappers.bike;

import com.frates.mapstruct.model.bike.Bike;
import com.frates.mapstruct.model.bike.BikeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BikeMapper {

    BikeMapper INSTANCE = Mappers.getMapper(BikeMapper.class);

    @Mapping(source = "numberOfSeats", target = "seats")
    BikeDTO bikeToBikeDto(Bike bike);

}
