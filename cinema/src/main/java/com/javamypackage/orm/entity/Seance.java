package com.javamypackage.orm.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "seances")
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date_seance;

    @ManyToOne
    private Hall hall;

    @ManyToOne
    private Movie movie;

    @OneToMany(mappedBy = "seance")
    private Set<Ticket> tickets;

    public Seance() {
    }

    public Seance(Date date_seance, Hall hall, Movie movie, Set<Ticket> tickets) {
        this.date_seance = date_seance;
        this.hall = hall;
        this.movie = movie;
        this.tickets = tickets;
    }

    public Seance(Date date_seance) {
        this.date_seance = date_seance;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "id=" + id +
                ", date_seance=" + date_seance +
                ", hall=" + hall +
                ", movie=" + movie.toString() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Date getDate_seance() {
        return date_seance;
    }

    public void setDate_seance(Date date_seance) {
        this.date_seance = date_seance;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
