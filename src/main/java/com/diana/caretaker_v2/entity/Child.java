package com.diana.caretaker_v2.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    @Column(name = "birthdate")
    private Date birthdate;

    private String bloodtype;

    @ManyToOne
    @JoinColumn(name = "caretaker_id")
    private Caretaker caretaker;

    public Child() {
    }

    public Child(int id, String name, Date birthdate, String bloodtype) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.bloodtype = bloodtype;
    }

    public Child(String name, Date birthdate, String bloodtype, Caretaker caretaker) {
        this.name = name;
        this.birthdate = birthdate;
        this.bloodtype = bloodtype;
        this.caretaker = caretaker;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public Caretaker getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(Caretaker caretaker) {
        this.caretaker = caretaker;
    }
}
