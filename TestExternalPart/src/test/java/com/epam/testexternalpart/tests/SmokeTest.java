package com.epam.testexternalpart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.core.WebDriverFactory;
import com.epam.testexternalpart.screen.AllCandidatesPage;
import com.epam.testexternalpart.screen.Departments;
import com.epam.testexternalpart.screen.Menu;
import com.epam.testexternalpart.screen.profile.CreateProfilePage;
import com.epam.testexternalpart.screen.profile.ViewProfilePage;

public class SmokeTest extends BaseTest{
	AllCandidatesPage pg;
	@BeforeClass
	@Override
	public void setUp() {
		driver = WebDriverFactory.getDriverInstance("");//new FirefoxDriver();
		menuComp=new Menu(driver);
		pageViewProfile = new ViewProfilePage(driver);
		pageDepartment=new Departments(driver);
		pageCreateProfile = new CreateProfilePage(driver);
		 pg= new AllCandidatesPage(driver);
	}
	
	
	@Test(dataProvider="testData")
	public void test (String url,String text) {
		driver.get(url);
		
		menuComp.allTabsArePresent();
		TestReporter.writeToReportHeader("1 test");
		
		pg.checkAllTittles(text);
		pg.getCheckbox(3).click();
	
		pg.isCheckboxSelected(3, true);
		
		pg.checkElementText("Ivan", "Name", pg.getTableEl(1, 3));
		pg.additionalEducationCheckBox.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestReporter.writeToReportPositiveResult("1 test complite");
	}



	
}
