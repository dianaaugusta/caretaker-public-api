package com.diana.caretaker_v2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String nameCaretaker;
    private String email;
    private Date dateCreated;

    @OneToMany(mappedBy = "caretaker")
    @JsonIgnore
    private List<Child> children;

    //private Date date = Date.valueOf(LocalDate.now());
    public Caretaker() {
    }

    public Caretaker(String name, String email) {
        this.nameCaretaker = name;
        this.email = email;
        this.dateCreated = Date.valueOf(LocalDate.now());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCaretaker() {
        return nameCaretaker;
    }

    public void setNameCaretaker(String nameCaretaker) {
        this.nameCaretaker = nameCaretaker;
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
