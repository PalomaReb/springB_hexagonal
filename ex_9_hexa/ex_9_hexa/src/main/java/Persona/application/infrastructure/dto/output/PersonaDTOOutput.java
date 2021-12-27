package Persona.application.infrastructure.dto.output;


import Persona.application.domain.Person;
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


        public Person getPersona(Persona.application.infrastructure.dto.output.PersonaDTOOutput personaDTOOutput) {
            Person person = new Person();
            person.setUsuario(personaDTOOutput.getUsuario());
            person.setPassword(personaDTOOutput.getPassword());
            person.setName(personaDTOOutput.getName());
            person.setLastName(personaDTOOutput.getLastName());
            person.setComp_email(personaDTOOutput.getComp_email());
            person.setPersonal_email(personaDTOOutput.getPersonal_email());
            person.setCity(personaDTOOutput.getCity());
            person.setActive(personaDTOOutput.getActive());
            person.setCreated_date(personaDTOOutput.getCreated_date());
            person.setImage_url(personaDTOOutput.getImage_url());
            person.setTerm_date(personaDTOOutput.getTerm_date());

            return person;
        }

}
