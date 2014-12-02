package com.epam.testexternalpart.tests;

import java.util.concurrent.TimeUnit;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.WebDriverFactory;
import com.epam.testexternalpart.screen.Menu;
import com.epam.testexternalpart.screen.departments.Departments;
import com.epam.testexternalpart.screen.profile.CreateProfilePage;
import com.epam.testexternalpart.screen.profile.EditProfilePage;
import com.epam.testexternalpart.screen.profile.ViewProfilePage;

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

public class SmokeTest extends BaseTest{
	
	@BeforeMethod
	public void setUp(){
		driver = WebDriverFactory.initDriver("");//new FirefoxDriver();
		menuComp=new Menu(driver);
		
		pageDepartment=new Departments(driver);
		
	}
	
	
 
	@Test(dataProvider="testData")
	public void testView(String textView) {
		pageViewProfile = new ViewProfilePage(driver);
		driver.get("http://epuakhaw0693:8081/KhExternalPreProdPortal/candidate/1");
		pageViewProfile.allTabsArePresent();
		pageViewProfile.checkAllTittles(textView);
	}
	
	@Test(dataProvider="testData")
	public void testEdit(String textEdit) {
		pageEditProfile=new EditProfilePage(driver);
		driver.get("http://epuakhaw0693:8081/KhExternalPreProdPortal/editCandidate/1");
		pageEditProfile.allTabsArePresent();
		pageEditProfile.checkAllTittles(textEdit);
		Assert.assertEquals(pageEditProfile.checkAllInputesAmount(16), true, "There are not right input's amount");
		Assert.assertEquals(pageEditProfile.checkAllTextareaAmount(4), true, "There are not right textarea's amount");
	}
	
	@Test(dataProvider="testData")
	public void testCreate(String textCreate) {
		pageCreateProfile = new CreateProfilePage(driver);
		driver.get("http://epuakhaw0693:8081/KhExternalPreProdPortal/addCandidate/1");
		pageCreateProfile.allTabsArePresent();
		pageCreateProfile.checkAllTittles(textCreate);
	}
	
	@Test(dataProvider="testData")
	public void testCreateNewCandidate(String data){
		pageCreateProfile = new CreateProfilePage(driver);
		driver.get("http://epuakhaw0693:8081/KhExternalPreProdPortal/addCandidate/1");
		pageCreateProfile.createNewCandidate(data);
	}
}
