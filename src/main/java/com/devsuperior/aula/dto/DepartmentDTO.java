package com.devsuperior.aula.dto;

// 2- criada "class DepartmentDTO"
public class DepartmentDTO {

	private Long id;
	private String name;
	
			
	public DepartmentDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
}
