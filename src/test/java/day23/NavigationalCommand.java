package day23;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommand {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());  // orangeHRM

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); // nopcommerce

		driver.navigate().refresh();
		
		

	}

	

}
