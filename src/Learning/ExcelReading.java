package Learning;

import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReading {
	
	public  XSSFWorkbook workbook;
	public  XSSFSheet sheet;
	public  XSSFRow row;
	public  XSSFCell cell;
	public FileInputStream file;
	
	

	 public Object getData() throws IOException{
		
		Object[][] obj = new Object [2][2];
		
  file = new FileInputStream("C:\\Users\\703426\\workspace\\Learning\\src\\Resources\\Data.xlsx");
		
		workbook = new XSSFWorkbook(file);
		 
		sheet = workbook.getSheetAt(0);
		
		for(int i =0;i<=sheet.getLastRowNum();i++){
			
			
			cell = sheet.getRow(i).getCell(0);
			cell.setCellType(Cell.CELL_TYPE_STRING);
			
			cell = sheet.getRow(i).getCell(1);
			cell.setCellType(Cell.CELL_TYPE_STRING);
			
			
			
			
			
			obj[0][i] = cell.getStringCellValue();
			obj[0][i+1] = cell.getStringCellValue();
			
		
			
			
		}
		
		return obj;
	}
	
	

	synchronized public static void main(String... args) throws IOException{
	
		//File src = new File("‪C:\\Users\\703426\\workspace\\Learning\\src\\Resources\\Data.xlsx");
		
		
		
		
		
	}

}
