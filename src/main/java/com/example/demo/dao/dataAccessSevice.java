package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("postgres")
public class dataAccessSevice implements PersonDao{
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public dataAccessSevice(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insertPerson(UUID id, Person person) {

    }

    @Override
    public List<Person> selectAllPeople() {
        String sql="SELECT * FROM person";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            UUID id = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            return new Person(id, name);
        });
    }

    @Override
    public void deletePersonById(UUID id) {

    }

    @Override
    public void updatePersonById(UUID id, Person person) {

    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }
}
