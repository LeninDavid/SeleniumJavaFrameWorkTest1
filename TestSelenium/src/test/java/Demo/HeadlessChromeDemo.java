package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {

	public static void main(String[] args) throws InterruptedException {
		

		test();
	}
	
	public static void test() throws InterruptedException
	{
		String PP = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", PP+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		//options.addArguments("window-size = 1920,1080");
		WebDriver driver = new ChromeDriver(options);
		
		//driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Shadow Skill");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.close();

}
}