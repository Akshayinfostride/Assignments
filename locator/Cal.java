package locator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Scanner;
public class Cal {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a date (dd-month-yyyy): ");
        String date = sc.nextLine();
        String[] dt = date.split("-", 3);
        String day = dt[0];
        String MM = dt[1];
        String YY = dt[2];
// done for processing
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.globalsqa.com/demo-site/datepicker/");
        driver.switchTo().frame(0);
        Thread.sleep(5000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        Thread.sleep(2000);
        while (true) {
            String txt = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//            System.out.println(txt);
            if (txt.equals(MM)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        while (true) {
            String txt2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//            System.out.println(txt2);
            if (txt2.equals(YY)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text()," + day + ")]")).click();
    }
}
