package day36;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 {

	@BeforeMethod
	void login()
	{
		
		System.out.println("login");
		
	}
	
	@Test(priority=1)
	void search()
	{
	
		System.out.println("search");
		
	}
	
	@Test(priority = 2)
	void advancesearch()
	{
		
		System.out.println("advancesearch");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logout");
	}
	
	
	
}
