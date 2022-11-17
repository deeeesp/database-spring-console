package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "workers")
@Getter
@Setter
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_worker")
    private long id;

    @Column(name = "worker_name")
    private String name;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(mappedBy = "worker")
    private List<Flat> flats;
}
