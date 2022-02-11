package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {

    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class='head']")
     WebElement systemUsers;

     @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
      WebElement userNameField;

     @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
      WebElement userRollDropDown;

     @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
      WebElement  employNameField;

     @FindBy(xpath = "//select[@id='searchSystemUser_status']")
      WebElement statusDropDown;

     @FindBy(xpath = "//input[@id='searchBtn']")
       WebElement searchButton;

     @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
       WebElement checkBox;

     @FindBy(xpath = "//p[contains(text(),'Delete records?')]")
         WebElement popUp;
     @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
         WebElement popUpButtonOk;

     @FindBy(xpath = "//input[@id='btnDelete']")
        WebElement delete;

   // By systemUsersText = By.xpath("//div[@class='head']");
   // By userNameField = By.xpath("//input[@id='searchSystemUser_userName']");
   // By userRollDropDown = By.xpath("//select[@id='searchSystemUser_userType']");
   // By employNameField = By.xpath("//input[@id='searchSystemUser_employeeName_empName']");
   // By statusDropDown = By.xpath("//select[@id='searchSystemUser_status']");
   // By searchButton = By.xpath("//input[@id='searchBtn']");
    By resetButton = By.xpath("//input[@id='resetBtn']");
    By deleteButton = By.xpath("//input[@id='btnDelete']");
   // By checkBox = By.xpath("//input[@id='ohrmList_chkSelectAll']");
   // By delete  = By.xpath("//input[@id='btnDelete']");
   // By popUp = By.xpath("//p[contains(text(),'Delete records?')]");
  //  By popUpButtonOk = By.xpath("//input[@id='dialogDeleteBtn']");
    By popUpMessage = By.xpath("//div[@id='deleteConfModal']//div[@class='modal-body']");
  //  By popUpDisplay = By.xpath("//input[@id='ohrmList_chkSelectAll']");

    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement popUpDisplay;

    public String getVerifyTheTextSystemUsers() {
        return getTextFromElement(systemUsers);
    }



    public void enterUserNameField(String name) {
        Reporter.log("Enter name" + userNameField.toString() + "<br>");
        sendTextToElement(userNameField, name);
    }

    public void selectUserRollDropDown() {
        Reporter.log("select User RollDown" + userRollDropDown.toString() + "<br>");
        selectByValueFromDropDown(userRollDropDown, "0");
    }

    public void selectStatusDropDown() {
        Reporter.log("select Status" + statusDropDown.toString() + "<br>");
        selectByValueFromDropDown(statusDropDown, "0");
    }

    public void clickOnSearchButton() {
        Reporter.log("" + searchButton.toString() + "<br>");
        clickOnWebElement(searchButton);
    }

    public void clickOnCheckBox() {
        Reporter.log("click on checkBox" + checkBox.toString() + "<br>");
        clickOnWebElement(checkBox);
    }
    public void clickOnDeleteButton() {
        Reporter.log("click on Delete Button" + delete.toString() + "<br>");
        clickOnWebElement(delete);
    }
    public String getVerifyDeleteRecord() {
        Reporter.log("Verify Message" + popUp.toString() + "<br>");
        return getTextFromElement(popUp);
    }
    public void clickOnOkButton() {
        Reporter.log("click on ok Button" + popUpButtonOk.toString() + "<br>");
        clickOnWebElement(popUpButtonOk);
    }
    public void clickOnpopUpDisplayed(){
        Reporter.log("click on PopUp Displayed" + popUpDisplay.toString() + "<br>");
        clickOnWebElement(popUpDisplay);

    }

}
