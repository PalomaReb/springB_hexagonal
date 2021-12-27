package Persona.application.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepoJPA extends JpaRepository<Person, Integer> {
    default List<Person> findByName(String name) {
        return null;
    }

}
