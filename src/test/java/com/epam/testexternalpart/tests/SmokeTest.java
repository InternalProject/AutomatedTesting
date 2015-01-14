package com.epam.testexternalpart.tests;

import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;

public class SmokeTest extends BaseTest{
	
	@Test
	public void checkElementsPresentDepartmentPage(){
		
		TestReporter.writeToReportHeader("Check all elements are present on DepartmentPage");
		
		pageDepartment.checkTextPresent();
		pageDepartment.checkElementsPresent();		
	}
	
	@Test
	public void checkElementsPresentAddDepartmentPage(){
		
		TestReporter.writeToReportHeader("Check all elements are present on Add Department Page");
		
		pageDepartment.clickCreateDepartmentButton();
		pageAddDepartment.checkTextPresent();
		pageAddDepartment.checkElementsPresent();
	}
	
	@Test
	public void checkElementsPresentAddStreamPage(){
		
		TestReporter.writeToReportHeader("Check all elements are present on Add Stream Page");
		
		pageDepartment.clickCreateStreamButton();
		pageAddStream.checkTextPresent();
		pageAddStream.checkElementsPresent();
	}	
	
	@Test
	public void checkAddStreamAccordingToDepartment(){
		
		TestReporter.writeToReportHeader("Check adding Stream according to department Java");
		
		pageDepartment.selectAndCheckDepartment();
	}
	
	@Test(dataProvider="testData")
	public void checkElStreamPage(String nameColumn) {
		
		TestReporter.writeToReportHeader("Check all elements are present on StreamPage");
		pageDepartment.clickSelectedStream();	
		pageStream.checkElementsPresent();
		pageStream.checkTextPresent();		
		pageStream.checkElementsPresentAllCandidatesTab();			
		
		pageStream.clickElement(pageStream.testCompletedTab, "Test Completed Tab");
		pageStream.checkElementsPresentTestCompletedTab();	
		
		pageStream.checkDefaultColumns(nameColumn);	
		pageStream.checkColumnsAccordingToCheckBox();	
	}
	
	@Test(dataProvider="testData")
	public void checkElementsAddCandidate(String titles){
		
		TestReporter.writeToReportHeader("Check all elements are present on Add Candidate Page");
		
		pageDepartment.clickSelectedStream();		
		pageStream.clickAddCandidateButton();
		pageCreateProfile.checkElementsPresent();
		pageCreateProfile.checkTextPresent();	
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
		pageViewProfile.checkElementsPresent();
		pageViewProfile.checkTextPresent();
		pageViewProfile.checkTextPresent(fields);		
		pageViewProfile.checkTextAccordingToFields(candData);		
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
		pageEditProfile.checkTextPresent();	
		pageEditProfile.checkTextPresent(fields);		
		pageEditProfile.checkTextAccordingToFields(candData);	
	}
	
	@Test(dataProvider="testData")
	public void checkElAllCandiadtesMenu(String nameColumn){
		
		TestReporter.writeToReportHeader("Check all elements are present on CandiadtesMenu");
		
		menuComp.clickElement(menuComp.allCandidatesButton,"allCandidatesButton");
		pageAllCandidate.checkTextPresent();
		pageAllCandidate.checkElementsPresent();
		pageAllCandidate.checkElementsPresent(nameColumn);
		pageAllCandidate.checkColumnsAccordingToCheckBox();			
	}
	
	@Test
	public void checkMenu(){
		
		TestReporter.writeToReportHeader("Check all elements are present on Menu");
		
		menuComp.checkElementsPresent();		
	}
	
	@Test
	public void checkEmailTemplatesPage(){
		
		TestReporter.writeToReportHeader("Check all elements are present on Email Templates Page");
		
		menuComp.enterToEmailTemplate();
		pageTemplates.checkTextPresent();
		
		pageTemplates.clickElement(pageTemplates.invitationTittle, "invitationTittle");
		pageTemplates.checkElementsPresentInvitation();
		
		pageTemplates.clickElement(pageTemplates.successfullTestTittle, "successfullTestTittle");
		pageTemplates.checkElementsPresentSuccessfullTest();
		
		pageTemplates.clickElement(pageTemplates.faildTestTittle, "faildTestTittle");
		pageTemplates.checkElementsPresentFaildTest();
		
		pageTemplates.clickElement(pageTemplates.answerDuplicationTittle, "answerDuplicationTittle");
		pageTemplates.checkElementsPresentAnswerDuplication();
	}
	
	@Test
	public void checkMailSettingsMenu(){
		
		TestReporter.writeToReportHeader("Check all elements are present on Mail Settings Page");
			
	}
	
}
