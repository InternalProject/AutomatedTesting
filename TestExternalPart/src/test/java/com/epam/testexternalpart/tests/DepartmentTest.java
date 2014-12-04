package com.epam.testexternalpart.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.core.WebDriverFactory;
import com.epam.testexternalpart.screen.departments.AddDepartmentPage;
import com.epam.testexternalpart.screen.departments.Departments;


public class DepartmentTest extends BaseTest{

//	@Test
//	public void testClickCreateDepartmentButton(){
//		Reporter.log("Check that CreateDepartmentButton reffering in to the Create department page");
//		driver.get("http://epuakhaw0693:8081/KhExternalPreProdPortal/departments");
//		pageDepartment.allTabsArePresent();
//		pageDepartment.clickCreateDepartmentButton();
//		
//	}
//	@Test
//	public void testAddDepartmentPeage(){
//		driver.get("http://epuakhaw0693:8081/KhExternalPreProdPortal/createDepartment");
//		pageAddDepartment = new AddDepartmentPage(driver);
//		pageAddDepartment.allTabsArePresent();
//		pageAddDepartment.addNewDepartment();
//	}
	
	@Test(dataProvider="testData")
	public void testAddDepartment(String depName){
		TestReporter.writeToReportHeader("Check the possibility of adding new department");
		
		pageDepartment.clickCreateDepartmentButton();
		pageAddDepartment.addNewDepartment(depName);
		pageDepartment.checkElementText(depName, "New Dep", pageDepartment.getlastDep());

	
		pageDepartment.clickElement(pageDepartment.deleteDepartmentButton, "deleteDepartmentButton");
		//pageDepartment.deleteDepartmentButton.click();
		pageDepartment.clickElement(pageDepartment.delDepPopAp, "deleteDepartmentButton");
		//pageDepartment.delDepPopAp.click();
		Assert.assertEquals(pageDepartment.depNumb-1, pageDepartment.allDep.size());		
		
	}

	


}
