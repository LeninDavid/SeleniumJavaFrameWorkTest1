package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
		googleSearchTest();

	}
	
	public static void googleSearchTest() throws InterruptedException
	{
		String Pp = System.getProperty("user.dir");
		System.out.println(Pp);
		System.setProperty("webdriver.chrome.driver", Pp+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		searchPageObj.setTextInSearchBox("Naruto");
		Thread.sleep(2000);
		searchPageObj.clickSearchButton();
		driver.close();
		System.out.println("Test Completed");
	}

}
