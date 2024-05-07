package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FourthTest {

	WebDriver driver;
	
	@BeforeClass
	//@Test(priority = 1)
	void openApp()
	{
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();    
	}
	
	@Test(priority = 2)
	void login()
	{
		driver.findElement(By.className("ico-login")).click();
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.clear();
		email.sendKeys("test@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='Password']"));
		pass.clear();
		pass.sendKeys("test@123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
	}
	
	@AfterClass
	//@Test(priority = 3)
	void close()
	{
		driver.quit();
	}
	
	
	
	
	

}
