package com.epam.testexternalpart.screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.testexternalpart.core.CheckerData;
import com.epam.testexternalpart.core.TestReporter;

public class TemplatePage extends Components implements CheckerData{
	
	private static final String CRUMBS = "//div[@id='crumds']";
	
	private static final String INVITATION_TITTLE = "//h3[@data-target='#template-invitation .collapse']";
	private static final String INVITATION_AVALIABLE_PLACEHOLDERS_TITTLE = "//div[@id='template-invitation']/div/div/label[text()='Available placeholders:']";
	private static final String INVITATION_PLACEHOLDER_DEPARTMENT = "//div[@id='template-invitation']/div/div[1]/div/span[text()='<:department:>']";
	private static final String INVITATION_PLACEHOLDER_DURATION = "//div[@id='template-invitation']/div/div[1]/div/span[text()='<:duration:>']";
	private static final String INVITATION_PLACEHOLDER_UNIVERSITY = "//div[@id='template-invitation']/div/div[1]/div/span[text()='<:university:>']";
	private static final String INVITATION_PLACEHOLDER_BUILDING = "//div[@id='template-invitation']/div/div[1]/div/span[text()='<:building:>']";
	private static final String INVITATION_PLACEHOLDER_ROOM = "//div[@id='template-invitation']/div/div[1]/div/span[text()='<:room:>']";
	private static final String INVITATION_PLACEHOLDER_BUILDING_MAP = "//div[@id='template-invitation']/div/div[1]/div/span[text()='<:buildingmap:>']";
	private static final String INVITATION_PLACEHOLDER_DATE = "//div[@id='template-invitation']/div/div[1]/div/span[text()='<:date:>']";
	private static final String INVITATION_PLACEHOLDER_TIME = "//div[@id='template-invitation']/div/div[1]/div/span[text()='<:time:>']";
	private static final String INVITATION_PLACEHOLDER_DEAD_LINE = "//div[@id='template-invitation']/div/div[1]/div/span[text()='<:deadline:>']";
	private static final String INVITATION_PLACEHOLDER_AUTHOR_NAME = "//div[@id='template-invitation']/div/div[1]/div/span[text()='<:author_name:>']";
	private static final String INVITATION_PLACEHOLDER_AUTHOR_EMAIL = "//div[@id='template-invitation']/div/div[1]/div/span[text()='<:author_email:>']";
	private static final String INVITATION_INPUT_BOX = "//div[@id='template-invitation']/div/div[2]/div/textarea";
	private static final String INVITATION_SAVE_BUTTON = "//div[@id='template-invitation']/div/div[3]/div/button[@class='btn btn-primary save']";
	private static final String INVITATION_RESET_BUTTON = "//div[@id='template-invitation']/div/div[3]/div/button[@class='btn btn-default reset']";
	
	private static final String SUCCESSFUL_TEST_TITTLE = "//h3[@data-target='#template-successful-test .collapse']";
	private static final String SUCCESSFUL_TEST_AVALIABLE_PLACEHOLDERS_TITTLE = "//div[@id='template-successful-test']/div/div/label[text()='Available placeholders:']";
	private static final String SUCCESSFUL_TEST_PLACEHOLDER_AUTHOR_NAME = "//div[@id='template-successful-test']/div/div[1]/div/span[text()='<:author_name:>']";
	private static final String SUCCESSFUL_TEST_PLACEHOLDER_AUTHOR_EMAIL = "//div[@id='template-successful-test']/div/div[1]/div/span[text()='<:author_email:>']";
	private static final String SUCCESSFUL_TEST_INPUT_BOX = "//div[@id='template-successful-test']/div/div[2]/div/textarea";
	private static final String SUCCESSFUL_TEST_SAVE_BUTTON = "//div[@id='template-successful-test']/div/div[3]/div/button[@class='btn btn-primary save']";
	private static final String SUCCESSFUL_TEST_RESET_BUTTON = "//div[@id='template-successful-test']/div/div[3]/div/button[@class='btn btn-default reset']";
	
