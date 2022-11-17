package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "flats")
@Getter
@Setter
public class Flat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flat_id")
    private long id;

//    @Column(name = "")
    private int floor;

    private int rooms;

    private int meters;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_worker")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Worker worker;
}
