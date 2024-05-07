package day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// locating  the drop down
		WebElement countrydrpdown = driver.findElement(By.xpath("//select[@id='country']"));
		
	    // To select one of the options from the drop down we use select method
		Select countrydp = new Select(countrydrpdown);
				
		//1) select one option from the country drop down
		//countrydp.selectByVisibleText("Australia");
		
		//countrydp.selectByValue("australia");
		
		//countrydp.selectByIndex(5);  // australia
		
		
		//2) Total Number of options in the drop down
		
		List<WebElement> options = countrydp.getOptions();
		System.out.println("Total Number of options: "+options.size());
		
		// 3) print all the options in the console window
		
		for(int i = 0;i<options.size();i++)
		{
			String option = options.get(i).getText();
			System.out.println(option);	
		}
		
		
		// 3) using for each loop
		/*
		for(WebElement option : options)
		{
			
			String opt = option.getText();
			System.out.println("opt");
			
		}
		*/
		
		
		
		
		
		
		
		
	}

}
