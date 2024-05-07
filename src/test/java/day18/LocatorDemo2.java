package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo2 {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Launching the Browser
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		
		// total number of slides
		
	    List<WebElement> slider = driver.findElements(By.className("homeslider-container"));
	    //driver.findElements(By.className("homeslider-container"));
		//slider.size();
		System.out.println(slider.size());
		
		//total number of images
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		
		// total number of links
		
		List<WebElement> No_links = driver.findElements(By.tagName("a"));
		System.out.println(No_links.size());
		
		
		
		
		
		
		
		
		
		
		
	}

}
