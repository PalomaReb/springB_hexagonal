package com.example.ex_9_hexa.Persona.application.Port;

import com.example.ex_9_hexa.Persona.application.domain.PersonRepoJPA;
import com.example.ex_9_hexa.Persona.application.infrastructure.dto.output.PersonaDTOOutput;
import org.springframework.beans.factory.annotation.Autowired;

public class DeletePersonIMPL implements DeletePersonPort {

    @Autowired
    PersonRepoJPA personRepoJPA;

    public void deleteById (int id) throws Exception{
        if( personRepoJPA.findById(id).isPresent()){
            personRepoJPA.deleteById(id);
        }
    }


    @Override
    public void deletePerson(int id) throws Exception {

    }

    @Override
    public PersonaDTOOutput findById(int id) throws Exception {
        return null;
    }
}
