package day43;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {

	WebDriver driver;
	Registration_page rp;
	
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
    void testregisterlink()
    {
		rp = new Registration_page(driver);
    	rp.clickregisterlink();
    }
	
	@Test(priority = 2)
	void testRegistrationPage() throws InterruptedException
	{
		rp.clickRdButton();
		
		rp.setfirstname("Shantanu");
		
		rp.setlastname("kekane");
		
		rp.setdate("12");
		
		Thread.sleep(2000);
		
		rp.setmonth("September");
		
		Thread.sleep(2000);
		
		rp.setyear("1993");
		
		rp.setemail("kekaneshantanu@gmail.com");
		rp.setcompanyName("Penta software");
		
		rp.setpassword("shan@1234");
		rp.setconfirmpassword("shan@1234");
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}	
	
}
