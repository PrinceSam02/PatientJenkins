package com.example.demo.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Patient;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PatientRepoImpl {
	
	@Autowired
	EntityManager em;
	
	public String save(Patient patient) {
		if(patient!=null) {
			em.merge(patient);
			return "Success";
		}
		else {
			return "failure";
		}
	}

	public Patient findById(int id) {
		
		return em.find(Patient.class, id);
	}

	public List<Patient> findAll() {
		String hql="from Patient";
		Query query= em.createQuery(hql);
		return query.getResultList();
	}

	public String update(Patient patient) {
		if(patient!=null) {
			em.merge(patient);
			return "Success";
		}
		else {
			return "failure";
		}

		
	}

	
	public String deleteById(int id) {
		if(id!=0) {
			Patient pat = em.find(Patient.class, id);
		em.remove(pat);
		return "Deleted";
	}
		else {
			return "deletion Failure";
		}
	}
}
