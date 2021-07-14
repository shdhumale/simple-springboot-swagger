package com.siddhu.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siddhu.model.Employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ApiOperation(value = "/", tags = "Employee controller" )
@RestController
public class IndexController {
	@GetMapping("/getEmployee")
	@ApiOperation(value = "To get the employee", response = Employee.class)
	public Employee getEmployee() {
		Employee objEmployee =  new Employee("1","Siddhu");
		//return "getEmployee called" + objEmployee.toString();
		return objEmployee;
	}


	@PostMapping("/insertEmployee/{id}/{name}")
	@ApiOperation(value = "To post the employee", response = Employee.class)
	public Employee insertEmployee(@PathVariable("id") String id ,@PathVariable("name") String name) {
		Employee objEmployee =  new Employee(id,name);
		System.out.println("insertEmployee called for id"+ objEmployee.getId() +"for name:" + objEmployee.getName());
		//return "insertEmployee called" + objEmployee.toString();
		return objEmployee;

	}

	@PutMapping("/updateEmployee/{id}/{name}")
	@ApiOperation(value = "To post the employee", response = Employee.class)
	public Employee updateEmployee(@PathVariable("id") String id ,@PathVariable("name") String name) {
		Employee objEmployee =  new Employee(id,name);
		System.out.println("updateEmployee called for id"+ objEmployee.getId() +"for name:" + objEmployee.getName());	
		//return "updateEmployee called" + objEmployee.toString();
		return objEmployee;

	}

	@DeleteMapping("/deleteEmployee/{id}")
	@ApiOperation(value = "To post the employee", response = Employee.class)
	public Employee deleteEmployee(@PathVariable("id") String id) {
		Employee objEmployee =  new Employee(id);
		System.out.println("deleteEmployee called for id"+ objEmployee.getId()+"for name:" + objEmployee.getName());
		//return "deleteEmployee called" + objEmployee.toString();
		return objEmployee;

	}
}