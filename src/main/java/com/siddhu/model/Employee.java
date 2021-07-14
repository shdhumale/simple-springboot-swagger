package com.siddhu.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "This is employee model")
public class Employee {
	@ApiModelProperty(notes = "Id of the employee", name = "id", required = true, value = "1")
	public String id;
	@ApiModelProperty(notes = "Name of the employee", name = "name", required = true, value = "siddhu")
	public String name;


	public Employee() { 
	}

	public Employee(String id) { 
		this.id = id;	
		this.name= "default";
	}
	
	public Employee(String id, String name) { 
		this.id = id;
		this.name= name; 
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name  + "]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




}
