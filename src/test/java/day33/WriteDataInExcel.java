package day33;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\Javacorerevised\\seleniumprojects\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet();
		
		// Creating  first row 
		XSSFRow row1 = sheet.createRow(0);
		
		row1.createCell(1).setCellValue("Name");
	    row1.createCell(2).setCellValue("Department");
	    row1.createCell(3).setCellValue("Mobile Number");
		row1.createCell(4).setCellValue("Designation");
		
		// create second row
		
		XSSFRow row2 = sheet.createRow(1);
		
		row2.createCell(1).setCellValue("Shantanu");
		row2.createCell(2).setCellValue("Testing");
		row2.createCell(3).setCellValue("8275583225");
		row2.createCell(4).setCellValue("QA lead");
		
		// create a third row
		XSSFRow  row3 = sheet.createRow(2);
		
		row3.createCell(1).setCellValue("Akshay");
		row3.createCell(2).setCellValue("Data Engineering");
		row3.createCell(3).setCellValue("9963785134");
		row3.createCell(4).setCellValue("Data Engineer");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.print("Writing is done!!!...");
        
	}

}
