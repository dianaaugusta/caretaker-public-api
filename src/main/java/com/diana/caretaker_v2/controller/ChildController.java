package com.diana.caretaker_v2.controller;

import com.diana.caretaker_v2.entity.Caretaker;
import com.diana.caretaker_v2.entity.Child;
import com.diana.caretaker_v2.repository.ChildRepository;
import com.diana.caretaker_v2.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/children")
public class ChildController {
    @Autowired
    private ChildRepository childRepository;
    @Autowired
    private ChildService childService;

    @PostMapping()
    public ResponseEntity<Void> postChild(@RequestBody Child child) {
        childService.insert(child);
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<Child>> getChildren(){
        List<Child> childList = childRepository.findAll();
        if(childList != null){
            return ResponseEntity.ok().body(childList);
        }
        return ResponseEntity.notFound().build();
    }

}
