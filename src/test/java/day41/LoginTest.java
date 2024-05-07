package day41;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	LoginPage lp;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	void testlogo()
	{
	   lp = new LoginPage(driver);
	   //lp.checklogopresence();
	   Assert.assertEquals(lp.checklogopresence(), true);
	
	}
	
	@Test(priority = 2)
	void testlogin() throws InterruptedException
	{
		lp.setusername("Admin");
		lp.setpassword("admin123");
		lp.clickbutton();
	
		// validation 
		// verify the title after login
		
		try
		{
		   Assert.assertEquals(driver.getTitle(),"OrangeHRM");
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
