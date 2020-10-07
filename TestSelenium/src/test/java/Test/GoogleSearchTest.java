package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		googleSearch();

	}
	
	public static void googleSearch() throws InterruptedException
	{
		String Pp = System.getProperty("user.dir");
		System.out.println(Pp);
		System.setProperty("webdriver.chrome.driver", Pp+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		//driver.findElement(By.name("q")).sendKeys("One Piece");
		GoogleSearchPage.textboxSearch(driver).sendKeys("One Piece");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);
		
		Thread.sleep(2000);
		driver.close();
	}

}
