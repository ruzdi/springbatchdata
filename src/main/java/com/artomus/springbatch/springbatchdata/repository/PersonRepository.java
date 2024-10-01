package com.artomus.springbatch.springbatchdata.repository;


import com.artomus.springbatch.springbatchdata.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}