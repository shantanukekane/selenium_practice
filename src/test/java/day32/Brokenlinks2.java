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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks2 {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// Find the total number of links
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links: "+alllinks.size());
		
		// so i wanted to find out the broken links
		
		int brokenlinks = 0;
		
		for(int i = 0;i<alllinks.size();i++)
		{
			String hrefallvalue = alllinks.get(i).getAttribute("href");
			
			// pre - requisites
			
			if(hrefallvalue == null || hrefallvalue.isEmpty())
			{
				System.out.println("href attributes value is empty");
				continue;
			}
			
			// to open the connection with server and connect to the server
			// for that we have to convert them into the URL
			
			URL linkurl = new URL(hrefallvalue);
			
			linkurl.openConnection();
			
			//but here we need HttpURLConnections for open the connection
			
			HttpURLConnection connection = (HttpURLConnection) linkurl.openConnection();
			
			connection.connect();
			
			if(connection.getResponseCode()>=400)
			{
				System.out.println(hrefallvalue+"=========>"+"Broken links");
				brokenlinks++;
			}
			else
			{
				System.out.println(hrefallvalue+"=========>"+"Not Broken links");
			}
			
		}
		
		System.out.println("Total Number of Broken Links are: "+brokenlinks);
		
	}

}
