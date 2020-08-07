package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SharewishlistPage 
{
	public static WebDriver driver;
	public SharewishlistPage(WebDriver driver2)
	{
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	By wishlistsharebtn=By.xpath("//*[@id=\"form-validate\"]/div[2]/button");
	By email = By.id("email_address");
	By message = By.id("message");
	By wishmessage = By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span");
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getMessage()
	{
		return driver.findElement(message);
	}
	public WebElement getsharebtn()
	{
		return driver.findElement(wishlistsharebtn);
	}
	public WebElement getsharemsg()
	{
		return driver.findElement(wishmessage);
	}
}
