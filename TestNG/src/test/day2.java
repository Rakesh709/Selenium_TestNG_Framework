package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void third() {
		System.out.println("Good");
	}
	
	@BeforeTest
	public void fourth() {
		System.out.println("This is the before test annotation");
	}
	
	

}
