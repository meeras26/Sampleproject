package Academy.Sampleproject;



import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import pageObjects.CheckoutPage;
import pageObjects.CreateAccountpage;
import pageObjects.Landingpage;
import pageObjects.Mydashboard;
import pageObjects.MywishlistPage;
import pageObjects.Shoppingcartpage;
import resourses.base;

public class SixthTest extends base
{
	@Test
	public void purchaseProducts() throws IOException, InterruptedException
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
		 for (String handle : driver.getWindowHandles()) 
		 {
			 driver.switchTo().window(handle);
		 }
		 Mydashboard md=new Mydashboard(driver);
		 md.getmywishlist().click();
		 for (String handle : driver.getWindowHandles()) 
		 {
		     driver.switchTo().window(handle);
		 }
		 MywishlistPage mw=new MywishlistPage(driver);
		 mw.getAddtocart().click();
		 for (String handle : driver.getWindowHandles())
		 {
			 driver.switchTo().window(handle);
		 }
		 Shoppingcartpage sc=new Shoppingcartpage(driver);
		 sc.getproceedtochechkoutbtn().click();
		 for (String handle : driver.getWindowHandles())
		 {
		    	driver.switchTo().window(handle);
		    	}
		 
		CheckoutPage ck=new CheckoutPage(driver);
		ck.getstate().selectByVisibleText("New York");
		ck.getzip().sendKeys("5454");
		ck.getaddress().sendKeys("ABC");
		ck.getcity().sendKeys("Newyork");
		ck.getphone().sendKeys("1234455");
		ck.getEstmate().click();
		String sflatrate="Flat Rate";
	    String flaterate=ck.getrate().getText();
	    try {	    	
			assertEquals(sflatrate, flaterate);
		    } catch (Exception e) {
		    	e.printStackTrace();	    	
		    }
	    String sFlatRatePrice = "Fixed - $5.00";
	    String flatRatePrice =ck.getfrprice().getText();
	    try {	    	
			assertEquals(sFlatRatePrice, flatRatePrice);
		    } catch (Exception e) {
		    	e.printStackTrace();	    	
		    }
		 ck.getshippingcost().click();
		 ck.getupdate().click();
		 String vFlatRatePrice = "$5.00";
		 String shipcostincluded=ck.getshipcostincluded().getText();
		 try {	    	
				assertEquals( vFlatRatePrice, shipcostincluded);
			    } catch (Exception e) {
			    	e.printStackTrace();	    	
			    }
		 ck.getcheckout().click();
		 Thread.sleep(2000);
		 for (String handle : driver.getWindowHandles()) { 
		    	driver.switchTo().window(handle);
		    	}  
	}

}
