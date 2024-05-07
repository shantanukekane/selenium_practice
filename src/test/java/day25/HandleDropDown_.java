package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown_ {

	public static void main(String[] args) {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		
		// Total Number of options
	    List<WebElement> options = driver.findElements(By.xpath("//div[@class ='single_tab_div resp-tab-content resp-tab-content-active']/p/select/option"));		
		System.out.println("Total Number of options: "+options.size());
	    
	    
		for(WebElement option:options)
		{
			String opt = option.getText();
			if(opt.equals("India"))
			{
				option.click();
			}
		}
		
		
		
		
		
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
