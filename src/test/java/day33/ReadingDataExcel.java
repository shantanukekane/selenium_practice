package day33;

// Excel file =====> workbook =====> sheet =====> rows ======> cells

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataExcel {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\newfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet0");  //workbook.getSheetAt(0);
		
		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total Number of rows: "+totalrows);  // 2 According to the Excel row will start from 0
		System.out.println("Total Number of cells: "+totalcells); //4 According to the Excel row will start from 1 
		
		// read the data from the Excel file 
		
		for(int i = 0;i<=totalrows;i++)   // in java row will start from 0
		{
			XSSFRow currentrow = sheet.getRow(i);
			
			for(int j = 0;j<totalcells;j++)  // In java cells will start from 
			{
			
			   String value = currentrow.getCell(j).toString();
			   System.out.print(value+"   ");
				
			}
			System.out.println();
		}
		
		
	   workbook.close();
	   file.close();
		
		

	}

}
