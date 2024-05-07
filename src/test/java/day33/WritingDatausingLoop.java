package day33;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDatausingLoop {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\newfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet();
		
		XSSFRow row1 = sheet.createRow(0);
		
		// writing the data into the excel sheet
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<=3;i++)
		{
			XSSFRow currentrow = sheet.createRow(i);
			
			for(int j = 0;j<2;j++)
			{
				System.out.print("Enter a value: ");
				String value = s.next();
				currentrow.createCell(j).setCellValue(value);
				
				
			}
		}
		
		System.out.print("Writing is done!");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		

	}

}
