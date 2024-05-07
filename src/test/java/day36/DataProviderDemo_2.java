package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo_2 {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider = "dp")
	void testlogin(String username,String pwd)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		String exp_title = "OrangeHRM";
		String act_title = driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
	
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name = "dp",indices = {0,1})
	String [][] logindata()
	{
		// here we pass Excel data using dataprovider annotation 
		// for that we create two dimentional array
		
		String data[][] = { 
				            {"shantanu","test123"},
				            {"parth","parth@124"},
			            	{"Admin","admin123"},
				            {"Admin","admin123"}
			              };
		
		return data;
	}
	
	
}
