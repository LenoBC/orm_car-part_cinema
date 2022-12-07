package com.javamypackage.orm.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "halls")
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numberOfSeats;
    private String hallName;

    @ManyToOne
    private Cinema cinema;

    @OneToMany(mappedBy = "hall")
    private Set<Seance> seances;

    public Hall() {
    }

    public Hall(Integer number_of_seats, String hallName, Cinema cinema, Set<Seance> seances) {
        this.numberOfSeats = number_of_seats;
        this.hallName = hallName;
        this.cinema = cinema;
        this.seances = seances;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "id=" + id +
                ", number_of_seats=" + numberOfSeats +
                ", hall_number=" + hallName +
                ", cinema=" + cinema.toString() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Integer getNumber_of_seats() {
        return numberOfSeats;
    }

    public void setNumber_of_seats(Integer number_of_seats) {
        this.numberOfSeats = number_of_seats;
    }

    public String getHall_number() {
        return hallName;
    }

    public void setHall_number(String hallName) {
        this.hallName = hallName;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }
}
