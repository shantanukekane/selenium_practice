package day27;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlewindowBrowser_using_loop {

	public static void main(String[] args) throws InterruptedException {
	
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();		
		/*
		for(String winIDs:windowIDs)
		{
			
		     String title =	driver.switchTo().window(winIDs).getTitle();
			
		     if(title.equals("Human Resources Management Software | OrangeHRM"))
		     {
		    	 
                    driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']/ul/li[2]/a/button")).click();
		    	 
		     }
			
		    Thread.sleep(3000);
		   
		    if(title.equals("OrangeHRM"))
		    {
		    	
		    	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		    	
		    	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		    	
		    	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		    	
		    }
		    
		}
		*/
		// closing the multiple browsers
		
		for(String winIDs:windowIDs)
		{
			
		     String title =	driver.switchTo().window(winIDs).getTitle();
			
		     if(title.equals("Human Resources Management Software | OrangeHRM") || title.equals("OrangeHRM"))
		     {
		
		         driver.close();
		    	 
		     }
		
		}
		
		
		
		

	}

}
