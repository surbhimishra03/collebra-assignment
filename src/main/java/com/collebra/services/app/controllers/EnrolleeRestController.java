package com.collebra.services.app.controllers;

import com.collebra.services.app.models.DependentEnrollee;
import com.collebra.services.app.services.EnrolleeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.collebra.services.app.models.Enrollee;

import java.util.List;

@RestController
public class EnrolleeRestController {

	@Autowired
	private EnrolleeService enrolleeService;

	public void EnrolleeService(EnrolleeService enrolleeService)
	{
		this.enrolleeService = enrolleeService;
	}

	@PostMapping("/api/enrollee/create")
	public void saveEnrollee(@RequestBody long id, String name, boolean activation_Status, String birth_Day, String phone_Number)
	{
		Enrollee enrollee = new Enrollee(id, name, activation_Status, birth_Day, phone_Number);
		enrolleeService.createEnrollee(enrollee);
	}

	@GetMapping("/api/enrollee/get")
	public List<Enrollee> getEnrollees()
	{
		return enrolleeService.getEnrollees();
	}

	@PutMapping("/api/enrollee/modify")
	public void modifyEnrollee(long id, String name, boolean activation_Status, String birth_Day, String phone_Number)
	{
		Enrollee enrollee = new Enrollee(id, name, activation_Status, birth_Day, phone_Number);
		enrolleeService.modifyEnrollee(enrollee);
	}

	@DeleteMapping("/api/enrollee/remove")
	public void removeEnrollee(long id)
	{
		enrolleeService.removeEnrollee(id);
	}

	@PostMapping("/api/enrollee/dependent/add")
	public void addDependent(long enrollee_ID, DependentEnrollee dependentEnrollee)
	{
		enrolleeService.addDependent(enrollee_ID, dependentEnrollee);
	}

	@DeleteMapping("/api/enrollee/dependent/remove")
	public void removeDependent(long enrollee_ID, long dependent_ID)
	{
		enrolleeService.removeDependent(enrollee_ID, dependent_ID);
	}
}

