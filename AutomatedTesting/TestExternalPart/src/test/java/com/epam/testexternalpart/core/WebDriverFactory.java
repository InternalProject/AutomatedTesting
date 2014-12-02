package com.epam.testexternalpart.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
	private static WebDriverFactory instance;
	private static WebDriver driver;
	
	private static WebDriver initDriver(String browserName) {
		if(browserName.contentEquals("chrome")) {
			driver = new ChromeDriver();
		   	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			return driver;
		
		}
		 else if(browserName.contentEquals("explorer")){
			 System.setProperty("webdriver.ie.driver", "C:/ExternalProject/IEDriverServer.exe");
			 
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			 return driver;
		}
		else {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			return  driver;
		}
	}

	
	public static WebDriver getDriverInstance(String browserName) {
		try {
			if (driver == null) {
				System.out.println("driver == null");
				return initDriver(browserName);

			}else{
				System.out.println("driver != null");
			return initDriver(browserName);
			}
		} catch (Exception e) {
			
		}
		return driver;
	}
}
