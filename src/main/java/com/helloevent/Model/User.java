package com.helloevent.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Email;
    private String password;
    private String Role;
    @OneToMany(mappedBy = "user")
    List<Reservation> reservationList;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
}
