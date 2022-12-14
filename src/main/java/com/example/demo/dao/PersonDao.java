package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    void insertPerson(UUID id, Person person);
    default void insertPerson(Person person){
        UUID id=UUID.randomUUID();
        insertPerson(id, person);
    }
    List <Person> selectAllPeople();

    void deletePersonById(UUID id);
    void updatePersonById(UUID id, Person person);
     Optional<Person> selectPersonById(UUID id);
}
