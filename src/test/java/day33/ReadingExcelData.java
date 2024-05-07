package day33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx");
		
		XSSFWorkbook workbook  = new XSSFWorkbook(file);
		
		XSSFSheet sheet =  workbook.getSheet("Sheet1");
		
		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("Total Number of rows: "+totalrows);   // 5
		System.out.println("Total Number of columns: "+totalcells); // 7
		
		
		// reading the data from the excel sheet 
		for(int i = 0;i<=totalrows;i++)  // 0 to 5
		{
			XSSFRow currentrow = sheet.getRow(i);
			
			for(int j = 0;j<totalcells;j++) // 0 to 6
			{
				
				String data = currentrow.getCell(j).toString();
				System.out.print(data+"   ");
				
			}
			System.out.println();
		}
		
		
		workbook.close();
		file.close();
		
		
		
		
		
		
		
		
		

	}

}
