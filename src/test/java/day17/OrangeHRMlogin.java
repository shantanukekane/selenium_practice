package day17;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OrangeHRMlogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		
		/*
		String act_title = driver.getTitle();
		String exp_title = "OrangeHRM";
		
		if(act_title.equals(exp_title))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	*/
		
		
		// validate the label after login button
		String act_label = "";
	
		try
		{
		  act_label = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		}
		catch(NoSuchElementException e)
		{
			
		}
		  
		String exp_label = "Dashboard";
		
		if(act_label.equals(exp_label))  // "".equals(exp_label) if fails
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	
		

	}

}
