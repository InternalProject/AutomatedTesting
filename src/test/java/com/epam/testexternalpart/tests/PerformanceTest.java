package com.epam.testexternalpart.tests;

import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;

public class PerformanceTest extends BaseTest{
	
//	@Test(dataProvider = "testData", priority = 1)
//	public void addDepartments(String departmentName){
//		
//		pageDepartment.clickCreateDepartmentButton();
//		pageAddDepartment.addNewDepartment(departmentName);
//	}
//	
//	@Test(dataProvider = "testData", priority = 2)
//	public void addStreams(String departmentName, String streamName){
//		
//		pageDepartment.selectDepatment(departmentName);
//		pageDepartment.selectDepatment(departmentName);
//		pageDepartment.addStreams(streamName);
//	}
	
	@Test(dataProvider = "testData", priority = 1)
	  public void addStream(String streamName) {
		  
		  pageDepartment.clickCreateStreamButton();
		  pageAddStream.fillAddStreamInput(streamName);
		  pageDepartment.clickSelectedStream(streamName);
	  }
	
	@Test(dataProvider = "testData", priority = 2)
	public void addCandidates(String streamName, String candidateFields) {
		  
		  pageDepartment.clickSelectedStream(streamName);
		  pageStream.clickAddCandidateButton();
		  pageCreateProfile.createTestCandidates(candidateFields);
		  pageStream.checkCandExisting(candidateFields,true);
	}
}
