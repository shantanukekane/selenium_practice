package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithElementswithJS {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//JavascriptExecutor js = driver;
		
		//first name
		WebElement inputtext = driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','shantanu')",inputtext);
		
		//Email address
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].setAttribute('value','test@gmail.com')", Email);		
		
		// male radio button
		//WebElement rd_button = driver.findElement(By.xpath("//input[@id='male']"));
		//rd_button.click();
		//js.executeScript("arguments[0].click();", rd_button);
		
		// female radio button
		
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments.click();", female_rd);
		
		
		// check boxes
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));
		js.executeScript("arguments[0].click();", checkbox);		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
