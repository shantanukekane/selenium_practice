package day36;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test()
	{
		//int a = 10;
		//int b = 15;
		
		// In TestNg framework we don't use if - else 
		// condition
		/*
		if(a == b)
		{
			System.out.print("Test Passed");
		}
		else
		{
			System.out.print("Test failed");
		}
		
		*/
		
		//Assert.assertEquals(a, b);
		
		//Assert.assertTrue(true);  // pass
		//Assert.assertTrue(false); // fail
		
		int a = 20;
		int b = 10;
		
	    //Assert.assertEquals(a>b, true, "a is not greater than b");
	    
		String s1 = "abc";
		String s2 = "abc";
		
		//Assert.assertEquals(s1, s2,"s1 is not equals to s2");;
		
		//Assert.assertNotEquals(s1, s2); // pass
		
		if(false)
		{
			Assert.assertTrue(true);
		}
		else
		{
			//Assert.assertTrue(false);
			Assert.fail();
		}
		
	}
	
}
