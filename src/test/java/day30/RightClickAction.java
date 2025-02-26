package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAction {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
	    WebElement button =	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		
		// right click action
		
		act.contextClick(button).perform();
	    
	   // click on copy element
		
	    driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();  // click on copy 
		
        driver.switchTo().alert().accept();   // switch to alert window and close the window with ok button
	    
        
        
        
        
	   
        
	    
	}

}
