import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		String Pp = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", Pp+"\\src\\test\\java\\Drivers\\IEDriver\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver(caps);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Test Reports");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		driver.close();
		System.out.println("Test Completed");
	}
}
