package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {

	WebDriver driver;
	LoginPage2 lp;
	
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
	void testLogo()
	{
		lp = new LoginPage2(driver);
		lp.checkLogopresence();
		
		Assert.assertEquals(lp.checkLogopresence(), true);
		
	}
	
	@Test(priority = 2)
	void testLogin()
	{
		lp.setusername("Admin");
		lp.setpassword("admin123");
		lp.clicksubmit();
		
		// validation part
		
		String act_label = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		String exp_label = "Dashboard";
		
		Assert.assertEquals(act_label, exp_label);
		
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
}
