package com.artomus.springbatch.springbatchdata.processor;

import com.artomus.springbatch.springbatchdata.model.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person person) throws Exception {
        // You can implement some business logic here
        return person;
    }
}