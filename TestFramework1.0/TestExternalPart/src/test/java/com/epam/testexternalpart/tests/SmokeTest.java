package com.epam.testexternalpart.tests;

import com.epam.testexternalpart.core.BaseTest;

import org.testng.annotations.Test;

public class SmokeTest extends BaseTest{
	
	@Test
	public void testCheckElementsPresentDepartmentPage(){
		
		pageDepartment.allTextArePresent();
		pageDepartment.allElementsArePresent();		
	}
	
	@Test
	public void testCheckElementsPresentAddDepartmentPage(){
		
		pageDepartment.clickCreateDepartmentButton();
		
		pageAddDepartment.allTextArePresent();
		pageAddDepartment.allElementsArePresent();	
	}
	
	@Test
	public void testCheckElementsPresentAddStreamPage(){
		
		pageDepartment.clickCreateStreamButton();
		
		pageAddStream.allTextArePresent();
		pageAddStream.allElementsArePeresent();
	}	
	
	@Test
	public void testcheckAddStreamPageInDepartmentJava(){
		
		pageDepartment.checkAddStreamPageInDepartmentJava();
	}
	
	@Test
	public void testcheckAddStreamPageInDepartmentNet(){
		
		pageDepartment.checkAddStreamPageInDepartmentNet();
	}
	
	@Test
	public void testcheckAddStreamPageInDepartmentFrontEnd(){
		
		pageDepartment.checkAddStreamPageInDepartmentFrontEnd();
	}
	
	@Test
	public void testcheckAddStreamPageInDepartmentAutoTest(){
		
		pageDepartment.checkAddStreamPageInDepartmentAutoTest();
	}
	
	@Test
	public void testcheckAddStreamPageInDepartmentSofttest(){
		
		pageDepartment.checkAddStreamPageInDepartmentSofttest();
	}	
	
	@Test(dataProvider="testData")
	public void checkElStreamPage(String nameColumn) {
		
		pageDepartment.clickSelectedStream();		
		
		pageStream.checkAllElementArePresentWithExport();
		pageStream.allTextArePresent();	
		
		pageStream.checkDefaultColumns(nameColumn);	
		pageStream.checkColumnsAccordingToCheckBox();
		
		pageStream.notTestedCandidate.click();
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
		pageStream.assignedToTestTab.click();
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
		pageStream.confirmedTab.click();
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
		pageStream.testCompleteTab.click();
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
		pageStream.notActualTab.click();
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
		pageStream.bannedTab.click();
		pageStream.allTextArePresent();	
		pageStream.checkAllElementArePresentWithoutImport();
		
	}
	
	@Test(dataProvider="testData")
	public void checkElementsAddCandidate(String titles){
		
		pageDepartment.clickSelectedStream();		
		pageStream.clickAddCandidateButton();
		
		pageCreateProfile.checkElementsPresent();
		pageCreateProfile.checkTextPresent(titles);		
	}

	@Test(dataProvider="testData")
	public void checkElementsViewCandidate(String candData,String fields){
		
		pageDepartment.clickSelectedStream();		
		pageStream.clickAddCandidateButton();		
		pageCreateProfile.createNewCandidate(candData);
		pageStream.checkTableAccordingToCandidadate(candData);
		pageStream.clickViewCand();
		pageViewProfile.checkElementsPresent();
		pageViewProfile.checkAllTextPresent(fields);		
		pageViewProfile.checkTextAccordingToFields(candData);		
	}
	
	@Test(dataProvider="testData")
	public void checkElementsEditCandidate(String candData,String fields){
		
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
		
		menuComp.allCandidatesButton.click();
		pageAllCandidate.checkAllTextPresent();
		pageAllCandidate.checkDefaultColumns(nameColumn);
		pageAllCandidate.checkColumnsAccordingToCheckBox();		
		
	}
	
	@Test
	public void checkMenu(){			
		
		menuComp.checkElementsPresent();		
	}
}
