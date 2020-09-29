package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertyFile;
import master.WebDrive;
import pageObject.HomePageElem;
import pageObject.LoginPageElem;

public class Login {
	WebDriver driver;
	LoginPageElem loginPageElems;
	HomePageElem homePageElems;
	PropertyFile prop =new PropertyFile();
	WebDrive ob =new WebDrive();
  @Test
  public void login() throws InterruptedException {
	  loginPageElems= new LoginPageElem(driver);
	  homePageElems= new HomePageElem(driver);
	  homePageElems.loginButtonInHomePage.click();
	  Thread.sleep(10000);
	  ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	   System.out.println(newTab.get(1) + "wwcwcw");
	    driver.switchTo().window(newTab.get(1));
	  loginPageElems.emailField.sendKeys("aelsam2@gmail.com");
	  loginPageElems.passwordField.sendKeys("Ael199710*");
	  loginPageElems.loginButtonInLoginPage.click();
  }
  @BeforeTest
  public void beforeTestSuite() throws IOException {
	  String url =prop.url();
	  driver=ob.com(url);
  }
  @AfterTest
  public  void afterSimpleTest() {

  }
 
 /* @AfterClass
  public void AfterClass() throws IOException {
	 driver.close();
  }*/
 
}
