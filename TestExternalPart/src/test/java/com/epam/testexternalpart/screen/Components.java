package com.epam.testexternalpart.screen;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.epam.testexternalpart.core.TestReporter;

public class Components {
	  WebDriver driver;
	  
	  public  void isElementExist( String item, WebElement welement, boolean refer) {
		
		 boolean value = isElementPresent(welement);
		 	   TestReporter.writeToReportTitle("Checking the presence of the elemen"+"["+item+"]");	
		 		if (refer) {
	            Assert.assertTrue(value,"No element ["+item+"] on the page ");
	 			TestReporter.writeToReportPositiveResult("[" + item + "]"+"is Present");

	           
	        } else {
	            Assert.assertFalse(value,"element ["+item+"] is present on the page");
	            TestReporter.writeToReportPositiveResult("[" + item + "]"+"is Not Present");

	        }
	        
}
	  private boolean isElementPresent(WebElement webElement){
	        try {
	        	webElement.getText();
	        	return true;
	        }catch (org.openqa.selenium.NoSuchElementException e) {
	        	return false;
	        } 
	  }

	  public  void clickElement(WebElement webElement, String item) {
		  TestReporter.writeToReportTitle("Click on ["+item+"]");
          (new WebDriverWait(driver, 3000)).until(ExpectedConditions.elementToBeClickable(webElement)).click();

	    }
	  
	  public  void checkElementText(String expectedText, String elementName, WebElement element) {
		  TestReporter.writeToReportTitle("Checking text of element "+elementName);
          	String elementText;
			if (element.getTagName().equals("input")) {
			elementText = element.getAttribute("value");
			}else {
			elementText = element.getText();
			}
			
			expectedText = expectedText.trim();
			elementText = elementText.trim();
			
			Assert.assertEquals(elementText, expectedText);
			TestReporter.writeToReportPositiveResult("Text of ["+elementName+"] is correct");

	  }

	  public void isElementVisibleState(String item, String xpath) {
		  TestReporter.writeToReportTitle("Checking visibility of element "+item+"]");

	        boolean state = false;
	        try {
	        	
	        	//Wait<WebDriver> wait = new WebDriverWait(driver, delay).ignoring(org.openqa.selenium.NoSuchElementException.class);
	         // waitForCondition(500, ExpectedConditions.visibilityOfElementLocated(by), driver);
	        	WebDriverWait wait = new WebDriverWait(driver, 10);
	        	wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
	            state = true;
	        } catch (org.openqa.selenium.TimeoutException e) {
	        }

	        if (state) {
	        	TestReporter.writeToReportPositiveResult("Element [" + item  + "]  is visible");
	        	 Reporter.log( "Element [" + item  + "]  is visible");
	        } else {
	        	TestReporter.writeToReportNegativeResult("Field [" + item  + "]  is Not visible");
	        	
	        }
	    }

}
