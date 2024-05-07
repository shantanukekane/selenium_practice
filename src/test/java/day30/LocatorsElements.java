package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	
		Actions act = new Actions(driver);
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));		
		
		System.out.print("Before maximize the window: ");
		
		driver.manage().window().maximize();
		System.out.print("After Maximize the window: "+logo.getLocation());
		
		driver.manage().window().minimize();
		System.out.print("After minimize the window: "+logo.getLocation());
		
		driver.manage().window().fullscreen();
		System.out.print("after full screen the window: "+logo.getLocation());
		
		// set up the page by 100*100
		
		Point p = new Point(100,100);
		
		driver.manage().window().setPosition(p);
		System.out.print("after setup the 100*100 window: "+logo.getLocation());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
