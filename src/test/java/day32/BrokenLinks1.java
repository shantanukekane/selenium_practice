package day32;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks1 {

	public static void main(String[] args) throws IOException {
		
		// Headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		
		// first to find total number links 
	    List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of links: "+alllinks.size());
		
		int brokenlinks = 0;
		
		for(WebElement links:alllinks)
		{
			// pre-requisites 
		   String hrefallvalue =	links.getAttribute("href");
		   
		   if(hrefallvalue == null || hrefallvalue.isEmpty())
		   {
			    
			    System.out.println("hrf attribute value is empty");
			    continue;  // continue for the next link to check is it having null or empty value
		   }
		
		   
		   // first to open the connection with server and connet it 
		   // for that we have to convert it from String to URL
		   
		   URL linkurl = new URL(hrefallvalue);
		   
		   linkurl.openConnection();
		   // but actually we need to convert them again into HttpURLConnection
		   
		   HttpURLConnection conne = (HttpURLConnection) linkurl.openConnection();
		   
		   conne.connect();  // now actually we connected to the server to check the status code of the response
		   
		   
		   if(conne.getResponseCode()>=400)
		   {
			   System.out.println(hrefallvalue+"======>"+"Broken Links");
			   brokenlinks++;
			   
		   }
		   else
		   {
			   System.out.println(hrefallvalue+"======>"+"Broken Links");

		   }
		 
		}
		
		System.out.println("Total Number of brokenlinks: "+brokenlinks);
		
		

	}

}
