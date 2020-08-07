package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TVPage
{
	public static WebDriver driver;
	public TVPage(WebDriver driver2) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	By wishlist = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a");
	public WebElement getwishlist()
	{
		return driver.findElement(wishlist);
	}
}
