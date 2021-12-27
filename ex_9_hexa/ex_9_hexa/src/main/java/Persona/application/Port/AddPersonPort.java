package Persona.application.Port;

import Persona.application.infrastructure.dto.input.PersonaDTOInput;
import Persona.application.infrastructure.dto.output.PersonaDTOOutput;

public interface AddPersonPort {

    PersonaDTOOutput addPerson(PersonaDTOInput person) throws Exception;

}
