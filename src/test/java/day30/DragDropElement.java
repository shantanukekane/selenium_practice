package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropElement {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		// create a Action class
		Actions act = new Actions(driver);
		
		WebElement source_Ele = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target_Ele = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(source_Ele, target_Ele).perform();
		
		
	}

}
