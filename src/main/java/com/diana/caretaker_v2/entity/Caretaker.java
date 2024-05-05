package com.diana.caretaker_v2.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Caretaker{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private Date dateCreated;

    @OneToMany(mappedBy = "caretaker")
    private List<Child> children;

    //private Date date = Date.valueOf(LocalDate.now());
    public Caretaker() {
    }

    public Caretaker(String name, String email) {
        this.name = name;
        this.email = email;
        this.dateCreated = Date.valueOf(LocalDate.now());
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
