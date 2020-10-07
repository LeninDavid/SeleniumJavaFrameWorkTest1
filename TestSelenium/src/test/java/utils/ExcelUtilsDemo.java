package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsDemo {

	public static void main(String[] args) throws IOException {
		
		String P = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(P+"\\Excel\\data.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);

	}

}
