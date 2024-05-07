package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_3 {

	public static void main(String[] args) {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Launching the Browser
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		
		// Find the total number of sliders
		
		
		
		
		// find the total Number of links
	    List<WebElement> slider = driver.findElements(By.className("homeslider-container"));
		System.out.println("Total Number of Links: "+slider.size());
		
		
		// find the total Number of images
		
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total Number of images:"+images.size());
        
       
        // Find the Total  Number of links
        
        List<WebElement> No_Links= driver.findElements(By.tagName("a"));
        System.out.println("Total Number of links: "+No_Links.size());
      
		
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		

	}

}
