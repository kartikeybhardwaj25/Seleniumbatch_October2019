package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	
	public ReadExcelFile(String excelPath) throws IOException {
		 // trying to access the location where my excel file is places
		File src = new File(excelPath);
		
		//Read character stream
		FileInputStream fis = new FileInputStream(src);
		
		//object for workbook
		wb = new XSSFWorkbook(fis);
		
	}
	
	//fetch the data from my sheet
	public String getData(int SheetNumber,int row,int column ) {
		sheet = wb.getSheetAt(SheetNumber);
		
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		
		return data;
		
	}
	
	//for row count
	public int getRowCount(int SheetIndex) {
		int row = wb.getSheetAt(SheetIndex).getLastRowNum();
		
		row = row+1;
		return row;
		
	}

}
