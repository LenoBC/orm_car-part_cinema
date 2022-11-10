package com.javamypackage.orm.repository;

import com.javamypackage.orm.entity.CarsParts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsPartsRepository extends CrudRepository<CarsParts, Long> {
}
