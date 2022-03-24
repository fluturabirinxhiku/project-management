package com.pma.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer projectId;
	private String name;
	private String status;
	private String description;
	
	public Project() {}
	
	public Project(String name, String status, String description) {
		super();
		this.name = name;
		this.status = status;
		this.description = description;
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getProjectId() {
		return projectId;
	}
	
	
}
