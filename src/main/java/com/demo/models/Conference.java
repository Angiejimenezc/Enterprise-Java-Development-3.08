package com.demo.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Conference extends Event{

    @ManyToMany
    @JoinTable(name ="conference_speakers",
            joinColumns = {@JoinColumn(name="conference_id")},
            inverseJoinColumns = {@JoinColumn(name="speakers_id")})
    private Set<Speaker> speakers = new HashSet<Speaker>();


    public Conference() {
    }

    public Conference(Long id, Date date, int duration, String location, String title, Set<Guest> list, Set<Speaker> speakers) {
        super(id, date, duration, location, title, list);
        this.speakers = speakers;
    }

    public Set<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Set<Speaker> speakers) {
        this.speakers = speakers;
    }
}
