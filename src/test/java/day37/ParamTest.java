package day37;

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

public class ParamTest {

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
		if(br.equalsIgnoreCase("chrome"))
		{
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
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
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	

}
