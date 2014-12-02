package com.epam.testexternalpart.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.WebDriverFactory;
import com.epam.testexternalpart.screen.departments.AddDepartmentPage;
import com.epam.testexternalpart.screen.departments.Departments;

@Test
public class DepartmentTest extends BaseTest{

	@BeforeClass
	@Override
	public void setUp() {
		driver =WebDriverFactory.initDriver("");
    	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		pageDepartment=new Departments(driver);
		
	}
	
	
	public void testClickCreateDepartmentButton(){
		Reporter.log("Check that CreateDepartmentButton reffering in to the Create department page");
		driver.get("http://epuakhaw0693:8081/KhExternalPreProdPortal/departments");
		pageDepartment.allTabsArePresent();
		pageDepartment.clickCreateDepartmentButton();
		
	}
	
	public void testAddDepartmentPeage(){
		driver.get("http://epuakhaw0693:8081/KhExternalPreProdPortal/createDepartment");
		pageAddDepartment = new AddDepartmentPage(driver);
		pageAddDepartment.allTabsArePresent();
		pageAddDepartment.addNewDepartment();
	}
	
	

	


}
