package Academy.Sampleproject;

import java.io.IOException;

import org.junit.Test;

import pageObjects.CreateAccountpage;
import pageObjects.Landingpage;
import pageObjects.Mydashboard;
import pageObjects.MywishlistPage;
import pageObjects.Shoppingcartpage;
import resourses.base;

public class SixthTest extends base
{
	@Test
	public void purchaseProducts() throws IOException
	{
		driver = initialsingDriver();
		driver.get("http://live.demoguru99.com/index.php/");
		Landingpage lp = new Landingpage(driver);
	    lp.getaccountlink().click();
		 for (String handle : driver.getWindowHandles())
		 {
		    	driver.switchTo().window(handle);
		 }
		 CreateAccountpage ca=new CreateAccountpage(driver);
		 ca.getEmail().sendKeys("testing4hobby@gmail.com"); 
		 ca.getpass().sendKeys("123456");
		 ca.getlogin().click();
		 Mydashboard md=new Mydashboard(driver);
		 md.getmywishlist().click();
		 MywishlistPage mw=new MywishlistPage(driver);
		 mw.getAddtocart().click();
		 Shoppingcartpage sc=new Shoppingcartpage(driver);
		 sc.getproceedtochechkoutbtn().click();
		 CreateAccountpage cp = new CreateAccountpage (driver);
			String fname = "Tester";
			cp.getfirstname().sendKeys(fname);
			System.out.println(fname);
			String midname = "hobby";
			cp.getmiddname().sendKeys(midname);
			System.out.println(midname);
			String lname = "xyz";
			cp.getLastname().sendKeys(lname);
		 
	}

}
