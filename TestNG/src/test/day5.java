package test;

import org.testng.annotations.Test;

public class day5 {
	
	@Test
	public void webLoginHomeLoan() {
		System.out.println("enter to weblogin");
	}

	
	@Test(dependsOnMethods= {"webLoginHomeLoan"})
	public void apiLoginHomeLoan() {
		System.out.println("enter to login API");
	}
	
	
	@Test(enabled=false)
	public void mobileLoginHomeLoan() {
		System.out.println("enter to mobile login");
	}
	
	
	@Test(timeOut=4000)
	public void mobileLoginHomeLoan2() {
		System.out.println("enter to mobile login2");
	}
	@Test
	public void mobileLoginHomeLoan3() {
		System.out.println("enter to mobile login3");
	}
	
	
	
}
