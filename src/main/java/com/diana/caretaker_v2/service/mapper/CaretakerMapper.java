package com.diana.caretaker_v2.service.mapper;

import com.diana.caretaker_v2.entity.Caretaker;
import com.diana.caretaker_v2.entity.Child;
import com.diana.caretaker_v2.service.response.CaretakerDTO;
import com.diana.caretaker_v2.service.response.ChildDTO;

import java.util.ArrayList;
import java.util.List;

public class CaretakerMapper {
    public CaretakerMapper() {
    }

    public List<CaretakerDTO> mapCaretakerDTO(List<Caretaker> caretaker) {
        List<CaretakerDTO> dtos = new ArrayList<>();
        for (Caretaker c : caretaker) {
            dtos.add(new CaretakerDTO(c.getNameCaretaker(), c.getEmail()));
        }
        return dtos;
    }
}
