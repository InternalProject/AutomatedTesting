package com.epam.testexternalpart.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
	private static WebDriver driver;
	
	public static WebDriver initDriver(String browserName) {
		if(browserName.contentEquals("chrome")) {


			System.setProperty("webdriver.chrome.driver", "D:/AutomatedTesting/chromedriver.exe");

			driver = new ChromeDriver();
		   	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			return driver;
		
		}
		 else if(browserName.contentEquals("explorer")){
			 System.setProperty("webdriver.ie.driver", "D:/workspace/TestExternalPart/IEDriverServer.exe");
			 
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 return driver;
		}
		else {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			return  driver;
		}
	}


}
