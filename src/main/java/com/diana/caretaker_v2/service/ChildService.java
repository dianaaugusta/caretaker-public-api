package com.diana.caretaker_v2.service;

import com.diana.caretaker_v2.entity.Child;
import com.diana.caretaker_v2.repository.ChildRepository;
import com.diana.caretaker_v2.service.mapper.CaretakerMapper;
import com.diana.caretaker_v2.service.response.ChildDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {

    @Autowired
    private ChildRepository childRepository;

    private CaretakerMapper caretakerMapper;

    public void insert(Child child){
        if(child != null){
            childRepository.save(child);
        }
    }

//    public List<Child> getAllChildrenDTO() {
//        List<Child> children = childRepository.findAll();
//        return caretakerMapper.mapToChildNameDTO(children);
//   }
}
