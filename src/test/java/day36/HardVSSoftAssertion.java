package day36;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVSSoftAssertion {

	
	@Test
	void test_HardAssertion()
	{
		System.out.println("Testing...........");
		System.out.println("Testing...........");
		System.out.println("Testing...........");
		System.out.println("Testing...........");
		
		Assert.assertEquals(1, 2);   // if this statement got failed then rest of the statement will not be executed
		
		System.out.println("Hard Assertion is passed");
		Assert.assertEquals(1, 1);
		
	}
	
	@Test
	void test_SoftAssertion()
	{
		System.out.println("Testing...........");
		System.out.println("Testing...........");
		System.out.println("Testing...........");
		System.out.println("Testing...........");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1, 2);
		
		System.out.println("Soft assert completed");
		
		Assert.assertEquals(3, 3);
		
		sa.assertAll();   // mandetory required after soft assertion
			
		
		
	}
	
	
}
