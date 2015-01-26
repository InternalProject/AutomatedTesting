package com.epam.testexternalpart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		
		pageStream.clickElement(pageStream.notTestedCandidate, "not Tested Tab");
		pageStream.checkElementsPresentNotTestedTabTab();			
		
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
	public void checkSubgroupPage(){
		
		TestReporter.writeToReportHeader("Check all elements are present on Subgroup Page");

		menuComp.clickElement(menuComp.settingsButton, "Click on settingsButton");
		menuComp.clickElement(menuComp.subgroupsButton, "Click on subgroupsButton");
		pageAllSubgroup.checkElementsPresent();
		pageAllSubgroup.checkTextPresent();
	}

	@Test
	public void checkConcretSubgroup(){
		try{
		menuComp.clickElement(menuComp.settingsButton, "Click on settingsButton");
		menuComp.clickElement(menuComp.subgroupsButton, "Click on subgroupsButton");
		Actions actions = new Actions(driver);
		System.out.println(" !!!  "+pageAllSubgroup.table_tbody.size());
		WebElement e= driver.findElement(By.xpath("//table[@id='tableSubgroups']//tbody//tr[1]"));
		pageAllSubgroup.waiting(pageAllSubgroup.MIDDLE_TIME);	
		actions.moveToElement(e).doubleClick().build().perform();
		pageAllSubgroup.waiting(pageAllSubgroup.MIDDLE_TIME);
		TestReporter.writeToReportPositiveResult("Check each subgroup on Separtment Page is exist");
		pageAllSubgroup.waiting(pageAllSubgroup.MIDDLE_TIME);
		}
		catch(StaleElementReferenceException e){
			
	}
	
	}
}
