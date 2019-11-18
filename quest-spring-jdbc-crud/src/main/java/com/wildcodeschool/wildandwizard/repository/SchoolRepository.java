package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.School;

import java.util.List;

public class SchoolRepository implements CrudDao<School> {

    @SuppressWarnings("unused")
	private final static String DB_URL = "jdbc:mysql://localhost:3306/spring_jdbc_quest?serverTimezone=GMT";
    @SuppressWarnings("unused")
	private final static String DB_USER = "h4rryp0tt3r";
    @SuppressWarnings("unused")
	private final static String DB_PASSWORD = "YES";

    @Override
    public School save(School school) {

        // TODO Create
        return null;
    }

    @Override
    public School findById(Long id) {

        // TODO Read one
        return null;
    }

    @Override
    public List<School> findAll() {

        // TODO Read all
        return null;
    }

    @Override
    public School update(School school) {

        // TODO Update
        return null;
    }

    @Override
    public void deleteById(Long id) {

        // TODO Delete
    }
}
