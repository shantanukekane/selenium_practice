package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static_table_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Explicit wait
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		// open url
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//1) find the total Number of rows
		
	    int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	    System.out.println("Total Number of rows: "+rows);
		
		//2) Find the total Number of columns
		
	    int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]//td")).size();
		System.out.println("Total Number of columns: "+columns);
	    
		//3) read the specific data from the rows and columns
		
	   // String name = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[2]//td[3]")).getText();
	   // System.out.print(name);
		
		//4) read all the data from the rows and columns
		/*
		System.out.println("BookName"+"   "+"Author"+"   "+"Subject"+"    "+"Price");
		
		for(int i=2;i<=rows;i++)
		{
			for(int j = 1;j<=columns;j++)
			{
			    String Name = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(Name+"\t");
			}
			System.out.println();
		}
		*/

		//5) print the bookname whose author is amit
		/*
		
		for(int i = 2;i<=rows;i++)
		{
		  String author = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td[2]")).getText();
		   
		  if(author.equals("Amit"))
		  {
			 String BookName = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td[1]")).getText();
		     System.out.println(BookName+"   "+author);
		  }
		
		}
	
	    */
		//6) print the Bookname whose price is 300
		/*
		for(int i = 2;i<=rows;i++)
		{
		  
			String price = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td[4]")).getText();
		    if(price.equals("300"))
		    {
		       String BookName = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td[1]")).getText();
		       System.out.println(BookName+"   "+price);
		       
		    }
			
		}
		*/
		
		//7) print the Subject Name whose author is Amit
		
		for(int i = 2;i<=rows;i++)
		{
			String author =driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td[2]")).getText();
		   
			if(author.equals("Amit"))
			{
				String subject = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td[3]")).getText();
				System.out.println(subject+"   "+author);
			
			}
		
		}
		
		//8) sum of all the price of the book
		int sum = 0;
		for(int i = 2;i<=rows;i++)
		{
			String price = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td[4]")).getText();
		    sum = sum + Integer.parseInt(price);
			
		}
		System.out.print("Addition of all price value: "+sum);
		
		
	}

}
