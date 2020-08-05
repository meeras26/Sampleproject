package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountpage {
	public static WebDriver driver;
	public CreateAccountpage(WebDriver driver2) 
	{
			// TODO Auto-generated constructor stub
	this.driver=driver2;
	}
	
	By firstname=By.id("firstname");
	By middlename=By.id("middlename");
	By lastname=By.id("lastname");
	By email=By.id("email_address");
	By password=By.id("password");
	By confirm=By.id("confirmation");
	By register=By.cssSelector("button.button:nth-child(2)");
	By errormsg=By.cssSelector(".hello > strong:nth-child(1)");
	public WebElement getfirstname()
	{
		return driver.findElement(firstname);
	}
	public WebElement getmiddname()
	{
		return driver.findElement(middlename);
	}
	public WebElement getLastname()
	{
		return driver.findElement(lastname);
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
    public WebElement getconfirmpass()
    {
    	return driver.findElement(confirm);
    }
    public WebElement getregistrationbtn()
    {
    	return driver.findElement(register);
    }
    public WebElement getvaliadtemsg()
    {
    	return driver.findElement(errormsg);
    }

}
