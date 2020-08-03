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
By addtocart=By.cssSelector(".products-grid > li:nth-child(1) > div:nth-child(2) > div:nth-child(4) > button:nth-child(1)");

    public WebElement getmobile()
	{
		return driver.findElement(mobile);
	}
    public WebElement getAddtocart()
    {
 	   return driver.findElement(addtocart);
    }
    

}
