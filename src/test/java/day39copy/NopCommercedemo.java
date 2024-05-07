package day39copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommercedemo {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	void testlogo()
	{
		try
		{
		  boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		  Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	@Test(priority = 2)
	void testlogin()
	{
		try
		{
			driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("dny@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("dny@123");
			
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
			
			// validation part
			
			boolean status = driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
			Assert.assertEquals(status, true);
			
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	
	@Test(priority = 3,dependsOnMethods = {"testlogin"})
	void testlogout() throws InterruptedException
	{
		try
		{
			//click on login button
			driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
			
			Thread.sleep(3000);
			//validate register button
			boolean registerlink = driver.findElement(By.xpath("//a[normalize-space()='Register']")).isDisplayed();
			Assert.assertEquals(registerlink, true);
		   
		}
		catch(NoSuchElementException e)
		{
			Assert.fail();
		}
	
	}	
	
	@AfterClass
	void teardown()
	{
	    driver.quit();	
	}
	
	
	
}
