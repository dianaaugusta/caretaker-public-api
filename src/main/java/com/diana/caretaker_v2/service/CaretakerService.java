package com.diana.caretaker_v2.service;

import com.diana.caretaker_v2.entity.Caretaker;
import com.diana.caretaker_v2.entity.Child;
import com.diana.caretaker_v2.repository.CaretakerRepository;
import com.diana.caretaker_v2.service.mapper.ChildMapper;
import com.diana.caretaker_v2.service.response.ChildDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaretakerService {
    private ChildMapper childMapper = new ChildMapper();

    @Autowired
    private CaretakerRepository caretakerRepository;

    public void insert(Caretaker caretaker){
        if(caretaker != null){
            caretakerRepository.save(caretaker);
        }
    }

    public List<ChildDTO> findChildrenByCaretakerId(Long caretakerId) {
        List<Child> children = caretakerRepository.findChildrenByCaretakerId(caretakerId);
        return childMapper.mapToChildNameDTO(children);
    }
}
