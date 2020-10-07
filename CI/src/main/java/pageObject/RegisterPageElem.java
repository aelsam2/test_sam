package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPageElem {
	WebDriver LoginPageDriver;
	public RegisterPageElem(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		LoginPageDriver=driver;
	}

@FindBy(xpath="//*[@id=\"inputFirstName\"]")
public WebElement firstName;

@FindBy(xpath="//*[@id=\"inputLastName\"]")
public WebElement lastName;
}
