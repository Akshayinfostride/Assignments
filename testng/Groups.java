package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Groups {

    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();

    @BeforeSuite(groups = {"Run","regression"})
    void setup(){
        System.out.println("test1");
    }
    @Test(groups = {"Run","regression"})
    void login(){
        System.out.println("test2");
    }
    @Test (groups = {"NotRun","regression"})
    void check2(){
        System.out.println("test3");
    }
    @AfterSuite(groups = {"Run"})
    void closeBrowser()
    {
        System.out.println("test4");
    }
}