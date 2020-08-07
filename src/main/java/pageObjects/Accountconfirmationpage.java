package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accountconfirmationpage 
{
	public static WebDriver driver;
	public Accountconfirmationpage(WebDriver driver2) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	By tvlink = By.cssSelector("li.level0:nth-child(2) > a:nth-child(1)");
    public WebElement gettv()
	{
    	return driver.findElement(tvlink);
	}
}
