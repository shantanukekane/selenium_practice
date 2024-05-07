package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement components = driver.findElement(By.xpath("//a[normalize-space()='Components']"));
		
		WebElement Moniter = driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
		
		// create an actions class to perform action on above Elements
		
		Actions act = new Actions(driver);
		
		act.moveToElement(components).moveToElement(Moniter).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