	private static final String FAILD_TEST_TITTLE = "//h3[@data-target='#template-failed-test .collapse']";
	private static final String FAILD_TEST_AVALIABLE_PLACEHOLDERS_TITTLE = "//div[@id='template-failed-test']/div/div/label[text()='Available placeholders:']";
	private static final String FAILD_TEST_PLACEHOLDER_AUTHOR_NAME = "//div[@id='template-failed-test']/div/div[1]/div/span[text()='<:author_name:>']";
	private static final String FAILD_TEST_PLACEHOLDER_AUTHOR_EMAIL = "//div[@id='template-failed-test']/div/div[1]/div/span[text()='<:author_email:>']";
	private static final String FAILD_TEST_INPUT_BOX = "//div[@id='template-failed-test']/div/div[2]/div/textarea";
	private static final String FAILD_TEST_SAVE_BUTTON = "//div[@id='template-failed-test']/div/div[3]/div/button[@class='btn btn-primary save']";
	private static final String FAILD_TEST_RESET_BUTTON = "//div[@id='template-failed-test']/div/div[3]/div/button[@class='btn btn-default reset']";	
	
	private static final String ANSWER_DUPLICATION = "//h3[@data-target='#template-double-answers .collapse']";
	private static final String ANSWER_DUPLICATION_INPUT_BOX = "//div[@id='template-double-answers']/div/div[1]/div/textarea";
	private static final String ANSWER_DUPLICATION_SAVE_BUTTON = "//div[@id='template-double-answers']/div/div[2]/div/button[@class='btn btn-primary save']";
	private static final String ANSWER_DUPLICATION_RESET_BUTTON = "//div[@id='template-double-answers']/div/div[2]/div/button[@class='btn btn-default reset']";
	
	@FindBy(xpath = CRUMBS)
	private WebElement crumbs;
	
	//---INVITATION TEMPLATE---
	
	@FindBy(xpath = INVITATION_TITTLE)
	public WebElement invitationTittle;
	
	@FindBy(xpath = INVITATION_AVALIABLE_PLACEHOLDERS_TITTLE)
	private WebElement invitationAvaliablePlaceholdersTittle;
	
	@FindBy(xpath = INVITATION_PLACEHOLDER_DEPARTMENT)
	private WebElement invitationPlaceholderDepartment;
	
	@FindBy(xpath = INVITATION_PLACEHOLDER_DURATION)
	private WebElement invitationPlaceholderDuration;
	
	@FindBy(xpath = INVITATION_PLACEHOLDER_UNIVERSITY)
	private WebElement invitationPlaceholderUniversity;
	
	@FindBy(xpath = INVITATION_PLACEHOLDER_BUILDING)
	private WebElement invitationPlaceholderBuilding;
	
	@FindBy(xpath = INVITATION_PLACEHOLDER_ROOM)
	private WebElement invitationPlaceholderRoom;
	
	@FindBy(xpath = INVITATION_PLACEHOLDER_BUILDING_MAP)
	private WebElement invitationPlaceholderBuildingMap;
	
	@FindBy(xpath = INVITATION_PLACEHOLDER_DATE)
	private WebElement invitationPlaceholderDate;
	
	@FindBy(xpath = INVITATION_PLACEHOLDER_TIME)
	private WebElement invitationPlaceholderTime;
	
	@FindBy(xpath = INVITATION_PLACEHOLDER_DEAD_LINE)
	private WebElement invitationPlaceholderDeadLine;
	
	@FindBy(xpath = INVITATION_PLACEHOLDER_AUTHOR_NAME)
	private WebElement invitationPlaceholderAuthorname;
	
	@FindBy(xpath = INVITATION_PLACEHOLDER_AUTHOR_EMAIL)
	private WebElement invitationPlaceholderAuthorEmail;
	
	@FindBy(xpath = INVITATION_INPUT_BOX)
	private WebElement invitationPlaceholderInputBox;
	
	@FindBy(xpath = INVITATION_SAVE_BUTTON)
	private WebElement invitationPlaceholderSaveButton;
	
