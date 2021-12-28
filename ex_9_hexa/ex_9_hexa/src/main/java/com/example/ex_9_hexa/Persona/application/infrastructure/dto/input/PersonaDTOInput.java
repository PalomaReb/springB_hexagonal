package com.example.ex_9_hexa.Persona.application.infrastructure.dto.input;


import com.example.ex_9_hexa.Persona.application.domain.Person;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class PersonaDTOInput {

    private String usuario;
    private String password;
    private String name;
    private String lastName;
    private String comp_email;
    private String personal_email;
    private String city;
    private Boolean active;
    private Date created_date;
    private String image_url;
    private Date term_date;


    public Person toPersona(PersonaDTOInput personaDTOInput){
        Person person = new Person();
        person.setUsuario(personaDTOInput.getUsuario());
        person.setPassword(personaDTOInput.getPassword());
        person.setName(personaDTOInput.getName());
        person.setLastName(personaDTOInput.getLastName());
        person.setComp_email(personaDTOInput.getComp_email());
        person.setPersonal_email(personaDTOInput.getPersonal_email());
        person.setCity(personaDTOInput.getCity());
        person.setActive(personaDTOInput.getActive());
        person.setCreated_date(personaDTOInput.getCreated_date());
        person.setImage_url(personaDTOInput.getImage_url());
        person.setTerm_date(personaDTOInput.getTerm_date());

        return person;
    }
}
