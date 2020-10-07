package EbranchNXT;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRun {

	public static void main(String[] args) throws InterruptedException {
		String Pp = System.getProperty("user.dir");
		System.out.println(Pp);
		System.out.println("OS Name is : "+ System.getProperty("os.name"));
		
		//Chrome
		System.setProperty("webdriver.chrome.driver", Pp+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		Set<Cookie> cookies = driver.manage().getCookies();
		
		driver.get("https://uat-ebranchnxt.pnbmetlife.com/ebranch-nxt/");
		Thread.sleep(3000);
		driver.findElement(By.id("mat-input-0")).sendKeys("1039997");
		driver.findElement(By.id("mat-input-1")).sendKeys("Metlife_1");
		driver.findElement(By.xpath("//button[@class='loginBtn']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//mat-toolbar/div[2]/div")).click();
		//driver.findElement(By.id("mat-input-2")).click();
		//driver.findElement(By.id("mat-input-2")).clear();
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("09/09/1990");
		//driver.findElement(By.id("formly_2_input_newCusMobileNum_0")).click();
		//driver.findElement(By.id("formly_2_input_newCusMobileNum_0")).clear();
		driver.findElement(By.xpath("//input[@id='formly_2_input_newCusMobileNum_0']")).sendKeys("8390961668");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//driver.findElement(By.className("create_quote_btn cursor_pointer ng-star-inserted")).click();
		driver.close();
		System.out.println("Test Completed");

	}

}
