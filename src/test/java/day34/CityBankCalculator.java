package day34;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CityBankCalculator {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		
		String file = System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx";
		
		int rows = ExcelUtils.getRowCount(file, "Sheet1");
		
		for(int r = 1;r<=rows;r++)
		{
			// read the data from the Excel
			
			String ini_depo_amt = ExcelUtils.getCellData(file, "Sheet1", r, 0);
			String interest_rate = ExcelUtils.getCellData(file, "Sheet1", r, 1);
			String length = ExcelUtils.getCellData(file, "Sheet1", r, 2);
			String comp = ExcelUtils.getCellData(file, "Sheet1", r, 3);
			String exp_Total = ExcelUtils.getCellData(file, "Sheet1", r, 4);	
			
			// pass the data to the Application using Excel data
			
			WebElement interdepoamt = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			interdepoamt.clear();
			interdepoamt.sendKeys(ini_depo_amt);
			
			WebElement intrrate = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			intrrate.clear();
			intrrate.sendKeys(interest_rate);
			
			WebElement leng = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
			leng.clear();
			leng.sendKeys(length);
		
		    driver.findElement(By.xpath("//div[@class='mat-select-trigger ng-tns-c109-4']")).click();
		    
		    List<WebElement> options = driver.findElements(By.xpath("//div[@id = 'mat-select-0-panel']//mat-option"));
		    System.out.println("Total Number of options: "+options.size());
		    
		    
		    for(WebElement option:options)
		    {
		    	if(option.getText().equals(comp))
		    	{
		    		option.click();
		    	}	
		    			
		    }
			
			// calculation button
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement cal_button = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']"));
			js.executeScript("arguments[0].click();", cal_button);
			
			
			// validation of application and update the Excel sheet
			
			String act_Total = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			
			if(act_Total.equals(exp_Total))
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(file, "Sheet1", r, 6, "Passed");
				ExcelUtils.fillGreenColor(file, "Sheet1", r, 6);
				
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(file, "Sheet1", r, 6, "Failed");
				ExcelUtils.fillRedColor(file, "Sheet1", r, 6);
				
			}
			
		}
		
		
	}

}
