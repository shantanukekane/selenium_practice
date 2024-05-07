package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleInnerFrame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames");
		driver.manage().window().maximize();
		
		// find the webelement and switch to the inner frame
		// frame 1
		WebElement frm1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("shantanu");
		
		// again switch to the main frame 
		driver.switchTo().defaultContent();		
		
		// find the webelement and switch to another inner frame
		// frame 2
		WebElement frm2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm2);
		
		// locating the Element
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Dnyanada");
		
		// again back to the main frame
		driver.switchTo().defaultContent();
		
		//find the webElement and switch to the inner frame
		// frame 4
		WebElement frm4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frm4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Parth");
		
		// frame 5
        WebElement frm5 =  driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frm5);
		
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Neeta");
		
		// again going to the main frame
		driver.switchTo().defaultContent();
	
		// find the WebElement and switch to the inner frame
		// frame 3
		WebElement frm3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		
	 	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Nitin");
	
	 	
	 	
	 	

	}

}
