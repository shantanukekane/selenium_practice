package day36;

import org.testng.annotations.Test;

public class Grouping_Demo {

	
	@Test(priority = 1,groups = {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
	}
	
	@Test(priority = 2,groups = {"sanity"})
	void loginByFacebook()
	{
		System.out.println("This is login by Facebook");
	}
	
	@Test(priority = 3,groups = {"sanity"})
	void loginBytwitter()
	{
		System.out.println("This is login by Twitter");
	}
	
	@Test(priority = 4,groups = {"sanity","regression"})
	void sigupByEmail()
	{
		System.out.println("This is signup by Email");
	}
	
	@Test(priority = 5,groups = {"regression"})
	void signByFacebook()
	{
		System.out.println("This is signby by Facebook");
	}
	
	@Test(priority = 6,groups = {"regression"})
	void signByTwitter()
	{
		System.out.println("This is signby by Twitter");
	}
	
	@Test(priority = 7,groups = {"sanity","regression"})
    void paymentInRupees()
    {
    	System.out.println("This is payment in Rupees");
    }
	
	@Test(priority = 8,groups = {"sanity"})
	void paymentinDoller()
	{
		System.out.println("This is payment in Doller");
	}
	
	@Test(priority = 9,groups = {"regression"})
	void paymentReturnbyBank()
	{
		System.out.println("This is payment return by bank");
	}
	
	
	
}
