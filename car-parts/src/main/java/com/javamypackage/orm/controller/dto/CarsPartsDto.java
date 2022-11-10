package com.javamypackage.orm.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.javamypackage.orm.entity.Part;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

//@Getter
//@Setter
//@SuperBuilder
//@AllArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class CarsPartsDto {
    private Long id;
    private Part part;
}
