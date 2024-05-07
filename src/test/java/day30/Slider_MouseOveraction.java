package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider_MouseOveraction {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		// create a Actions class
		
		Actions act = new Actions(driver);
	
		
		// locating the Element
		
		WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
		
		System.out.println("current location of min slider: "+min_slider.getLocation());// 59,250
		
		act.dragAndDropBy(min_slider, 100, 250).perform();  // 161, 250
		
		System.out.println("Location after moving the slider: "+min_slider.getLocation());
		
		act.dragAndDropBy(min_slider, 150, 250).perform();  // 311 250

		System.out.println("Location after slide moving of min slider: "+min_slider.getLocation());
	
		
		
		
		
	}

}
