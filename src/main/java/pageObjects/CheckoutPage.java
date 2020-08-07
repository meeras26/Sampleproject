package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage
{
	public static WebDriver driver;
	public CheckoutPage(WebDriver driver2) 
	{
		driver = driver2;
	}
	By country = By.xpath("//select[@id='country']");
	public Select getcountry()
	{
		Select sel = new Select(driver.findElement(country));
		return sel;
	}
}
