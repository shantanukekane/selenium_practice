package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAction_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		// right button
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		// click on right click
		
		Actions act = new Actions(driver);
		
		act.contextClick(button).perform();
		
		
		// click on paste  
		
		driver.findElement(By.xpath("//span[normalize-space()='Paste']")).click(); // click on paste
		
		// switch to alter window
		
		driver.switchTo().alert().accept();  // close the alert window with ok button
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
