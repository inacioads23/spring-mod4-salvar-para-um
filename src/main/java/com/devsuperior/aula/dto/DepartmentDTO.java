package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;

// 2- criada "class DepartmentDTO"
public class DepartmentDTO {

	private Long id;
	private String name;
	
			
	public DepartmentDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//8-
	//Copio da entidade para o DTO
	public DepartmentDTO(Department entity) {
		id = entity.getId();
		name = entity.getName();
	}
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
}
