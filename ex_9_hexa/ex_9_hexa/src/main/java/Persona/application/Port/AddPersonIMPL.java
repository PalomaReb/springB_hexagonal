package Persona.application.Port;

import Persona.application.domain.PersonRepoJPA;
import Persona.application.infrastructure.dto.input.PersonaDTOInput;
import Persona.application.infrastructure.dto.output.PersonaDTOOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddPersonIMPL implements AddPersonPort {
    @Autowired
    PersonRepoJPA personRepoJPA;

    public PersonaDTOOutput addPerson(PersonaDTOInput person) throws Exception{
        if(person == null) {throw new Exception("Persona no existe");}
        personRepoJPA.saveAndFlush(person.toPersona(person));
        return addPerson(person);
    }
}
