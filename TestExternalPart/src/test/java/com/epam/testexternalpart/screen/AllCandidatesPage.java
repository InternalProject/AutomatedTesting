package com.epam.testexternalpart.screen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.epam.testexternalpart.core.TestReporter;



public class AllCandidatesPage extends Components {
	private static final String TITLE="//h1";
	private static final String COLLS_TITLE="//table[@id='table']//tr//th";
	private static final String CHECKBOXES_COL="//td[@class='bs-checkbox']//input";
	private static final String CHECKBOX_FOR_ALL="//input[@name='btSelectAll']";
	private static final String TABLE_EL="//tbody//tr[%s]//td[%s]";

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
	
	@FindBy(xpath = TITLE)
	private WebElement title;
	
	@FindBy(xpath = COLLS_TITLE)
	private List<WebElement> colsTitle;
	
	@FindBy(xpath = CHECKBOX_FOR_ALL)
	private WebElement CheckboxForAll;
	
	@FindBy(xpath = CHECKBOXES_COL)
	private List<WebElement> Checkbox—ol;	
	
	@FindBy(xpath = TABLE_EL)
	private List<WebElement> tableElement;	
	
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
	public WebElement secondPhoneCheckBox;
	
	@FindBy(xpath = STREAM_UNIVERSITY_CHECKBOX)
	public WebElement UniversityCheckBox;
	
	@FindBy(xpath = STREAM_FACULTY_CHECKBOX)
	public WebElement facultyCheckBox;
		
	@FindBy(xpath = STREAM_DEGREE_CHECKBOX)
	public WebElement degreeCheckBox;
	
	@FindBy(xpath = STREAM_EDUCATION_START_CHECKBOX)
	public WebElement educationStartCheckBox;
	
	@FindBy(xpath = STREAM_GRADUATION_YEAR_CHECKBOX)
	public WebElement graduationYearCheckBox;
	
	@FindBy(xpath = STREAM_ADDITIONAL_EDUCATION_CHECKBOX)
	public WebElement additionalEducationCheckBox;
	
	@FindBy(xpath = STREAM_RELEVANT_SKILLS_CHECKBOX)
	public WebElement relevantSkillsCheckBox;
	
	@FindBy(xpath = STREAM_LANGUAGE_CHECKBOX)
	public WebElement LanguageCheckBox;
	
	@FindBy(xpath = STREAM_HOW_KNOW_CHECKBOX)
	public WebElement howKnowCheckBox;
	
	@FindBy(xpath = STREAM_ATTEMPT_COUNT_CHECKBOX)
	public WebElement attemptCountCheckBox;	
	
	public AllCandidatesPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}	
	
	public WebElement getTableEl(int numOfRow,int numOfCol){
		String s =String.format(TABLE_EL, numOfRow,numOfCol);
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
	
	public void checkAllTittles(String text){
		String []textForEachElement=text.split(";");
		for(int i=0;i<textForEachElement.length;i++){
		checkElementText(textForEachElement[i], textForEachElement[i], colsTitle.get(i));
		}
	}
}
