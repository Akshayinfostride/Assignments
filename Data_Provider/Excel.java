package Data_Provider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel {
    public int a,b;
    FileInputStream file;
    XSSFWorkbook bk;
    XSSFSheet sh;

    @DataProvider(name="DaTa")
    public Object[][] testData() throws IOException {
        String path = System.getProperty("user.dir") + "/Test/Login.xlsx";
        System.out.println(path);
        //Reading the Excel file
        file = new FileInputStream(path);
        //Reading the workBook
        bk = new XSSFWorkbook(file);
        //Reading the sheet
        sh = bk.getSheetAt(0);
        a = sh.getLastRowNum();
        b = sh.getRow(0).getPhysicalNumberOfCells();
        int row = a;
        int col = b;
        System.out.println(row+"     "+col);
        Object[][] arr = new Object[row+1][2];
        int ij = 0;
        for (int i = 1; i <= row; i++, ij++){
            String data1 = sh.getRow(i).getCell(0).getStringCellValue();
            String data2 = sh.getRow(i).getCell(1).getStringCellValue();
            arr[ij][0] = data1;
            arr[ij][1] = data2;
        }
        return arr;
    }

    @Test(dataProvider = "DaTa")
    public void login(String name, String pass){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        driver.findElement(By.id("txtUsername")).sendKeys(name);
        driver.findElement(By.id("txtPassword")).sendKeys(pass);
        driver.findElement(By.id("btnLogin")).click();
        WebElement s = driver.findElement(By.xpath("//input[@id='MP_link']"));
        String act = s.getText();
        driver.close();
        Assert.assertEquals(act,"OrangeHRM Addons");
    }
}

