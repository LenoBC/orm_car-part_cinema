package com.javamypackage.orm.controller.dto;


import com.javamypackage.orm.entity.CarsParts;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Data
public class CarDto {
    private Long id;
    private String model;
    private String brand;
    private String generation;
    private Set<CarsParts> carsParts;
}
