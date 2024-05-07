package day37;

import org.testng.annotations.Test;

public class IncovationCountDemo {

	@Test
	void test()  // it will return only single time o/p
	{
		System.out.println("Manual Testing..................");
	}
	
	
	@Test(invocationCount = 10)     // it will return 10 times of o/p
	void test2()
	{
		System.out.println("Automation Testing..................");

	}
	
	
	
	
	
	
	
	
	
}
