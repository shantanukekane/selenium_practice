package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0); // switch to frame
		
		// Approach 1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2022");//mm//dd//yyyy
		
		// Approach 2
		
		String year = "2024";
		String month = "September";
		String date = "12";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		// select month and year
		while(true)
		{
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yrs = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		    if(mon.equals(month) && yrs.equals(year))
		    {
		    	break;
		    }
		
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // next button
		
		}
		
		// select data from the table 
		
	     List<WebElement> alldate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
		 for(WebElement dt:alldate)
		 {
			 if(dt.getText().equals(date))
			 {
				 dt.click();
			     break;
			 }
		 }

	}

}
