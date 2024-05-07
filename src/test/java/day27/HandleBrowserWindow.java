package day27;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		// window ids are unique to its type is set type
		Set<String> WinIDs = driver.getWindowHandles();
		
	    // but set don't have a index method and all how to get the individual ids 
		//for that reason we convert set into list datatype
		
		
		List<String> WindowIDs = new ArrayList(WinIDs);
		
	    String ParentId =	WindowIDs.get(0);
		String childId  =   WindowIDs.get(1);
		
	    
	    // switch to child window now driver instance will focus on child window
		
		driver.switchTo().window(childId);
		
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[2]/a/button")).click();
		
		Thread.sleep(3000);
		
		//again switch to the parent window
		driver.switchTo().window(ParentId);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		
	

	}

}
