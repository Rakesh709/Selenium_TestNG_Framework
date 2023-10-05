package test;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class day5 {
	

	
	@Test(enabled=false)
	public void mobileLoginHomeLoan() {
		System.out.println("enter to mobile login");
	}
	
	@Test(dataProvider="getData")
//	@Test(timeOut=4000)
	public void mobileLoginHomeLoan2(String username, String password) {
		System.out.println("enter to mobile login2");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Parameters({"KEY"})
	@Test
	public void mobileLoginHomeLoan3(String key) {
		System.out.println("enter to mobile login3");
		
		System.out.println(key);
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination -> username & password -> good credit
		//2nd combination -> username & password -> no credit
		//3rd combination -> username & password -> frad
		
		Object[][] data = new Object[3][2];
		
		//1st combination 
		data[0][0]="firstusername";
		data[0][1]="firsPassword";
		
		//2nd combination
		data[1][0]="secondUser";
		data[1][1]="secoundPass";
		
		//3rd combination
		data[2][0]="thirduser";
		data[2][1]="thirdPass";
		
		return data;
	}
	
	
	
}
