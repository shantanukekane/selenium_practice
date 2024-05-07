package day36;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotation {

	@BeforeSuite
	void bs()
	{
		
		System.out.println("Before suite");
		
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("after suite");
	}
	
	@BeforeTest
	void bt()
	{
		
		System.out.println("before test");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("after test");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("after class");

	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("before method");

	}

	@AfterMethod
	void am()
	{
		System.out.println("after method");

	}
	
	@Test(priority = 1)
	void test1()
	{
		System.out.println("Test 1");
		
	}
	
	@Test(priority = 2)
	void test2()
	{
		System.out.println("Test 2");
		
	}
	

	
	
}
