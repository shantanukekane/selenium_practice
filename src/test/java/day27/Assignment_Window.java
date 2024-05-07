package day27;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Window {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // Total Number of links to capture
        
        List<WebElement> No_links =   driver.findElements(By.xpath("//div[@id = 'wikipedia-search-result-link']/a"));
        System.out.println("Number of Links: "+No_links.size());
        
        // print all the links on console window and also open the multiple links in browser window
        
       for(WebElement links:No_links)
       {
    	  System.out.println(links.getText());
    	  links.click();
       }
        
        
        // capturing all the ids
   
       Set<String> windowids = driver.getWindowHandles();
       
	   System.out.println("Switching to all browser pages and capture the all title:..........");

       for(String winIDs:windowids)
       {
    	  String title = driver.switchTo().window(winIDs).getTitle();
    	  System.out.println(title);
       }
       
       
       driver.quit();
       
       
       
       
       
       
        
       
       
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
	}
	
	
}
