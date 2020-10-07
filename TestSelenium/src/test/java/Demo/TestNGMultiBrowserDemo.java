package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;
	String Pp = System.getProperty("user.dir");
	
	@BeforeTest
	@Parameters("browserName")
	public void setUp(String browserName)
	{
		System.out.println("Browser Nmae is "+ browserName + "Thread ID is "+ Thread.currentThread().getId());
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
	public void test1() throws InterruptedException
	{
		driver.get("https://google.com/");
		Thread.sleep(2000);
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Test Completed");
	}
	
}
