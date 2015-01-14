package com.epam.testexternalpart.tests;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;

public class DepartmentTest extends BaseTest{

	
	@Test(dataProvider="testData")
	public void testAddDepartmentWithValidName(String depName){
		TestReporter.writeToReportHeader("Check the possibility of adding new department");
		
		pageDepartment.clickCreateDepartmentButton();
		pageAddDepartment.addNewDepartmentCor(depName);

		pageDepartment.isElementExist(depName, pageDepartment.getlastDep(), true);
	
		pageDepartment.clickElement(pageDepartment.deleteDepartmentButton, "deleteDepartmentButton");
		pageDepartment.isElementExist("delDepPopAp", pageDepartment.delDepPopAp, true);
		pageDepartment.clickElement(pageDepartment.delDepPopApButton, "deleteDepartmentButton");
		pageDepartment.isElementExist(depName, pageDepartment.allDepartmentTabs, false);
	}

	@Test(dataProvider="testData")
	public void testAddDepartment(String depName){
		TestReporter.writeToReportHeader("Adding new department with invalide name");
	
		pageDepartment.clickCreateDepartmentButton();
		pageAddDepartment.addNewDepartmentWithInvalideName(depName);

		
	}

	@Test(dataProvider="testData")
	public void testEditDepartmentName(String depNameFirst,String depNameSecond){
		TestReporter.writeToReportHeader("Edit department name");
	
		pageDepartment.clickCreateDepartmentButton();
		pageAddDepartment.addNewDepartmentCor(depNameFirst);

		pageDepartment.isElementExist(depNameFirst, pageDepartment.getlastDep(), true);
		pageDepartment.clickElement(pageDepartment.editDepartmentButton, "editDepartmentButton");
		pageDepartment.isElementExist("Input name field", pageAddDepartment.name_input, true);
		pageDepartment.checkElementText(depNameFirst, "Dep name", pageAddDepartment.name_input);
		pageAddDepartment.addNewDepartmentCor(depNameSecond);
		
		pageDepartment.checkElementText(depNameSecond, "Dep tab", pageDepartment.getlastDep());
		pageDepartment.isElementExist(depNameFirst, pageDepartment.allDepartmentTabs, false);
		
		pageDepartment.clickElement(pageDepartment.deleteDepartmentButton, "deleteDepartmentButton");
		pageDepartment.isElementExist("delDepPopAp", pageDepartment.delDepPopAp, true);
		pageDepartment.clickElement(pageDepartment.delDepPopApButton, "deleteDepartmentButton");
		pageDepartment.isElementExist(depNameSecond, pageDepartment.allDepartmentTabs, false);
		
	}
}
