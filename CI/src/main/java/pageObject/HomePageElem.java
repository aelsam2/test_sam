package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageElem {
	WebDriver HomePageDriver;
	public HomePageElem(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		HomePageDriver=driver;
	}
@FindBy(xpath="//*[@id=\"mega-nav-navigation\"]/div/ul[2]/li/a")
public
WebElement loginButtonInHomePage;

}
