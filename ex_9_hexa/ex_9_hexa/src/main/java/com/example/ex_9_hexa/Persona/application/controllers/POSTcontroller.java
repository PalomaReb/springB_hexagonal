package com.example.ex_9_hexa.Persona.application.controllers;


import com.example.ex_9_hexa.Persona.application.Port.AddPersonPort;
import com.example.ex_9_hexa.Persona.application.infrastructure.dto.input.PersonaDTOInput;
import com.example.ex_9_hexa.Persona.application.infrastructure.dto.output.PersonaDTOOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POSTcontroller {

    @Autowired
    AddPersonPort addPersonPort;

@PostMapping ("/addPerson")
    public PersonaDTOOutput addNewPerson(@RequestBody PersonaDTOInput person) throws  Exception {
    System.out.println("post controller hola");
   return addPersonPort.addPerson(person);
}
}
