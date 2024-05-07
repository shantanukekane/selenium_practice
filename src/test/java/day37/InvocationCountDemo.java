package day37;

import org.testng.annotations.Test;

public class InvocationCountDemo {

	
	@Test(invocationCount = 5)
	void test1()
	{
		System.out.print("browser testing");
	}
	
	@Test
	void test2()
	{
		System.out.print("Headless testing");
	}
	
	
	
	
	
	
	
	
}