	@FindBy(xpath = INVITATION_RESET_BUTTON)
	private WebElement invitationPlaceholderResetButton;
	
	//---SACCESSFUL TEST TEMPLATE---
	
	@FindBy(xpath = SUCCESSFUL_TEST_TITTLE)
	public WebElement successfullTestTittle;
	
	@FindBy(xpath = SUCCESSFUL_TEST_AVALIABLE_PLACEHOLDERS_TITTLE)
	private WebElement successfullTestAvaliablePlaceholdersTittle;
	
	@FindBy(xpath = SUCCESSFUL_TEST_PLACEHOLDER_AUTHOR_NAME)
	private WebElement successfullTestPlaceholderAuthorName;
	
	@FindBy(xpath = SUCCESSFUL_TEST_PLACEHOLDER_AUTHOR_EMAIL)
	private WebElement successfullTestPlaceholderAuthorEmail;
	
	@FindBy(xpath = SUCCESSFUL_TEST_INPUT_BOX)
	private WebElement successfullTestPlaceholderInputBox;
	
	@FindBy(xpath = SUCCESSFUL_TEST_SAVE_BUTTON)
	private WebElement successfullTestPlaceholderSaveButton;
	
	@FindBy(xpath = SUCCESSFUL_TEST_RESET_BUTTON)
	private WebElement successfullTestPlaceholderResetButton;
	
	//---FAILD TEST TEMPLATE---	
	
	@FindBy(xpath = FAILD_TEST_TITTLE)
	public WebElement faildTestTittle;
	
	@FindBy(xpath = FAILD_TEST_AVALIABLE_PLACEHOLDERS_TITTLE)
	private WebElement faildTestAvaliablePlaceholderTittle;
	
	@FindBy(xpath = FAILD_TEST_PLACEHOLDER_AUTHOR_NAME)
	private WebElement faildTestPlaceholderAuthorName;
	
	@FindBy(xpath = FAILD_TEST_PLACEHOLDER_AUTHOR_EMAIL)
	private WebElement faildTestPlaceholderAuthorEmail;
	
	@FindBy(xpath = FAILD_TEST_INPUT_BOX)
	private WebElement faildTestPlaceholderInputBox;
	
	@FindBy(xpath = FAILD_TEST_SAVE_BUTTON)
	private WebElement faildTestPlaceholderSaveButton;
	
	@FindBy(xpath = FAILD_TEST_RESET_BUTTON)
	private WebElement faildTestPlaceholderResetButton;
	
	//---ANSWER DUPLICATION TEMPLATE---	
	
	@FindBy(xpath = ANSWER_DUPLICATION)
	public WebElement answerDuplicationTittle;
	
	@FindBy(xpath = ANSWER_DUPLICATION_INPUT_BOX)
	private WebElement answerDuplicationInputBox;
	
	@FindBy(xpath = ANSWER_DUPLICATION_SAVE_BUTTON)
	private WebElement answerDuplicationSaveButton;
	
	@FindBy(xpath = ANSWER_DUPLICATION_RESET_BUTTON)
	private WebElement answerDuplicationResetButton;	
	
	public TemplatePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void checkTextPresent() {
		
		TestReporter.writeToReportStep("Check the presence text on Email Template Page");

		checkElementPartialText("Email templates edit page", "Crumbs", crumbs);
		checkElementText("Invitation", "invitation Tittle", invitationTittle);
		checkElementText("Successful test", "successfull Test Tittle", successfullTestTittle);
		checkElementText("Failed test", "faild Test Tittle", faildTestTittle);
		checkElementText("Answer Duplication", "answerDuplicationTittle", answerDuplicationTittle);
		
		TestReporter
		.writeToReportPositiveResult("All text are present on Email Template Page");			
	}
	
