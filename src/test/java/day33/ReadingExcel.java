package day33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// File -----> Workbook-------> sheets--------> rows------>cells

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		
		//FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Javacorerevised\\seleniumprojects\\testdata\\data.xlsx");
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");		
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
	    XSSFSheet sheet = workbook.getSheet("Sheet1");  //  workbook.getSheetAt(0);
	   
	    int totalrows = sheet.getLastRowNum();
	    int totalcell =  sheet.getRow(1).getLastCellNum();
	     
	     
	    System.out.println("Total Number of rows: "+totalrows);  //5 == According to the Excel the rows will start from 0
	    System.out.println("Total Number of cells: "+totalcell);// 4 == According to the Excel the columns will start from 1
	    
	    
	    // According to the java the rows and cell start from zero
	    
	    
	    for(int r = 0;r<=totalrows;r++)
	    {
	       XSSFRow currentrow = sheet.getRow(r);
	    	
	    	for(int c = 0;c<totalcell;c++)
	    	{
	    		
	    		//XSSFCell cell= currentrow.getCell(c);
	    	   // String value = cell.toString();
	    		String value = currentrow.getCell(c).toString();
	    		System.out.print(value+"    ");
	    		
	    	}
	    	System.out.println();
	    }
	    
	    workbook.close();
	    file.close();
	    
	    
	    
	    
	     
	     
	}

}
