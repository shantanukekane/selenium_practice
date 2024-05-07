package day26;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWindowwithinput1 {

	public static void main(String[] args) throws InterruptedException {
	
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	
	    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
	    
	    Alert alertwindow =  driver.switchTo().alert();
	    alertwindow.sendKeys("hello! Welcome");
	    
	    Thread.sleep(3000);
	    //alertwindow.accept();
	    alertwindow.dismiss();
	    
	    //validation
	    String act_txt = driver.findElement(By.xpath("//p[@id='result']")).getText();
	    String exp_txt = "You entered: hello! Welcome";
	    
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
