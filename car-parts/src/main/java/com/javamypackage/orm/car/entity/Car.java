package com.javamypackage.orm.car.entity;

import com.javamypackage.orm.part.entity.Part;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    private String brand;
    private String generation;
    @ManyToMany
    @JoinTable(
            name = "cars_parts",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "part_id"))
    private Set<Part> parts;

    public Car() {}

    public Car(String model, String brand, String generation) {
        this.model = model;
        this.brand = brand;
        this.generation = generation;
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }
}
