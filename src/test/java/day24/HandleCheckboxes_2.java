package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes_2 {

	public static void main(String[] args) {
		
		
		    WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			// Launch URL
			
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			// select single check box from the multiple checkboxes e.g Monday
			
			//driver.findElement(By.xpath("//input[@id='monday']")).click();
			
			
			
			//Total Numnber of Check boxes
			
	        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class ='form-check-input'][@type='checkbox']"));
			System.out.print("Number of checkboxes: "+checkboxes.size());
	        
		    // we want to select only last two checkbox
			//total number of check boxes - last two check boxes = starting point
			                 // 7 - 2 = 5
			/*
			for(int i = 5;i<checkboxes.size();i++)
			{
				checkboxes.get(i).click();
				
			}
			
			
			for(int i = 0;i<checkboxes.size();i++)
			{
				
			}
			
		
			// select first three checkbox 
		
			for(int i = 0;i<checkboxes.size();i++)
			{
				if(i<3)
				{
				   checkboxes.get(i).click();
			
				}
				
			}
			*/
			
			// select all check boxes Except 2 and 4
			
			
			for(int i = 0;i<checkboxes.size();i++)
			{
				if(i==2)
					continue;
				if(i==4)
					continue;
				checkboxes.get(i).click();
			}
		
		
		
			
			
			
			
			
			
		
		

	}

}
