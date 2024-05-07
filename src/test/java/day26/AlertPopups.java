package day26;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
		
		Thread.sleep(3000);
		Alert alertwindow = driver.switchTo().alert();
		
		System.out.print(alertwindow.getText());
		
		alertwindow.accept();
		

	}

}
