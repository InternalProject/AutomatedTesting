package com.epam.testexternalpart.tests;

import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;

public class SeveralStreamTest extends BaseTest{
	  
	@Test(dataProvider="testData")
	   public void addCandidateToSeveralDepartment(String candData){
		   pageDepartment.clickElement(pageDepartment.first_stream, "Click first_stream");
		   String streamFirstDepartmentName = pageStream.title.getText();
		   pageStream.clickElement(pageStream.addCandidateButton, "Click addCandidateButton");
		   pageCreateProfile.createNewCandidate(candData);
		   pageStream.clickElement(pageStream.crumbs, "Click on crumbs");
		   pageDepartment.clickElement(pageDepartment.netTab, "Click on netTab");
		   pageDepartment.clickElement(pageDepartment.first_stream, "Click on first_stream");
		   pageStream.clickElement(pageStream.addCandidateButton, "Click on addCandidateButton");
		   pageCreateProfile.createNewCandidate(candData);
		   System.out.println("  mailName  "+pageCreateProfile.mailName);
		   System.out.println("  phoneNumber  "+pageCreateProfile.phoneNumber);
		   pageStream.checkMarker(pageCreateProfile.mailName, pageCreateProfile.phoneNumber, streamFirstDepartmentName);
		   String streamSecondDepartmentName = pageStream.title.getText();
		   pageStream.clickElement(pageStream.crumbs, "Click on crumbs");
		   pageDepartment.clickElement(pageDepartment.javaTab, "Click javaTab");
		   pageDepartment.clickElement(pageDepartment.first_stream, "Click first_stream");
		   pageStream.checkMarker(pageCreateProfile.mailName, pageCreateProfile.phoneNumber, streamSecondDepartmentName);
	   }
}
