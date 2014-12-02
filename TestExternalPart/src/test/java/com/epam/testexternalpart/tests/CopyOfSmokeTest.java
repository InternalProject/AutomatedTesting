package com.epam.testexternalpart.tests;

import java.util.concurrent.TimeUnit;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.core.WebDriverFactory;
import com.epam.testexternalpart.screen.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CopyOfSmokeTest extends BaseTest{
	
	@BeforeClass
	@Override
	public void setUp() {
		driver = WebDriverFactory.getDriverInstance("");//new FirefoxDriver();
		menuComp=new Menu(driver);
		
	}
	
	
	@Test(dataProvider="testData")
	public void test (String url) {
		TestReporter.writeToReportHeader("Copy_1 test");
		driver.get(url);
		menuComp.allTabsArePresent();
	

	
		
	}

	@Test(dataProvider="testData")
	public void test2 (String url) {
		TestReporter.writeToReportHeader("Copy_2 test");

		driver.get(url);
		//menuComp.allTabsArePresent();
		TestReporter.writeToReportNegativeResult("2 test complite wrong");

	}
	

	
}
