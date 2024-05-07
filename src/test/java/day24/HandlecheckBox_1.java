package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlecheckBox_1 {

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
        
		/*
		// if we want to select only first three checkboxes selected
		for(int i = 0;i<checkboxes.size();i++)
		{
			
			if(i==3)
			break;
			checkboxes.get(i).click();
			
		}
		
		
		// if we want to get only first five checkboxes
		
		for(int i = 0;i<checkboxes.size();i++)
		{
			if(i==5)
				break;
			checkboxes.get(i).click();
		}
		*/
		
		// tik all the  checkboxes using for each loop
		
		for(WebElement chboxes:checkboxes)
		{
		
			chboxes.click();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
