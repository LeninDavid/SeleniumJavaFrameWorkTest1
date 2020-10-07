package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo {

	static WebDriver driver;
	public static String browserName;
	
	@BeforeTest
	public static void setUPTest() throws IOException
	{
		String Pp = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		System.out.println(Pp);
		if (browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", Pp+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", Pp+"\\src\\test\\java\\Drivers\\GeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
		System.setProperty("webdriver.ie.driver", Pp+"\\src\\test\\java\\Drivers\\IEDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
		
		
	}
	
	@Test
	public static void googleSearch()
	{
	
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("One Piece");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	}
	
	@AfterTest
	public void tearDownTest() throws IOException
	{
		driver.close();
		System.out.println("Test Completed");
		PropertiesFile.setProperties();
	}

}
