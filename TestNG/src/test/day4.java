package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class day4 {
	
	@Test(groups= {"Smoke"})
	public void webLoginCarLoan() {
		System.out.println("enter to CarLoanweblogin");
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
