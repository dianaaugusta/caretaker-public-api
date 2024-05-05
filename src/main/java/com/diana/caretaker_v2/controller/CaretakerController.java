package com.diana.caretaker_v2.controller;

import com.diana.caretaker_v2.entity.Caretaker;
import com.diana.caretaker_v2.repository.CaretakerRepository;
import com.diana.caretaker_v2.service.CaretakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/caretakers")
public class CaretakerController {
    @Autowired
    private CaretakerRepository caretakerRepository;

    @Autowired
    private CaretakerService caretakerService;


    @PostMapping()
    public ResponseEntity<Void> postCaretaker(@RequestBody Caretaker caretaker) {

       caretakerService.insert(caretaker);
       return ResponseEntity.ok().build();
    }
}
