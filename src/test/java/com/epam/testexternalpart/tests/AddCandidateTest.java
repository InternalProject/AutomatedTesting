package com.epam.testexternalpart.tests;

import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;

public class AddCandidateTest extends BaseTest {	

   @Test(dataProvider="testData")
   public void addCandidateManually(String candData){
	TestReporter.writeToReportHeader("Check the possibility of adding Òandidate manually");
	   pageDepartment.clickElement(pageDepartment.getTableEl(1,1), "First stream on first dep");
	   pageDepartment.clickElement( pageStream.addCandidateButton, "addCandidateBut");
	   pageCreateProfile.createNewCandidate(candData);
       pageStream.checkCandExisting(candData,true);
	   pageStream.deleteAddedCand();

   }
   
   
   @Test(dataProvider="testData")
   public void addCandidate(String candData){
	TestReporter.writeToReportHeader("Check the possibility of adding Òandidate manually whith wrong data");
	   pageDepartment.clickElement(pageDepartment.getTableEl(1,1), "First stream on first dep");
	   pageDepartment.clickElement( pageStream.addCandidateButton, "addCandidateBut");
	   pageCreateProfile.createNewCandidateWithout(candData);

   }
  
   	@Test(dataProvider="testData")
	public void deleteAllCandidates(String mess){
		TestReporter.writeToReportHeader("Delete all Candidates");
		pageDepartment.clickElement(pageDepartment.getTableEl(1,1), "First stream on first dep");
		pageStream.deleteAllCand(mess);
		   
}
  
   	@Test(dataProvider="testData")
	public void changeStatus(String candData,String status1,String status2,String status3,String status4,String candData2) throws InterruptedException{
		TestReporter.writeToReportHeader("Change  Candidat's status manually");
		TestReporter.writeToReportStep("1-Create candidate");
		pageDepartment.clickElement(pageDepartment.getTableEl(1,1), "First stream on first dep");
		pageDepartment.clickElement( pageStream.addCandidateButton, "addCandidateBut");
		pageCreateProfile.createNewCandidate(candData);
		pageStream.checkCandExisting(candData,true);
		TestReporter.writeToReportStep("2-Check candidat's displaying on \"Not tested\" tab");
		pageStream.clickElement(pageStream.notTestedCandidate,"notTestedCandidate");		
		pageStream.checkCandExisting(candData,true);
		TestReporter.writeToReportStep("4-Check candidat's displaying on \"confirmed\" tab");
		pageStream.clickViewCand();
		pageViewProfile.clickEditButton();
		pageEditProfile.changeStatus(status1);
		pageStream.clickElement(pageStream.confirmedTab,"notTestedCandidate");
		pageStream.checkCandExisting(candData,true);
		TestReporter.writeToReportStep("4-Check candidat's displaying on \"test†completed\" tab");
		pageStream.clickViewCand();
		pageViewProfile.clickEditButton();
		pageEditProfile.changeStatus(status2);
		pageStream.clickElement(pageStream.testCompleteTab,"notTestedCandidate");
		pageStream.checkCandExisting(candData,true);
		TestReporter.writeToReportStep("5-Check candidat's displaying on \"not actual\" tab");
		pageStream.clickViewCand();
		pageViewProfile.clickEditButton();
		pageEditProfile.changeStatus(status3);
		pageStream.clickElement(pageStream.notActualTab,"notTestedCandidate");
		pageStream.checkCandExisting(candData,true);
		TestReporter.writeToReportStep("6-Check candidat's displaying on \"Banned\" tab");
		pageStream.clickViewCand();
		pageViewProfile.clickEditButton();
		pageEditProfile.changeStatus(status4);
		pageStream.clickElement(pageStream.bannedTab,"BannedTab");
		pageStream.checkCandExisting(candData,true);
		pageStream.deleteAddedCand();

		   
}
  
   	@Test(dataProvider="testData")
	public void bannWithButton(String candData) {
		TestReporter.writeToReportHeader("Chech Ban button work");
		pageDepartment.clickElement(pageDepartment.getTableEl(1,1), "First stream on first dep");
		TestReporter.writeToReportStep("1-Create candidate");
		pageDepartment.clickElement( pageStream.addCandidateButton, "addCandidateBut");
		pageCreateProfile.createNewCandidate(candData);
		pageStream.checkCandExisting(candData,true);
		 TestReporter.writeToReportStep("2-Ban Candidate");
		 pageStream.clickElement(pageStream.Checkbox—ol.get(0),"CheckboxForFirst");
		 pageStream.clickElement(pageStream.bunButton,"BanButton");
		 pageStream.clickElement(pageStream.banButtPopap,"banButtPopap");
		 TestReporter.writeToReportStep("3-Check candidat's displaying on \"Banned\" tab");
		 pageStream.clickElement(pageStream.bannedTab,"notTestedCandidate");
		 pageStream.checkCandExisting(candData,true);
		 pageStream.deleteAddedCand();


}
   	
}
