package day27;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
	    Set<String> winIDs = driver.getWindowHandles();
		
	    // convert set data type into list 
	    
	    List<String> WindowIDs = new ArrayList(winIDs);
	    
	    String parentIds = WindowIDs.get(0);
	    String childIds =  WindowIDs.get(1);
	    
	    // switch to the child window
	    
	    driver.switchTo().window(childIds);
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']/ul/li[2]/a/button")).click();
	    
	    Thread.sleep(3000);
	    
	    // switch to the parent windows
	    
	    driver.switchTo().window(parentIds);
	    
	    
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	    
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	    
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();	    
		

	}

}
