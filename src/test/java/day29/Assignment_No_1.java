package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_No_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='product_551']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("shantanu");
		
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("kekane");
		
		driver.findElement(By.xpath("//textarea[@id='order_comments']")).sendKeys("abc text");
		
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		// Locating the web elements months
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		
		// Select one of the option from the drop down
		Select mon = new Select(month);
		
		mon.selectByVisibleText("Sep");
		
		// Locating the web Elements year
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		
		// Select one of the option from the drop down
		Select yrs = new Select(year);
		
		yrs.selectByVisibleText("1993");
		
		
		// select the date
		String date = "24";
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody//tr//td"));
		System.out.print("total number of dates: "+alldates.size());
		
		for(int i = 0;i<alldates.size();i++)
		{
			String dt = alldates.get(i).getText();
			if(dt.equals(date))
			{
				alldates.get(i).click();
			}
		}
		
		
		driver.findElement(By.xpath("//input[@id='sex_1']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Nashik");
		
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Mumbai");
		
	
	}

}
