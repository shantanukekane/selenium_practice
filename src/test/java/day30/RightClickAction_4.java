package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAction_4 {

	public static void main(String[] args) throws InterruptedException {
		
	
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		// create an actions class
		Actions act = new Actions(driver);
		
		Action myaction = act.contextClick(button).build(); // here we just create an action but not completing the action
		//act.contextClick(button).build().perform(); // here we do both 
		
		myaction.perform();
	
		
		
		
		
		

	}

}
