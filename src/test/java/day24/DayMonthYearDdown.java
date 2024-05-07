package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DayMonthYearDdown {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		// click on register button
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		
		// locating the Elements
		WebElement datedpEle = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		
		// selectingb one of the options from the drop down
		
		Select datedp = new Select(datedpEle);
		
		datedp.selectByVisibleText("12");
		
		

	}

}
