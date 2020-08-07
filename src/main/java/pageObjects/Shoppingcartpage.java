package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shoppingcartpage 
{
	public static WebDriver driver;
	public Shoppingcartpage(WebDriver driver2) 
	{
	     this.driver = driver2;
	}
	By proceedcheclout = By.cssSelector(".top > li:nth-child(1) > button:nth-child(1)");
	By qty = By.cssSelector(".product-cart-actions > input:nth-child(1)");
	By update = By.cssSelector("button.btn-update:nth-child(2)");
	By error = By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[2]/p");
	By emptycart = By.id("empty_cart_button");
	By eptymsg = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1");
	public WebElement getproceedtochechkoutbtn()
	{
		return driver.findElement(proceedcheclout);
	}
	public WebElement getQty()
	{
		return driver.findElement(qty);
	}
	public WebElement getUpdate()
	{
		return driver.findElement(update);
	}
	public WebElement getErrormessage()
	{
		return driver.findElement(error);
	}
	public WebElement getemptycart()
	{
		return driver.findElement(emptycart);
	}
	public WebElement getemptymesage()
	{
		return driver.findElement(eptymsg);
	}
}
