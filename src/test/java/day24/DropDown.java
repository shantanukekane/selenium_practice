package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Open URL or application
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	    WebElement countrydpEle = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		
		// Drop down itself is a single WebElement and inside the drop down there are multiple WebElement 
		// if you want to get multiple webelements we use one class which is called select class
		
		Select countrydp = new Select(countrydpEle);
		
		// Selecting one of the options from the dropdown
		//countrydp.selectByVisibleText("Australia");
		
		//countrydp.selectByVisibleText("India");
		
		countrydp.selectByValue("ALA");
		
		// Note = value is different and visible text is different
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
		
		
		
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
