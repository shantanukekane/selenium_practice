package day36;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2 {

	@BeforeClass
	void login()
	{
		System.out.println("login");
		
	}
	
	
	@Test(priority = 2)
	void search()
	{
		System.out.println("search");
	}
	
	@Test(priority = 3)
	void Advancesearch()
	{
		System.out.println("Advancesearch");
	}

	@AfterClass
	void logout()
	{
		
		System.out.println("logout");
	}
	
	
	
}
