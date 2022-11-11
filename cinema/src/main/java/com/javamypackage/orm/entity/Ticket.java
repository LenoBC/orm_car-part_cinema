package com.javamypackage.orm.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean is_discount;
    private Boolean is_student;
    private Boolean reservation;
    private Boolean approved_reservation;
    private Integer amount_of_seats;
    private Date date_of_purchase;

    @ManyToOne
    private Seance seance;

    @ManyToOne
    private User user;

    public Ticket() {
    }

    public Ticket(Boolean is_discount, Boolean is_student, Boolean reservation, Boolean approved_reservation, Integer amount_of_seats, Date date_of_purchase, Seance seance, User user) {
        this.is_discount = is_discount;
        this.is_student = is_student;
        this.reservation = reservation;
        this.approved_reservation = approved_reservation;
        this.amount_of_seats = amount_of_seats;
        this.date_of_purchase = date_of_purchase;
        this.seance = seance;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", is_discount=" + is_discount +
                ", is_student=" + is_student +
                ", reservation=" + reservation +
                ", approved_reservation=" + approved_reservation +
                ", amount_of_seats=" + amount_of_seats +
                ", date_of_purchase=" + date_of_purchase +
                ", seance=" + seance.toString() +
                ", user=" + user.toString() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Boolean getIs_discount() {
        return is_discount;
    }

    public void setIs_discount(Boolean is_discount) {
        this.is_discount = is_discount;
    }

    public Boolean getIs_student() {
        return is_student;
    }

    public void setIs_student(Boolean is_student) {
        this.is_student = is_student;
    }

    public Boolean getReservation() {
        return reservation;
    }

    public void setReservation(Boolean reservation) {
        this.reservation = reservation;
    }

    public Boolean getApproved_reservation() {
        return approved_reservation;
    }

    public void setApproved_reservation(Boolean approved_reservation) {
        this.approved_reservation = approved_reservation;
    }

    public Integer getAmount_of_seats() {
        return amount_of_seats;
    }

    public void setAmount_of_seats(Integer amount_of_seats) {
        this.amount_of_seats = amount_of_seats;
    }

    public Date getDate_of_purchase() {
        return date_of_purchase;
    }

    public void setDate_of_purchase(Date date_of_purchase) {
        this.date_of_purchase = date_of_purchase;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
