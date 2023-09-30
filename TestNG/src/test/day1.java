package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void Demo() {
		System.out.println("Hello World!");
	}
	
	@Test
	public void SecondDemo() {
		System.out.println("Bye");
	}
	
	@AfterTest
	public void fourth() {
		System.out.println("This is the After test annotation");
	}
	
	@AfterSuite
	public void BeforeSuiteDemo() {
		System.out.println("IM the last suite annotation");
	}
}
