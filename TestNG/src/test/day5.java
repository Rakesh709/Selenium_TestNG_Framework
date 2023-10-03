package test;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class day5 {
	

	
	@Test(enabled=false)
	public void mobileLoginHomeLoan() {
		System.out.println("enter to mobile login");
	}
	
	
	@Test(timeOut=4000)
	public void mobileLoginHomeLoan2() {
		System.out.println("enter to mobile login2");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileLoginHomeLoan3(String urlname) {
		System.out.println("enter to mobile login3");
		System.out.println(urlname);
	}
	
	
	
}
