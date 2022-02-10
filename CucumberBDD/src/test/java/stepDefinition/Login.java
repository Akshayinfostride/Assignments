package stepDefinition;


import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class Login {
	WebDriver driver;
	
	@Given("^Login Page is Open now$")
	public void Launch() {
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	   
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
	}
	
	@Then("^Enter the username$")
	public void enterUserName() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	
	@Then("^Enter the password$")
	public void enterPassword() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	
	@Then("^Click on login$")
	public void clickOnLoginbutton() {
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("^Homepage$")
	public void verifyTitle() {
	  Assert.assertEquals("OrangeHRM",driver.getTitle());
	}

	@Then("^User enter the \"([^\"]*)\" into username field and \"([^\"]*)\" into password field$")
	public void enterUserNameAndPassWord(String userName, String pass) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
	}


	@Then("^user click on Add user$")
	public void clickOnAddUserButton () throws InterruptedException {

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[@id=\"menu_admin_UserManagement\"]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id=\"menu_admin_viewSystemUsers\"]")).click();
	}

	@Then("^user fill \"([^\"]*)\" and username and \"([^\"]*)\" and confirm pass$")
	public void addUserDetails(String empName,String pass) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"btnAdd\"]")).click();
		WebElement empName1 = driver.findElement(By.xpath("//input[@id=\"systemUser_employeeName_empName\"]"));
		empName1.sendKeys(empName);
		empName1.sendKeys(Keys.ENTER);


		driver.findElement(By.xpath("//input[@id=\"systemUser_password\"]")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id=\"systemUser_confirmPassword\"]")).sendKeys(pass);

	}

	@Then("^user delelete button by current \"([^\"]*)\"$")
	public void deleteUserByUserName(String username) throws InterruptedException
	{
		WebElement name = driver.findElement(By.xpath("//input[@id=\"systemUser_userName\"]"));
		name.click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		String getUserNameText = username+randomInt;
		name.sendKeys(getUserNameText);
		System.out.println(getUserNameText);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
		Thread.sleep(6000);

		WebElement searchUser = driver.findElement(By.xpath("//input[@id=\"searchSystemUser_userName\"]"));
		searchUser.sendKeys(getUserNameText);
		driver.findElement(By.xpath("//input[@id=\"searchBtn\"]")).click();
		WebElement checkBox = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
		checkBox.click();
		WebElement deleteButton = driver.findElement(By.xpath("//input[@id=\"btnDelete\"]"));
		deleteButton.click();
		WebElement confirmDelete = driver.findElement(By.xpath("//input[@id=\"dialogDeleteBtn\"]"));
		confirmDelete.click();
		Thread.sleep(3000);

	}

}
