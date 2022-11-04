package com.javamypackage.orm.invoiceitem.entity;

import com.javamypackage.orm.invoice.entity.Invoice;
import com.javamypackage.orm.part.entity.Part;

import javax.persistence.*;

@Entity
@Table(name = "invoice_items")
public class InvoiceItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer amount;
    private Float price;
    private Float total_value;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    @OneToOne
    @JoinColumn(name = "part_id")
    private Part part;

    public InvoiceItem() {}

    public InvoiceItem(Integer amount, Float price) {
        this.amount = amount;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
