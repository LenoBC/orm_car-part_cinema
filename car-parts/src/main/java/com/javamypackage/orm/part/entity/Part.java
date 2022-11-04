package com.javamypackage.orm.part.entity;

import com.javamypackage.orm.car.entity.Car;
import com.javamypackage.orm.category.entity.Category;
import com.javamypackage.orm.invoiceitem.entity.InvoiceItem;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "parts")
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String symbol;
    private String description;
    private Float price;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @ManyToMany(mappedBy = "parts")
    private Set<Car> cars;

    @OneToOne(mappedBy = "part")
    private InvoiceItem invoiceItem;

    public Part() {}

    public Part(String name, String symbol, String description, Float price) {
        this.name = name;
        this.symbol = symbol;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
