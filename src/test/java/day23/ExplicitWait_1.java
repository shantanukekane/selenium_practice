package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_1 {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		WebElement register = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Register']")));
		register.click();
		
		WebElement male_rd_button = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gender-male']")));
		male_rd_button.click();
		
		
		//WebElement female_rd_button = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gender-female']")));
		//female_rd_button.click();
		
		
		WebElement firstName = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='FirstName']")));
		firstName.sendKeys("shantanu");
		
		
		WebElement lastName = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LastName']")));
		lastName.sendKeys("kekane");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
