package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownslider {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		// Actions class
		
		Actions act = new Actions(driver);
		
		WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
		System.out.println("current location of min slider: "+min_slider.getLocation());  // 59,250
		act.dragAndDropBy(min_slider, 100, 250).perform();  // 
		System.out.println("Location of min slider after moving: "+min_slider.getLocation()); //159 250
		
		Thread.sleep(2000);
		
	    WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
	    System.out.println("current location of max slider: "+max_slider.getLocation()); //544,250
		act.dragAndDropBy(max_slider, -100, 250).perform();  // 
		System.out.println("Location of max slider after moving: "+max_slider.getLocation()); // 444 250
		

	}

}
