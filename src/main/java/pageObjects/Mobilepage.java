package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Mobilepage 
{
	public static WebDriver driver;
	public Mobilepage(WebDriver driver2) 
	{
	     this.driver = driver2;
	}
	
	By sorted = By.cssSelector("select[title='Sort By']");
	static By listname = By.cssSelector("h2[class=product-name]");
	By productprice = By.id("product-price-1");
	By experialink = By.cssSelector("a[title='Sony Xperia']");
	public Select getsortedlist()
	{
		   Select sel = new Select(driver.findElement(sorted));
		   return sel;
	}
	public static List<String> getProductNames()
	{
	   List<String> names = new ArrayList<>();
	   List<WebElement> products = driver.findElements(listname);
	   for (WebElement product : products)
	   {
	       names.add(product.getText());
	       System.out.println("item :"+product.getText());
	   }
	
	   return names;
	}
   public  boolean isListSorted(List<String> list)
   {
       String last = list.get(0);
       for (int i = 1; i < list.size(); i++)
       {
           String current = list.get(i);
           if (last.compareToIgnoreCase(current) > 0)
           {
               return false;
           }

           last = current;
       }

       return true;
      
   }
   public WebElement getPrice()
   {
   	   return driver.findElement(productprice);
   }
   public WebElement getXperialink()
   {
   	   return driver.findElement(experialink);
   }
}
