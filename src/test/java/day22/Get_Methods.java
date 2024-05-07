package day22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Methods {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//Launching Browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		driver.manage().window().maximize();
		
		//driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		//driver.getPageSource();
		//System.out.println(driver.getPageSource());
		
		// Here we will get the current window Browser ID
		System.out.println(driver.getWindowHandle());
		
		// get the title of current web page
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		// if you want to capture this ID in term of string 
		
		for(String ids:windowIDs)
		{
			System.out.println("Number of Ids: "+ids);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