	public void checkElementsPresentInvitation(){
		
		TestReporter.writeToReportTitle("Checking the presence of all elements on Email Invitation Template Page");
		
		checkElementText("Available placeholders:", "invitation Available placeholders Tittle", invitationAvaliablePlaceholdersTittle);
		
		isElementExist( "invitationPlaceholderAuthorEmail", invitationPlaceholderAuthorEmail, true);
		isElementExist( "invitationPlaceholderAuthorname", invitationPlaceholderAuthorname, true);
		isElementExist( "invitationPlaceholderBuilding", invitationPlaceholderBuilding, true);
		isElementExist( "invitationPlaceholderBuildingMap", invitationPlaceholderBuildingMap, true);
		isElementExist( "invitationPlaceholderDate", invitationPlaceholderDate, true);
		isElementExist( "invitationPlaceholderDeadLine", invitationPlaceholderDeadLine, true);
		isElementExist( "invitationPlaceholderDepartment", invitationPlaceholderDepartment, true);
		isElementExist( "invitationPlaceholderDuration", invitationPlaceholderDuration, true);
		isElementExist( "invitationPlaceholderInputBox", invitationPlaceholderInputBox, true);
		isElementExist( "invitationPlaceholderSaveButton", invitationPlaceholderSaveButton, true);
		isElementExist( "invitationPlaceholderResetButton", invitationPlaceholderResetButton, true);
		isElementExist( "invitationPlaceholderRoom", invitationPlaceholderRoom, true);
		isElementExist( "invitationPlaceholderTime", invitationPlaceholderTime, true);
		isElementExist( "invitationPlaceholderUniversity", invitationPlaceholderUniversity, true);
	
		TestReporter.writeToReportPositiveResult("All elements are present on Email Invitation Template Page");
	}
	
	public void checkElementsPresentSuccessfullTest(){
		
		TestReporter.writeToReportTitle("Checking the presence of all elements on Email Successfull Test Template Page");

		checkElementText("Available placeholders:", "successfull Test Available placeholders Tittle", successfullTestAvaliablePlaceholdersTittle);
		
		isElementExist( "successfullTestPlaceholderAuthorEmail",successfullTestPlaceholderAuthorEmail, true);
		isElementExist( "successfullTestPlaceholderAuthorName", successfullTestPlaceholderAuthorName, true);
		isElementExist( "successfullTestPlaceholderInputBox", successfullTestPlaceholderInputBox, true);
		isElementExist( "successfullTestPlaceholderResetButton", successfullTestPlaceholderResetButton, true);
		isElementExist( "successfullTestPlaceholderSaveButton", successfullTestPlaceholderSaveButton, true);
			
		TestReporter.writeToReportPositiveResult("All elements are present on Email Successfull Test Template Page");
	}
	
	public void checkElementsPresentFaildTest(){
		
		TestReporter.writeToReportTitle("Checking the presence of all elements on Email Faild Test Template Page");
		
		isElementExist( "faildTestPlaceholderAuthorEmail",faildTestPlaceholderAuthorEmail, true);
		isElementExist( "faildTestPlaceholderAuthorName", faildTestPlaceholderAuthorName, true);
		isElementExist( "faildTestPlaceholderInputBox", faildTestPlaceholderInputBox, true);
		isElementExist( "faildTestPlaceholderResetButton", faildTestPlaceholderResetButton, true);
		isElementExist( "faildTestPlaceholderSaveButton", faildTestPlaceholderSaveButton, true);
			
		TestReporter.writeToReportPositiveResult("All elements are present on Email Faild Test Template Page");
	}
	
	public void checkElementsPresentAnswerDuplication(){
		
		TestReporter.writeToReportTitle("Checking the presence of all elements on Email Answer Duplication Template Page");
		
		checkElementText("Available placeholders:", "faild Test Available placeholders Tittle", faildTestAvaliablePlaceholderTittle);
		
		isElementExist( "answerDuplicationInputBox",answerDuplicationInputBox, true);
		isElementExist( "answerDuplicationResetButton", answerDuplicationResetButton, true);
		isElementExist( "answerDuplicationSaveButton", answerDuplicationSaveButton, true);
						
		TestReporter.writeToReportPositiveResult("All elements are present on Email Answer Duplication Template Page");
	}

	public void checkElementsPresent() {
		
		TestReporter.writeToReportStep("Checking the presence of all elements on Template Page");	
	}
}
