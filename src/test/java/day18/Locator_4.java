package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_4 {

	public static void main(String[] args) throws InterruptedException {
	

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Launching the Browser
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// searchproduct
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("MacBook");
		
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("driver.findElement(By.xpath(\"//button[normalize-space()='Add to cart']\"))")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
