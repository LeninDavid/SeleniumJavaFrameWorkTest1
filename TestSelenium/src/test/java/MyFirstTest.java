import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {

	public static void main(String[] args) throws InterruptedException {

		
		String Pp = System.getProperty("user.dir");
		System.out.println(Pp);
		System.out.println("OS Name is : "+ System.getProperty("os.name"));
		
		//Chrome
		//System.setProperty("webdriver.chrome.driver", Pp+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		
		
		//Firefox
		/*System.setProperty("webdriver.gecko.driver", Pp+"\\src\\test\\java\\Drivers\\GeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		//Internet Explorer
		//System.setProperty("webdriver.ie.driver", Pp+"\\src\\test\\java\\Drivers\\IEDriver\\IEDriverServer.exe");
		/*DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability("ignoreProtectedModeSettings", true);*/
		//WebDriver driver = new InternetExplorerDriver();
		
		//EDGE
		/*System.setProperty("webdriver.edge.driver", Pp+"\\src\\test\\java\\Drivers\\EdgeDriver\\MicrosoftWebDriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();*/
		
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("jacket");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[contains(text(),'Jackets for Men - Shop for Mens Jacket Online in I')]")).click();
		driver.findElement(By.xpath("//li[1]//a[1]//div[2]")).click();
		driver.close();
		driver.quit();
		
		System.out.println("Test Completed");
		
	}

}
