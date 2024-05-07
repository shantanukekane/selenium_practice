package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autthentication_alert {

	
	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//https://the-internet.herokuapp.com/basic_auth
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(3000);
		
	    String msg = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		
		if(msg.contains("Congratulations!"))
		{
			System.out.println("Successfully login");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
		
	}

}
