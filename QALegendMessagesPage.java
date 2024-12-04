package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.pageUtilities;
import dev.failsafe.internal.util.Assert;

public class QALegendMessagesPage {
	public WebDriver driver;
	private pageUtilities pgeutlity;
	
	@FindBy(xpath="//a[text()='Compose']")
	WebElement composeButton;
	
	@FindBy(xpath="//div[@class='select2-container select2 validate-hidden']")
	WebElement tobutton;
	
	@FindBy(xpath="(//div[@class='select2-result-label'])[4]")
	WebElement toMessagebutton;
	
	@FindBy(xpath="//input[@id='subject']")
	WebElement Subject_Input;
	
	@FindBy(xpath="//textarea[@id='message']")
	WebElement messageInput;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement Save_Button;
	
	@FindBy(xpath="//a[text()='Sent items']")
	WebElement SentItemsButton;
	
	@FindBy(xpath="//i[@class='fa fa-send']")
	WebElement sentItesmslabel;
	
	
	
	
	
	public QALegendMessagesPage(WebDriver driver) {
		
		this.driver = driver;
		this.pgeutlity = new pageUtilities(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickon_composebutton() {
		composeButton.click();
	}
	
	public void clickon_tobutton() {
		tobutton.click();
	}
	public void click_ontosendermessage() {
		toMessagebutton.click();
	}
	public void enterSubject() {
		Subject_Input.sendKeys("subject1");
	}
	public void entermessage() {
		messageInput.sendKeys("Message1");
	}
	public void Clickon_SaveButton() {
		Save_Button.click();
	}
	
	public void clickon_sentItems() {
		SentItemsButton.click();
	}
	
	public boolean sentitemsvisibility() {
		sentItesmslabel.isDisplayed();
		return true;
		
	}


}
