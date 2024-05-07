package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickers {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//select year and month
		
		String year = "2024";
		String month = "April";
		String date = "15";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		
		while(true)
		{
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yrs = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yrs.equals(year))
			{
				break;
			}
			
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();	  // past date
		}
		
		// select date
		
		List<WebElement>  alldates =  driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody//tr//td"));
		
		/*
		// using the enhance loop
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
			}
		}
		
		*/
		
		// using the for loop
		
		for(int i = 0;i<alldates.size();i++)
		{
			String dt = alldates.get(i).getText();
			if(dt.equals(date))
			{
				alldates.get(i).click();
			}
		}

	}

}
