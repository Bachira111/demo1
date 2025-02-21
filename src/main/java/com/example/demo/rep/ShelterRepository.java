package com.example.demo.rep;

import com.example.demo.models.Adopter;
import com.example.demo.models.Pets;
import com.example.demo.models.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelterRepository extends JpaRepository<Shelter, Long> {}

