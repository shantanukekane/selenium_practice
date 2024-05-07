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

public class TakesScreenshots {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		// if you want to take screen shot of the full page or particular area
		//  we use one interface that is TakeScreenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
	    File scr =	ts.getScreenshotAs(OutputType.FILE);  // its takes the screenshot
		File trg = new File("C:\\Users\\ASUS\\Desktop\\Javacorerevised\\seleniumprojects\\Screenshot\\fullpage.png");              // here we save our screenshot file
		
		// now we wanted to copy the screenshot into the target page from source page
		// for that we have one method 
		
		FileUtils.copyFile(scr, trg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    

		
		
		
		

	}

}
