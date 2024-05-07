package day38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizedTest {

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{
		if(br.equalsIgnoreCase("chrome"))
		{
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
		   WebDriverManager.chromedriver().setup();
		   driver = new EdgeDriver();
		}
		else 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
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
	void testhomepageTitle()
	{
		try
		{
		     Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	
}
