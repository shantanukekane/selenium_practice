package day29;

import java.time.Duration;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentNo_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com");
		driver.manage().window().maximize();
		
		
	    WebElement departcityEle =	driver.findElement(By.xpath("//select[@name='fromPort']"));
		
	    // select one of the option from the drop doen
	    Select departcity = new Select(departcityEle);
	    
	    departcity.selectByVisibleText("Portland");
	    
	    WebElement destinecityEle = driver.findElement(By.xpath("//select[@name='toPort']"));
	    
	    // Select one of the option from the destine city
	    
	    Select destinecity = new Select(destinecityEle); 
	    
	    destinecity.selectByVisibleText("Berlin");
	    
	    driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	    
	    // find the number of rows in the table
	    
	   int  rows = driver.findElements(By.xpath("//table[@class = 'table']//tbody//tr")).size();
	   System.out.print("Number of rows: "+rows);
	   
	   // create an String array to store the variable price value 
	   
	   String price[] = new String[rows];
	   
	  // store the value in the String variable price 
	   
	   for(int i = 1;i<=rows;i++)
	   {
		   String prc = driver.findElement(By.xpath("//table[@class = 'table']//tbody//tr["+i+"]//td[6]")).getText();
		   
		   price[i-1] = prc;	// because the String is start from 0 and array is 1
	   }
	   
	   Arrays.sort(price);
	   
	   for(String pc:price)
	   {
		   System.out.println(pc);
	   }
	   
	   String min = price[0];
	   String max = price[4];
	   
	   for(int i = 1;i<=rows;i++)
	   {
		   String prc = driver.findElement(By.xpath("//table[@class = 'table']//tbody//tr["+i+"]//td[6]")).getText();
		   if(prc.equals(min))
		   {
			   driver.findElement(By.xpath("//table[@class = 'table']//tbody//tr["+i+"]//td[1]//input")).click();
			   break;
		   }
		   
	   }
	   
	   String act_text = "";
	   
	   try
	   {
		   
	      act_text = driver.findElement(By.xpath("//h2[normalize-space()='Your flight from TLV to SFO has been reserved.']")).getText();
	   
	   }
	   catch(NoSuchElementException e)
	   {
	   	   
	   }
	   
	   String exp_text = "Your flight from TLV to SFO has been reserved.";

	   if(act_text.equals(exp_text))
	   {
		   System.out.print("Test passed");
	   }
	   else
	   {
		   System.out.print("Test Failed");
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
