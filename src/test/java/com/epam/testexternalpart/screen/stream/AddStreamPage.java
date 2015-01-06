package com.epam.testexternalpart.screen.stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.screen.Components;


public class AddStreamPage extends Components{
	
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
	public static final String CRUMBS = "//div[@id='crumds']/a[text()='Departments page>']";
	public static final String ADD_STREM_BUTTON = "//button[@class='btn btn-primary']";
	public static final String INPUT_NAME_STREAM="//input[@id='streamName']";
	public static final String WRONG_MESS = ".//span[@id='e_name']";
	
	@FindBy(xpath = ADD_STREM_BUTTON)
	public WebElement add_strem_button;
	
	@FindBy(xpath = INPUT_NAME_STREAM)
	public WebElement input_name_stream;

	@FindBy(xpath = CRUMBS)
	public WebElement crumbs;
	
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
	
	@FindBy(xpath = STREAM_STATUS_OPTION_NOT_STARTED)
	private WebElement optionNotStarted;
	
	@FindBy(xpath = STREAM_STATUS_OPTION_STARTED)
	private WebElement optionStarted;
	
	@FindBy(xpath = STREAM_STATUS_OPTION_FINISHED)
	private WebElement optionFinished;
	
	@FindBy(xpath = STREAM_SUBMIT_BUTTON)
	private WebElement submitButton;
	
	public AddStreamPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addNewStream(){
		nameField.sendKeys("new Stream");		
		submitButton.click();
	}
	
	public void allTextArePresent(){
		TestReporter.writeToReportTitle("Checking the presence of text on Edit Stream Page");
		
		checkElementText("Enter stream information", "AddEditStream title", title);
		checkElementText("Stream name", "AddStream name Stream", nameTitle);
		checkElementText("Department", "AddStream department title", departmentTitle);			
		checkElementText("Start date", "AddStream start date title", startDateTitle);
		checkElementText("End date", "AddStream end date title", endDateTitle);
		checkElementText("Status", "AddStream status title", statusTitle);
		
		TestReporter.writeToReportPositiveResult("All text on Stream Page is present");
	}
	
	public void allElementsArePeresent(){
		
		TestReporter.writeToReportTitle("Checking the presence of Stream's elements");
		
		isElementExist( "Crumbs", crumbs, true);
		isElementExist( "AddStream name field", nameField, true);
		isElementExist( "AddStream start date field", startDateTitle, true);
		isElementExist( "AddStream end date field", endDateTitle, true);
		isElementExist( "AddStream status field", statusField, true);
		
		isElementExist( "AddStream status option Not Started", optionNotStarted, true);
		isElementExist( "AddStream status option Started", optionStarted, true);
		isElementExist( "AddStream status option Finished", optionFinished, true);
		
		isElementExist( "AddStream submit button", submitButton, true);
		
		TestReporter.writeToReportPositiveResult("All Streams elements are present");
	}
	
	public void checkDepartment(String department){
		
		checkElementText(department, "AddStream department name tab " + department, departmentNameField);
		
	}

	public void fillAddStreamInput(String name) {
		TestReporter.writeToReportTitle("Create new Stream with name "+name);
		input_name_stream.sendKeys(name);
		clickElement(add_strem_button,"AddStreamButton");
	}

	public void chekStreamPageOpen() {
		isElementExist("Added stream",input_name_stream,true);

	}
	
	
	
}
