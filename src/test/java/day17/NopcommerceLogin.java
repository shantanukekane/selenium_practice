package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopcommerceLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Launching the Browser
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// locate the element and click on login
		
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		
		// locate the elements and enter the email
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("test123@gmail.com");
		
		// locate the elemets and enter the password
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test@123");
		
		// click on submit button
		
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		// validate the title of the page after login
		
		String act_title = driver.getTitle();
		String exp_title = "nopCommerce demo store";
		
		
		if(act_title.equals(exp_title))
		{
			System.out.println("Test Passed");		
			
		}
		else
		{
			System.out.println("Test failed");
		}
			
	
		String act_images = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).getText();
		String exp_images = "nopCommerce demo store";
		
		if(act_images.equals(exp_images))
		{
			System.out.print("Test passed");
		}
		else
		{
			System.out.print("Test failed");
		}
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
