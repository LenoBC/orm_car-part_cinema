package com.javamypackage.orm.service;

import com.javamypackage.orm.controller.dto.CarDto;
import com.javamypackage.orm.entity.Car;
import com.javamypackage.orm.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;


//    public List<CarDto> getAllCars() {
//        return carRepository.findByModel("x")
//                .stream()
//                .map(this::convertEntityToDto)
//                .collect(Collectors.toList());
//    }

    private CarDto convertEntityToDto(Car car) {
        CarDto carDto = new CarDto();
        carDto.setId(car.getId());
        carDto.setModel(car.getModel());
        carDto.setBrand(car.getBrand());
        carDto.setGeneration(car.getGeneration());
        carDto.setCarsParts(car.getCarsParts());
        return carDto;
    }
}
