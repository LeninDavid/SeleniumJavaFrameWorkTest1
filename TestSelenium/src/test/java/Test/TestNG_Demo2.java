package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {

	static WebDriver driver;
	
	@BeforeTest
	public static void setUPTest()
	{
		String Pp = System.getProperty("user.dir");
		System.out.println(Pp);
		System.setProperty("webdriver.chrome.driver", Pp+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	@Test
	public static void googleSearch2()
	{
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Naruto");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	}
	
	@Test
	public static void googleSearch3()
	{
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Bleach");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	}
	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("Test2 Completed");
	}

}
