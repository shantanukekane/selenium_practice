package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dnyamic_Drop_down {

	public static void main(String[] args) {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https:www.google.co.in/");
		driver.manage().window().maximize();
		
		
	    WebElement searchtxt = 	driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchtxt.sendKeys("selenium webdriver");
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class = 'wM6W7d']/span"));
		System.out.println("Number of auto dynamic options are: "+options.size());
		
		
		// print all the auto suggestion are in console window
		
		for(WebElement autosugg:options)
		{
			
			String autosugge = autosugg.getText();
			System.out.println(autosugge);
			
		}
		
		

		for(WebElement autosugg:options)
		{
			
			String auto = autosugg.getText();
			if(auto.equals("selenium webdriver download"))
			{
				autosugg.click();
			}
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
