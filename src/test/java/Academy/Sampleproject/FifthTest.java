package Academy.Sampleproject;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.testng.annotations.Test;
import pageObjects.Accountconfirmationpage;
import pageObjects.AccountcreatePage;
import pageObjects.AccountloginPage;
import pageObjects.CreateAccountpage;
import pageObjects.Landingpage;
import pageObjects.MywishlistPage;
import pageObjects.SharewishlistPage;
import pageObjects.TVPage;
import pageObjects.Wishlistpage;
import resourses.base;

public class FifthTest extends base
{
@Test
public void wishlist() throws IOException
{
	driver = initialsingDriver();
	driver.get("http://live.demoguru99.com/index.php/");
	Landingpage lp = new Landingpage(driver);
	lp.getaccountlink().click();
	 for (String handle : driver.getWindowHandles())
	 {
	    	driver.switchTo().window(handle);
	  }
	AccountloginPage al = new AccountloginPage(driver); 
	al.getcreateaccnt().click();
	CreateAccountpage cp = new CreateAccountpage (driver);
	String fname = "Tester";
	cp.getfirstname().sendKeys(fname);
	System.out.println(fname);
	String midname = "hobby";
	cp.getmiddname().sendKeys(midname);
	System.out.println(midname);
	String lname = "xyz";
	cp.getLastname().sendKeys(lname);
	cp.getEmail().sendKeys("testinhobby4896@gmail.com");
	cp.getPassword().sendKeys("123456");
	cp.getconfirmpass().sendKeys("123456");
	cp.getregistrationbtn().click();

	for (String handle : driver.getWindowHandles()) 
	{
		driver.switchTo().window(handle);
	}

	String ovalue = ("Hello, "+ fname + " " + midname +" "+lname+"!");
	System.out.println(ovalue);
	String validatemsg = cp.getvaliadtemsg().getText();
	System.out.println(validatemsg);
	
	try {	    	
		assertEquals(ovalue, validatemsg);
	    } catch (Exception e) {
	    	e.printStackTrace();	    	
	    }
	Accountconfirmationpage ac = new Accountconfirmationpage(driver);
	ac.gettv().click();
	for (String handle : driver.getWindowHandles()) {
    	driver.switchTo().window(handle);
    	}
	TVPage tp=new TVPage(driver);
	tp.getwishlist().click();
	 MywishlistPage  wp = new  MywishlistPage (driver);
	wp.getsharewishlist().click();
	for (String handle : driver.getWindowHandles()) {
    	driver.switchTo().window(handle);
    	}
	SharewishlistPage sw = new SharewishlistPage(driver);
	sw.getEmail().sendKeys("djfsjdfjsdf");
	sw.getMessage().sendKeys("fsdfsd");
	sw.getsharebtn().click();
	String vWishList = "Your Wishlist has been shared.";
	String owishlist=sw.getsharemsg().getText();
	try {	    	
		assertEquals(vWishList, owishlist);
	    } catch (Exception e) {
	    	e.printStackTrace();	    	
	    }
	}
}