package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;


public interface PatientService {
	public String addPatient(Patient patient);
	public Patient getPatient(int id);
	public List<Patient> getAllPatient();
	public String updatePatient(Patient patient);
	public String deletePatient(int id);

}
