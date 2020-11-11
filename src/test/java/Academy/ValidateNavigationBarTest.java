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


public class ValidateNavigationBarTest extends Base {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void inililization() throws IOException
	{
		driver = initilizeDriver();
		log.info("Driver is initilized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
	}
	
	@Test
	public void ValidateNavBar() throws IOException
	{
		LandingPage l = new LandingPage(driver);
	    Assert.assertTrue(l.getNavigationBar().isDisplayed());
	    
	    log.info("Navigation bar displayed");
	    
	}  
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.info("Navigated bar windows closed");
	}

}
