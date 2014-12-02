package com.epam.testexternalpart.screen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.epam.testexternalpart.core.TestReporter;

public class SreamPage extends Components {
	
	private static final String STREAM_TITLE = "//div[@class='container-fluid']/h1";
	private static final String STREAM_COLLS_TITLE="//table[@id='table']//tr//th";
	private static final String STREAM_CHECKBOXES_COL="//td[@class='bs-checkbox']//input";
	private static final String STREAM_CHECKBOX_FOR_ALL="//input[@name='btSelectAll']";
	private static final String STREAM_TABLE_ELEMENT="//tbody//tr[%s]//td[%s]";
	private static final String STREAM_TABLE_HEAD="//thead//th";
	private static final String STREAM_ASSIGN_TEST_BUTTON = "//button[@id='assign_test']";
	private static final String STREAM_BUN_BUTTON = "//button[@id='ban']";
	private static final String STREAM_DELETE_BUTTON = "//a[@class='btn btn-primary btn-sm']";
	private static final String STREAM_ALL_CANDIDATE_TAB = "//ul[@id='candTab']/li/a[text()='All Candidates']";
	private static final String STREAM_NOT_TESTED_TAB = "//ul[@id='candTab']/li/a[text()='Not tested']";
	private static final String STREAM_ASSIGNED_TO_TEST_TAB = "//ul[@id='candTab']/li/a[text()='Assigned to test']";
	private static final String STREAM_TEST_COMPLETE_TAB = "//ul[@id='candTab']/li/a[text()='Test complete']";
	private static final String STREAM_BANNED_TAB = "//ul[@id='candTab']/li/a[text()='Banned']";
	private static final String STREAM_SEARCH_FIELD = "//input[@id='searchCandidate']";
	private static final String STREAM_ADD_CANDIDATE_BUTTON = "//a[@class='btn btn-primary'][text()='Add candidate']";
	private static final String STREAM_CHOOSE_CANDIDATE_BUTTON = "//span[@class='glyphicon glyphicon-folder-open']";
	private static final String STREAM_IMPORT_CANDIDATE_BUTTON = "//input[@value='Import candidates']";
	
