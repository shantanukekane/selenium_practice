package day32;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenshots2 {

	public static void main(String[] args) throws IOException {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// if we want take the screenshot we have one interface that is TakesScreenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File scr = ts.getScreenshotAs(OutputType.FILE);  // it takes the screenshot  // source file 
		File trg = new File("C:\\Users\\ASUS\\Desktop\\Javacorerevised\\seleniumprojects\\Screenshot\\newpage.png");  // here we have to save the file of the Screenshot
		
		// now we wanted to copy the source file to destination file

		FileUtils.copyFile(scr, trg);
		
		
		
		
		
		
		

	}

}
