package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickButton {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		// first we have to switch to inner frame
		
		driver.switchTo().frame("iframeResult");
		
		// clear the text and enter the text in the input box
		
		WebElement f1 = driver.findElement(By.xpath("//input[@id='field1']"));
		f1.clear();
		f1.sendKeys("Welcome");
		
		// double click on button
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		// for double click action we have to create a Actions class
		
		Actions act = new Actions(driver);
		
		act.doubleClick(button).perform();
		
		// validation part 
		// here we mainly check the text is copied or not in the second field f2
		
		WebElement f2 = driver.findElement(By.xpath("//input[@id='field2']"));
		String copied_text = f2.getAttribute("value");
		System.out.println("copied text: "+copied_text);
		
		if(copied_text.equals("Welcome"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.print("Test Failed");
		}
		
		

	}

}
