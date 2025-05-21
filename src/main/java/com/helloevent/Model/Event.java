package com.helloevent.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Titre;
    private LocalDate date;
    private String location;
    private String category;
    private String description;
    @OneToMany(mappedBy = "event")
    List<Reservation> reservationList;
}
