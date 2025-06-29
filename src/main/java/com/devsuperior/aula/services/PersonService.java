package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.dto.PersonDTO;
import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;

import jakarta.transaction.Transactional;


@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Transactional
	public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
	
	Person entity = new Person(); //criei/ instanciei a entidade Person	
	entity.setName(dto.getName()); // copia do entity para o dto
	entity.setSalary(dto.getSalary());
	
	/*
	//Traz apenas "id"
	Department dept = new Department(); //criei/ instanciei a entidade Department
	dept.setId(dto.getDepartment().getId());
	*/	
	
	//Traz "id e department" - o objeto inteiro
	Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId()); // lazy
	entity.setDepartment(dept); //vincula Department com Person
	
	entity = repository.save(entity);
	return new PersonDepartmentDTO(entity);
	}
	
	@Transactional
	public PersonDTO insert(PersonDTO dto) {
		
		Person entity = new Person(); // criei/ instanciei a entidade Person	
		entity.setName(dto.getName()); 
		entity.setSalary(dto.getSalary());		
		
		//Department dept = departmentRepository.getReferenceById(dto.getDepartmentId());		
		
		Department dept = new Department(); //criei/ instanciei a entidade Department
		dept.setId(dto.getDepartmentId());
		
		entity.setDepartment(dept); //vincula Department com Person
		
		entity = repository.save(entity);
		return new PersonDTO(entity);
		}
}
