package com.epam.testexternalpart.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEditStreamPage extends Components{
	
	private static final String STREAM_TITLE="//fieldset/legend";
	
	private static final String STREAM_NAME_TITLE="//label[@for='name']";
	private static final String STREAM_NAME_FIELD="//input[@id='streamName']";
	
	private static final String STREAM_DEPARTMENT_TITLE="//label[text()='Department']";
	private static final String STREAM_DEPARTMENT_NAME="//div[@class='col-lg-10']/label";
	
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
	
	@FindBy(xpath = STREAM_DEPARTMENT_TITLE)
	private WebElement departmentTitle;
	
	@FindBy(xpath = STREAM_DEPARTMENT_NAME)
	private WebElement departmentNameField;
	
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
	
	@FindBy(xpath = STREAM_SUBMIT_BUTTON)
	private WebElement submitButton;
	
	
}
