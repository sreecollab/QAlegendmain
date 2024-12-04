package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.QALegendNotesPage;
import Utilities.fakerUtility;

public class QALegenddeleteNote {

public class QALegendNoteTest extends Base {
	public WebDriver driver;
	@Test
	public void addNote () throws InterruptedException {
		loginpage.LogintoQALegend(properties.getProperty("email"),properties.getProperty("password"));
		homePage.clickonDashboard_NotesButton();
		notePage.clickon_AddNoteButton();
		String noteTitle = notePage.AddNote(properties.getProperty("title")+fakerUtility.Randomnmbergenerator(),properties.getProperty("description"));
		Thread.sleep(5000);
		notePage.clickon_delete();
		Thread.sleep(4000);
		notePage.click_ONdeletePopup();
		//driver.switchTo().alert().accept();
		Thread.sleep(4000);//maatanpom
		notePage.searchNote(noteTitle);
		org.testng.Assert.assertEquals(notePage.Recordnotfound(),true); //comaku shesham expected 
	}
}


}
