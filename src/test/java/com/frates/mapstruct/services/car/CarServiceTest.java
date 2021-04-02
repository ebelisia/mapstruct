package com.frates.mapstruct.services.car;

import com.frates.mapstruct.mappers.car.CarMapper;
import com.frates.mapstruct.model.car.Car;
import com.frates.mapstruct.model.car.CarDTO;
import com.frates.mapstruct.model.car.CarType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarServiceTest {

    @Test
    public void shouldMapCarToDto() {

        Car car = new Car("JEEP", 5, CarType.HATCH);
        CarDTO carDto = CarMapper.INSTANCE.carToCarDto(car);

        assertThat(carDto).isNotNull();
        assertThat(carDto.getMake()).isEqualTo("JEEP");
        assertThat(carDto.getSeatCount()).isEqualTo(5);
        assertThat(carDto.getType()).isEqualTo("HATCH");

    }

}
