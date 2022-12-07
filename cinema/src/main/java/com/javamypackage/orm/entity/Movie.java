package com.javamypackage.orm.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numberOfViews;
    private String title;

    @OneToMany(mappedBy = "movie")
    private Set<Seance> seances;

    public Movie() {
    }

    public Movie(Integer number_of_views, String title, Set<Seance> seances) {
        this.numberOfViews = number_of_views;
        this.title = title;
        this.seances = seances;
    }

    public Movie(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", number_of_views=" + numberOfViews +
                ", title='" + title + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Integer getNumber_of_views() {
        return numberOfViews;
    }

    public void setNumber_of_views(Integer number_of_views) {
        this.numberOfViews = number_of_views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }
}
