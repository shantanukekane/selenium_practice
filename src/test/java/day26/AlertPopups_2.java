package day26;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopups_2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Explicit wait
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
		/*
	    Alert alertwindow =	driver.switchTo().alert();
		
	    System.out.print(alertwindow.getText());
		
		//alertwindow.dismiss();  // it will close the alert window using cancle button
		*/
		
	    Alert alertwindow =	mywait.until(ExpectedConditions.alertIsPresent());
		
	    System.out.print(alertwindow.getText());
	    
	    alertwindow.accept();  // it will close the alert window using ok button 
	    
	    
	    
		

	}

}
