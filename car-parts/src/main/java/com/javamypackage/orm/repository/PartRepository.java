package com.javamypackage.orm.repository;

import com.javamypackage.orm.entity.Part;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartRepository extends CrudRepository<Part,Long> {
    List<Part> findByPriceBetween(float minPrice, float maxPrice);
}
