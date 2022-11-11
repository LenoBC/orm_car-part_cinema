package com.javamypackage.orm.repository;

import com.javamypackage.orm.entity.Movie;
import com.javamypackage.orm.entity.Seance;
import com.javamypackage.orm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;

@Repository
public interface SeanceRepository extends JpaRepository<Seance, Long> {
    @Query("SELECT new com.javamypackage.orm.entity.Movie(m.title) FROM seances s INNER JOIN movies m on m.id = s.movie_id WHERE s.hall_id = ?1")
    List<Movie> findByHallId(long hall_id, Pageable pageable);

    @Query("SELECT new com.javamypackage.orm.entity.Seance(s.date_seance) FROM seances s INNER JOIN movies m on m.id = s.movie_id WHERE s.hall_id = ?1")
    List<Seance> findBySeanceId(long hall_id, Pageable pageable);

    @Query("SELECT new com.javamypackage.orm.entity.Seance(s.date_seance) FROM seances s INNER JOIN movies m on m.id = s.movie_id WHERE s.movie_id = ?1")
    List<Seance> findByMovieId(long movie_id, Pageable pageable);

    @Query("SELECT new com.javamypackage.orm.entity.Seance(s.date_seance) FROM seances s INNER JOIN movies m on m.id = s.movie_id WHERE m.title = ?1")
    List<Seance> findByMovieTitle(String title, Pageable pageable);

    @Query("SELECT new com.javamypackage.orm.entity.User(u.name) FROM seances s INNER JOIN tickets t on t.seance_id = s.id " +
            "INNER JOIN users u on u.id = t.user_id WHERE s.id = ?1")
    List<User> findUserBySeanceId(long seance_id, Pageable pageable);

    @Query("SELECT new com.javamypackage.orm.entity.Seance(s.date_seance) FROM seances s INNER JOIN tickets t on t.seance_id = s.id " +
            "INNER JOIN users u on u.id = t.user_id WHERE u.id = ?1")
    List<Seance> findSeanceByUserId(long user_id, Pageable pageable);

    @Query("SELECT new com.javamypackage.orm.entity.Seance(s.date_seance) FROM seances s INNER JOIN tickets t on t.seance_id = s.id " +
            "INNER JOIN users u on u.id = t.user_id WHERE u.login = ?1")
    List<Seance> findSeanceByLogin(String login, Pageable pageable);

    @Query("SELECT sum(t.amount_of_seats) s.date_seance FROM seances s INNER JOIN tickets t on t.seance_id = s.id " +
            "INNER JOIN halls h on h.id = s.hall_id WHERE h.hall_number = ?1 and s.date_seance = ?2")
    int sumAmountOfSeats(int hall_number, Date date_seance, Pageable pageable);

    @Query("SELECT sum(t.amount_of_seats) FROM seances s INNER JOIN tickets t on t.seance_id = s.id " +
            "WHERE s.id = ?1")
    int sumAmountOfSeats(long seance_id, Pageable pageable);

    @Query("SELECT count(distinct s.hall_id) FROM seances s WHERE s.movie_id = ?1")
    int countHallByMovie(long movie_id, Pageable pageable);

    @Query("SELECT sum(t.amount_of_seats) FROM tickets t " +
            "INNER JOIN users u on u.id = t.user_id WHERE u.name = ?1" +
            " AND t.date_of_purchase BETWEEN ?2 AND ?3")
    int sumAmountOfSeatsByUserAndDateOfPurchase(String user_name, Date from, Date to, Pageable pageable);
}
