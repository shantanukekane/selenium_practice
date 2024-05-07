package day35;

import org.testng.annotations.Test;

public class Firsttest {
	
    @Test(priority = 1)
	void openapp()
	{
		
		System.out.println("Testing 1");
	}
	
	@Test(priority = 2)
	void login()
	{
		System.out.println("Testing 2");
	}
	
	@Test(priority = 3)
	void logout()
	{
		System.out.println("Testing 3");
	}
}
