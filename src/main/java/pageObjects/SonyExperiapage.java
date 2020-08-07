package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SonyExperiapage {
	public static WebDriver driver;
	public SonyExperiapage(WebDriver driver2) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	
	By secdprice = By.id("product-price-1");
	
	public WebElement getscndPrice()
	{
		return driver.findElement(secdprice);
	}
}
