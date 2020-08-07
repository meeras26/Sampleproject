package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MywishlistPage 
{
	public static WebDriver driver;
	public MywishlistPage(WebDriver driver2) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver2;
    }
	By wishlist = By.xpath("//*[@id=\"wishlist-view-form\"]/div/div/button[1]");
	By addcart = By.xpath("//*[@id=\"item_46402\"]/td[5]/div/button");
	public WebElement getsharewishlist()
	{
		return driver.findElement(wishlist);
	}
	public WebElement getAddtocart()
	{
		return driver.findElement(addcart);
	}
}
