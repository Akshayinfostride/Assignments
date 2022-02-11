package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DashBoardPage extends Utility {
    public DashBoardPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashBoard;

  //  By dashBoard = By.xpath("//h1[contains(text(),'Dashboard')]");


    public String getVerifyTextDashBoard() {
        Reporter.log("select Disable" + dashBoard.toString() + "<br>");
        return getTextFromElement(dashBoard);
    }
}


