package Persona.application.Port;

import Persona.application.domain.Person;
import Persona.application.domain.PersonRepoJPA;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GetPersonIMPL implements GetPersonPort {

    @Autowired
    PersonRepoJPA personRepoJPA;

    public List<Person> getAllPerson(){
        return personRepoJPA.findAll();
    }

    public Person getPersonById(int id)throws Exception{
        return personRepoJPA.findById(id).orElseThrow(() -> new Exception("not found"));
    }

    @Override
    public List<Person> getByName(String name) throws Exception {
        return personRepoJPA.findByName(name);
    }
}