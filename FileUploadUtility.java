package Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	public WebDriver driver;
	public void FileUploadusingRobotclass(WebElement element,String path) throws AWTException {
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); //kaana paadam 
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
