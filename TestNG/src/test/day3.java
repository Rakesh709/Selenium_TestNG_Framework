package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(groups= {"Smoke"})
	public void webLoginHomeLoan() {
		System.out.println("enter to weblogin");
	}
	
	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("enter to mobile login");
	}
	
	@Test
	public void mobileLoginHomeLoan2() {
		System.out.println("enter to mobile login");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileLoginHomeLoan3(String urlname) {
		System.out.println("enter to mobile login");
		System.out.println(urlname);
	}
	
	
	
	@Test(dependsOnMethods= {"webLoginHomeLoan","mobile.*"})
	public void apiLoginHomeLoan() {
		System.out.println("enter to login API");
	}
}
