package com.example.ex_9_hexa.Persona.application.controllers;

import com.example.ex_9_hexa.Persona.application.Port.GetPersonPort;
import com.example.ex_9_hexa.Persona.application.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GETcontroller {
    @Autowired
    GetPersonPort getPersonPort;

    @GetMapping("/id/{id}")
    public GetPersonPort getPersonById(@PathVariable int id) throws Exception{

        return (GetPersonPort) getPersonPort.getPersonById(id);
    }

    @GetMapping("/name/{name}")
    public List<Person> getPersonByName(@PathVariable String name) throws Exception{
        return getPersonPort.getByName(name);
    }

    @GetMapping("/person")
    public List<Person> getAllPerson() throws Exception {
        System.out.println("entro por aqui");
        return getPersonPort.getAllPerson();
    }


}
