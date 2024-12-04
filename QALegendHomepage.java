package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.pageUtilities;

public class QALegendHomepage {
	public WebDriver driver;
	private pageUtilities pgeutlity;
	@FindBy(xpath="//span[text()='Notes']")
	WebElement Dashboard_NotesButton;
	
	@FindBy(xpath="//span[text()='Lekshmi Nair']")
	WebElement Dropdownbutton;
	
	@FindBy(xpath="//i[@class='fa fa-power-off mr10']")
	WebElement SignoutButton;
	
	@FindBy(xpath="//i[@class='fa fa-desktop dashboard-menu']")
	WebElement dashBoardButton;
	
	@FindBy(xpath="//span[text()='Messages']")
	WebElement MessagesButton;
	
	@FindBy(xpath="//span[text()='Projects']")
	WebElement HomeProjectButton;
	
	@FindBy(xpath="//span[text()='All Projects']")
	WebElement AllprojectsButton;
	
	
	
	
public QALegendHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	this.pgeutlity= new pageUtilities(driver);
	PageFactory.initElements(driver, this);
	}

public void clickonDashboard_NotesButton() {	
	Dashboard_NotesButton.click();
}
public void Clickon_Dropdownbutton() {
	Dropdownbutton.click();
}
public void Clickon_SignoutButton() {
	SignoutButton.click();
}
public boolean Clickon_Dashboardbutton() {
	dashBoardButton.click();
	return true;
}

public void Clickon_LekshmiNair() {
	Dropdownbutton.click();
}
public void Clickon_MessagesButton() {
	MessagesButton.click();
}
public void Clickon_ProjectDropdown() {
	HomeProjectButton.click();
}
public void clickon_AllprojectsDropdown() {
	AllprojectsButton.click();
}
		
	
	
	
	
	
	
	
	
	
	
}
