package com.orangehrm.testsuite;

import com.orangehrm.ctomlisteners.CustomListeners;
import com.orangehrm.pages.*;
import com.orangehrm.testbase.TestBase;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class UsersTest extends TestBase {

    AdminPage adminPage;
    DashBoardPage dashboardPage;
    HomePage homePage ;
    AddUsersPage addUsersPage;
    ViewSystemUsersPage viewSystemUsersPage;
    LoginPage loginPage;
    LoginTest loginTest;

    @BeforeMethod(groups = {"sanity"})
    public void init(){
         adminPage = new AdminPage();
         dashboardPage = new DashBoardPage();
         homePage = new HomePage();
         addUsersPage = new AddUsersPage();
         viewSystemUsersPage = new ViewSystemUsersPage();
         loginPage = new LoginPage();
         loginTest =new LoginTest();
    }
    @Test(groups = {"sanity", "regression"})
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        //Login to Application
        //click On "Admin" Tab
        //	Verify "System Users" Text
        //	click On "Add" button
        //	Verify "Add User" Text
        //	Select User Role "Admin"
        //	enter Employee Name "Ananya Dash"
        //	enter Username
        //	Select status "Disable"
        //	enter psaaword
        //	enter Confirm Password
        //	click On "Save" Button
        //	verify message "Successfully Saved"

        loginPage.enterUserName("Admin");
        Thread.sleep(1000);
        loginPage.enterPassword("admin123");
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        String expectedText = "Welcome Paul";
        String actualText = loginPage.VerifyWelcomeMessage();
        Assert.assertEquals(actualText,expectedText,"Message Verify");




        homePage.clickOnAdminTab();
        String expectedText5 = "System Users";
        String actualText5 = viewSystemUsersPage.getVerifyTheTextSystemUsers();
        Assert.assertEquals(actualText5,expectedText5,"Message Verify");
        addUsersPage.clickOnAddButton();
        String expectedText1 = "Add User";
        String actualText1 = addUsersPage.getVerifyAddUsersText();
        Assert.assertEquals(actualText1,expectedText1,"Message Verify");
        addUsersPage.selectUserRoleAdmin();
        addUsersPage.enterEmployeeName("Ananya Dash");
        addUsersPage.enterUserName("Ankita"+getRandomString(3));
        addUsersPage.selectStatusDisable();
        addUsersPage.enterPassword("Jiten7685@");
        addUsersPage.enterConfirmPassword("Jiten7685@");
        Thread.sleep(1000);
        addUsersPage.clickOnSaveButton();
        String expectedText4 = "Successfully Saved" ;
        String actualText4 = addUsersPage.getTextSuccessfullySaved();
        Assert.assertEquals(actualText4,expectedText4);

    }
    @Test(groups = {"sanity","smoke","regression"})
    public void searchTheUserCreatedAndVerifyIt()throws InterruptedException{
        //Login to Application
        //	click On "Admin" Tab
        //	Verify "System Users" Text
        //	Enter Username
        //	Select User Role
        //	Select Satatus
        //	Click on "Search" Button
        //	Verify the User should be in Result list.

      //  loginTest.verifyUserShouldLoginSuccessFully();
        loginPage.enterUserName("Admin");
        Thread.sleep(1000);
        loginPage.enterPassword("admin123");
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        String expectedMessage = "Welcome Paul";
        String actualMessage = loginPage.VerifyWelcomeMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"Message Verify");
       homePage.clickOnAdminTab();
        String expectedText2 = "System Users";
        String actualText2 = viewSystemUsersPage.getVerifyTheTextSystemUsers();
        Assert.assertEquals(actualText2,expectedText2,"Message Verify");
        viewSystemUsersPage.enterUserNameField("Ankita");
      viewSystemUsersPage.selectUserRollDropDown();
       viewSystemUsersPage.selectStatusDropDown();
        viewSystemUsersPage.clickOnSearchButton();
        String expectedText3 = "System Users";
        String actualText3 = viewSystemUsersPage.getVerifyTheTextSystemUsers();
        Assert.assertEquals(actualText3,expectedText3,"Message Verify");
    }
    @Test(groups = {"sanity","smoke", "regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        //Login to Application
        //	click On "Admin" Tab
        //	Verify "System Users" Text
        //	Enter Username
        //	Select User Role
        //	Select Satatus
        //	Click on "Search" Button
        //	Click on Delete Button
        //	Verify the User should be in Result list
        //	Click on Check box
        loginPage.enterUserName("Admin");
        Thread.sleep(1000);
        loginPage.enterPassword("admin123");
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        String expectedMessage = "Welcome Aniket";
        String actualMessage = loginPage.VerifyWelcomeMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"Message Verify");

        homePage.clickOnAdminTab();

        String expectedText2 = "System Users";
        String actualText2 = viewSystemUsersPage.getVerifyTheTextSystemUsers();
        Assert.assertEquals(actualText2,expectedText2,"Message Verify");

        viewSystemUsersPage.enterUserNameField("Ankita");

        viewSystemUsersPage.selectUserRollDropDown();

        viewSystemUsersPage.selectStatusDropDown();
        viewSystemUsersPage.clickOnSearchButton();

        viewSystemUsersPage.clickOnCheckBox();

        viewSystemUsersPage.clickOnDeleteButton();

        //	Popup will display

        //	Click on Ok Button on Popup
        viewSystemUsersPage.clickOnOkButton();

        //	verify message "Successfully Deleted"
        String expectedText = "Successfully Deleted";
        String actualText= viewSystemUsersPage.getVerifyDeleteRecord();
        Assert.assertEquals(actualText,expectedText,"Message Verify");

    }
    @Test(groups = {"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        //Login to Application

        loginPage.enterUserName("Admin");
        Thread.sleep(1000);
        loginPage.enterPassword("admin123");
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        String expectedMessage = "Welcome Paul";
        String actualMessage = loginPage.VerifyWelcomeMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"Message Verify");

        //	click On "Admin" Tab
        homePage.clickOnAdminTab();

        //	Verify "System Users" Text
        String expectedText2 = "System Users";
        String actualText2 = viewSystemUsersPage.getVerifyTheTextSystemUsers();
        Assert.assertEquals(actualText2,expectedText2,"Message Verify");

        //	Enter Username
        viewSystemUsersPage.enterUserNameField("Ankita");

        //	Select User Role
        viewSystemUsersPage.selectUserRollDropDown();

        //	Select Satatus
        viewSystemUsersPage.selectStatusDropDown();

        //	Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();

        //	verify message "No Records Found"
    }

}
