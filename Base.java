package TestScript;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;

import Pages.QALegandLoginPage;
import Pages.QALegendHomepage;
import Pages.QALegendMessagesPage;
import Pages.QALegendNotesPage;
import Pages.QALegendProjectspage;
import constants.Constants;

public class Base {
	public WebDriver driver;
	public Properties properties; // object
	public FileInputStream fis;// object
	QALegandLoginPage loginpage;
	QALegendHomepage homePage;
	QALegendNotesPage notePage;
	QALegendMessagesPage messagepage;
	QALegendProjectspage projectpage;
	
	
	@BeforeMethod(alwaysRun = true)
	@Parameters({"browser"})
	public void browserintialistaion(@Optional("chrome") String browsername) throws Exception { //Method
	
	{
		properties = new Properties(); // new for obj initialaition
		fis = new FileInputStream(Constants.CONFIGFILE); // CALLING STATIC METHOD 
		properties.load(fis);
		if(browsername.equalsIgnoreCase("Chrome"))
				{
			driver = new ChromeDriver();
				}
		else if (browsername.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			throw new Exception("Invalid Name exception");
		}
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage = new QALegandLoginPage(driver);
		homePage = new QALegendHomepage(driver);
		notePage = new QALegendNotesPage(driver);
		messagepage = new QALegendMessagesPage(driver);
		projectpage = new QALegendProjectspage(driver);
	}
	
		
	}
	/*public void getScreenshotpath(WebDriver driver,String Testcasname) {
		TakesScreenshot ts = (TakesScreenshot)driver;  // kanathepadika
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationfile = System.getProperty("user.dir")+"\\test-output"+Testcasname+".png";
		Files.copy(source, source);*/
		
	}
	
	


