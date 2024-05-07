package day36;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion_1 {

	@Test
	void hardAssertion()
	{
		System.out.println("Testing...");
		System.out.println("Testing...");
		System.out.println("Testing...");
		System.out.println("Testing...");

		Assert.assertEquals(1, 2);
		
		System.out.println("Hard assertion is completed");
		
		Assert.assertEquals(1, 1);
	}
	
	@Test
	void softAssertion()
	{
		
		System.out.println("Testing...");
		System.out.println("Testing...");
		System.out.println("Testing...");
		System.out.println("Testing...");

		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1, 2);
		
		System.out.print("Soft assertion is completed");
		
		sa.assertEquals(2, 2);
		
		sa.assertAll();
	}
	
}
