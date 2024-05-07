package day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_on_auto_suggest_dropdown {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("facebook");
		
		// Total Number of auto suggestions are :=
		List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'sa_as')]//following-sibling::li"));
		
		System.out.println(options.size());
		
		// print the all the auto suggestion in a console window 
		
		for(int i = 0;i<options.size();i++)
		{
		   String opt =	options.get(i).getText();
		   System.out.println(opt);
		}
		
		/*
		for(WebElement option:options)
		{
			if(option.equals(""))
		}
		
		*/
		
		
	}

}
