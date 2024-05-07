package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame_frame {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// frame1
		WebElement frm1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("shantanu");
		
		
		// again switch to the main frame
		driver.switchTo().defaultContent();
		
		
		//frame2
		WebElement frm2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Dnyanada");
		
		// again switch to the main frame 
		driver.switchTo().defaultContent();
		
		// frame3
		WebElement frm3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("parth");
		
		// inner frame
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();
		
		// again switch to the main frame
		driver.switchTo().defaultContent();
		
		// frame 4
	    WebElement frm4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frm4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Neeta");
		
		
		// again switch to the main frame
		driver.switchTo().defaultContent();
		
		// frame 5
		
		WebElement frm5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frm5);
		
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Nitin");
	
		

		

	}

}
