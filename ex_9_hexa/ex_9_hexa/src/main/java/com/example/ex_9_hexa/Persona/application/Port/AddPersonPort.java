package com.example.ex_9_hexa.Persona.application.Port;

import com.example.ex_9_hexa.Persona.application.infrastructure.dto.input.PersonaDTOInput;
import com.example.ex_9_hexa.Persona.application.infrastructure.dto.output.PersonaDTOOutput;

public interface AddPersonPort {

    PersonaDTOOutput addPerson(PersonaDTOInput person) throws Exception;

}
