package day27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_innerFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame-one796456169");
		
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-0']")).sendKeys("shantanu");
		
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		
		//locating the drop down element 
        WebElement job_desc = driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-3']"));
		
		// select one of the option from the from the drop down
		// create a select class
		Select jobs = new Select(job_desc);
		
		List<WebElement> options = jobs.getOptions();
		System.out.println("Total Number of options: "+options.size());
		
 		
		jobs.selectByVisibleText("Developer");
		
		// Again switch to main web page
		driver.switchTo().defaultContent();
		
		
		// locating the country Element drop down
		
		WebElement countrydpEle = driver.findElement(By.xpath("//select[@id='country']"));
		
		
		// Total Number of countries in the option
		
		List<WebElement> countrydp = driver.findElements(By.xpath("//select[@id='country']/option"));
		System.out.println("Total Number of options are: "+countrydp.size());
		
		
		Thread.sleep(5000);
		//print the all options are the console window
		
		for(int i = 0;i<countrydp.size();i++)
		{
			
			String opt = countrydp.get(i).getText();
			System.out.println(opt);
			
		}
		
		Thread.sleep(3000);
		for(WebElement option:countrydp)
		{
			String opt = option.getText();
			if(opt.equals("France"))
			{
				option.click();
			}
			
		}
		
	
	}

}
