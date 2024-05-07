package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMloginTest_ {

	public static void main(String[] args) throws InterruptedException {
		
		
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		// Launch browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// find the elements and passing the username name
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		// find the element and pass the password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
		
		// click on login button
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		
	    String act_title = driver.getTitle();
		String exp_title = "OrangeHRM";
		
		/*
		if(act_title.equals(exp_title))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");

		}
	*/
		
		// label varification after successful login
		// if below element is not located then rest of the things are shows validates 
		
		String act_label = "";
		
		try
		{
		   act_label = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		   
		}
		catch(NoSuchElementException e)
		{
			
		}
		
		String exp_label = "Dashboard";
		
		if(act_label.equals(exp_label))
		{
			
			System.out.print("test passed");		
			
		}
		else
		{
			System.out.print("Test failed");
		}	
		
		
	
	}

	
	}


