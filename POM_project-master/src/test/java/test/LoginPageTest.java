package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginPageTest {

	WebDriver driver;
	
	@Test
	public void validUserMustLoginTest() {
		
		driver = BrowserFactory.init();
		
		// creating object of LoginPage class to call their methods in this class !
		
//		LoginPage loginpage1 = new LoginPage(driver);
		
//			but, in Page object method, we use different technique to create object !
//		instead of using new keyword, we use pageFactory keyword !
		
		// This has capability of transfering driver from this page to Loginpage
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);  
		loginpage.insertUserName("demo@techfios.com");
		loginpage.insertPassword("abc123");
		loginpage.clickOnSigninButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboard();
		
		
		
//		BrowserFactory.tearDown();
	
	}
	
}
