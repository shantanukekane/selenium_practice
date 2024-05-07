package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_iframe {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		// inner frame
		driver.switchTo().frame("mce_0_ifr");
		
		WebElement txt = driver.findElement(By.xpath("//body[@id = 'tinymce']/p[1]"));
		txt.clear();
		txt.sendKeys("This is inner frame");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
