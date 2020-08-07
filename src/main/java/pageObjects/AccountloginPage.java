package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountloginPage
{
	public static WebDriver driver;
	public AccountloginPage(WebDriver driver2) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	By createaccont = By.cssSelector("#login-form > div > div.col-1.new-users > div.buttons-set > a");
	public WebElement getcreateaccnt()
	{
		return driver.findElement(createaccont);
	}
}
