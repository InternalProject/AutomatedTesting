package com.epam.testexternalpart.screen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.epam.testexternalpart.core.CheckerData;
import com.epam.testexternalpart.core.TestReporter;

public class AllCandidatesPage extends Components implements CheckerData{
	
	private static final String TITLE="//h1";
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
	//private static final String STREAM_TABLE_HEAD="//div[@class='fixed-table-header']//table[@class='table-striped header-fixed table table-hover']/thead/tr/th/div[@class='th-inner sortable']";
	private static final String STREAM_TABLE_HEAD="//div[@class='fixed-table-container']/div[@class='fixed-table-header']//table[@class='table-striped header-fixed table table-hover']/thead/tr/th/div[@class='th-inner sortable']";

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
	private static final String STREAM_STATUS_CHECKBOX = "//input[@id='checkbox12']";
	private static final String STREAM_COMMENT_CHECKBOX = "//input[@id='checkbox13']";
	private static final String STREAM_ESTIMATION_CHECKBOX = "//input[@id='checkbox15']";

	//---CHECK BOXES TITTLES---
	private static final String STREAM_SECOND_PHONE_CHECKBOX_LABEL = "//label[text()='Second phone']";
	private static final String STREAM_UNIVERSITY_CHECKBOX_LABEL = "//label[text()='University']";
	private static final String STREAM_FACULTY_CHECKBOX_LABEL = "//label[text()='Faculty']";
	private static final String STREAM_DEGREE_CHECKBOX_LABEL = "//label[text()='Degree']";
	private static final String STREAM_EDUCATION_START_CHECKBOX_LABEL = "//label[text()='Education Start']";
	private static final String STREAM_GRADUATION_YEAR_CHECKBOX_LABEL = "//label[text()='Graduation Year']";
	private static final String STREAM_ADDITIONAL_EDUCATION_CHECKBOX_LABEL = "//label[text()='Additional Education']";
	private static final String STREAM_RELEVANT_SKILLS_CHECKBOX_LABEL = "//label[text()='Relevant Skills']";
	private static final String STREAM_LANGUAGE_CHECKBOX_LABEL = "//label[text()='Language']";
	private static final String STREAM_HOW_KNOW_CHECKBOX_LABEL = "//label[text()='How do you know about courses']";
	private static final String STREAM_ATTEMPT_COUNT_CHECKBOX_LABEL = "//label[text()='Attempt Count']";
	private static final String STREAM_STATUS_CHECKBOX_LABEL = "//label[text()='Status']";
	private static final String STREAM_COMMENT_CHECKBOX_LABEL = "//label[text()='Comment']";
	private static final String STREAM_ESTIMATION_CHECKBOX_LABEL = "//label[text()='Estimation']";
	
	@FindBy(xpath = TITLE)
	private WebElement title;
		
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
	
	@FindBy(xpath = STREAM_STATUS_CHECKBOX)
	private WebElement statusCheckBox;
	
	@FindBy(xpath = STREAM_COMMENT_CHECKBOX)
	private WebElement commentCheckBox;
	
	@FindBy(xpath = STREAM_ESTIMATION_CHECKBOX)
	private WebElement estimationCheckBox;
	
	//---CHECK BOXES-TITLES--
	
	@FindBy(xpath = STREAM_SECOND_PHONE_CHECKBOX_LABEL )
	public WebElement secondPhoneCheckBoxTitle;
	
	@FindBy(xpath = STREAM_UNIVERSITY_CHECKBOX_LABEL)
	private WebElement UniversityCheckBoxTitle;
	
	@FindBy(xpath = STREAM_FACULTY_CHECKBOX_LABEL)
	private WebElement facultyCheckBoxTitle;
		
	@FindBy(xpath = STREAM_DEGREE_CHECKBOX_LABEL)
	private WebElement degreeCheckBoxTitle;
	
	@FindBy(xpath = STREAM_EDUCATION_START_CHECKBOX_LABEL)
	private WebElement educationStartCheckBoxTitle;
	
	@FindBy(xpath = STREAM_GRADUATION_YEAR_CHECKBOX_LABEL)
	private WebElement graduationYearCheckBoxTitle;
	
	@FindBy(xpath = STREAM_ADDITIONAL_EDUCATION_CHECKBOX_LABEL)
	private WebElement additionalEducationCheckBoxTitle;
	
	@FindBy(xpath = STREAM_RELEVANT_SKILLS_CHECKBOX_LABEL)
	private WebElement relevantSkillsCheckBoxTitle;
	
	@FindBy(xpath = STREAM_LANGUAGE_CHECKBOX_LABEL)
	private WebElement LanguageCheckBoxTitle;
	
