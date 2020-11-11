package stepDefinations;

import org.junit.runner.RunWith;
import org.testng.Assert;

import Academy.Base;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.PortalHomePage;

@RunWith(Cucumber.class)
public class StepDefination extends Base {
	  
		 @Given("^Initilize the browser with chrone$")
		    public void initilize_the_browser_with_chrone() throws Throwable {
			 driver = initilizeDriver();
		    }
		 @And("^Navigate to the \"([^\"]*)\" Site$")
		 public void navigate_to_the_something_site(String strArg1) throws Throwable {
			  driver.get(strArg1);
		    }

		    @And("^Click on Login link in home page to land on secure signin page$")
		    public void click_on_login_link_in_home_page_to_land_on_secure_signin_page() throws Throwable {
		    	LandingPage l = new LandingPage(driver);
				l.login().click(); 
		    }

		    @When("^User enters (.+) and (.+) and logsin$")
		    public void user_enters_and_and_logsin(String username, String password) throws Throwable {
		    	LoginPage lp = new LoginPage(driver);
				lp.email().sendKeys(username);
				lp.password().sendKeys(password);
				lp.login().click();
		    }

		    @Then("^verify that user is successfully logged in$")
		    public void verify_that_user_is_successfully_logged_in() throws Throwable {
		    	PortalHomePage ph = new PortalHomePage(driver);
		    	//Assert.assertTrue(ph.getSearchBox().isDisplayed());
		    }
		    
		    @And("^Close browsers$")
		    public void close_browsers() throws Throwable {
		        driver.close();
		    }

	}
	
	


