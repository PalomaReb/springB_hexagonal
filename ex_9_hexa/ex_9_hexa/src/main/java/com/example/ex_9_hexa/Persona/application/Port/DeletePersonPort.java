package com.example.ex_9_hexa.Persona.application.Port;

import com.example.ex_9_hexa.Persona.application.infrastructure.dto.output.PersonaDTOOutput;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface DeletePersonPort {


    void deletePerson(int id) throws Exception;
    PersonaDTOOutput findById(int id) throws Exception;

}
