package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to automation");
		
		
		// Actions classs
		
		Actions act = new Actions(driver);
		
		// control + A
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		// control + C
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		// Tab
		//act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	    act.sendKeys(Keys.TAB).perform();  // only want to press single key
		
		// control + V
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		

	}

}
