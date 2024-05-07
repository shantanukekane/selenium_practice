package day33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData_in_Excel_1 {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total Number of rows: "+rows);
		System.out.println("Total Number of cells: "+cells);
		
		
		for(int i = 0;i<=rows;i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			
			for(int j = 0;j<cells;j++)
			{
				String value = currentrow.getCell(j).toString();
				System.out.print(value+"    ");
				
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
		
		
	}

}
