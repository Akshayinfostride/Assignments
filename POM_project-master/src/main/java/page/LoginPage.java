package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	// Element library
	@FindBy(how = How.XPATH, using = "//*[@id='username']") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement LOGIN_BUTTON;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//1. creating methods for every element 
	public void insertUserName(String userName) {
		USERNAME_ELEMENT.sendKeys(userName);
		
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickOnSigninButton() {
		LOGIN_BUTTON.click();

	}
	
	// 2. creating 1 method with different parameter for all element
//	
//	public void loginTest(String userName, String password) {
//		USERNAME_ELEMENT.sendKeys(userName);
//		PASSWORD_ELEMENT.sendKeys(password);
//		LOGIN_BUTTON.click();
//		
//		
//	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

	
	
	
	
}
