package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationOfElements {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		System.out.println("Before maximizing the window: "+logo.getLocation());
		
		driver.manage().window().maximize();
		System.out.println("after maximizing the window: "+logo.getLocation());
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		System.out.println("after minimizing the window: "+logo.getLocation());
		
		driver.manage().window().fullscreen();  // will get the full screen option
		System.out.println("after full screen window: "+logo.getLocation());
	
		// open the page or reframe the page as per the requirements using point class 
		// create a object for that 
		
		Point p = new Point(50,50);
		driver.manage().window().setPosition(p);
        System.out.println("after setting the window by 50*50: "+logo.getLocation());
		 
		
	}

}
