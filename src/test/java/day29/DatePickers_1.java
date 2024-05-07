package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickers_1 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// switching to the inner frame
		
		//driver.switchTo().frame(0);
		
		//Approach 1 
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09/12/2025");
		
		//Approach 2
		String year = "2025";
		String month = "April";
		String date = "29";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();		
		
		// select year and month
		
		while(true)
		{
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yrs = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yrs.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		
		// Select date 
		
	     List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
	     
	     for(WebElement dt:alldates)
	     {
	    	 if(dt.getText().equals(date))
	    	 {
	    		 dt.click();
	    		 break;
	    	 }
	     }
	  
		
		

	}

}
