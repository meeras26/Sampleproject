package Academy.Sampleproject;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Compareproductpage;
import pageObjects.Landingpage;
import resourses.base;

public class ForthTest extends base{
//	@Test
//	public void compareprodct() throws IOException, InterruptedException
//	{
//		driver = initialsingDriver();
//		driver.get("http://live.demoguru99.com/index.php/");
//		Landingpage lp = new Landingpage(driver);
//		lp.getmobile().click();
//		lp.getsonycomparelink().click();
//		lp.getiphonecomparison().click();
//		String so=lp.getsonyheading().getText();
//		String ip=lp.getiphoneheading().getText();
//		System.out.println(so);
//		System.out.println(ip);
//		lp.getComparebtn().click();
//		Thread.sleep(2000);
//        for (String handle : driver.getWindowHandles()) 
//           {
//	    	driver.switchTo().window(handle);
//	    	}
//	    Compareproductpage cp=new Compareproductpage (driver);
//		String at=cp.getcomparisonheading().getText();
//		System.out.println(at);
//		String ct="COMPARE PRODUCTS";
//		assertEquals(ct,at);
//	    String hed1=cp.getheadingsony().getText();
//	    String hed2=cp.getheadingiphone().getText();
//		System.out.println(hed1);
//		System.out.println(hed2);
//		assertEquals(so,hed1);
//		assertEquals(ip,hed2);
//		cp.closetheWindow().click();
//	}

}
