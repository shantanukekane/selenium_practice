package day31;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsAndWindows {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB); // open the new tab
		driver.get("https://www.opencart.com/index.php");
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		

	}

}
