package com.diana.caretaker_v2.service;

import com.diana.caretaker_v2.entity.Allergies;
import com.diana.caretaker_v2.repository.AllergyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllergyService {

    @Autowired
    private AllergyRepository allergyRepository;

    public void insert(Allergies allergies){
        if(allergies != null){
            allergyRepository.save(allergies);
        }
    }

    public List<Allergies> getAllAlergies(){
        return allergyRepository.findAll();
    }

}
