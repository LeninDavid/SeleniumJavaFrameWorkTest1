package Demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		test();
	}
	
	public static void test() throws InterruptedException
	{
		String PP = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", PP+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Shadow Skill");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[10]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/h3[1]/span[1]")).click();

		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       WebElement linkElement =  driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[10]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/h3[1]/span[1]"));
		      
		       if (linkElement.isEnabled())
		       {
		    	   System.out.println("Element Found");
		    	   
		       }
		       return linkElement;
		     }
		   });
		
		   element.click();
		driver.close();
		driver.quit();
	}
}
