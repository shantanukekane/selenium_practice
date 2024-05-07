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

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> alllinks =  driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+alllinks.size());		
		
		int brokenlink = 0;
		
		for(WebElement links:alllinks)
		{
			// pre-requisite
			String hrefAllvalue = links.getAttribute("href");
			if(hrefAllvalue == null || hrefAllvalue.isEmpty())
			{
				System.out.println("href Attribute value is empty");
				continue;
			}
			
			// to open the connection with URL and connect to the server we have to use URL 
			// so to convert string to URL
			
			URL linkurl = new URL(hrefAllvalue);      // open the connections
			
			// but we need httpURL connection to connect the Server
			HttpURLConnection conne = (HttpURLConnection) linkurl.openConnection();
			
			conne.connect();
			
			if(conne.getResponseCode()>=400)
			{
				System.out.println(links.getText()+"=======>"+"Broken links");
				brokenlink++;
			}
			else
			{
				System.out.println(links.getText()+"=======>"+" Not Broken links");

			}
	
		}
		
		System.out.print("Total Number of Broken Links are: "+brokenlink);
		
		
		
		
		
		
		

	}

}
