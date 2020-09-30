package master;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.PropertyFile;
import utils.Common;

public class WebDrive {
	WebDriver driver;
  PropertyFile prop = new PropertyFile();
  Common com = new Common();
  

	public 	WebDriver com (String url) throws IOException
    { 
		
		String browser =prop.browser();
		String projPath=com.projectPath();
		switch (browser) 
		{
		case "chrome" :{
    	System.setProperty("webdriver.chrome.driver", projPath+"\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
    	driver.get(url);
    	driver.manage().window().maximize();		
    }
		break;
		
		case "firefox":{
    	System.setProperty("webdriver.chrome.driver", projPath+"\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
    	driver.get(url);
    	driver.manage().window().maximize();
		 }
		break;
    }
		return driver;	
	}
}
