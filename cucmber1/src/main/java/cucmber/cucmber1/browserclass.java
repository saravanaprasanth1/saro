package cucmber.cucmber1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class browserclass {
 static WebDriver driver;
@Test
	public static WebDriver openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.04.30\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	
		else if(browser.equalsIgnoreCase("Ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Training_C2a.04.30\\Desktop\\Selenium\\Drivers\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else
			System.out.println("Invalid browser !!");
		return driver;
	}
    

}

