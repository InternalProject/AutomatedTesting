package com.epam.testexternalpart.screen.stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.epam.testexternalpart.screen.Components;

public class EditStreamPage extends Components{
	
	private static final String STREAM_TITLE="//fieldset/legend";
	
	private static final String STREAM_NAME_TITLE="//label[@for='name']";
	private static final String STREAM_NAME_FIELD="//input[@id='streamName']";
	
	private static final String STREAM_START_DATE_TITLE="//label[@for='dateOfStart']";
	private static final String STREAM_START_DATE_FIELD="//input[@id='streamStartDate']";
	
	private static final String STREAM_END_DATE_TITLE="//label[@for='dateOfEnd']";
	private static final String STREAM_END_DATE_FIELD="//input[@id='streamEndDate']";
	
	private static final String STREAM_STATUS_TITLE="//label[text()='Status']";
	private static final String STREAM_STATUS_FIELD="//select[@name='streamStatusId']";
	private static final String STREAM_STATUS_OPTION_NOT_STARTED="//option[text()='not started']";
	private static final String STREAM_STATUS_OPTION_STARTED="//option[text()='started']";
	private static final String STREAM_STATUS_OPTION_FINISHED="//option[text()='finished']";
	
	private static final String STREAM_SUBMIT_BUTTON="//button[@class='btn btn-primary']";
	
	@FindBy(xpath = STREAM_TITLE)
	private WebElement title;
	
	@FindBy(xpath = STREAM_NAME_TITLE)
	private WebElement nameTitle;
	
	@FindBy(xpath = STREAM_NAME_FIELD)
	private WebElement nameField;
	
	@FindBy(xpath = STREAM_START_DATE_TITLE)
	private WebElement startDateTitle;
	
	@FindBy(xpath = STREAM_START_DATE_FIELD)
	private WebElement startdateField;
	
	@FindBy(xpath = STREAM_END_DATE_TITLE)
	private WebElement endDateTitle;
	
	@FindBy(xpath = STREAM_END_DATE_FIELD)
	private WebElement endDateField;
	
	@FindBy(xpath = STREAM_STATUS_TITLE)
	private WebElement statusTitle;
	
	@FindBy(xpath = STREAM_STATUS_FIELD)
	private WebElement statusField;
	
	@FindBy(xpath = STREAM_STATUS_OPTION_NOT_STARTED)
	private WebElement optionNotStarted;
	
	@FindBy(xpath = STREAM_STATUS_OPTION_STARTED)
	private WebElement optionStarted;
	
	@FindBy(xpath = STREAM_STATUS_OPTION_FINISHED)
	private WebElement optionFinished;
	
	@FindBy(xpath = STREAM_SUBMIT_BUTTON)
	private WebElement submitButton;
	
	WebDriver driver;
	
	public EditStreamPage(WebDriver driver) {
		super(driver);
	}
	
	public void addNewStream(){
		nameField.sendKeys("new Stream");		
		submitButton.click();
	}
	
	public void allTextArePresent(){
		Reporter.log("<br><b>"+"Checking the presence of text on Edit Stream Page"+"</b><br>");
		
		checkElementText("AddStream title", "AddEditStream title", title);
		checkElementText("AddStream name Stream", "AddEditStream name Stream", nameTitle);
		checkElementText("AddStream start date name", "AddEditStream start date title", startDateTitle);
		checkElementText("AddEditStream end date title", "AddEditStream end date title", endDateTitle);
		checkElementText("AddEditStream status title", "AddEditStream status title", statusTitle);
		
		Reporter.log("<br><br><b>"+"All text on Edit Stream Page is present"+"</b><br>");
	}
	
	public void allElementsArePeresent(){
		
		Reporter.log("<br><b>"+"Checking the presence of Stream's elements"+"</b><br>");
		
		isElementExist( "AddStream name field", nameField, true);
		isElementExist( "AddStream start date field", startDateTitle, true);
		isElementExist( "AddStream end date field", endDateTitle, true);
		isElementExist( "AddStream status field", statusField, true);
		
		isElementExist( "AddStream status option Not Started", optionNotStarted, true);
		isElementExist( "AddStream status option Started", optionStarted, true);
		isElementExist( "AddStream status option Finished", optionFinished, true);
		
		isElementExist( "AddStream submit button", submitButton, true);
		
		Reporter.log("<br><br><b>"+"All Streams elements are present"+"</b><br>");
	}
	
}
