package com.example.dami.controller;

import com.example.dami.model.Person;
import com.example.dami.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private IPersonRepository personRepository;

    @GetMapping()
    public List<Person> getPeople() {
        return personRepository.findAll();
    }

    @PostMapping()
    public List<Person> createPerson(Person person) {
        personRepository.save(person);
        return personRepository.findAll();
    }

}