	@FindBy(xpath = STREAM_HOW_KNOW_CHECKBOX_LABEL)
	private WebElement howKnowCheckBoxTitle;
	
	@FindBy(xpath = STREAM_ATTEMPT_COUNT_CHECKBOX_LABEL)
	private WebElement attemptCountCheckBoxTitle;
	
	@FindBy(xpath = STREAM_STATUS_CHECKBOX_LABEL)
	private WebElement statusCheckBoxTitle;
	
	@FindBy(xpath = STREAM_COMMENT_CHECKBOX_LABEL)
	private WebElement commentCheckBoxTitle;
	
	@FindBy(xpath = STREAM_ESTIMATION_CHECKBOX_LABEL)
	private WebElement estimationCheckBoxTitle;
	
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
	
	public void checkElementsPresent(){
		
		TestReporter.writeToReportStep("Checking the presence of all elements on All Candidates Page");
	}
	
	public void checkElementsPresent(String nameColumn){
		
		TestReporter.writeToReportTitle("Checking the presence of default columns on All Candidates menu - ");
		
		String []textForEachElement=nameColumn.split(";");				
		
		wating(2000);
		List<WebElement> tableHead = driver.findElements(By.xpath(STREAM_TABLE_HEAD));
		
		for(int i=0;i<textForEachElement.length;i++){		
			checkElementText(textForEachElement[i], textForEachElement[i], tableHead.get(i));
		}
		
		TestReporter.writeToReportPositiveResult("Default columns are present on All Candidates menu Page");
	}
	
	public void checkColumnsAccordingToCheckBox(){
		
		checkEnableColumnByCheckBox(secondPhoneCheckBoxTitle);
		checkEnableColumnByCheckBox(UniversityCheckBoxTitle);
		checkEnableColumnByCheckBox(facultyCheckBoxTitle);
		checkEnableColumnByCheckBox(degreeCheckBoxTitle);
		checkEnableColumnByCheckBox(educationStartCheckBoxTitle);
		checkEnableColumnByCheckBox(graduationYearCheckBoxTitle);
		checkEnableColumnByCheckBox(additionalEducationCheckBoxTitle);
		checkEnableColumnByCheckBox(relevantSkillsCheckBoxTitle);
		checkEnableColumnByCheckBox(howKnowCheckBoxTitle);
		checkEnableColumnByCheckBox(secondPhoneCheckBoxTitle);
		checkEnableColumnByCheckBox(attemptCountCheckBoxTitle);
		checkEnableColumnByCheckBox(statusCheckBoxTitle);
		checkEnableColumnByCheckBox(commentCheckBoxTitle);
		checkEnableColumnByCheckBox(estimationCheckBoxTitle);
	}
	
	public void checkEnableColumnByCheckBox(WebElement title){
		
		TestReporter.writeToReportTitle("Checking enable column " + title.getText() +
				" by selecting check Box");
		
		clickElement(title, "Click " + title.getText());		
		String name = title.getText();		
		
        (new WebDriverWait(driver, 3000)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(STREAM_TABLE_HEAD)));
		List<WebElement> tableHead = driver.findElements(By.xpath(STREAM_TABLE_HEAD));
		boolean b = false;
		
		for(WebElement el : tableHead){		
			if (el.getText().toLowerCase().equals(name.toLowerCase())){
				b = true;
				break;
			}
		}		
		
		Assert.assertTrue(b);
		
		TestReporter.writeToReportPositiveResult("Column is enabled");
		
		checkDisableColumnByCheckBox(title);
	}	
	
	public void checkDisableColumnByCheckBox(WebElement title){
		
		TestReporter.writeToReportTitle("Checking disable column " + title.getText() +
				" by selecting check Box");		
		
		String name = title.getText();	
		
		boolean b = false;
		clickElement(title, "Click " + title.getText());		

        (new WebDriverWait(driver, 3000)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(STREAM_TABLE_HEAD)));
		List<WebElement> tableHead = driver.findElements(By.xpath(STREAM_TABLE_HEAD));
		
		for(WebElement el : tableHead){
			if (el.getText().toLowerCase().equals(name.toLowerCase())){
				b = true;
				break;
			}
		}
		 
		Assert.assertFalse(b);
		
		TestReporter.writeToReportPositiveResult("Column is disabled");
	}	
	
	public void checkTextPresent(){
		
		TestReporter.writeToReportStep("Check the presence of all text on All Candidates menu Page");

		checkElementText("All Candidates", "All candidates title", title);
		
		TestReporter
		.writeToReportPositiveResult("All text on All Candidates menu Page is present");		
	}
}
