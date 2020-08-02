package Academy.Sampleproject;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.Mobilepage;
import pageObjects.SonyExperiapage;
import resourses.base;

public class PriceverificationTest extends base
{
	@Test
	public void pricecomparison() throws IOException
	{
		driver = initialsingDriver();
		driver.get("http://live.demoguru99.com/index.php/");
		Landingpage lp = new Landingpage(driver);
		lp.getmobile().click();
		String actual = driver.getTitle();
		String expected = "Mobile";
		Assert.assertEquals(expected, actual);
		Mobilepage sp = new Mobilepage(driver);
		String p = sp.getPrice().getText();
		System.out.println(p);
		sp.getXperialink().click();
		SonyExperiapage sx = new SonyExperiapage(driver);
		String s = sx.getscndPrice().getText();
		System.out.println(s);
		Assert.assertEquals(p,s);
	}

}
