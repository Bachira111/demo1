package com.example.demo.controller;

import com.example.demo.models.Pets;
import com.example.demo.services.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
@RequiredArgsConstructor
public class PetController {
    private final PetService petService;

    @GetMapping
    public List<Pets> getAllPets() {
        return petService.getAllPets();
    }

    @PostMapping
    public ResponseEntity<Pets> addPet(@RequestBody Pets pets) {
        Pets savedPet = petService.savePet(pets);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPet);
    }
}
