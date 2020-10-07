package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String P;
	static XSSFWorkbook workbook;
	static int rowCount;
	static XSSFSheet sheet;
	static int colCount;
	
	public ExcelUtils(String excelPath, String sheetName) throws IOException
	{
		P = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
	}
	
	public static void main(String[] args) throws IOException {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	
	public static int getRowCount() throws IOException
	{
		
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count is "+ rowCount);
		return rowCount;
	}
	
	public static String getCellDataString(int rownum, int colnum) throws IOException
	{
		
		String cellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		//System.out.println(cellData); 
		return cellData;
	}
	
	public static void getCellDataNumber(int rownum, int colnum) throws IOException
	{
		
		double cellData = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
		//System.out.println(cellData); 
		
	}
	
	public static int getColCount() throws IOException
	{
		
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Column Count is "+ colCount);
		return colCount;
	}
}
