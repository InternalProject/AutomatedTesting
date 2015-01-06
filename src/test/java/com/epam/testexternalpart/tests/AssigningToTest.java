package com.epam.testexternalpart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.screen.stream.assigningTest.emails.AnswerFromGMail;
import com.epam.testexternalpart.screen.stream.assigningTest.emails.AnswerFromIUa;
import com.epam.testexternalpart.screen.stream.assigningTest.emails.AnswerFromRambler;
import com.epam.testexternalpart.screen.stream.assigningTest.emails.AnswerFromYandex;

public class AssigningToTest extends BaseTest{
	
	@BeforeClass
	public void initEmails(){

		pageIUa = new AnswerFromIUa(driver);
		pageYandex = new AnswerFromYandex(driver);
		pageRambler = new AnswerFromRambler(driver);
		pageGmail = new AnswerFromGMail(driver);
	}
  
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
	
	@Test(dataProvider = "testData", priority = 3)
	public void checkNotTestedCand(String streamName, String candidateFields, String row){
		
		pageDepartment.clickSelectedStream(streamName);
		pageStream.clickNotTestedTab();
		pageStream.checkCandidates(candidateFields, row);
	}
	
	@Test(dataProvider = "testData", priority = 4)
	public void assignTest(String streamName){
		
		pageDepartment.clickSelectedStream(streamName);
		pageStream.selectCandidatesForTest();
		pageAssignTest.sendInvitation();
		pageAssignTest.checkResults();		
	}
	
	@Test(dataProvider = "testData",priority = 5)
	public void checkAssignedToTestCand(String streamName, String candidateFields, String row){
		
		pageDepartment.clickSelectedStream(streamName);
		pageStream.clickAssignedToTest();
		pageStream.checkCandidates(candidateFields, row);	
	}
	
	@Test(priority = 6)
	public void responseFromCandidates(){	
				
		pageIUa.logOn();
		pageIUa.enterIntoUnreadMessage();
		pageIUa.responseConfirmedAnswer();		
		
		pageYandex.logOn();
		pageYandex.enterIntoUnreadMessage();
		pageYandex.responseNotActualAnswer();
		
		pageRambler.logOn();
		pageRambler.enterIntoUnreadMessage();
		pageRambler.responseNewTimeAnswer();
		
//		pageGmail.logOn();
//		pageGmail.enterIntoUnreadMessage();
//		pageGmail.responseConfirmedAnswer();
	}
	
	@Test(dataProvider = "testData",priority = 7)
	public void checkConfirmedCand(String streamName, String candidateFields, String row){
		
		pageDepartment.clickSelectedStream(streamName);
		pageStream.clickConfirmedTab();
		pageStream.checkCandidates(candidateFields, row);	
	}
	
	@Test(dataProvider = "testData",priority = 8)
	public void checkNotActualCand(String streamName, String candidateFields, String row){
		
		pageDepartment.clickSelectedStream(streamName);
		pageStream.clickNotActaualTab();
		pageStream.checkCandidates(candidateFields, row);	
	}

	@Test(dataProvider = "testData",priority = 9)
	public void checkNewTimeCand(String streamName, String candidateFields, String row){
		
		pageDepartment.clickSelectedStream(streamName);
		pageStream.clickNotTestedTab();
		pageStream.checkCandidates(candidateFields, row);	
	}
	//не проверено
	@Test(priority = 10)
	public void checkDublicateAnswer(){	
				
		pageIUa.logOn();
		pageIUa.enterIntoUnreadMessage();
		pageIUa.clickDublicateAnswer();
		pageIUa.checkDublicateAnswerMessage();
	}
	
	//не проверено
	@Test(dataProvider = "testData",priority = 11)
	public void invitateSecondTime(String streamName, String candidateFields, String row){	
				
		pageDepartment.clickSelectedStream(streamName);
		pageStream.clickNotTestedTab();
		pageStream.selectCandidatesForTest();
		pageAssignTest.sendInvitation();
		
		pageRambler.logOn();
		pageRambler.enterIntoUnreadMessage();
		pageRambler.responseNewTimeAnswer();
	}
	
	//не проверено
	@Test(dataProvider = "testData",priority = 12)
	public void invitateThirdTime(String streamName, String candidateFields, String row){	
				
		pageDepartment.clickSelectedStream(streamName);
		pageStream.clickNotTestedTab();
		pageStream.selectCandidatesForTest();
		pageAssignTest.sendInvitation();
		
		pageRambler.logOn();
		pageRambler.enterIntoUnreadMessage();
		pageRambler.responseNewTimeAnswer();
	}
	
	//не проверено
	@Test(dataProvider = "testData",priority = 13)
	public void checkBannedCandidate(String streamName, String candidateFields, String row){	
				
		pageDepartment.clickSelectedStream(streamName);
		pageStream.clickBannedTab();
		pageStream.checkCandidates(candidateFields, row);
	}
}
