package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.pageUtilities;

public class QALegendProjectspage {
	public WebDriver driver;
	private pageUtilities pgeutlity;
	
	@FindBy(xpath="(//i[@class='fa fa-pencil'])[1]")
	WebElement edit_projectbutton;
	
	@FindBy(xpath="//input[@id='title']")
	WebElement edit_titlebutton;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement save_button;
	
	
	
	
	
	
	
	
	
	
	
	
	
		public QALegendProjectspage(WebDriver driver) {
		// TODO Auto-generated constructor stub
			this.driver=driver;
			this.pgeutlity= new pageUtilities(driver);
			PageFactory.initElements(driver, this);
	}
		
		public void clickon_edit() {
			edit_projectbutton.click();
		}
		
		public void clickon_title() {
			edit_titlebutton.click();
		}
		
		public void clickonbackspace() {
			pgeutlity.pressBackSpaceKey();
			pgeutlity.pressBackSpaceKey();
			pgeutlity.pressBackSpaceKey();
			pgeutlity.pressBackSpaceKey();
		}
		
		public void eneterdata_title() {
			edit_titlebutton.sendKeys("Title1");
		}

		public void savethetitle() {
			save_button.click();
		}
		public void clearthetitle() {
			edit_titlebutton.clear();
		}

}
