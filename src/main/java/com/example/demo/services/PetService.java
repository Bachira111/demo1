package com.example.demo.services;

import com.example.demo.models.Pets;
import com.example.demo.rep.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;
    public List<Pets> getAllPets() { return petRepository.findAll(); }

    public Pets savePet(Pets pets) {
        return petRepository.save(pets);
    }
}
