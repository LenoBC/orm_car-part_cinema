package com.javamypackage.orm.entity;

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

    @OneToMany(mappedBy = "car")
    private Set<CarsParts> carsParts;

    public Car() {}

    public Car(String model, String brand, String generation, Set<CarsParts> carsParts) {
        this.model = model;
        this.brand = brand;
        this.generation = generation;
        this.carsParts = carsParts;
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

    public Set<CarsParts> getCarsParts() {
        return carsParts;
    }

    public void setCarsParts(Set<CarsParts> carsParts) {
        this.carsParts = carsParts;
    }
}
