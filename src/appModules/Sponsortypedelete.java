package appModules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.Constants;

public class Sponsortypedelete
{
	public static void sponsordelete(WebDriver driver) throws Exception
	{
	driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
	List<WebElement> rowcount,columncount;
	Alert alert;
	
	WebElement Sponsortable= driver.findElement(By.id("sponsor_type"));
	rowcount=Sponsortable.findElements(By.xpath("//*[@id='sponsor_type']/tbody/tr"));
	
    int r = rowcount.size();	
	System.out.println("Rowcount"+r);
	
	columncount=Sponsortable.findElements(By.tagName("th"));
	
	int c= columncount.size();	
	System.out.println("Columncount"+c);
	
	String colvalue="Testentry-1";
	
	for (int i=1;i<=r;i++)
	{
		String cellvalue=null;
		cellvalue= driver.findElement(By.xpath(".//*[@id='sponsor_type']/tbody/tr["+i+"]/th")).getText();
		System.out.println("Cellvalue:"+cellvalue);
		if(cellvalue.equals(colvalue))
		{
			for (int j=1;j<=c;j++)
			{
				driver.findElement(By.xpath("//*[contains(@class,'btn btn-danger btn-xs btn_tooltip')]")).click();
				
				//*[@id="changeStatus145"]/button
				//*[contains(@id,changeStatus]/button
				alert=driver.switchTo().alert();
				
				Thread.sleep(1500);
				
				alert.accept();
				
			}
		break;	
		
		}
		
	}
	}

}
