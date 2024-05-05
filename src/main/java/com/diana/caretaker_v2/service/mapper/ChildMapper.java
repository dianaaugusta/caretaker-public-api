package com.diana.caretaker_v2.service.mapper;

import com.diana.caretaker_v2.entity.Child;
import com.diana.caretaker_v2.service.response.ChildDTO;

import java.util.ArrayList;
import java.util.List;

public class ChildMapper {

    public ChildMapper() {
    }

    public List<ChildDTO> mapToChildNameDTO(List<Child> children) {
        List<ChildDTO> dtos = new ArrayList<>();
        for (Child child : children) {
            dtos.add(new ChildDTO(child.getName(), child.getBirthdate()));
        }
        return dtos;
    }
}
