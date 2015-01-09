package com.epam.testexternalpart.tests;

import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;

public class SmokeTest extends BaseTest{
	
	@Test
	public void testCheckElementsPresentDepartmentPage(){
		TestReporter.writeToReportHeader("Check all elements are present on DepartmentPage");
		pageDepartment.allTextArePresent();
		pageDepartment.allElementsArePresent();		
	}
	
	@Test
	public void testCheckElementsPresentAddDepartmentPage(){
		TestReporter.writeToReportHeader("Check all elements are present on AddDepartmentPage");
		pageDepartment.clickCreateDepartmentButton();
		pageAddDepartment.allTextArePresent();
		pageAddDepartment.allElementsArePresent();	
	}
	
	@Test
	public void testCheckElementsPresentAddStreamPage(){
		TestReporter.writeToReportHeader("Check all elements are present on AddStreamPage");
		pageDepartment.clickCreateStreamButton();
		pageAddStream.allTextArePresent();
		pageAddStream.allElementsArePeresent();
	}	
	
	@Test
	public void testcheckAddStreamPageInDepartmentJava(){
		TestReporter.writeToReportHeader("Check all elements are present on AddStreamPage in Department Java");
		pageDepartment.checkAddStreamPageInDepartmentJava();
	}
	
	@Test
	public void testcheckAddStreamPageInDepartmentNet(){
		TestReporter.writeToReportHeader("Check all elements are present on AddStreamPage in Department Net");
		pageDepartment.checkAddStreamPageInDepartmentNet();
	}
	
	@Test
	public void testcheckAddStreamPageInDepartmentFrontEnd(){
		TestReporter.writeToReportHeader("Check all elements are present on AddStreamPage in Department FrontEnd");
		pageDepartment.checkAddStreamPageInDepartmentFrontEnd();
	}
	
	@Test
	public void testcheckAddStreamPageInDepartmentAutoTest(){
		TestReporter.writeToReportHeader("Check all elements are present on AddStreamPage in Department AutoTest");
		pageDepartment.checkAddStreamPageInDepartmentAutoTest();
	}
	
	@Test
	public void testcheckAddStreamPageInDepartmentSofttest(){
		TestReporter.writeToReportHeader("Check all elements are present on AddStreamPage in Department Softtest");
		pageDepartment.checkAddStreamPageInDepartmentSofttest();
	}	
	
	@Test(dataProvider="testData")
	public void checkElStreamPage(String nameColumn) {
		TestReporter.writeToReportHeader("Check all elements are present on StreamPage");
		pageDepartment.clickSelectedStream();	
		
		TestReporter.writeToReportStep("Check all elements are present With Export");
		pageStream.checkAllElementArePresentWithExport();
		pageStream.allTextArePresent();	
		
		TestReporter.writeToReportStep("Check all Defaul tColumns are present");
		pageStream.checkDefaultColumns(nameColumn);	
		pageStream.checkColumnsAccordingToCheckBox();
		
		TestReporter.writeToReportStep("Check elements are present on notTestedCandidate tab");
		pageStream.clickElement(pageStream.notTestedCandidate,"notTestedCandidate");
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
		TestReporter.writeToReportStep("Check elements are present on assignedToTest tab");
		pageStream.clickElement(pageStream.assignedToTestTab,"assignedToTestTab");
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
		TestReporter.writeToReportStep("Check elements are present on confirmed tab");
		pageStream.clickElement(pageStream.confirmedTab,"confirmedTab");
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
		TestReporter.writeToReportStep("Check elements are present on testComplete tab");
		pageStream.clickElement(pageStream.testCompleteTab,"testCompleteTab");
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
		TestReporter.writeToReportStep("Check elements are present on notActual tab");
		pageStream.clickElement(pageStream.notActualTab,"notActualTab");
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
		TestReporter.writeToReportStep("Check elements are present on banned Tab");
		pageStream.clickElement(pageStream.bannedTab,"bannedTab");
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
	}
	
	@Test(dataProvider="testData")
	public void checkElementsAddCandidate(String titles){
		TestReporter.writeToReportHeader("Check all elements are present on AddCandidatePage");
		pageDepartment.clickSelectedStream();		
		pageStream.clickAddCandidateButton();
		pageCreateProfile.checkElementsPresent();
		pageCreateProfile.checkTextPresent(titles);		
	}

	@Test(dataProvider="testData")
	public void checkElementsViewCandidate(String candData,String fields){
		TestReporter.writeToReportHeader("Check all elements are present on ViewCandidatePage");
		pageDepartment.clickSelectedStream();		
		pageStream.clickAddCandidateButton();		
		pageCreateProfile.createNewCandidate(candData);
		pageStream.checkTableAccordingToCandidadate(candData);
		pageStream.clickViewCand();
		//pageViewProfile.checkElementsPresent();
		//pageViewProfile.checkAllTextPresent(fields);		
		//pageViewProfile.checkTextAccordingToFields(candData);		
	}
	
	@Test(dataProvider="testData")
	public void checkElementsEditCandidate(String candData,String fields){
		TestReporter.writeToReportHeader("Check all elements are present on EditCandidatePage");
		pageDepartment.clickSelectedStream();		
		pageStream.clickAddCandidateButton();		
		pageCreateProfile.createNewCandidate(candData);
		pageStream.clickViewCand();
		pageViewProfile.clickEditButton();
		pageEditProfile.checkElementsPresent();
		pageEditProfile.checkAllTextPresent(fields);		
		pageEditProfile.checkTextAccordingToFields(candData);	
	}
	
	@Test(dataProvider="testData")
	public void checkElAllCandiadtesMenu(String nameColumn){
		TestReporter.writeToReportHeader("Check all elements are present on CandiadtesMenu");
		menuComp.clickElement(menuComp.allCandidatesButton,"allCandidatesButton");
		pageAllCandidate.checkAllTextPresent();
		pageAllCandidate.checkDefaultColumns(nameColumn);
		pageAllCandidate.checkColumnsAccordingToCheckBox();		
		
	}
	
	@Test
	public void checkMenu(){
		TestReporter.writeToReportHeader("Check all elements are present on Menu");
		menuComp.checkElementsPresent();		
	}
}
