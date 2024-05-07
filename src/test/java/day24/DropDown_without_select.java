package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_without_select {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		// locating the multiselect drop down
		driver.findElement(By.xpath("//button[contains(@data-toggle,'dropdown')]")).click();
		
		
		// total Number of options in the drop down
	    List<WebElement> multiopt =	driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li//label"));
		System.out.println("Total Number of multi select options: "+multiopt.size());
		
		
		for(int i = 0;i<multiopt.size();i++)
		{
			
			String mlopt = multiopt.get(i).getText();
			System.out.println(mlopt);
		
		}
		
        for(int i = 0;i<multiopt.size();i++)
        {
        	
			String mlopt = multiopt.get(i).getText();
			if(mlopt.equals("Java") || mlopt.equals("C#"))
		    {
				multiopt.get(i).click();
			
		    }
        }
		
	
		/*
		
		for(int i = 0;i<multiopt.size();i++)
		{
			
			if(multiopt.get(i).isSelected())
			{
				multiopt.get(i).click();
			}
			
		}
		*/
		
		
		
		
		
	}

}
