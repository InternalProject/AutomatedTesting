package com.epam.testexternalpart.screen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.epam.testexternalpart.core.TestReporter;

public class Components {
	  protected WebDriver driver;
	  
	  public  void isElementExist( String item, WebElement welement, boolean refer) {
		
		 boolean value = isElementPresent(welement);
		 TestReporter.writeToReportTitle("Checking the presence of the elemen ["+item+"]");
	        if (refer) {
	            Assert.assertTrue(value,item+ "No element ["+item+"] on the page ");
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
	  

	  public  void isElementExist( String text, List<WebElement> welement, boolean refer) {
			
		 boolean value=false;
		 for(int i=0;i<welement.size();i++){
				if(welement.get(i).getText().equals(text)){
					value=true;
				break;}
				}
		 
		 
		 TestReporter.writeToReportTitle("Checking the presence of the elemen ["+text+"]");
	        if (refer) {
	            Assert.assertTrue(value, "No element ["+text+"] on the page ");
	            TestReporter.writeToReportPositiveResult("[" + text + "]"+"is Present");
	           
	        } else {
	            Assert.assertFalse(value,"element ["+text+"] is present on the page");
	            TestReporter.writeToReportPositiveResult("[" + text + "]"+"is Not Present");
	        }
	       }
	  
//	  public WebElement find(By by){
//		return  getWaiter().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
//	  }


	  public  void clickElement(WebElement webElement, String item) {
		  TestReporter.writeToReportTitle("Click on ["+item+"]");
          (new WebDriverWait(driver, 6000)).until(ExpectedConditions.elementToBeClickable(webElement)).click();
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
}
