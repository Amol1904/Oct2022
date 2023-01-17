import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropDown 
{

	public static void main(String[] args)
	{
		 System.out.println("Launch Crome Browser");
		   
	       System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	       
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://mail.yahoo.com/");
	       
	       driver.manage().window().maximize();
	       

	}

}
