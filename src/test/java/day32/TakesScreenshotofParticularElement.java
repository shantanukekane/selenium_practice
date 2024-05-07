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

public class TakesScreenshotofParticularElement {

	public static void main(String[] args) throws IOException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
				
		WebElement featurefile = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File scr = featurefile.getScreenshotAs(OutputType.FILE);
		
		File trg = new File("C:\\Users\\ASUS\\Desktop\\Javacorerevised\\seleniumprojects\\Screenshot\\featurefile.png");
		
		FileUtils.copyFile(scr, trg);
		
			
		
	}

}
