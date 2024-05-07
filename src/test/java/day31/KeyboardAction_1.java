package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction_1 {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='target']")).sendKeys("Shantanu");
		
		// Actions class
		
		Actions act = new Actions(driver);
		
		//act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		//act.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).perform();
		//act.sendKeys(Keys.CLEAR).perform();
		
		act.sendKeys(Keys.ENTER).perform();		
	

		
		
		
		
	}

}
