package Maven_project1.MaProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenFirstDemo
{

	public static void main(String[] args)
	{
		
		  System.out.println("Launch Crome Browser");
		   
	       System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	      
	       WebDriver driver = new ChromeDriver();
	      
	       
	       driver.get("http://www.facebook.com/");			

	      
	       driver.manage().window().maximize();


	}

}
