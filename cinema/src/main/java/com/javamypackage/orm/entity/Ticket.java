package com.javamypackage.orm.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean isDiscount;
    private Boolean isStudent;
    private Boolean reservation;
    private Boolean approvedReservation;
    private Integer amountOfSeats;
    private Date dateOfPurchase;

    @ManyToOne
    private Seance seance;

    @ManyToOne
    private User user;

    public Ticket() {
    }

    public Ticket(Boolean isDiscount, Boolean isStudent, Boolean reservation, Boolean approvedReservation, Integer amountOfSeats, Date dateOfPurchase, Seance seance, User user) {
        this.isDiscount = isDiscount;
        this.isStudent = isStudent;
        this.reservation = reservation;
        this.approvedReservation = approvedReservation;
        this.amountOfSeats = amountOfSeats;
        this.dateOfPurchase = dateOfPurchase;
        this.seance = seance;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", isDiscount=" + isDiscount +
                ", isStudent=" + isStudent +
                ", reservation=" + reservation +
                ", approvedReservation=" + approvedReservation +
                ", amountOfSeats=" + amountOfSeats +
                ", dateOfPurchase=" + dateOfPurchase +
                ", seance=" + seance.toString() +
                ", user=" + user.toString() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Boolean getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(Boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public Boolean getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(Boolean isStudent) {
        this.isStudent = isStudent;
    }

    public Boolean getReservation() {
        return reservation;
    }

    public void setReservation(Boolean reservation) {
        this.reservation = reservation;
    }

    public Boolean getApprovedReservation() {
        return approvedReservation;
    }

    public void setApprovedReservation(Boolean approvedReservation) {
        this.approvedReservation = approvedReservation;
    }

    public Integer getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(Integer amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
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
