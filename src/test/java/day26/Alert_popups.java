package day26;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_popups {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// here we user Explicit wait instead of using implicit wait 
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Alert alertwindow = driver.switchTo().alert();
        
		//----------------or--------------------------//
        
	    //Alert alertwindow = mywait.until(ExpectedConditions.alertIsPresent());
		
	    System.out.print(alertwindow.getText());
	    
	    alertwindow.accept();
	    
	    
	    
	    


	}

}
