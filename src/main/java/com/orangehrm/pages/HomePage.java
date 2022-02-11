package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement hrmLogo;

    @FindBy(xpath = "//b[normalize-space()='Admin']")
    WebElement adminTab;

    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pim;

    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leave;

    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement dashBoard;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logout;


    public void clickOnAdminTab() {
        Reporter.log("click on Admin Tab" + adminTab.toString() + "<br>");
        clickOnWebElement(adminTab);
    }

    public String verifyOrangeHrmLogo() {
        Reporter.log("verify message" + hrmLogo.toString() + "<br>");
        return getTextFromElement(hrmLogo);
    }

    public void clickOnLogout() {
        Reporter.log("click on Logout" + logout.toString() + "<br>");
        clickOnWebElement(logout);
    }

    public String getVerifyLogout() {
        Reporter.log("Verify Message" + logout.toString() + "<br>");
        return getTextFromElement(logout);
    }


}