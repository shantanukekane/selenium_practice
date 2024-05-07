package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_3 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		// Select year and months
		// locating the dob elements
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		// locating the month drop down
		
		WebElement monthdpEle = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		
		// Selecting the one of the option from the drop down using select class
		
		Select month = new Select(monthdpEle);
		
		month.selectByVisibleText("Sep");
		
		// locating the year drop down
		
		WebElement yeardpEle = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		
		// selecting one of the option from the year drop down
		
		Select year = new Select(yeardpEle);
		
		year.selectByVisibleText("1993");
		
		
		// select the date
		String date = "12";
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
		
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
