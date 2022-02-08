package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactPageTest {

	WebDriver driver;
	
	@Test
	public void validUserAddContact() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);  
		loginpage.insertUserName("demo@techfios.com");
		loginpage.insertPassword("abc123");
		loginpage.clickOnSigninButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboard();
		dashboard.clickCustomerButton();
		dashboard.clickAddCustomerButton();
		
		AddContactPage contactpage =PageFactory.initElements(driver, AddContactPage.class);
	
		contactpage.insertFullname("testNg");
		
		
	}
	
	
	
}
