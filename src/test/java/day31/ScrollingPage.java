package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();;
		
        JavascriptExecutor js = driver;
        
        //1) scroll by down page by pixel 
        //js.executeScript("window.scrollBy(0,3000)","");
		
		  js.executeScript("window.scrollBy(0,3350", "");
		
		
		//2) scroll down the page till the Element is present 
		  
		  WebElement flag = driver.findElement(By.xpath("//img[@alt ='Flag of India"));
		  js.executeScript("arguments[0].scrollIntoView();", flag);
		  
		  System.out.println(js.executeScript("return window.pageYOffset;"));
		  
		  
		  
		// 3) scroll down till the end of the page  
		  
		  
		  
		  
		  
	}

}
