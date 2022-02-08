package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		
	}

	@FindBy(how = How.XPATH, using ="//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Customers')]") WebElement CUSTOMER_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Add Customer')]") WebElement ADD_CUSTOMER_BUTTON_ELEMENT;
	
	public void verifyDashboard() {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "Dashboard", "wrong page");
		
	}
	
	public void clickCustomerButton() {
		CUSTOMER_BUTTON_ELEMENT.click();
		
	}
	
	public void clickAddCustomerButton() {
		ADD_CUSTOMER_BUTTON_ELEMENT.click();
	}
}
