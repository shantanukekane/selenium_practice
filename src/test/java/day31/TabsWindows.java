package day31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsWindows {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.WINDOW);		 // this will open the new window
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		

	}

}
