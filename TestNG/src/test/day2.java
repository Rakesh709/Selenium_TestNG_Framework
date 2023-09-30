package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
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