	//---DEDAULT COLUMNS---
	private static final String STREAM_NUMBER_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='π']";
	private static final String STREAM_TABLE_FIRST_NAME_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='First Name']";
	private static final String STREAM_TABLE_LAST_NAME_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Last Name']";
	private static final String STREAM_TABLE_MIDDLE_NAME_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Middle Name']";
	private static final String STREAM_TABLE_PHONE_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Phone']";
	private static final String STREAM_TABLE_BIRTH_DATE_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='BirthDate']";
	private static final String STREAM_TABLE_EMAIL_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Email']";
	private static final String STREAM_TABLE_FILL_DATE_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Fill Date']";
	
	//---ADITIONAL COLUMNS---
	private static final String STREAM_TABLE_SECOND_PHONE_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Second Phone']";
	private static final String STREAM_TABLE_UNIVERSITY_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='University']";
	private static final String STREAM_TABLE_FACULTY_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Faculty']";
	private static final String STREAM_TABLE_DEGREE_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Degree']";
	private static final String STREAM_TABLE_EDUCATION_START_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Education Start']";
	private static final String STREAM_TABLE_GRADUATION_YEAR_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Graduation Year']";
	private static final String STREAM_TABLE_ADDITIONAL_EDUCATION_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Additional Education']";
	private static final String STREAM_TABLE_RELEVANT_SKILLS_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Relevant Skills']";
	private static final String STREAM_TABLE_LANGUAGE_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Language']";
	private static final String STREAM_TABLE_HOW_KNOW_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='How do you know about courses']";
	private static final String STREAM_TABLE_ATTEMPT_COUNT_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Attempt Count']";
	
	//---CHECK BOXES---
	private static final String STREAM_SECOND_PHONE_CHECKBOX = "//input[@id='checkbox1'] | //label[text()='Second phone']";
	private static final String STREAM_UNIVERSITY_CHECKBOX = "//input[@id='checkbox2'] | //label[text()='University']";
	private static final String STREAM_FACULTY_CHECKBOX = "//input[@id='checkbox3'] | //label[text()='Faculty']";
	private static final String STREAM_DEGREE_CHECKBOX = "//input[@id='checkbox4'] | //label[text()='Degree']";
	private static final String STREAM_EDUCATION_START_CHECKBOX = "//input[@id='checkbox5'] | //label[text()='Education Start']";
	private static final String STREAM_GRADUATION_YEAR_CHECKBOX = "//input[@id='checkbox6'] | //label[text()='Graduation Year']";
	private static final String STREAM_ADDITIONAL_EDUCATION_CHECKBOX = "//input[@id='checkbox7'] | //label[text()='Additional Education']";
	private static final String STREAM_RELEVANT_SKILLS_CHECKBOX = "//input[@id='checkbox8'] | //label[text()='Relevant Skills']";
	private static final String STREAM_LANGUAGE_CHECKBOX = "//input[@id='checkbox9'] | //label[text()='Language']";
	private static final String STREAM_HOW_KNOW_CHECKBOX = "//input[@id='checkbox10'] | //label[text()='How do you know about courses']";
	private static final String STREAM_ATTEMPT_COUNT_CHECKBOX = "//input[@id='checkbox11'] | //label[text()='Attempt Count']";
	
	@FindBy(xpath = STREAM_TITLE)
	private WebElement title;
	
	@FindBy(xpath = STREAM_COLLS_TITLE)
	private List<WebElement> colsTitle;
	
	@FindBy(xpath = STREAM_CHECKBOX_FOR_ALL)
	private WebElement CheckboxForAll;
	
	@FindBy(xpath = STREAM_CHECKBOXES_COL)
	private List<WebElement> Checkbox—ol;
	
	@FindBy(xpath = STREAM_TABLE_ELEMENT)
	private List<WebElement> tableElement;
	
	@FindBy(xpath = STREAM_TABLE_HEAD)
	private List<WebElement> tableHead;
	
	@FindBy(xpath = STREAM_ASSIGN_TEST_BUTTON)
	private WebElement assignTestButton;
	
	@FindBy(xpath = STREAM_BUN_BUTTON)
	private WebElement bunButton;
	
	@FindBy(xpath = STREAM_DELETE_BUTTON)
	private WebElement deleteButton;
	
	@FindBy(xpath = STREAM_ALL_CANDIDATE_TAB)
	private WebElement allCandidateTab;
	
	@FindBy(xpath = STREAM_NOT_TESTED_TAB)
	private WebElement notTestedCandidate;
	
	@FindBy(xpath = STREAM_ASSIGNED_TO_TEST_TAB)
	private WebElement assignedToTestTab;
	
	@FindBy(xpath = STREAM_TEST_COMPLETE_TAB)
	private WebElement testCompleteTab;
	
	@FindBy(xpath = STREAM_BANNED_TAB)
	private WebElement bannedTab;
	
	@FindBy(xpath = STREAM_SEARCH_FIELD)
	private WebElement searchTab;
	
	@FindBy(xpath = STREAM_ADD_CANDIDATE_BUTTON)
	private WebElement addCandidateTab;
	
	@FindBy(xpath = STREAM_CHOOSE_CANDIDATE_BUTTON)
	private WebElement chooseCandidateButton;
	
	@FindBy(xpath = STREAM_IMPORT_CANDIDATE_BUTTON)
	private WebElement importCandidateButton;
	
	//---DEDAULT COLUMNS---
	
	@FindBy(xpath = STREAM_NUMBER_COLUMN)
	private WebElement numberColumn;
	
	@FindBy(xpath = STREAM_TABLE_FIRST_NAME_COLUMN)
	private WebElement firstNameColumn;
	
	@FindBy(xpath = STREAM_TABLE_LAST_NAME_COLUMN)
	private WebElement lastNameColumn;
	
	@FindBy(xpath = STREAM_TABLE_MIDDLE_NAME_COLUMN)
	private WebElement middleNameColumn;
	
	@FindBy(xpath = STREAM_TABLE_PHONE_COLUMN)
	private WebElement phoneColumn;
	
	@FindBy(xpath = STREAM_TABLE_BIRTH_DATE_COLUMN)
	private WebElement birthDateColumn;
	
	@FindBy(xpath = STREAM_TABLE_EMAIL_COLUMN)
	private WebElement emailColumn;
	
	@FindBy(xpath = STREAM_TABLE_FILL_DATE_COLUMN)
	private WebElement fillDateColumn;
	
	//---ADITIONAL COLUMNS---
	
	@FindBy(xpath = STREAM_TABLE_SECOND_PHONE_COLUMN)
	private WebElement secondPhoneColumn;
	
	@FindBy(xpath = STREAM_TABLE_UNIVERSITY_COLUMN)
	private WebElement universityColumn;
	
	@FindBy(xpath = STREAM_TABLE_FACULTY_COLUMN)
	private WebElement facultyColumn;
	
	@FindBy(xpath = STREAM_TABLE_DEGREE_COLUMN)
	private WebElement degreeColumn;
	
	@FindBy(xpath = STREAM_TABLE_EDUCATION_START_COLUMN)
	private WebElement educationStartColumn;
	
	@FindBy(xpath = STREAM_TABLE_GRADUATION_YEAR_COLUMN)
	private WebElement graduationYearColumn;
	
	@FindBy(xpath = STREAM_TABLE_ADDITIONAL_EDUCATION_COLUMN)
	private WebElement additionalEducationColumn;
	
	@FindBy(xpath = STREAM_TABLE_RELEVANT_SKILLS_COLUMN)
	private WebElement relevantSkillsColumn;
	
	@FindBy(xpath = STREAM_TABLE_LANGUAGE_COLUMN)
	private WebElement languageColumn;
	
	@FindBy(xpath = STREAM_TABLE_HOW_KNOW_COLUMN)
	private WebElement howKnowColumn;
	
	@FindBy(xpath = STREAM_TABLE_ATTEMPT_COUNT_COLUMN)
	private WebElement attemptCountColumn;
	
	//---CHECK BOXES---
	
	@FindBy(xpath = STREAM_SECOND_PHONE_CHECKBOX)
	private WebElement secondPhoneCheckBox;
	
	@FindBy(xpath = STREAM_UNIVERSITY_CHECKBOX)
	private WebElement UniversityCheckBox;
	
	@FindBy(xpath = STREAM_FACULTY_CHECKBOX)
	private WebElement facultyCheckBox;
		
	@FindBy(xpath = STREAM_DEGREE_CHECKBOX)
	private WebElement degreeCheckBox;
	
	@FindBy(xpath = STREAM_EDUCATION_START_CHECKBOX)
	private WebElement educationStartCheckBox;
	
	@FindBy(xpath = STREAM_GRADUATION_YEAR_CHECKBOX)
	private WebElement graduationYearCheckBox;
	
	@FindBy(xpath = STREAM_ADDITIONAL_EDUCATION_CHECKBOX)
	private WebElement additionalEducationCheckBox;
	
	@FindBy(xpath = STREAM_RELEVANT_SKILLS_CHECKBOX)
	private WebElement relevantSkillsCheckBox;
	
	@FindBy(xpath = STREAM_LANGUAGE_CHECKBOX)
	private WebElement LanguageCheckBox;
	
	@FindBy(xpath = STREAM_HOW_KNOW_CHECKBOX)
	private WebElement howKnowCheckBox;
	
	@FindBy(xpath = STREAM_ATTEMPT_COUNT_CHECKBOX)
	private WebElement attemptCountCheckBox;
	
	public SreamPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTableEl(int numOfRow,int numOfCol){
		String s =String.format(STREAM_TABLE_ELEMENT, numOfRow,numOfCol);
		return driver.findElement(By.xpath(s));		
	}
	
	public WebElement getCheckbox(int number){
		return Checkbox—ol.get(number);
	}
	
	public void isCheckboxSelected(int number,boolean refer){
		TestReporter.writeToReportStep("Check is checkbox N"+(number)+" selected");
		boolean b;
		
		if(getCheckbox(number).isSelected())
			b=true;
		else
			b=false;
		
		Assert.assertEquals(b, refer);
		TestReporter.writeToReportPositiveResult("Checkbox is selected");
		
	}
	
	public void checkDefaultColumns(String nameColumn){
		String []textForEachElement=nameColumn.split(";");
		for(int i=0;i<textForEachElement.length;i++){
		checkElementText(textForEachElement[i], textForEachElement[i], colsTitle.get(i));
		}
	}
	
	public void checkEnableColumnByCheckBox(WebElement element){
		
		element.click();
		String name = element.getText();
		
		boolean b = false;
		
		for(WebElement el : tableHead){
			if (el.getText().equals(name))
				b = true;
			break;
		}
		
		Assert.assertEquals(true, b);
	}	
	
}
