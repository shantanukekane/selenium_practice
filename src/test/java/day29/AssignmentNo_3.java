package day29;

import java.util.Arrays;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentNo_3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement departcityEle = driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		Select departcity = new Select(departcityEle);
		
		departcity.selectByVisibleText("Boston");
		
		WebElement destinecityEle = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select destinecity = new Select(destinecityEle);
		
		destinecity.selectByVisibleText("Rome");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		
		int rows = driver.findElements(By.xpath("//table[@class = 'table']//tbody//tr")).size();
		
		// create a String array to store the string variable price
		
		String Allprices[] = new String[rows];
		
		
		for(int i = 1;i<=rows;i++)
		{
			String prices = driver.findElement(By.xpath("//table[@class = 'table']//tbody//tr["+i+"]/td[6]")).getText();
			
			Allprices[i-1] = prices;
		}
		
		System.out.print("Arrays in Ascending order: ");
		Arrays.sort(Allprices);
		
		for(String prc:Allprices)
		{
			System.out.println(prc);
		}
		
		
		// selectiing the highest price flight ticket 
		
		String Lowest_price = Allprices[0];
		String Highest_price = Allprices[4];
		
		
		for(int i = 1;i<=rows;i++)
		{
			String prices = driver.findElement(By.xpath("//table[@class = 'table']//tbody//tr["+i+"]/td[6]")).getText();
		
		    if(prices.equals(Highest_price))
		    {
		    	driver.findElement(By.xpath("//table[@class = 'table']//tbody//tr["+i+"]//td[1]//input")).click();
		    	break;
		    }
		
		}
		
	   Thread.sleep(5000);
		
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='inputName']"));
		firstname.clear();
		firstname.sendKeys("shantanu");
		
		WebElement address =  driver.findElement(By.xpath("//input[@id='address']"));
		address.clear();
		address.sendKeys("Plot No 52");
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("kashi");
		
		
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Uttar Pradesh");
		
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("202525");
		
		WebElement carttype = driver.findElement(By.xpath("//select[@id='cardType']"));
		
		// select class
		
		Select cart = new Select(carttype);
		cart.selectByVisibleText("American Express");
		
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("2534661");
		
		WebElement mon = driver.findElement(By.xpath("//input[@id='creditCardMonth']"));
		mon.clear();
		mon.sendKeys("10");
		
		
		WebElement year = driver.findElement(By.xpath("//input[@id='creditCardYear']"));
		year.clear();
		year.sendKeys("2025");
		
		
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("shantanu mishra");
		
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		
		String act_text = "";
		
		try
		{
			act_text = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
		}
		catch(NoSuchElementException e)
		{
			
		}
		
		String exp_text = "Thank you for your purchase today!";
		
		if(act_text.contains("Thank you"))
		{
			System.out.print("Test Passed");
		}
		else
		{
			System.out.print("Test Failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
