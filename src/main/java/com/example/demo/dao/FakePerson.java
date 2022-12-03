package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePerson implements PersonDao{
    private static final List<Person> DB= new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id,person.name()));
        return 1;
    }


    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public void deletePersonById(UUID id) {
        Optional<Person> personMayBe = selectPersonById(id);
        if (personMayBe.isEmpty()) {
            return;
        }
        DB.remove(personMayBe.get());

    }

    @Override
    public void updatePersonById(UUID id, Person update) {
        selectPersonById(id).map(person -> {
            int indexOfPersonToUpdate = DB.indexOf(person);
            if (indexOfPersonToUpdate >= 0) {
                DB.set(indexOfPersonToUpdate, new Person(id, update.name()));
                return 1;
            }
            return 0;
        });
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream().filter(person -> person.id().equals(id)).findFirst();
    }


}
