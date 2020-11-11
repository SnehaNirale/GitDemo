package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;

public class HomePageTest extends Base{
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void inililization() throws IOException
	{

	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password, String text) throws IOException{
		
		driver = initilizeDriver();
		log.info("Driver is initilized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
		
		LandingPage l = new LandingPage(driver);
		if(l.getPopupSize()>0)
		{
			l.getPopup().click();
		}
		l.login().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.email().sendKeys(username);
		lp.password().sendKeys(password);
		lp.login().click();
		
		log.info(text);
		
		driver.close();
		log.info("loging window closed");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
Object[][] data = new Object[2][3];
		
		//at 0th row
		data[0][0] = "restricteduser@qw.com";
		data[0][1] = "1234";
		data[0][2] = "NonRestricted User";
		
		//at 1th row
		data[1][0] = "non-resticted user";
		data[1][1] = "5678";
		data[1][2] = "Restricted User";
		
		return data;
	}

	@AfterTest
	public void teardown()
	{
		//driver.close();
	}
}
