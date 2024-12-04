
package TestScript;

import org.testng.annotations.Test;

import Utilities.fakerUtility;
import org.openqa.selenium.WebDriver;

public class QALegendNoteTest extends Base {
	public WebDriver driver;
	@Test
	public void addNote () throws InterruptedException {
		loginpage.LogintoQALegend(properties.getProperty("email"),properties.getProperty("password"));
		homePage.clickonDashboard_NotesButton();
		notePage.clickon_AddNoteButton();
		String noteTitle = notePage.AddNote(properties.getProperty("title")+fakerUtility.Randomnmbergenerator(),properties.getProperty("description"));
		
		Thread.sleep(4000);//maatanpom
		notePage.searchNote(noteTitle);
		org.testng.Assert.assertEquals(notePage.getnotetitle(), noteTitle);
	}
}
