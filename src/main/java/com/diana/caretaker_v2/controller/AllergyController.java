package com.diana.caretaker_v2.controller;

import com.diana.caretaker_v2.entity.Allergies;
import com.diana.caretaker_v2.repository.AllergyRepository;
import com.diana.caretaker_v2.service.AllergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allergies")
public class AllergyController {
    @Autowired
    private AllergyRepository allergyRepository;

    @Autowired
    private AllergyService allergyService;

    @GetMapping()
    public ResponseEntity<List<Allergies>> getAllAllergies() {
        return ResponseEntity.ok().body(allergyService.getAllAlergies());
    }

    @PostMapping()
    public ResponseEntity<Void> postAllergy(@RequestBody Allergies allergies) {
        allergyService.insert(allergies);
        return ResponseEntity.ok().build();
    }

}
