package Academy.Sampleproject;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.Shoppingcartpage;
import resourses.base;

public class ProducttothecartTest extends base
{
@Test
	public void productverification() throws IOException
	{
		driver = initialsingDriver();
		driver.get("http://live.demoguru99.com/index.php/");
		Landingpage lp = new Landingpage(driver);
		lp.getmobile().click();
		lp.getAddtocart().click();
		Shoppingcartpage sc=new Shoppingcartpage(driver);
		sc.getQty().clear();
		sc.getQty().sendKeys("1000");
		sc.getUpdate().click();
		String acts=sc.getErrormessage().getText();
		System.out.println(acts);
		String expts="* The maximum quantity allowed for purchase is 500.";
		System.out.println(expts);
		   try
			{
			     assertEquals(acts,expts);
			}catch (Exception e) {
		    	e.printStackTrace();	    	
		    }
		sc.getemptycart().click();     
	    String em=sc.getemptymesage().getText();
		String mg="SHOPPING CART IS EMPTY";
			try
			{
				assertEquals(em,mg);
			}catch(Exception e) {
		    	e.printStackTrace();	    	
		    }
		
	}
}
