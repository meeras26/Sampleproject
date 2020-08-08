package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage
{
	public static WebDriver driver;
	public CheckoutPage(WebDriver driver2) 
	{
		driver = driver2;
	}
	By country = By.xpath("//select[@id='country']");
	By state=By.id("billing:region_id");
	By zip=By.xpath("//*[@id=\"billing:postcode\"]");
	By address=By.id("billing:street1");
	By city=By.id("billing:city");
	By phone=By.id("billing:telephone");
	By estimate=By.xpath(".//*[@id='shipping-zip-form']/div/button");
	By frate=By.xpath(".//*[@id='co-shipping-method-form']/dl/dt");
	By frprice=By.xpath("By.xpath(\".//*[@id='co-shipping-method-form']/dl/dd/ul/li/label");
	By shcost=By.id("s_method_flatrate_flatrate");
	By updatetotl=By.xpath("//button[@title='Update Total'");
	By costincluded=By.xpath(".//*[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]/span");
	By checkout=By.xpath("//button[@title='Proceed to Checkout']");
	public Select getcountry()
	{
		Select sel = new Select(driver.findElement(country));
		return sel;
	}
	public Select getstate()
	{
		Select se=new Select(driver.findElement(state));
		return se;
	}
	public WebElement getzip()
	{
		return driver.findElement(zip);
	}
	public WebElement getaddress()
	{
		return driver.findElement(address);
	}
	public WebElement getcity()
	{
		return driver.findElement(city);
	}
	public WebElement getphone()
	{
		return driver.findElement(phone);
	}
	public WebElement getEstmate()
	{
		return driver.findElement(estimate);
	}
	public WebElement getrate()
	{
		return driver.findElement(frate);
	}
	public WebElement getfrprice()
	{
		return driver.findElement(frprice);
	}
	public WebElement getshippingcost()
	{
		return driver.findElement(shcost);
	}
	public WebElement getupdate()
	{
		return driver.findElement(updatetotl);
	}
	public WebElement getshipcostincluded()
	{
		return driver.findElement(costincluded);
	}
	public WebElement getcheckout()
	{
		return driver.findElement(checkout);
	}
	
}
