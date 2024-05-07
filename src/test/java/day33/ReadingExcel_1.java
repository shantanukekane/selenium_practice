package day33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel_1 {

	public static void main(String[] args) throws IOException {
		
		// its a predefine method 
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");  // workbook.getSheetAt(0)

		int rows =  sheet.getLastRowNum();
		int cells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total Number of rows: "+rows);  // 5 according to the excel rows will start from zero
		System.out.println("Total Number of cells: "+cells); // 4 According to the Excel cell will start from 1
		

		// According to the java rows and columns start from zero only
		
		for(int i = 0;i<=rows;i++)  // 0 to 5 = 6
		{
			XSSFRow currentrow = sheet.getRow(i);
			
			for(int j = 0;j<cells;j++) // 0 to 3 = 4
			{
				//XSSFCell cell = currentrow.getCell(j);
				//String value = cell.toString(); // read the data in string variable
				
				String value = currentrow.getCell(j).toString();
				System.out.print(value+"   ");
				
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
		
	}

}
