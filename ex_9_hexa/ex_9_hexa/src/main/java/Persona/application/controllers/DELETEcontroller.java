package Persona.application.controllers;

import Persona.application.Port.DeletePersonPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DELETEcontroller {

    @Autowired
    DeletePersonPort deletePersonPort;

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") int id) throws Exception{
        deletePersonPort.deletePerson(id);
    }
}
