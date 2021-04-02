package com.frates.mapstruct.services.car;

import com.frates.mapstruct.mappers.car.CarMapper;
import com.frates.mapstruct.model.car.Car;
import com.frates.mapstruct.model.car.CarDTO;
import com.frates.mapstruct.model.car.CarType;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper
public class CarService{

    public CarDTO getCar(){

      Car car = new Car("FIAT", 5, CarType.SEDAN);
      CarDTO carDto = CarMapper.INSTANCE.carToCarDto(car);

      return carDto;

    }

}
