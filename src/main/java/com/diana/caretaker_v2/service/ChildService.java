package com.diana.caretaker_v2.service;

import com.diana.caretaker_v2.entity.Child;
import com.diana.caretaker_v2.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildService {

    @Autowired
    private ChildRepository childRepository;

    public void insert(Child child){
        if(child != null){
            childRepository.save(child);
        }
    }
}
