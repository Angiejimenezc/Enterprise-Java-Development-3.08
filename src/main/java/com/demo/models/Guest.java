package com.demo.models;

import com.demo.enums.Status2;

import javax.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status2 status;

    public Guest() {
    }

    public Guest(Long id, String name, Status2 status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status2 getStatus() {
        return status;
    }

    public void setStatus(Status2 status) {
        this.status = status;
    }
}
