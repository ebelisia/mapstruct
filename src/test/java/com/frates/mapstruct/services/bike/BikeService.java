package com.frates.mapstruct.services.bike;

import com.frates.mapstruct.mappers.bike.BikeMapper;
import com.frates.mapstruct.model.bike.Bike;
import com.frates.mapstruct.model.bike.BikeDTO;
import com.frates.mapstruct.model.bike.BikeType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BikeService {

    @Test
    public void shouldMapCarToDto() {

        Bike bike = new Bike("MONARK", 1, BikeType.SPEED);
        BikeDTO bikeDTO = BikeMapper.INSTANCE.bikeToBikeDto(bike);

        assertThat(bikeDTO).isNotNull();
        assertThat(bikeDTO.getMake()).isEqualTo("MONARK");
        assertThat(bikeDTO.getSeats()).isEqualTo(1);
        assertThat(bikeDTO.getType()).isEqualTo(BikeType.SPEED);

    }

}
