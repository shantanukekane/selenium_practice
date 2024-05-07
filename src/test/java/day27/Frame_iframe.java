package day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_iframe {

	public static void main(String[] args) throws InterruptedException {
	
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame-one796456169");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-0']")).sendKeys("shantanu");
		
		
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		
		Thread.sleep(3000);
		//Locating the drop down 
		
		WebElement job_description  =driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-3']"));
		
		/*
		// Total Number of options
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id = 'RESULT_RadioButton-3']/option"));
		
		
		System.out.println("Total Number of options: "+options.size());
		
		// print the options in the console window
		
		for(int i = 1;i<=options.size();i++)
		{
			String opt = options.get(i).getText();
			System.out.println(opt);
		}
		
		Thread.sleep(3000);
		
		for(WebElement option:options)
		{
			String opt = option.getText();
			if(opt.equals("Automation Engineer"))
			{
				option.click();
			}
		}
		
		*/
		
		// create a select class
		
		Select jobs = new Select(job_description);
		
		List<WebElement> options = jobs.getOptions();
		System.out.print(options.size());
		
		jobs.selectByVisibleText("Automation Engineer");
		
		
		
		
		
		
		
		

	}

}
