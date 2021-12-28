package com.example.ex_9_hexa.Persona.application.infrastructure.dto.output;


import com.example.ex_9_hexa.Persona.application.domain.Person;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class PersonaDTOOutput {
    public boolean isEmpty;
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


        public PersonaDTOOutput personaDTOOutput(Person person) {
            PersonaDTOOutput personaDTOOutput = new PersonaDTOOutput();
            personaDTOOutput.setUsuario(person.getUsuario());
            personaDTOOutput.setPassword(person.getPassword());
            personaDTOOutput.setName(person.getName());
            personaDTOOutput.setLastName(person.getLastName());
            personaDTOOutput.setComp_email(person.getComp_email());
            personaDTOOutput.setPersonal_email(person.getPersonal_email());
            personaDTOOutput.setCity(person.getCity());
            personaDTOOutput.setActive(person.getActive());
            personaDTOOutput.setCreated_date(person.getCreated_date());
            personaDTOOutput.setImage_url(person.getImage_url());
            personaDTOOutput.setTerm_date(person.getTerm_date());

            return personaDTOOutput;
        }

}
