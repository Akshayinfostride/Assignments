package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddUsersPage extends Utility {

    public AddUsersPage() {
        PageFactory.initElements(driver, this);
    }

      @FindBy(xpath = "//h1[@id='UserHeading']")
      WebElement addUsersText;

      @FindBy(xpath = "//select[@id='systemUser_userType']")
       WebElement userRoleAdmin;

      @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
       WebElement ananyaDash;

      @FindBy(xpath = "//input[@id='systemUser_userName']")
         WebElement username;
      @FindBy(xpath = "//select[@id='systemUser_status']")
              WebElement disable;

      @FindBy(xpath = "//input[@id='systemUser_password']")
              WebElement password;
      @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
              WebElement confirmPassword;
      @FindBy(xpath = "//input[@id='btnSave']")
      WebElement saveButton;

      @FindBy(xpath = "//input[@id='btnCancel']")
              WebElement cancleButton;

      @FindBy(xpath = "//input[@id='btnAdd']")
              WebElement addButton;

   // By addUsersText = By.xpath("//h1[@id='UserHeading']");
  //  By userRoleAdmin = By.xpath("//select[@id='systemUser_userType']");
   // By ananyaDash = By.xpath("//input[@id='systemUser_employeeName_empName']");
    //By userRoleDropDown  = By.xpath("//select[@id='systemUser_userType']");
   // By employeeName = By.xpath("//input[@id='systemUser_employeeName_empName']");
   // By username  = By.xpath("//input[@id='systemUser_userName']");
   // By disable = By.xpath("//select[@id='systemUser_status']");
   // By statusDropDown = By.xpath("//select[@id='systemUser_status']");
   // By password =  By.xpath("//input[@id='systemUser_password']");
   // By confirmPassword = By.xpath("//input[@id='systemUser_confirmPassword']");
   // By saveButton =  By.xpath("//input[@id='btnSave']");
   // By cancleButton = By.xpath("//input[@id='btnCancel']");
   // By addButton = By.xpath("//input[@id='btnAdd']");

    public String getVerifyAddUsersText() {
        return getTextFromElement(addUsersText);
    }

    public void selectUserRoleAdmin(){
        Reporter.log("select user" + userRoleAdmin.toString() + "<br>");
        selectByValueFromDropDown(userRoleAdmin,"1");
    }

    public void enterEmployeeName(String name) {
        Reporter.log("Enter name" + name +"to name field"+ ananyaDash.toString() + "<br>");
        sendTextToElement(ananyaDash, name);
    }

    public void enterUserName(String name) {
        Reporter.log("Enter name" +  name+ "to name field" +username.toString() + "<br>");
        sendTextToElement(username, name);
    }

    public void selectStatusDisable(){
        Reporter.log("select Disable" + disable.toString() + "<br>");
        selectByValueFromDropDown(disable,"0");
    }

    public void enterPassword(String name) {
        Reporter.log("Enter Password" +password+"to password field"+ password.toString() + "<br>");
        sendTextToElement(password, name);
    }

    public void enterConfirmPassword(String name) {
        Reporter.log("Enter conformPassword" + password+"to password field"+confirmPassword.toString() + "<br>");
        sendTextToElement(confirmPassword, name);
    }

    public void clickOnSaveButton(){
        Reporter.log("click on Save button" + saveButton.toString() + "<br>");
        clickOnWebElement(saveButton);
    }
    public String getTextSuccessfullySaved(){
    Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void clickOnAddButton() {
        Reporter.log("click on Add Button" + addButton.toString() + "<br>");
        clickOnWebElement(addButton);
    }



}


