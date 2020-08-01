package resourses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base 
{
	public WebDriver driver;
	public WebDriver initialsingDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\meera\\eclipse-workspace\\Sampleproject\\src\\test\\java\\resourses\\Data.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Meera\\WebDrivers\\chromedriver.exe");
			  driver=new ChromeDriver();
	    }
		else if(browser.equals("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver","C:\\Meera\\WebDrivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
