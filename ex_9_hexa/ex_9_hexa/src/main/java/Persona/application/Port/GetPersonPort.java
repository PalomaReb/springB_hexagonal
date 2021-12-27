package Persona.application.Port;

import Persona.application.domain.Person;

import java.util.List;

public interface GetPersonPort {

    Person getPersonById(int id) throws Exception;
    List<Person> getAllPerson() throws Exception;
    List<Person> getByName(String name) throws Exception;
}
