package day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_iFrames {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame-one796456169");
		
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-0']")).sendKeys("Shantanu");
		
		
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		
		Thread.sleep(3000);
		
		// Location the Element 
		
		WebElement job_des = driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-3']"));
		
		// Select one of the option from the job description
		
		Select jobs = new Select(job_des);
		
		List<WebElement> option = jobs.getOptions();		
		System.out.print("Total Number of options: "+option.size());
		
		//jobs.selectByVisibleText("QA Engineer");
		jobs.selectByValue("Radio-0");
		//jobs.selectByIndex(0);
		
		//driver.findElement(By.xpath("//input[@id='FSsubmit']")).click();
	
		
		// again go back to the current web page
		driver.switchTo().defaultContent();
		
		WebElement countrydpEle  = driver.findElement(By.xpath("//select[@id='country']"));
		
		// Select of the country options from the drop down
		// create select class 
		
		Select countrydp = new Select(countrydpEle);
		
		List<WebElement> options = countrydp.getOptions();
		System.out.print(options.size());
		
		//countrydp.selectByIndex(0);
		countrydp.selectByValue("uk");
		//countrydp.selectByVisibleText("");
		
		
		
		

	}

}
