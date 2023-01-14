package Maven_project1.MaProject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest1
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  
      String baseUrl = "https://www.toolsqa.com/";
      System.out.println("Launching Google Chrome browser"); 
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String testTitle = "Free QA Automation Tools Tutorial for Beginners with Examples";
      String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Starting Test On Chrome Browser");
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Finished Test On Chrome Browser");
  }

}
