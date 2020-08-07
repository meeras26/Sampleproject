package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wishlistpage 
{
	public static WebDriver driver;
	public Wishlistpage(WebDriver driver2) 
	{
			// TODO Auto-generated constructor stub
	this.driver = driver2;
	}
    By wishlistbtn = By.cssSelector(".btn-share");
	public WebElement getwishlistbtn()
	{
		return driver.findElement(wishlistbtn);
	}

}
