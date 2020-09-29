package master;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.PropertyFile;

public class WebDrive {
	WebDriver driver;
  PropertyFile prop = new PropertyFile();
  

	public 	WebDriver com (String url) throws IOException
    { 
		
		String browser =prop.browser();
		switch (browser) 
		{
		case "chrome" :{
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aelsam\\eclipse-workspace\\CI\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
    	driver.get(url);
    	driver.manage().window().maximize();		
    }
		break;
		
		case "firefox":{
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aelsameclipse-workspace\\CI\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
    	driver.get(url);
    	driver.manage().window().maximize();
		 }
		break;
    }
		return driver;	
	}
}
