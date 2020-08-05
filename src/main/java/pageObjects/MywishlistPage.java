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
      this.driver=driver2;
    }
	By wishlist=By.xpath("//*[@id=\"wishlist-view-form\"]/div/div/button[1]");
	public WebElement getsharewishlist()
	{
		return driver.findElement(wishlist);
	}

}
