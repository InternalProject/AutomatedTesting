package com.epam.testexternalpart.tests;

import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;

public class PerformanceTest extends BaseTest{
	
	@Test(dataProvider = "testData", priority = 1)
	public void addDepartments(String departmentName){
		
		pageDepartment.clickCreateDepartmentButton();
		pageAddDepartment.addNewDepartment(departmentName);
	}
	
	@Test(dataProvider = "testData", priority = 2)
	public void addStreams(String departmentName, String streamName){
		
		pageDepartment.selectDepatment(departmentName);
		pageDepartment.selectDepatment(departmentName);
		pageDepartment.addStreams(streamName);
	}
	
	@Test(dataProvider = "testData", priority = 3)
	public void addCandidates(String departmentName, String streamName){
		
	}
}
