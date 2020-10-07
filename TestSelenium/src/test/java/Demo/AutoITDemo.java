package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		test();

	}
	
	public static void test() throws InterruptedException, IOException
	{
		String PP = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", PP+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.id("pickfiles")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\FileUpload.exe");
		Thread.sleep(3000);
		//driver.close();

}
}