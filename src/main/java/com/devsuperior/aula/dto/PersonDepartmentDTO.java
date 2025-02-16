package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDepartmentDTO {
	
	private Long id;
	private String name;
	private Double salary;
	
	//1- criar a "class DepartmentDTO"
		
	private DepartmentDTO department; //3 - Criar/ instanciar o objeto DTO

	public PersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;		
	}

	//7-
	//Copio da entidade para o DTO
	public PersonDepartmentDTO(Person entity) {
		id = entity.getId();
		name = entity.getName();
		salary = entity.getSalary();
		department = new DepartmentDTO(entity.getDepartment());
	}
	
	
	//Apenas Getters
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}
	
	
	

}
