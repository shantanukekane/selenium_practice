package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static_tables {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/reserve.php");
		driver.manage().window().maximize();

	
		//1) Total number of rows
		
		  int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		  System.out.println("Total Number of rows: "+rows);
		
		//2) Total Number of columns
		
		  int columns = driver.findElements(By.xpath("//table[@class='table']//tbody//tr[2]//td")).size();
		  System.out.println("Total Number of columns: "+columns);
		
		//3) read the specific data from the table
		
		 String airline = driver.findElement(By.xpath("//table[@class = 'table']//tbody//tr[1]//td[3]")).getText();
		 System.out.println("Name of the Airline: "+airline);
		
		//4) read all the data from the table
		 /*
		System.out.println("Choose"+"   "+"Flight"+"    "+"Airline"+"    "+"Departure"+"    "+"Arrives"+"    "+"Price");
		 
		for(int i = 1;i<=rows;i++)
		{
			for(int j = 1;j<=columns;j++)
			{
				String table_data =driver.findElement(By.xpath("//table[@class = 'table']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(table_data+"\t");
				
			}
			System.out.println();
		}
		 
		 */
		 
		// find the price of the virgin america
		/*
		for(int i = 1;i<rows;i++)
		{
			String Airline = driver.findElement(By.xpath("//table[@class ='table']//tbody//tr["+i+"]//td[3]")).getText();
			
			if(Airline.equals("Virgin America"))
			{
				String price = driver.findElement(By.xpath("//table[@class ='table']//tbody//tr["+i+"]//td[6]")).getText();
			    System.out.println(Airline+"   "+price);
			
			}
		}
		*/

		// find the sum of the price 
		int sum = 0;
		for(int i = 1;i<rows;i++)
		{
			
			String prices = driver.findElement(By.xpath("//table[@class ='table']//tbody//tr[1]//td[6]")).getText();
			sum = sum + Integer.parseInt(prices);
		}
		System.out.print("Addition of all the prices: "+sum);
		
		
		

		
	}

}
