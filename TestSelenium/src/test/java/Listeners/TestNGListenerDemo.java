package Listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(TestNGListeners.class)
public class TestNGListenerDemo {

	@Test
	public void Test1()
	{
		System.out.println("I am Inside Test 1");
	}
	
	@Test
	public void Test2() throws InterruptedException
	{
		System.out.println("I am Inside Test 2");
		//Assert.assertTrue(false);
		String Pp = System.getProperty("user.dir");
		System.out.println(Pp);
		System.out.println("OS Name is : "+ System.getProperty("os.name"));
		
		//Chrome
		System.setProperty("webdriver.chrome.driver", Pp+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("abc")).sendKeys("jacket");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void Test3()
	{
		System.out.println("I am Inside Test 3");
		throw new SkipException("This method si skipped");
	}
	
}
