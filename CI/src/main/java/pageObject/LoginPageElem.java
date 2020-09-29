package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageElem {
	WebDriver LoginPageDriver;
	public LoginPageElem(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		LoginPageDriver=driver;
	}

@FindBy(xpath="//*[@id=\"inputEmail\"]")
public WebElement emailField;

@FindBy(id="inputPassword")
public WebElement passwordField;

@FindBy(xpath="recaptcha-checkbox-border//*[@id=\"recaptcha-anchor\"]/div[1]")
public WebElement reCaptcha;

@FindBy(id="login")
public WebElement loginButtonInLoginPage;
}
