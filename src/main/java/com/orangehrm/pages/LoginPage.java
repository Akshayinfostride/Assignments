package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='txtPassword']")
      WebElement password;

    @FindBy(xpath ="//input[@id='btnLogin']" )
        WebElement loginButton;

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
       WebElement loginPenal;

     @FindBy(xpath = "//a[@id='welcome']")
       WebElement verifyWelcome;
    //By username = By.xpath("/input[@id='txtUsername']");
   // By password = By.xpath("//input[@id='txtPassword']");
    //By loginButton = By.xpath("//input[@id='btnLogin']");
   // By loginPenal  = By.xpath("//div[@id='logInPanelHeading']");
   // By verifyWelcome =By.xpath("//a[@id='welcome']");


    public void enterUserName(String name) {
        sendTextToElement(userName,name);
        Reporter.log("Enter Name" + name + " to name field "+ userName.toString() + "<br>");

    }

    public void enterPassword(String name) {
        sendTextToElement(password, name);
        Reporter.log("Enter Password" + password + " to password field "+ password.toString() + "<br>");

    }

    public void clickOnLoginButton() {
        Reporter.log("click on login button" + loginButton.toString() + "<br>");
        clickOnWebElement(loginButton);
    }

    public String getVerifyTextLoginPenal() {
        Reporter.log("Verify Text" + loginPenal.toString() + "<br>");
        return getTextFromElement(loginPenal);
    }

    public void clickOnWelcomeButton() {
        Reporter.log("click on welcome Button" + verifyWelcome.toString() + "<br>");
        clickOnWebElement(verifyWelcome);
    }

    public String VerifyWelcomeMessage() {
        Reporter.log("Verify Message" + verifyWelcome.toString() + "<br>");
        return getTextFromElement(verifyWelcome);
    }


}
