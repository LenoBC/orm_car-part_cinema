package com.javamypackage.orm.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "parts")
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String symbol;
    private String description;
    private Float price;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @OneToMany(mappedBy = "part")
    private Set<CarsParts> carsParts;

    @OneToOne(mappedBy = "part")
    private InvoiceItem invoiceItem;

    public Part() {}

    public Part(String name, String symbol, String description, Float price, Category category, Set<CarsParts> carsParts, InvoiceItem invoiceItem) {
        this.name = name;
        this.symbol = symbol;
        this.description = description;
        this.price = price;
        this.category = category;
        this.carsParts = carsParts;
        this.invoiceItem = invoiceItem;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<CarsParts> getCarsParts() {
        return carsParts;
    }

    public void setCarsParts(Set<CarsParts> carsParts) {
        this.carsParts = carsParts;
    }

    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }
}
