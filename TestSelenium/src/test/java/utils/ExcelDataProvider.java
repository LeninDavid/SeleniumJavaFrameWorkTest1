package utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	static WebDriver driver = null;
	
	@BeforeTest
	public static void setUPTest() throws IOException
	{
		String Pp = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Pp+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(dataProvider="test1data")
	public void test1(String Username, String Password)
	{
		System.out.println(Username+" | " + Password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		/*driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.name("Logout")).click();*/
	}
	
	@DataProvider(name = "test1data")
	public Object[][] getData() throws IOException
	{
		String P = System.getProperty("user.dir");
		String excelPath = P+"\\Excel\\data.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}
	
	public static Object[][] testData(String excelPath, String sheetName) throws IOException
	{
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount =excel.getColCount();
		Object data[][] = new Object[rowCount][colCount];
		
		for (int i=1; i<rowCount; i++)
		{
			for (int j=0; j<colCount; j++)
			{
				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData+" | ");
				data[i][j] = cellData;
			}
			System.out.println();
		}
		return data;
	}

}
