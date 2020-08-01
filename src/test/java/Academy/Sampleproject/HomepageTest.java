package Academy.Sampleproject;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.Mobilepage;
import resourses.base;

public class HomepageTest extends base
{
	@Test
	public void basepagenavigation() throws IOException
	{
		driver = initialsingDriver();
		driver.get("http://live.demoguru99.com/index.php/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Home page";
		assertEquals(expectedTitle,actualTitle);
		Landingpage lp = new Landingpage(driver);
		lp.getmobile().click();
		String actual = driver.getTitle();
		String expected = "Mobile";
		assertEquals(expected, actual);
		Mobilepage mp = new Mobilepage(driver);
		mp.getsortedlist().selectByVisibleText("Name");
		List<String> p = mp.getProductNames();
		System.out.println(p);
		boolean s = mp.isListSorted(p);
		System.out.println(s);

	}

}
