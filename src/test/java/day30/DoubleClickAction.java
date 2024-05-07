package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickAction {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");  // switch to the inner frame
		
		// locating the Elements and clear the existing text
		
		WebElement inputbox =  driver.findElement(By.xpath("//input[@id='field1']"));
		inputbox.clear();
		inputbox.sendKeys("Shantanu");
		
		
		// perform double click action on the Elements
		WebElement copy_text = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		// creata Action class 
		Actions act = new Actions(driver);
		
		act.doubleClick(copy_text).perform();
		
		
		// validation part
		
		WebElement f2 = driver.findElement(By.xpath("//input[@id='field2']"));
		String copied_text = f2.getAttribute("value");
		System.out.println("copied text: "+copied_text);
		
		
		if(copied_text.equals("Shantanu"))
		{
			System.out.print("Test Passed");
		}
		else
		{
			System.out.print("Test Failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
