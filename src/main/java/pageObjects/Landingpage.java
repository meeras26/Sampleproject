package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage 
{
	public WebDriver driver;
	public Landingpage(WebDriver driver2) 
	{
	     this.driver=driver2;
	}
By mobile = By.linkText("MOBILE");

    public WebElement getmobile()
	{
		return driver.findElement(mobile);
	}

}
