package day33;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file  = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\update.xlsx");
		
        XSSFWorkbook workbook =  new XSSFWorkbook();
        
        XSSFSheet sheet = workbook.createSheet();
        
        XSSFRow row1 = sheet.createRow(0);
      
        // create rows,cells and update data manually
        /*
        row1.createCell(0).setCellValue("Roll No");
        row1.createCell(1).setCellValue("Name");
        row1.createCell(2).setCellValue("Department");
        row1.createCell(3).setCellValue("Designation");
        row1.createCell(4).setCellValue("Workload");
        
        XSSFRow row2 = sheet.createRow(1);
        
        row2.createCell(0).setCellValue("1");
        row2.createCell(1).setCellValue("Shantanu");
        row2.createCell(2).setCellValue("Software Testing");
		row2.createCell(3).setCellValue("QA");
		row2.createCell(4).setCellValue("Create Test Cases");
		
		*/
        
        // create rows and cells and update data using loop
        
        Scanner s = new Scanner(System.in);
        
        for(int i = 0;i<=3;i++)
        {
        	XSSFRow currentrow = sheet.createRow(i);
        			
        	for(int j = 0;j<2;j++)
        	{
        		//currentrow.createCell(j).setCellValue("Welcome");
        		
        		System.out.println("Enter the value: ");
        		String value = s.next();
        		currentrow.createCell(j).setCellValue(value);
        		
        	}
        }
        
		workbook.write(file);
		
		workbook.close();
		file.close();
		
		System.out.print("Writing is done!!");
	
	}

}
