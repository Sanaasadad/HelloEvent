package com.helloevent.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Locale;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateReservation;
    private LocalDate dateEvenement;
    @ManyToOne
    private User user;
    @ManyToOne
    private Event event;

}
