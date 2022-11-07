package com.javamypackage.orm.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "invoices")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date data_sale;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "invoice")
    private Set<InvoiceItem> invoiceItems;

    public Invoice() {}

    public Invoice(Date data_sale, User user, Set<InvoiceItem> invoiceItems) {
        this.data_sale = data_sale;
        this.user = user;
        this.invoiceItems = invoiceItems;
    }

    public Long getId() {
        return id;
    }

    public Date getData_sale() {
        return data_sale;
    }

    public void setData_sale(Date data_sale) {
        this.data_sale = data_sale;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(Set<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
}