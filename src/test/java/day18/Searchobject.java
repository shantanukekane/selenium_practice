package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Searchobject {

	public static void main(String[] args) {
	
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Launching the Browser
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		
		// locate the search inpox and 
		WebElement searchinput = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		searchinput.sendKeys("Tshirt");
		
		// click on submit button
		
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		
		//linkstext
		
		driver.findElement(By.xpath("//a[normalize-space()='Blouse']")).click();
		
		//select product size
		
		
		
	    WebElement prquantity =	driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
	    prquantity.clear();
	    prquantity.sendKeys("2");
		
		
	   
	   
	   
	   
		//driver.findElement(By.xpath("//div[@id='best-sellers_block_right']//li[1]//a[1]//img[1]"))
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
