package com.javamypackage.orm.user.entity;

import com.javamypackage.orm.invoice.entity.Invoice;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String name;
    private String surname;
    private String phone_number;

    @OneToMany(mappedBy = "user")
    private Set<Invoice> invoices;

    public User() {}

    public User(String email, String name, String surname, String phone_number) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
