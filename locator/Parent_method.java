package locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_method {


        public static void main (String[]args) throws InterruptedException
        {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
            driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//div[@class='_1lch']//parent::div[@class='large_form']//input[@type='text']")).sendKeys("Musk");
        }
    }
