package locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Followingmethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login");
        driver.findElement(By.xpath("//div[@id='login_link']/child::a[@class='_97w5']")).click();
        driver.findElement(By.xpath("//input[@name='reg_email__']/following::input[@name='reg_passwd__']")).click();
    }
}