package com.example.techprotocol.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "relations")
@Entity
public class Relation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
