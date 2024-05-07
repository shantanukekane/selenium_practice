package day33;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDatainExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\newfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet Sheet = workbook.createSheet();
		
		XSSFRow row1 = Sheet.createRow(0);
		
		
		row1.createCell(0).setCellValue("Name");
		row1.createCell(1).setCellValue("Department");
		row1.createCell(2).setCellValue("Mobile Number");
		row1.createCell(3).setCellValue("Designation");
		
		XSSFRow row2 = Sheet.createRow(1);
		
		row2.createCell(0).setCellValue("shantanu");
		row2.createCell(1).setCellValue("Testing");
		row2.createCell(2).setCellValue("8275583225");
		row2.createCell(3).setCellValue("QA Testing");
		
		XSSFRow row3 = Sheet.createRow(2);
		
		row3.createCell(0).setCellValue("Dnyanada");
		row3.createCell(1).setCellValue("Business Analyst");
		row3.createCell(2).setCellValue("9865467842");
		row3.createCell(3).setCellValue("BA");
		
		workbook.write(file);
		
		workbook.close();
		file.close();
		
		System.out.print("Writing data in Excel is done!");
		
		

	}

}
