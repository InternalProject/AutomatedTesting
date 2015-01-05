package com.epam.testexternalpart.screen.stream.assigningTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.screen.Components;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignToTestPage extends Components{
	
	private static final String SELECT_UNIVERSITY="//select[@id='university-list']";
	private static final String SELECT_BUILDING="//select[@id='building-list']";
	private static final String SELECT_ROOM="//select[@id='room-list']";
	private static final String INPUT_DATE_TIME="//input[@id='assigned-test-date']";
	private static final String INPUT_DURATION="//input[@id='test-duration']";
	private static final String INPUT_DEADLINE="//input[@id='test-deadline']";
	private static final String SEND_INVITATION_BUTTON="//button[@id='send-invitations']";
	private static final String POPUP_SUCCESS_RESULT="//div[@class='alert alert-success']/label[@id='sentAmount']";
	private static final String POPUP_ERROR_RESULT="//div[@id='sentErrors']/label[@id='failedAmount']";
	private static final String POPUP_CLOSE_BUTTON="//div[@class='modal-footer']/form/button";
	private static final String POP_UP_RESULTS="//div[@aria-hidden='true']/div[@class='modal-dialog']/div/div/h4[@id='emailErrorCandidateLabel']";

	@FindBy(xpath = SELECT_UNIVERSITY)
	private WebElement selectUniversity;
	
	@FindBy(xpath = SELECT_BUILDING)
	private WebElement selectBuilding;
	
	@FindBy(xpath = SELECT_ROOM)
	private WebElement selectRoom;
	
	@FindBy(xpath = INPUT_DATE_TIME)
	private WebElement selectDateTime;
	
	@FindBy(xpath = POPUP_SUCCESS_RESULT)
	private WebElement successResult;
	
	@FindBy(xpath = POPUP_ERROR_RESULT)
	private WebElement errorResult;
	
	@FindBy(xpath = POPUP_CLOSE_BUTTON)
	private WebElement popUpCloseButton;
	
	@FindBy(xpath = INPUT_DURATION)
	private WebElement duration;
	
	@FindBy(xpath = INPUT_DEADLINE)
	private WebElement deadLine;
	
	@FindBy(xpath = SEND_INVITATION_BUTTON)
	private WebElement invitationButton;
	
	@FindBy(xpath = POP_UP_RESULTS)
	private WebElement popUpResults;
	
	public AssignToTestPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendInvitation(){
		
		TestReporter.writeToReportTitle("Send invitation to candidates");
		
		new Select(selectUniversity).selectByIndex(1);
		new Select(selectBuilding).selectByIndex(1);
		new Select(selectRoom).selectByIndex(1);
		selectDateTime.sendKeys("29.11.2015 18:30");
		duration.sendKeys("1.5");
		deadLine.sendKeys("6");
		clickElement(invitationButton, "click invitationButton");
		
		try{
			long timeOutInSeconds = 20;
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds, 500);
			WebElement overlay = driver.findElement(By.xpath("//div[@id='assign-candidates-invitation'][@style='display: block;']"));
			wait.until(ExpectedConditions.stalenessOf(overlay));
		} catch (Exception e) {	}	
						
		TestReporter.writeToReportPositiveResult("Invitation were sent");
	}
	
	public void checkResults() {
		TestReporter.writeToReportTitle("Check results of sending invitation");
		
		boolean result = false;
	
		isElementExist( "Results pop up", popUpResults, true);
		
		if (successResult.getText().equals("6") && errorResult.getText().equals("1"))
			result = true;
		
		Assert.assertTrue(result, "Sending invitation is success!");
	}
	
	public ExpectedCondition<WebElement> visibilityOfElementLocated(final By locator) {
		  return new ExpectedCondition<WebElement>() {
		    public WebElement apply(WebDriver driver) {
		      WebElement toReturn = driver.findElement(locator);
		      if (toReturn.isDisplayed()) {
		        return toReturn;
		      }
		      return null;
		    }
		  };
		}

}
