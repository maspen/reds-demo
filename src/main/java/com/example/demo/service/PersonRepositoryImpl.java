package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonRepositoryImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> loadAll() {
		return personRepository.findAll();
	}
	
	
}
