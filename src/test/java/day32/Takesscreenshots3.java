package day32;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takesscreenshots3 {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		// for capturing the specific area of webpage we can get it throghu the WebElement
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		File src = username.getScreenshotAs(OutputType.FILE); // source file
		
		File trg = new File("C:\\Users\\ASUS\\Desktop\\Javacorerevised\\seleniumprojects\\Screenshot\\username.png");// destination file
		
		FileUtils.copyFile(src, trg);
		
		
		
		
	}

}
