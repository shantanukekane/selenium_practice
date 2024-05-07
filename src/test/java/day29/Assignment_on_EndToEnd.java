package day29;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_on_EndToEnd {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement departurecityEle = driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		// Select one of the options from the drop down
		Select departcity = new Select(departurecityEle);
		
		
		departcity.selectByVisibleText("Boston");
		
		
		WebElement destinationcityEle = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select desticity = new Select(destinationcityEle);
		
		desticity.selectByVisibleText("London");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		
		// Find the total Number of rows
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));
		System.out.print("Number of rows: "+rows.size());
		
		// to find the lowest price from the price column
		// first to create a string array 
		
		String arrayprice[] = new String[rows.size()];  // or rows 
		
		for(int i = 1;i<=rows.size();i++)
		{
			String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]//td[6]")).getText();
		
		    arrayprice[i-1] = price;
		
		}
		
		Arrays.sort(arrayprice);
		
		for(String arrayvalue:arrayprice)
		{
			System.out.println(arrayvalue);
		}
		
		String min = arrayprice[0];
		String max = arrayprice[4];
		
		// select flight ticket with the lowest price
		
		for(int i = 0;i<rows.size();i++)
		{
			
			String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]//td[6]")).getText();
			
			if(price.equals(min))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]//td[1]")).click();
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
