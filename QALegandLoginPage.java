package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.pageUtilities;

public class QALegandLoginPage  {
	public static WebDriver driver;
	private pageUtilities pgeutlity; // object of pageUtilities page initialized
	@FindBy(xpath="(//input[@class ='form-control p10'])[1]")
	WebElement usernameField;
	
	@FindBy(xpath="(//input[@class ='form-control p10'])[2]")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block mt15']")
	WebElement SignInButton;
	
	@FindBy(xpath = "//h2[text()='Sign in']")
	WebElement Signinlabel;
	
	
	
	public QALegandLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;//using pagefactory techique to create needed constructor
		this.pgeutlity = new pageUtilities(driver);
		PageFactory.initElements(driver, this);
		
	}

	public void LogintoQALegend(String email,String password) {
		pgeutlity.Insert_Value(usernameField,email); //add the data to input
		pgeutlity.Insert_Value(passwordField,password); // add the data to input
		pgeutlity.Clickon_Element(SignInButton);   // methods used to combine the login page and the methods from the pageUtilities page is added here
		
	}	
	
	public void Refreshdriver() {
		driver.navigate().refresh();
	}
	public boolean FindSigninLabel() {
		Signinlabel.isDisplayed();
		return true;
	}

	
}
