package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes_4 {

	public static void main(String[] args) throws InterruptedException {
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
	        
			// select last three checkboxes
			// Total Number of checkboxes - last three checkboxes = 7 -3 = 4
			
			/*
			for(int i = 4;i<checkboxes.size();i++)
			{
				
				checkboxes.get(i).click();
				
			}
			
			/*
			
			// first we select all check boxes for selecting all checkboxes
			for(int i = 0;i<checkboxes.size();i++)
			{
				checkboxes.get(i).click();
			}
			
			// second for loop is used for the unselecting all the selected checkboxes
			
			for(int i = 0;i<checkboxes.size();i++)
			{
				checkboxes.get(i).click();
			}
			
			
			*/
			
			
			// select first 4 checkboxes 
			/*
			
			for(int i = 0;i<checkboxes.size();i++)
			{
				if(i<4)
				{
					checkboxes.get(i).click();
				}
				
			}
			
			// -------------------------or --------------------//
			
			for(int i = 0;i<checkboxes.size();i++)
			{
				if(i==4)
					break;
				checkboxes.get(i).click();
				
			}
			
			
			
			// selecting first four checkboxes and then unselect them
			for(int i = 0;i<checkboxes.size();i++)
			{
				if(i==4)
					break;
				checkboxes.get(i).click();
				
			}
			
			for(int i = 0;i<checkboxes.size();i++)
			{
				if(checkboxes.get(i).isSelected())
				{
					
					checkboxes.get(i).click();
					
				}
			}
			
			/*
			 
			 
			// select first five checkboxes 
			
			for(int i = 0;i<checkboxes.size();i++)
			{
				if(i<5)
				{
				checkboxes.get(i).click();
				}
				
			}
			
			Thread.sleep(3000);
			
			for(WebElement chboxes:checkboxes)
			{
				if(chboxes.isSelected())
				{
					chboxes.click();
				}
			}

			*/
			
			for(int i = 0;i<3;i++)
			{
				checkboxes.get(i).click();
				
			}
			
			
			
			for(int i = 0;i<checkboxes.size();i++)
			{
				
				if(checkboxes.get(i).isSelected())
				{
				    checkboxes.get(i).click();
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
