package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownWithoutselectTag {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		
	    List<WebElement> countryOpt = driver.findElements(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select/option"));
		System.out.print("Total Number of country drop down options are: "+countryOpt.size());
		
		
		// print all the options are present in the console windows
		/*
		
		for(int i = 0;i<countryOpt.size();i++)
		{
			String opt = countryOpt.get(i).getText();
			System.out.print(opt);
		}
		
		*/
		
		for(WebElement opt:countryOpt)
		{
			System.out.println(opt.getText());
		}
		
		Thread.sleep(3000);
		for(WebElement opt:countryOpt)
		{
			String crtdp = opt.getText();
			if(crtdp.equals("France"))
			{
				opt.click();
			}
		}
		
		
		
		
	
	}

}
