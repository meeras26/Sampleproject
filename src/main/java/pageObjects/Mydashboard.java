package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mydashboard
{
	public static WebDriver driver;
	public Mydashboard(WebDriver driver2) 
	{
		this.driver = driver2;
	}
	By wishlist = By.cssSelector("div.block-content:nth-child(2) > ul:nth-child(1) > li:nth-child(8) > a:nth-child(1)");
	By addtocart = By.cssSelector("button[title='Add to Cart']");
	By myorder = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a");
	By reorder = By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/span/a[2]");
	public WebElement getmywishlist()
	{
		return driver.findElement(wishlist);
	}
	public WebElement getaddTocart()
	{
		return driver.findElement(addtocart);
	}
	public WebElement getmyorder()
	{
		return driver.findElement(myorder);
	}
	public WebElement getreorderlink()
	{
		return driver.findElement(reorder);
	}
}
