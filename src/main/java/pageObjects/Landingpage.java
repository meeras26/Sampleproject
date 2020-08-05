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
By sonyheading=By.cssSelector("li.last:nth-child(1) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1)");
By iphoneheading=By.cssSelector(".products-grid > li:nth-child(2) > div:nth-child(2) > h2:nth-child(1)");
By sony=By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a");
By iphone=By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a");
By comparebtn=By.cssSelector("div.block-content:nth-child(2) > div:nth-child(3) > button:nth-child(1)");
By accountlink=By.xpath("//*[@id=\"top\"]/body/div/div/div[3]/div/div[4]/ul/li[1]/a");

    public WebElement getmobile()
	{
		return driver.findElement(mobile);
	}
    public WebElement getAddtocart()
    {
 	   return driver.findElement(addtocart);
    }
    public WebElement getsonycomparelink()
    {
 	   return driver.findElement(sony);
    }
    public WebElement getiphonecomparison()
    {
 	   return driver.findElement(iphone);
    }
    public WebElement getsonyheading()
    {
 	   return driver.findElement(sonyheading);
    }
    public WebElement getiphoneheading()
    {
 	   return driver.findElement(iphoneheading);
    }
    public WebElement getComparebtn()
	{
		return driver.findElement(comparebtn);
	}
    public WebElement getaccountlink()
    {
 	   return driver.findElement(accountlink);
    }

}
