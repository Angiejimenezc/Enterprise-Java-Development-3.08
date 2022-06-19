package com.demo.models;

import com.demo.enums.Status;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Member(int id, String name, Chapter chapter, Status status, Date renewalDate) {
        this.id = id;
        this.name = name;
        this.chapter = chapter;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    private String name;
    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    public Member() {

    }

    public Member(int id, String name, Status status, Date renewalDate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    @Enumerated(EnumType.STRING)
    private Status status;

    private Date renewalDate;

}