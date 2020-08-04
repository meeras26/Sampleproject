package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Compareproductpage 
{
	public static WebDriver driver;
	public Compareproductpage(WebDriver driver2) 
		{
				// TODO Auto-generated constructor stub
		this.driver=driver2;
		}
	By compareheading=By.xpath(".//*[@id='top']/body/div[1]/div[1]/h1");
	By popup1=By.xpath("/html/body/div/table/tbody[1]/tr[1]/td[1]/h2");
	By popup2=By.xpath("/html/body/div/table/tbody[1]/tr[1]/td[2]/h2");
	By closewindow=By.cssSelector(".buttons-set > button:nth-child(1)");
	public WebElement getcomparisonheading()
	{
		return driver.findElement(compareheading);
	}
	public WebElement getheadingsony() 
	{
		return driver.findElement(popup1);
	}
	public WebElement getheadingiphone()
	{
		return driver.findElement(popup2);
	}
	public WebElement closetheWindow()
	{
		return driver.findElement(closewindow);
	}

}
