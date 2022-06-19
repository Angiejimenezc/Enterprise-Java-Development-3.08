package com.demo.models;


import javax.persistence.*;
import java.util.List;


@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String district;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;

    @OneToMany(mappedBy = "chapter")
    private List<Member> members;

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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public Chapter() {

    }
    public Chapter(int id, String name, String district, Member president, List<Member> members, Association association) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
        this.association = association;
    }

    @ManyToOne
    @JoinColumn(name = "association_id")
    private Association association;

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }
}