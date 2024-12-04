package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class pageUtilities {
	public WebDriver driver;
	public pageUtilities(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void Clickon_Element(WebElement element) {
		element.click();
	}
	public void Insert_Value(WebElement element, String text) {
		element.sendKeys(text);
	}
	public void SelectbyVisbleText(WebElement dropdown, String visbletext) {
		Select drp = new Select(dropdown);
		drp.selectByVisibleText(visbletext);
		}
	public void SelectbyValue(WebElement dropdown, String value) {
		Select drp = new Select(dropdown);
		drp.selectByValue(value);
	}
	public void SelectbyIndex(WebElement dropdown,int Index) {
		Select drp = new Select(dropdown);
		drp.selectByIndex(0);
	}
	
	public void DragandDrop(WebElement source, WebElement destination) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, destination).build().perform();
	}
	public void hoveroverElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		}
	public void rightClick() {
		Actions action = new Actions(driver);
		action.contextClick().build().perform();
	}
	public void rightclickonElement(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform(); // homework enter ctrl alt
	}
	public void Scrollpage(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		}
	public boolean IselementVisible(WebElement element) {
		return(element.isDisplayed());
	}
	public void pressEnterkey() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
	public void pressBackSpaceKey() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.BACK_SPACE).build().perform();
	}

}
