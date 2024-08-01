package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;
import com.example.demo.repoimpl.PatientRepoImpl;
import com.example.demo.repository.PatientRepo;
import com.example.demo.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	PatientRepoImpl repo;
	
	@Override
	public String addPatient(Patient patient) {
		return(repo.save(patient));
	}
	
	@Override
	public Patient getPatient(int id) {		
		return repo.findById(id);
	}
	
	@Override
	public List<Patient> getAllPatient(){
		return repo.findAll();
	}
	 
	@Override
	public String updatePatient(Patient patient) {
		return (repo.save(patient));
	}
	
	public String deletePatient(int id) {
		return(repo.deleteById(id));
	}
	

}
