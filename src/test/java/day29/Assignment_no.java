package day29;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_no {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement departcityEle = driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		// Select one of the option from the drop down
		Select departcity = new Select(departcityEle);
		
		departcity.selectByVisibleText("Portland");
		
		
		WebElement destinecityEle = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		// Select one of the option from the drop down
		
		Select destinecity = new Select(destinecityEle);
		
		destinecity.selectByVisibleText("London");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		
		int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("Total Number of rows: "+rows);
		
		// create a string array and store the value into the String Array
		
		String Allprices[] = new String[rows];
		
		for(int i = 1;i<=rows;i++)
		{
			String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]//td[6]")).getText();
			
			Allprices[i-1] = price;
			
		}
		
		Arrays.sort(Allprices);
		
		for(String allprice:Allprices)
		{
			System.out.println(allprice);
		}
		
		// validation part 
		
		String lowest_value = Allprices[0];
		String highest_value = Allprices[4];
		
		
		for(int i = 1;i<rows;i++)
		{
			String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]//td[6]")).getText();

			if(price.equals(highest_value))
			{
				
				driver.findElement(By.xpath("//table[@class = 'table']//tr["+i+"]//td[1]//input")).click();
				break;
			}
			
		}	
		

	}

}
