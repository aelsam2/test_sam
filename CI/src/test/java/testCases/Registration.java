package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertyFile;
import master.WebDrive;
import pageObject.HomePageElem;
import pageObject.LoginPageElem;
import pageObject.RegisterPageElem;
import utils.ExcelDataProvider;

public class Registration {
	WebDriver driver;
	LoginPageElem loginPageElems;
	HomePageElem homePageElems;
	RegisterPageElem regPageElems;
	PropertyFile prop =new PropertyFile();
	WebDrive ob =new WebDrive();

	
	

 @Test(priority=2,dataProvider="RegistrationData")
  public void RegistrationOfUser(String firstName, String LastName) throws InterruptedException {
	  loginPageElems= new LoginPageElem(driver);
	  regPageElems= new RegisterPageElem(driver);
	  loginPageElems.registerButton.click();
	  regPageElems.firstName.sendKeys(firstName);
	  regPageElems.lastName.sendKeys(LastName);
	
  }
 

  @BeforeMethod
  public void beforeMethod() throws InterruptedException {;
	  loginPageElems= new LoginPageElem(driver);
	  homePageElems= new HomePageElem(driver);
	  loginPageElems= new LoginPageElem(driver);
	  homePageElems.loginButtonInHomePage.click();
	  Thread.sleep(1000);
	  ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(newTab.get(1));
  }
 
  @AfterMethod
  public void afterMethod() {

  }
 
	@DataProvider(name="RegistrationData")
	public Object[][] RegistrationData() throws IOException{
		ExcelDataProvider dataProvider = new ExcelDataProvider();
		Object data[][]	= dataProvider.testData("\\Excel\\data.xlsx","Registration");
		return data;
	}
  @BeforeTest
  public void beforeTestSuite() throws IOException {
	  String url =prop.url();
	  driver=ob.com(url);
  }
  @AfterTest
  public  void afterSimpleTest() {
     driver.quit();
  }
 
}
