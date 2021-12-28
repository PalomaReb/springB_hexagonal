package com.example.ex_9_hexa.Persona.application.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepoJPA extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);

}
