package day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Total Number of options
		List<WebElement> options = driver.findElements(By.xpath("//select[@class='form-control'][@id='country']/option"));
		System.out.print("Total Number of countries: "+options.size());
		
		//print all the options in a console window
		
		for(int i = 0;i<options.size();i++)
		{
			String option = options.get(i).getText();
			if(option.equals("Japan"))
			{
				options.get(i).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		;
		
		
		
		
		
		
		
		
		
		
		

	}

}
