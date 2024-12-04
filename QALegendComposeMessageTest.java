package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class QALegendComposeMessageTest extends Base {
	
public WebDriver driver;
@Test
public void addNote () throws InterruptedException {
	loginpage.LogintoQALegend(properties.getProperty("email"),properties.getProperty("password"));
	homePage.Clickon_MessagesButton();
	messagepage.clickon_composebutton();
	messagepage.clickon_tobutton();
	messagepage.click_ontosendermessage();
	messagepage.enterSubject();
	messagepage.entermessage();
	messagepage.Clickon_SaveButton();
	//assertion cheyanom
	
	
	
	
}

}
