package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
			
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

		// Mouse over action
		// Mouseover action contains 
		// right click
		// double click
		// drag and drop
		
		// To perform mouseover action 
		
		Actions act = new Actions(driver);
		
		// Approach 1
		//act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		
		//build() = method to create an action 
		//perform() = method to complete an action
		
		// Approach 2 both are same
		act.moveToElement(desktop).moveToElement(mac).click().perform();
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
	}

}
