package com.demo.models;


import javax.persistence.Entity;
import java.util.Date;
import java.util.Set;

@Entity
public class Exposition extends Event {
    public Exposition() {
    }

    public Exposition(Long id, Date date, int duration, String location, String title, Set<Guest> list) {
        super(id, date, duration, location, title, list);
    }
}
