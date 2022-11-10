package com.javamypackage.orm.controller;

import com.javamypackage.orm.controller.dto.CarDto;
import com.javamypackage.orm.repository.CarRepository;
import com.javamypackage.orm.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @Autowired
    CarRepository carRepository;

//    @GetMapping("/cars")
//    public List<CarDto> getAllCars()
//    {
//        //return carService.getAllCars();
//    }

}
