package day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownWithout_select_tag {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Total Number of country drop down options
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='country']//option"));
		System.out.println("Total Number of Options: "+options.size());
		
		
		// print all the options in the console window
		/*
		for(int i = 0;i<options.size();i++)
		{
			String opt = options.get(i).getText();
			System.out.print(opt);
		}
		*/
		
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		
		for(int i = 0;i<options.size();i++)
		{
			String text = options.get(i).getText();
			if(text.equals("France"))
			{
				options.get(i).click();
			}
		}
		
		

	}

}
