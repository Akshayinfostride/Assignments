package com.orangehrm.testsuite;



import com.orangehrm.ctomlisteners.CustomListeners;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

   @BeforeMethod(groups = {"sanity"})
   public void init(){
      loginPage = new LoginPage();
       homePage = new HomePage();
   }
    @Test(groups = {"sanity","regression"})
    public void  verifyUserShouldLoginSuccessFully()throws InterruptedException{
        //Enter username
        //   Enter password
        //   Click on Login Button
        //   Verify "WelCome" Message
        //   Verify "WelCome" Message

        loginPage.enterUserName("Admin");
        Thread.sleep(1000);
        loginPage.enterPassword("admin123");
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        String expectedMessage = "Welcome abc";
        String actualMessage = loginPage.VerifyWelcomeMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"Message Verify");
    }
    //2. VerifyThatTheLogoDisplayOnHomePage()
    @Test(groups = {"smoke","regression"})
    public void verifyThatTheLogoDisplayOnHomePage() throws InterruptedException {
        //   Login To The application
        this.verifyUserShouldLoginSuccessFully();
        //   Verify Logo is Displayed
        String expectedLogo = homePage.verifyOrangeHrmLogo();
        String actualLogo = homePage.verifyOrangeHrmLogo();
        Assert.assertEquals(actualLogo, expectedLogo);


    }
    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully() throws InterruptedException {
        //   Login To The application
        this.verifyUserShouldLoginSuccessFully();

        //   Click on User Profile logo
        loginPage.clickOnWelcomeButton();
        //   Mouse hover on "Logout" and click
        Thread.sleep(1000);
        homePage.clickOnLogout();
        //   Verify the text "Login Panel" is displayed
        loginPage.getVerifyTextLoginPenal();
    }
}
