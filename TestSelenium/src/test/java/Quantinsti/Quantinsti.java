package Quantinsti;

import static org.testng.Assert.fail;

import java.io.File;

//import java.util.regex.Pattern;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Quantinsti {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	String Pp = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", Pp+"\\src\\test\\java\\Drivers\\ChromeDriver\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testQuantinsti() throws Exception {
	//Home Page  
	driver.manage().window().maximize();
    driver.get("https://quantra.quantinsti.com/");  
    driver.findElement(By.xpath("//nav[@id='right-navigation']/ul/div/li[4]/button/span/span")).click();
    
    //Login Page - Enter Email and Password
    driver.findElement(By.name("email")).sendKeys("naus_482@yahoo.co.in");
    driver.findElement(By.name("password")).sendKeys("leonardo1157358");
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/form")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    //Dashboard - Click on Browse Course and select the course Sentiment Analysis in Trading
    driver.findElement(By.linkText("Browse Courses")).click();
    driver.findElement(By.xpath("//label[@class='lbl-toggle']")).click();
    WebDriverWait wait = new WebDriverWait(driver, 20); // Explicit wait for popup
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/button")));
    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/button")).click();
    driver.findElement(By.xpath("//img[@alt='Move Right']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//img[@alt='Move Right']")).click();    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//img[@alt='Move Right']")).click();
    driver.findElement(By.xpath("//body/div/div[@class='App']/div[@class='LayoutDefault']/main[@class='LayoutDefault__main']/div[@class='ctlg-course-page view']/section[@class='grey-bg']/div/div/section[@class='user-card-section recommended-card-section']/div[@class='section-body container']/div/div[@class='glide glide--ltr glide--slider glide--swipeable']/div[@class='glide__track']/ul[@class='glide__slides card-wrapper user-card-carousel']/li[7]/div[1]/a[1]/div[2]")).click();
    Thread.sleep(2000);
    
    //Get the Course name and price - data printed in the terminal    
    String course1 = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/main[1]/div[1]/div[2]/div[7]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/span[1]")).getText();
    System.out.println("Name of course 1 is : "+course1);
    driver.findElement(By.xpath("//a[contains(text(),'Course 2')]")).click();
    String course2 = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/main[1]/div[1]/div[2]/div[7]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/span[1]")).getText();
    System.out.println("Name of course 1 is : "+course2);
    driver.findElement(By.xpath("//a[contains(text(),'Course 3')]")).click();
    String course3 = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/main[1]/div[1]/div[2]/div[7]/div[1]/div[1]/section[1]/div[3]/div[1]/div[1]/span[1]")).getText();
    System.out.println("Name of course 1 is : "+course3);
    driver.findElement(By.xpath("//a[contains(text(),'Course 4')]")).click();
    String course4 = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/main[1]/div[1]/div[2]/div[7]/div[1]/div[1]/section[1]/div[4]/div[1]/div[1]/span[1]")).getText();
    System.out.println("Name of course 1 is : "+course4);
    driver.findElement(By.xpath("//a[contains(text(),'Course 5')]")).click();
    String course5 = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/main[1]/div[1]/div[2]/div[7]/div[1]/div[1]/section[1]/div[5]/div[1]/div[1]/span[1]")).getText();
    System.out.println("Name of course 1 is : "+course5);
    Thread.sleep(3000);
    String price = driver.findElement(By.xpath("//span[contains(text(),'₹22575')]")).getText();
    System.out.println("The Price of the course is : "+price);
    driver.findElement(By.xpath("//div[@id='courseDetailMenu']/div/ul/li[8]/span/button/span/span")).click();
    
    // Clicked on Enroll - Cart Page - Get the Course name and price and tally it with the previous page
    String cartCourse1 = driver.findElement(By.xpath("//h5[contains(text(),'Python For Trading!')]")).getText();
    System.out.println("Name of course 1 in the cart is : "+cartCourse1);
    String cartCourse2 = driver.findElement(By.xpath("//h5[contains(text(),'Trading using Options Sentiment Indicators')]")).getText();
    System.out.println("Name of course 2 in the cart is : "+cartCourse2);
    String cartCourse3 = driver.findElement(By.xpath("//h5[contains(text(),'Trading Strategies with News and Tweets')]")).getText();
    System.out.println("Name of course 3 in the cart is : "+cartCourse3);
    String cartCourse4 = driver.findElement(By.xpath("//h5[contains(text(),'Trading with Machine Learning: Classification and ')]")).getText();
    System.out.println("Name of course 4 in the cart is : "+cartCourse4);
    String cartCourse5 = driver.findElement(By.xpath("//h5[contains(text(),'Natural Language Processing in Trading')]")).getText();
    System.out.println("Name of course 5 in the cart is : "+cartCourse5);
    String basePrice = driver.findElement(By.xpath("//div[contains(text(),'₹22575')]")).getText();
    System.out.println("Base Price for the course in the cart is : "+basePrice);
    String cartPrice = driver.findElement(By.xpath("//span[contains(text(),'₹26639')]")).getText();
    System.out.println("Amount Payable for the course in the cart is : "+cartPrice);
    if(course1.equalsIgnoreCase(cartCourse1) && course1.equalsIgnoreCase(cartCourse1) && course1.equalsIgnoreCase(cartCourse1) && course1.equalsIgnoreCase(cartCourse1) && course1.equalsIgnoreCase(cartCourse1))
    {
    	System.out.println("The course names match with the cart");
    }
    else
    {
    	System.out.println("the course name does not match with the cart");
    }
    if(price.equalsIgnoreCase(basePrice))
    {
    	System.out.println("Base Price of the courses match with the cart");
    }
    else
    {
    	System.out.println("Base Price of the courses does not match with the cart");
    }
    
    //Click on one of the course - new tab opens and later it closes
    driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
    Thread.sleep(2000);
    Set<String> windowIds = driver.getWindowHandles();
    Iterator<String> iter = windowIds.iterator();
    String mainWindow = iter.next();
    String tabWindow = iter.next();
    driver.switchTo().window(tabWindow);
    Thread.sleep(2000);
    driver.close();
    driver.switchTo().window(mainWindow);
    
    //Remove a course from the list
    driver.findElement(By.xpath("(//a[contains(text(),'Remove')])[5]")).click();
    Thread.sleep(1000);
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //Screenshot of the alert available in src/tst/java folder under Quantinsti package
    FileUtils.copyFile(scrFile, new File("C:\\Users\\Admin\\eclipse-workspace\\TestSelenium\\src\\test\\java\\Quantinsti\\screenshot.png"));
    //String alert = driver.findElement(By.xpath("//body/div[@id='Bl1UkZxQ4']/div[1]")).getText();
    //System.out.println("Alert text is: " + alert);
    
    //Enter coupon code and close the modal
    driver.findElement(By.xpath("//button/span/span")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ABC");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='coupon-modal']/div[2]/div/div/form/div[3]/button/span/span")).click();
    Thread.sleep(2000);
    scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //Screenshot of the alert available in src/tst/java folder under Quantinsti package
    FileUtils.copyFile(scrFile, new File("C:\\Users\\Admin\\eclipse-workspace\\TestSelenium\\src\\test\\java\\Quantinsti\\error.png"));
    driver.findElement(By.xpath("//div[@id='coupon-modal']/div[2]/div/div/button/span")).click();
    Thread.sleep(2000);
    
    //Log out
    driver.findElement(By.xpath("//nav[@id='right-navigation']/ul/div/li[6]/div")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Logout')])[2]")).click();
    Thread.sleep(2000);
    driver.close();
    driver.quit();
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
