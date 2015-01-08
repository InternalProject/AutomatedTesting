package com.epam.testexternalpart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;

public class SearchTest extends BaseTest {

	
	 @Test(dataProvider="testData")
	   public void streamSearch(String candData1,String candData2,String candData3,String word,String word2) throws InterruptedException{
		TestReporter.writeToReportHeader("Check search in Stream");
		   pageDepartment.clickElement(pageDepartment.getTableEl(1,1), "First stream on first dep");
		   TestReporter.writeToReportStep("Create candidates for test");
		   pageDepartment.clickElement( pageStream.addCandidateButton, "addCandidateBut");
		   pageCreateProfile.createNewCandidate(candData1);
			//bug
		   	Thread.sleep(4000);
		   	WebElement element = driver.findElement(By.xpath("//table[@id='table']/thead/tr/th/div[text()='Fill Date']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(4000);
			//bug
		   pageStream.checkCandExisting(candData1,true);
		   pageDepartment.clickElement( pageStream.addCandidateButton, "addCandidateBut");
		   pageCreateProfile.createNewCandidate(candData2);
			//bug
		   	Thread.sleep(4000);
		   	 element = driver.findElement(By.xpath("//table[@id='table']/thead/tr/th/div[text()='Fill Date']"));
			 js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(4000);
			//bug
		   pageStream.checkCandExisting(candData2,true);
		   pageDepartment.clickElement( pageStream.addCandidateButton, "addCandidateBut");
		   pageCreateProfile.createNewCandidate(candData3);
			//bug
		   	Thread.sleep(4000);
		   	 element = driver.findElement(By.xpath("//table[@id='table']/thead/tr/th/div[text()='Fill Date']"));
			 js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(4000);
			//bug
			pageStream.checkCandExisting(candData3,true);
			TestReporter.writeToReportStep("Perform search for "+word);
			pageStream.performSearch(word);
			pageStream.searchResultCheck(word);
			TestReporter.writeToReportStep("Perform search for "+word2);
			pageStream.performSearch(word2);
			pageStream.searchResultCheck(word2);
	   }
	
	
}