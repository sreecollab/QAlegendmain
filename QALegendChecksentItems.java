package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QALegendChecksentItems extends Base {
	public WebDriver driver;
	@Test
	public void Check_sentItems(){
		loginpage.LogintoQALegend(properties.getProperty("email"),properties.getProperty("password"));
		homePage.Clickon_MessagesButton();
		messagepage.clickon_sentItems();
		Assert.assertEquals(true,messagepage.sentitemsvisibility());
	}
	

}
