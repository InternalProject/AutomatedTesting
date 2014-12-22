package com.epam.testexternalpart.tests;

import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;

public class AddCandidate extends BaseTest {	
	
   @Test(dataProvider="testData")
   public void addCandidateManually(String candData){
	TestReporter.writeToReportHeader("Check the possibility of adding ñandidate manually");
	   pageDepartment.clickElement(pageDepartment.getTableEl(1,1), "First stream on first dep");
	   pageDepartment.clickElement( pageStream.addCandidateButton, "addCandidateBut");
	   pageCreateProfile.createNewCandidate(candData);
	   pageStream.checkCandExisting(candData,true);
	   pageStream.deleteAddedCand();

	   //pageStream.checkCandExisting(candData,false);
   }
   
   
   @Test(dataProvider="testData")
   public void addCandidate(String candData){
	TestReporter.writeToReportHeader("Check the possibility of adding ñandidate manually");
	   pageDepartment.clickElement(pageDepartment.getTableEl(1,1), "First stream on first dep");
	   pageDepartment.clickElement( pageStream.addCandidateButton, "addCandidateBut");
	   pageCreateProfile.createNewCandidateWithout(candData);

   }
}
