package Persona.application.Port;

import Persona.application.infrastructure.dto.output.PersonaDTOOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public interface DeletePersonPort {


    void deletePerson(int id) throws Exception;
    PersonaDTOOutput findById(int id) throws Exception;

}
