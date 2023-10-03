package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("It will print before the class.");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("It will print after  the class.");
	}
	
	
	@Test
	public void third() {
		System.out.println("Good");
	}
	
	
	
	@BeforeMethod
	public void BeforeMethodDemo() {
		System.out.println("This will run before each method");
	}
	
	
	@BeforeTest
	public void fourth() {
		System.out.println("This is the before test annotation");
	}
	
	
	

}
