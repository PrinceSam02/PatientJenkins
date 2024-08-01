package com.example.demo.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class PatientServiceImplTest {
	@Autowired
	PatientServiceImpl psi;
	
//	@Test
//	void testAddPatient() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetPatient() {
//		fail("Not yet implemented");
//	}

	@Test
	void testGetAllPatient() {
		
		assertNotNull(psi.getAllPatient());
	}

//	@Test
//	void testUpdatePatient() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeletePatient() {
//		fail("Not yet implemented");
//	}

}
