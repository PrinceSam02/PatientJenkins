package com.example.demo.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class PatientSel {

	@Test
	void test() {
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:3000/");
			assertEquals("React App",driver.getTitle());	
		}


	@Test
	void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3001/addcustomer");
		driver.findElement(By.name("name")).sendKeys("prabu");
		driver.findElement(By.name("disease")).sendKeys("Psyc");
		driver.findElement(By.name("button")).click();
		
	}}
	


