package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Patient;

public interface PatientRepo {
	Patient findById(int id);

	String save(Patient patient);

	String update(Patient patient);

	String deleteById(int id);

	List<Patient> findAll();
}
