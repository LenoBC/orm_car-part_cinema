package com.javamypackage.orm.repository;

import com.javamypackage.orm.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car,Long> {
}
