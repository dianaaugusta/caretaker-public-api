package com.diana.caretaker_v2.service.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;

import java.util.Date;

public class ChildDTO {
    private String name;

    private Date birthdate;



    public ChildDTO(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
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
}

