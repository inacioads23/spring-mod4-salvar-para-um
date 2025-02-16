package com.devsuperior.aula.dto;

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
