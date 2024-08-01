package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;
import com.example.demo.serviceimpl.PatientServiceImpl;

@RestController
@RequestMapping("/patient")
@CrossOrigin("*")
public class PatientController {
	
	@Autowired
	PatientServiceImpl service;
		
	@PostMapping
	public String insertPatient(@RequestBody Patient pat)
	{
		String msg="";
		try {
			service.addPatient(pat);
			msg="Insert Success";
		} 
		catch(Exception e) {	
			msg="Insert Failure";
		}
			return msg;
	}

	@GetMapping("{id}")
	public Patient getPatientById(@PathVariable("id") int id)
	{
		return service.getPatient(id);
		}

	@GetMapping("/all")
	public List<Patient> getPatient()
	{
		return service.getAllPatient();
		}

	@PutMapping()
	public String updatePatient(@RequestBody Patient pat)
	{
		String msg="";
	try {
		service.updatePatient(pat);
		msg="Update Success";
		} 	
			
	catch(Exception e) {
		msg="Updation Failure";
		}
		return msg;
	}

	@DeleteMapping("{id}")
	public String deletePatientById(@PathVariable("id") int id)
	{
		String msg="";
		try {
			service.deletePatient(id);
			msg="Deletion Success";
		} 
		catch(Exception e) {
			msg="Deletion Failure";
		}	
		return msg;
	}	

}
