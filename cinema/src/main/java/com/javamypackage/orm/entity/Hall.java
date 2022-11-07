package com.javamypackage.orm.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "halls")
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number_of_seats;
    private Integer hall_number;

    @ManyToOne
    private Cinema cinema;

    @OneToMany(mappedBy = "hall")
    private Set<Seance> seances;

    public Hall() {
    }

    public Hall(Integer number_of_seats, Integer hall_number, Cinema cinema, Set<Seance> seances) {
        this.number_of_seats = number_of_seats;
        this.hall_number = hall_number;
        this.cinema = cinema;
        this.seances = seances;
    }

    public Long getId() {
        return id;
    }

    public Integer getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(Integer number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public Integer getHall_number() {
        return hall_number;
    }

    public void setHall_number(Integer hall_number) {
        this.hall_number = hall_number;
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
