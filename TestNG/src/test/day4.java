package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void webLoginCarLoan() {
		System.out.println("enter to weblogin");
	}
	
	@Test
	public void mobileLoginCarLoan() {
		System.out.println("enter to mobile login");
	}
	
	@Test
	public void loginAPICarLoan() {
		System.out.println("enter to login api");
	}
	
	@BeforeSuite
	public void BeforeSuiteDemo() {
		System.out.println("IM the first suite annotation");
	}
}
