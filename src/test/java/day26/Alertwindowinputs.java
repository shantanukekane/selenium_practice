package day26;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertwindowinputs {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
		
		Alert alertwindow = driver.switchTo().alert();
		
		alertwindow.sendKeys("Welcome");
		
		alertwindow.accept();
		
	    String act_txt = driver.findElement(By.xpath("//p[@id = 'demo']")).getText();
		String exp_txt = "Hello Welcome! How are you today?";
		
		
		if(act_txt.equals(exp_txt))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}

	
	}

}
