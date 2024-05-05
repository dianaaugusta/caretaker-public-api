package com.diana.caretaker_v2.service;

import com.diana.caretaker_v2.entity.Caretaker;
import com.diana.caretaker_v2.repository.CaretakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaretakerService {

    @Autowired
    private CaretakerRepository caretakerRepository;

    public void insert(Caretaker caretaker){
        if(caretaker != null){
            caretakerRepository.save(caretaker);
        }
    }
}
