package com.epam.testexternalpart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.core.WebDriverFactory;
import com.epam.testexternalpart.screen.Departments;
import com.epam.testexternalpart.screen.Menu;
import com.epam.testexternalpart.screen.profile.CreateProfilePage;
import com.epam.testexternalpart.screen.profile.ViewProfilePage;

public class SmokeTest extends BaseTest{
	
	@BeforeClass
	@Override
	public void setUp() {
		driver = WebDriverFactory.getDriverInstance("");//new FirefoxDriver();
		menuComp=new Menu(driver);
		pageViewProfile = new ViewProfilePage(driver);
		pageDepartment=new Departments(driver);
		pageCreateProfile = new CreateProfilePage(driver);
		
	}
	
	
	@Test(dataProvider="testData")
	public void test () {
		
		TestReporter.writeToReportHeader("1 test");
		
		menuComp.allTabsArePresent();
		TestReporter.writeToReportPositiveResult("1 test complite");
	}

	@Test(dataProvider="testData")
	public void test2 () {
		TestReporter.writeToReportHeader("2 test");
		//menuComp.allTabsArePresent();
		TestReporter.writeToReportPositiveResult("2 test complite");

	}



	
}
