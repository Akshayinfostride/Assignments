package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AdminPage extends Utility {
    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagement;

    @FindBy(xpath = "//a[@id='menu_admin_Job']")
      WebElement job;
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
            WebElement organization;


   // By userManagement = By.xpath("//a[@id='menu_admin_UserManagement']");
   // By job    = By.xpath("//a[@id='menu_admin_Job']");
   // By organization = By.xpath("//a[@id='menu_admin_Organization']");

    public void mouseHoverOnUserManagement(){

    Reporter.log("Mouse Hover On User Management" + userManagement.toString() + "<br>");
        mouseHoverToElement(userManagement);
    }
    public void mouseHoverOnJob(){
        Reporter.log("Mouse Hover On job" + job.toString() + "<br>");
        mouseHoverToElement(job);
    }
    public void mouseHoverOnOrganization(){
        Reporter.log("Mouse hover On Organization" + organization.toString() + "<br>");
        mouseHoverToElement(organization);
    }
}



