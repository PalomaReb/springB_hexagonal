package com.example.ex_9_hexa.Persona.application.Port;

import com.example.ex_9_hexa.Persona.application.domain.Person;

import java.util.List;

public interface GetPersonPort {

    Person getPersonById(int id) throws Exception;
    List<Person> getAllPerson() throws Exception;
    List<Person> getByName(String name) throws Exception;
}
