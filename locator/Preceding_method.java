package locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Preceding_method
{
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login");
        driver.findElement(By.xpath("//div[@id='login_link']/child::a[@class='_97w5']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name='reg_passwd__']/preceding::input[@name='reg_email__']")).click();

    }
}