///*
//package data_driven_framework;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import static org.bouncycastle.asn1.x500.style.RFC4519Style.name;
//
//public class Read_Data {
//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        public int a,b;
//        FileInputStream file;
//        XSSFWorkbook bk;
//        XSSFSheet sh;
//
//        @DataProvider(name="DaTa")
//        public Object[][] testData() throws IOException {
//            String path = System.getProperty("user.dir") + "/TestData/Login.xlsx";
//            System.out.println(path);
//            //Reading the Excel file
//            file = new FileInputStream(path);
//            //Reading the workBook
//            bk = new XSSFWorkbook(file);
//            //Reading the sheet
//            sh = bk.getSheetAt(0);
//            a = sh.getLastRowNum();
//            b = sh.getRow(0).getPhysicalNumberOfCells();
//            int row = a;
//            int col = b;
//            System.out.println(row+"     "+col);
//            Object[][] arr = new Object[row+1][2];
//            int ij = 0;
//            for (int i = 1; i <= row; i++, ij++){
//                String data1 = sh.getRow(i).getCell(0).getStringCellValue();
//                String data2 = sh.getRow(i).getCell(1).getStringCellValue();
//                arr[ij][0] = data1;
//                arr[ij][1] = data2;
//            }
//            return arr;
//        }
//
//        @Test(dataProvider = "DaTa")
//        public void login(String name, String pass){
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.navigate().to("https://www.saucedemo.com/");
//            driver.findElement(By.id("user-name")).sendKeys(name);
//            driver.findElement(By.id("password")).sendKeys(pass);
//            driver.findElement(By.id("login-button")).click();
//            WebElement s = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
//            String act = s.getText();
//            driver.close();
//            Assert.assertEquals(act,"PRODUCTS");
//        }
//    }
//    }
//}*/
