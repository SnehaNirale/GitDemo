package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObject.LandingPage;

public class ValidateTittleTest extends Base{
	
	public WebDriver driver;
	public static Logger log =  LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void inililization() throws IOException
	{
		driver = initilizeDriver();
		log.info("Driver is initilized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
	}
	
	@Test
	public void validateTitle() throws IOException{
		
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.title().getText(), "FEATURED COURSES1234");
		
		log.info("Successfully validated text message");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.info("text validation windows closed");
	}

}
