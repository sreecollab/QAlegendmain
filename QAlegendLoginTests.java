package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QAlegendLoginTests extends Base {
	public WebDriver driver;
	@Test
	
	public void logintests() throws InterruptedException {
	
		loginpage.LogintoQALegend(properties.getProperty("wrongemail"), properties.getProperty("password"));
		loginpage.Refreshdriver();
		loginpage.LogintoQALegend(properties.getProperty("email"), properties.getProperty("wrongpassword"));	
		loginpage.LogintoQALegend(properties.getProperty("email"), properties.getProperty("password"));
		Thread.sleep(3000);
		Assert.assertEquals(true,homePage.Clickon_Dashboardbutton());
	}
}
