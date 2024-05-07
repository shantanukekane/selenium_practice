package day22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
	    driver.findElement(By.xpath("//a[normalize-space()='nopCommerce']")).click();
	
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getWindowHandle());
		
		// if we want to print the window ids then we should use set datatype because ids are uniques
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		
		
		for(String WinIDs:windowIDs)
		{
			System.out.println("Number of IDs: "+WinIDs);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
