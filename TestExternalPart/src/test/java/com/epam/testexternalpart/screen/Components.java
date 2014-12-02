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

public class Components {
	  protected WebDriver driver;
	  
	  public  void isElementExist( String item, WebElement welement, boolean refer) {
		
		 boolean value = isElementPresent(welement);
		 	Reporter.log("<br>Checking the presence of the elemen ["+item+"]");
	        if (refer) {
	            Assert.assertTrue(value,item+ "No element ["+item+"] on the page ");
	            Reporter.log("<br>"+"[" + item + "]"+"is Present");
	           
	        } else {
	            Assert.assertFalse(value,"element ["+item+"] is present on the page");
	            Reporter.log("<br>"+"[" + item + "]"+"is Not Present");
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
          Reporter.log("<br>"+"Click on ["+item+"]");
          (new WebDriverWait(driver, 3000)).until(ExpectedConditions.elementToBeClickable(webElement)).click();

	    }
	  
	  public  void checkElementText(String expectedText, String elementName, WebElement element) {
          Reporter.log("<br>"+"Checking text of element "+elementName);
          	String elementText;
			if (element.getTagName().equals("input")) {
			elementText = element.getAttribute("value");
			}else {
			elementText = element.getText();
			}
			
			expectedText = expectedText.trim();
			elementText = elementText.trim();
			
			Assert.assertEquals(elementText, expectedText);
	        Reporter.log("<br>"+"Text of ["+elementName+"] is correct");

	  }
}
