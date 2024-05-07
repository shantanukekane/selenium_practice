package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.xpath("//input[@id='dob']")).click();
	    
	    // select year and month
	    
	    // select one of the options are drop down
	    // using  select class 
	    
	    String date = "12";
	    
	    WebElement monthdpEle =  driver.findElement(By.xpath("//select[@aria-label='Select month']"));
	    
	    Select monthdp = new Select(monthdpEle);
	    
	    // selecting the month option
	    monthdp.selectByVisibleText("Sep");
	    
	    // selecting the year option
	    
	    WebElement yeardpEle = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
	    
	    Select yeardp = new Select(yeardpEle);
	    
	    yeardp.selectByVisibleText("1993");
	    // select date
	    
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
