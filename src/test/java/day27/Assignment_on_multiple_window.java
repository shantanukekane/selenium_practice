package day27;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_on_multiple_window {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("facebook");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> browser_links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		System.out.println("Total Number of links are : "+browser_links.size());
		
		
		//open the multiple links
		
		for(WebElement links:browser_links)
		{
			System.out.println(links.getText());
			links.click();
			
		}
		
		
		// capturing ids and their titles
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		for(String WinIDs:windowIDs)
		{
		   String title = driver.switchTo().window(WinIDs).getTitle();
		   System.out.println(title);	
			
		}
	
		
		driver.quit();
		
		/*
       // closing all the browser window one by one by reference of title
		for(String WinIDs: windowIDs)
		{
		  String title = driver.switchTo().window(WinIDs).getTitle();
		  if(title.equals("") || title.equals(""))
		  {
			  driver.close();
		  }
		}
		
		*/
		
		

	}

}
