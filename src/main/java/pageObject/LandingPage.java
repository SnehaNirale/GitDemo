package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By login = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector(".text-center>h2");
	By nav = By.cssSelector("nav[class='navbar-collapse collapse']");
	By popup = By.xpath("//button[text()='NO THANKS']");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement login()
	{
		return driver.findElement(login);
	}
	
	public WebElement title()
	{
		return driver.findElement(title);
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(nav);
	}
	
	public int getPopupSize()
	{
		return driver.findElements(popup).size();
	}
	
	public WebElement getPopup()
	{
		return driver.findElement(popup);
	}

}
