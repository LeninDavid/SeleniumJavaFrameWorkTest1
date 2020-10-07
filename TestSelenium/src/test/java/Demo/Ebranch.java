package Demo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebranch {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	String PP = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", PP+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEbranch() throws Exception {
    driver.get("https://uat-ebranchnxt.pnbmetlife.com/ebranch-nxt/");
    driver.findElement(By.id("mat-input-0")).clear();
    driver.findElement(By.id("mat-input-0")).sendKeys("1039997");
    driver.findElement(By.id("mat-input-1")).clear();
    driver.findElement(By.id("mat-input-1")).sendKeys("Metlife_1");
    driver.findElement(By.id("mat-input-0")).click();
    driver.findElement(By.id("mat-input-0")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=mat-input-0 | ]]
    driver.findElement(By.id("mat-input-0")).click();
    driver.findElement(By.xpath("//div[@id='loginContent']/div/div/div/form")).click();
    driver.findElement(By.id("mat-input-1")).click();
    driver.findElement(By.id("mat-input-1")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=mat-input-1 | ]]
    driver.findElement(By.id("mat-input-1")).clear();
    driver.findElement(By.id("mat-input-1")).sendKeys("Metlife1");
    driver.findElement(By.xpath("//div[@id='loginContent']/div/div/div/form/div[4]/div/button")).click();
    driver.findElement(By.xpath("//div[@id='loginContent']/div/div/div/form/div[2]/div/mat-form-field/div/div/div[2]/mat-icon")).click();
    driver.findElement(By.id("mat-input-1")).clear();
    driver.findElement(By.id("mat-input-1")).sendKeys("Metlife_1");
    driver.findElement(By.xpath("//div[@id='loginContent']/div/div/div/form/div[4]/div/button")).click();
    driver.findElement(By.xpath("//mat-toolbar/div[2]/div")).click();
    driver.findElement(By.id("mat-input-2")).clear();
    driver.findElement(By.id("mat-input-2")).sendKeys("09/09/1990");
    driver.findElement(By.id("formly_2_input_newCusMobileNum_0")).click();
    driver.findElement(By.id("formly_2_input_newCusMobileNum_0")).clear();
    driver.findElement(By.id("formly_2_input_newCusMobileNum_0")).sendKeys("9898989898");
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.xpath("//img[@alt='hamburger']")).click();
    driver.findElement(By.xpath("//div[4]/div[2]/span")).click();
    driver.findElement(By.id("mat-input-11")).clear();
    driver.findElement(By.id("mat-input-11")).sendKeys("1039997");
    driver.findElement(By.id("mat-input-12")).clear();
    driver.findElement(By.id("mat-input-12")).sendKeys("Metlife_1");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
