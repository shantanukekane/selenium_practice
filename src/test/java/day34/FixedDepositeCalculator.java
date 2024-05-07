package day34;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FixedDepositeCalculator {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		
		String file = System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx";
		
		int rows = ExcelUtils.getRowCount(file, "Sheet1");
		
		
		for(int r=1;r<=rows;r++)
		{
	   
		// read data from the Excel
			
		   String princi = ExcelUtils.getCellData(file, "Sheet1", r, 0);
		   String rate_of_intr = ExcelUtils.getCellData(file, "Sheet1", r, 1);
		   String peri1 = ExcelUtils.getCellData(file, "Sheet1", r, 2);
		   String peri2 = ExcelUtils.getCellData(file, "Sheet1", r, 3);
		   String freq  = ExcelUtils.getCellData(file, "Sheet1", r, 4);
		   String exp_mat_value = ExcelUtils.getCellData(file, "Sheet1", r, 5);
			
	   // pass the Excel data to the application
			
		   driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princi);
		   driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rate_of_intr);
		   driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(peri1);
		   
		              // period 2 drop down 
		  WebElement tenuredpEle = driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
		  
		  Select tenuredp = new Select(tenuredpEle);
		  
		  tenuredp.selectByVisibleText(peri2);
		  
		  WebElement freqdpEle = driver.findElement(By.xpath("//select[@id='frequency']"));
		  
		  Select freqdp = new Select(freqdpEle);
		  
		  freqdp.selectByVisibleText(freq);
		  
		  // click on calculate button 
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement cal_button =  driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")); // calculate button
		  js.executeScript("arguments[0].click();", cal_button);
		  
		  
		  
		// validation and update the data in Excel like pass or fails
			
          String act_mat_value = driver.findElement(By.xpath("//span[@class='gL_27'][@id='resp_matval']")).getText();
		  
          if(Double.parseDouble(act_mat_value) == Double.parseDouble(exp_mat_value))
          {
        	  System.out.print("Test passed");
        	  
        	  ExcelUtils.setCellData(file, "Sheet1", r, 7,"Passed");
        	  ExcelUtils.fillGreenColor(file, "Sheet1", r, 7);
          }
          else
          {
        	  System.out.print("Test Failed");
        	  ExcelUtils.setCellData(file, "Sheet1", r, 7, "Failed");
        	  ExcelUtils.fillRedColor(file, "Sheet1", r, 7);
          }
          
          WebElement clear_button = driver.findElement(By.xpath("//img[@class='PL5']"));
  		  js.executeScript("arguments[0].click();", clear_button);
  			
		}
		
		
		

	}

}
