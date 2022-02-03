package locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Bbc {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");
        List<WebElement> linktext = driver.findElements(By.tagName("a"));
        System.out.println(linktext.size());
        for (WebElement webElement : linktext) {
            String linktxt = webElement.getText();
            String linkurl = webElement.getAttribute("href");
            System.out.println(linktxt + "    " + linkurl);
        }
    }
    }
