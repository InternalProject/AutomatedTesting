package com.epam.testexternalpart.screen.stream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.epam.testexternalpart.core.CheckerData;
import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.screen.Components;
import com.epam.testexternalpart.screen.departments.Departments;

public class StreamPage extends Components implements CheckerData {
	
	private static final String STREAM_TITLE = "//div[@class='container-fluid']/h1";
	public static final String CRUMBS = "//div[@id='crumds']/a";
	private static final String STREAM_COLLS_TITLE="//div[@class='fixed-table-header']/table[@class='table-striped table-condensed table table-hover']/thead/tr/th/div[1]";
	private static final String STREAM_CHECKBOXES_COL="//td[@class='bs-checkbox']//input";
	private static final String STREAM_CHECKBOX_FOR_ALL="//input[@name='btSelectAll']";
	private static final String STREAM_TABLE_ELEMENT="//tbody//tr[%s]//td[%s]";
	private static final String STREAM_TABLE_HEAD="//div[@class='fixed-table-header']/table[@class='table-striped table-condensed table table-hover']/thead/tr/th/div[@class='th-inner sortable']";
	private static final String STREAM_ASSIGN_TEST_BUTTON = "//a[@id='assign_test']";
	private static final String STREAM_BUN_BUTTON = "//a[@id='banCandidateButton']";
	private static final String STREAM_DELETE_BUTTON = "//a[@id='deleteCandidateButton']";
	private static final String STREAM_ALL_CHECKBOXES = "//div [@class='col-md-2']//label";
	private static final String STREAM_TABLE_ROW="//tbody/tr";
	private static final String STREAM_TABLE_ROW_VIEW="//table[@id='table']/tbody/tr[1]/td[3]";
	
	private static final String STREAM_ALL_CANDIDATE_TAB = "//ul[@id='candTab']/li/a[text()='All Candidates']";
	private static final String STREAM_NOT_TESTED_TAB = "//ul[@id='candTab']/li/a[text()='Not tested']";
	private static final String STREAM_ASSIGNED_TO_TEST_TAB = "//ul[@id='candTab']/li/a[text()='Assigned to test']";
	private static final String STREAM_CONFIRMED_TAB = "//ul[@id='candTab']/li/a[text()='Confirmed']";
	private static final String STREAM_TEST_COMPLETE_TAB = "//ul[@id='candTab']/li/a[text()='Test completed']";
	private static final String STREAM_NOT_ACTUAL_TAB = "//ul[@id='candTab']/li/a[text()='Not actual']";
	private static final String STREAM_BANNED_TAB = "//ul[@id='candTab']/li/a[text()='Banned']";
	private static final String STREAM_SEARCH_FIELD = "//input[@id='searchCandidate']";
	private static final String STREAM_ADD_CANDIDATE_BUTTON = "//a[text()='Add candidate']";
	private static final String STREAM_CHOOSE_BUTTON = "//span[@class='glyphicon glyphicon-folder-open']";
	private static final String STREAM_IMPORT_CANDIDATE_BUTTON = "//input[@value='Import candidates']";
	private static final String STREAM_EXPORT_CANDIDATE_BUTTON = "//a[@id='exportToTaleo']";
	private static final String STREAM_SEND_POSSITIVE_RESULT_BUTTON = "//a[@id='send_positive']";
	private static final String STREAM_SEND_NEGATIVE_RESULT_BUTTON = "//a[@id='send_negative']";
	
	//---DEDAULT COLUMNS---
	private static final String STREAM_NUMBER_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='π']";
	private static final String STREAM_TABLE_FIRST_NAME_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='First Name']";
	private static final String STREAM_TABLE_LAST_NAME_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Last Name']";
	private static final String STREAM_TABLE_MIDDLE_NAME_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Middle Name']";
	private static final String STREAM_TABLE_PHONE_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Phone']";
	private static final String STREAM_TABLE_BIRTH_DATE_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='BirthDate']";
	private static final String STREAM_TABLE_EMAIL_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Email']";
	private static final String STREAM_TABLE_FILL_DATE_COLUMN = "//table[@id='table']/thead/tr/th/div[text()='Fill Date']/..";
	
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
	private static final String STREAM_SECOND_PHONE_CHECKBOX = "//input[@id='checkbox1']";
	private static final String STREAM_UNIVERSITY_CHECKBOX = "//input[@id='checkbox2']";
	private static final String STREAM_FACULTY_CHECKBOX = "//input[@id='checkbox3']";
	private static final String STREAM_DEGREE_CHECKBOX = "//input[@id='checkbox4']";
	private static final String STREAM_EDUCATION_START_CHECKBOX = "//input[@id='checkbox5']";
	private static final String STREAM_GRADUATION_YEAR_CHECKBOX = "//input[@id='checkbox6']";
	private static final String STREAM_ADDITIONAL_EDUCATION_CHECKBOX = "//input[@id='checkbox7']";
	private static final String STREAM_RELEVANT_SKILLS_CHECKBOX = "//input[@id='checkbox8']";
	private static final String STREAM_LANGUAGE_CHECKBOX = "//input[@id='checkbox9']";
	private static final String STREAM_HOW_KNOW_CHECKBOX = "//input[@id='checkbox10']";
	private static final String STREAM_ATTEMPT_COUNT_CHECKBOX = "//input[@id='checkbox11']";
	private static final String STREAM_STATUS_CHECKBOX = "//input[@id='checkbox13']";
	private static final String STREAM_COMMENT_CHECKBOX = "//input[@id='checkbox12']";
	private static final String STREAM_ESTIMATION_CHECKBOX = "//input[@id='checkbox15']";
	private static final String STREAM_SEND_RESULT_CHECKBOX = "//input[@id='checkbox14']";
	
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
	
	private static final String	DEL_DEP_POP_AP_BUTTON="//button[@id='delete_candidate']";
	private static final String POP_AP_DEL="//div [@class='modal-dialog']";

	private static final String ALL_CANDIDATES_IN_STREAM ="//tbody/tr";
	private static final String ALL_CANDIDATES_PHONE_IN_STREAM = "/td[6]";
	private static final String ALL_CANDIDATES_MAIL_IN_STREAM = "/td[8]";
	
	private static final String BAN_BUTTON_POPAP = "//button[@id='ban_candidate']";

	@FindBy(xpath = BAN_BUTTON_POPAP)
	public WebElement banButtPopap;
	
	@FindBy(xpath = ALL_CANDIDATES_PHONE_IN_STREAM)
	public WebElement all_candidates_phone_in_stream;
	
	@FindBy(xpath = ALL_CANDIDATES_MAIL_IN_STREAM)
	public WebElement all_candidates_mail_in_stream;
	
	@FindBy(xpath = ALL_CANDIDATES_IN_STREAM)
	public List <WebElement> all_candidates_in_stream;
	
	@FindBy(xpath = POP_AP_DEL)
	public WebElement delCandPopAp;
	
	@FindBy(xpath = DEL_DEP_POP_AP_BUTTON)
	public WebElement delDepPopAp;
	
	@FindBy(xpath = STREAM_ALL_CHECKBOXES)
	public List<WebElement> allCheckBoxes;
	
	@FindBy(xpath = STREAM_TABLE_ROW)
	public List<WebElement> tableRow;
	
	@FindBy(xpath = STREAM_TITLE)
	public WebElement title;
	
	@FindBy(xpath = CRUMBS)
	public WebElement crumbs;
	
	@FindBy(xpath = STREAM_COLLS_TITLE)
	private List<WebElement> colsTitle;
	
	@FindBy(xpath = STREAM_CHECKBOX_FOR_ALL)
	public WebElement checkboxForAll;
	
	@FindBy(xpath = STREAM_CHECKBOXES_COL)
	public List<WebElement> Checkbox—ol;
	
	@FindBy(xpath = STREAM_TABLE_ELEMENT)
	private List<WebElement> tableElement;
	
	@FindBy(xpath = STREAM_TABLE_HEAD)
	private List<WebElement> tableHead;
	
	@FindBy(xpath = STREAM_ASSIGN_TEST_BUTTON)
	private WebElement assignTestButton;
	
	@FindBy(xpath = STREAM_BUN_BUTTON)
	public WebElement bunButton;
	
	@FindBy(xpath = STREAM_DELETE_BUTTON)
	private WebElement deleteButton;
	
	@FindBy(xpath = STREAM_ALL_CANDIDATE_TAB)
	private WebElement allCandidateTab;
	
	@FindBy(xpath = STREAM_NOT_TESTED_TAB)
	public WebElement notTestedCandidate;
	
	@FindBy(xpath = STREAM_ASSIGNED_TO_TEST_TAB)
	public WebElement assignedToTestTab;
	
	@FindBy(xpath = STREAM_CONFIRMED_TAB)
	public WebElement confirmedTab;
	
	@FindBy(xpath = STREAM_TEST_COMPLETE_TAB)
	public WebElement testCompletedTab;
	
	@FindBy(xpath = STREAM_BANNED_TAB)
	public WebElement bannedTab;
	
	@FindBy(xpath = STREAM_NOT_ACTUAL_TAB)
	public WebElement notActualTab;
	
	@FindBy(xpath = STREAM_SEARCH_FIELD)
	private WebElement searchField;
	
	@FindBy(xpath = STREAM_ADD_CANDIDATE_BUTTON)
	public WebElement addCandidateButton;
	
	@FindBy(xpath = STREAM_CHOOSE_BUTTON)
	private WebElement chooseCandidateButton;
	
	@FindBy(xpath = STREAM_IMPORT_CANDIDATE_BUTTON)
	private WebElement importCandidateButton;
	
	@FindBy(xpath = STREAM_EXPORT_CANDIDATE_BUTTON)
	private WebElement exportCandidateButton;
	
	@FindBy(xpath = STREAM_TABLE_ROW_VIEW)
	private WebElement tableRowView;
	
	@FindBy(xpath = STREAM_SEND_POSSITIVE_RESULT_BUTTON)
	private WebElement sendPossitiveResultsButton;
	
	@FindBy(xpath = STREAM_SEND_NEGATIVE_RESULT_BUTTON)
	private WebElement sendNegativeResultsButton;
	
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
	
	@FindBy(xpath = STREAM_STATUS_CHECKBOX)
	private WebElement statusCheckBox;
	
	@FindBy(xpath = STREAM_COMMENT_CHECKBOX)
	private WebElement commentCheckBox;
	
	@FindBy(xpath = STREAM_ESTIMATION_CHECKBOX)
	private WebElement estimationCheckBox;
	
	@FindBy(xpath = STREAM_SEND_RESULT_CHECKBOX)
	private WebElement sendResultCheckBox;	
	
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

	
	public WebElement icon;
	public String mailNameActual;
	public String phoneNumberActual;
	
	public StreamPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTableEl(int numOfRow,int numOfCol){
		String s =String.format(STREAM_TABLE_ELEMENT, numOfRow,numOfCol);
		return driver.findElement(By.xpath(s));		
	}
	
	public WebElement getCheckbox(int number){
		System.out.println("  !   "+Checkbox—ol.size());
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
		TestReporter.writeToReportPositiveResult("Checkbox is selected column is visible");
		
	}
	
	public void checkDefaultColumns(String nameColumn){
		
		TestReporter.writeToReportTitle("Checking the presence of Stream's default columns");
		String []textForEachElement=nameColumn.split(";");
		
		for(int i=0;i<textForEachElement.length;i++){
			checkElementText(textForEachElement[i], textForEachElement[i], colsTitle.get(i));
		}
		
		isElementExist( "Stream Create Button", checkboxForAll, true);
		TestReporter.writeToReportPositiveResult("All Streams default columns are present");
	}
	
	public void checkColumnsAccordingToCheckBox(){
				
		for (WebElement currentCheckBox : allCheckBoxes){
			EnableColumnByCheckBox(currentCheckBox);
			DisableColumnByCheckBox(currentCheckBox);
		}
	}
	
	private boolean clickAndCheÒkColumn(WebElement currentCheckBox){
		
		clickElement(currentCheckBox, currentCheckBox.getText());		
		boolean b = false;
		
        (new WebDriverWait(driver, 3000)).until(ExpectedConditions.visibilityOfAllElements(tableHead));
		for(WebElement el : tableHead){
			if (el.getText().toLowerCase().equals(currentCheckBox.getText().toLowerCase())){
				b = true;
				break;
			}
		}
		
		return b;
	}
	
	private void EnableColumnByCheckBox(WebElement currentcheckBox){
		
		TestReporter.writeToReportTitle("Checking enable column " + currentcheckBox.getText() +
				" by selected check Box");		
		
		Assert.assertTrue(clickAndCheÒkColumn(currentcheckBox));	
	}	
	
	private void DisableColumnByCheckBox(WebElement currentCheckBox){
		
		TestReporter.writeToReportTitle("Checking disable column " + currentCheckBox.getText() +
				" by selected check Box");			
		 
		Assert.assertFalse(clickAndCheÒkColumn(currentCheckBox));
	}	
	
	public void checkTextPresent(){
		
		TestReporter.writeToReportStep("Checking the presence of all text on Stream Page");

		checkElementText(Departments.streamName, "Department title", title);
		checkElementPartialText("Candidates pagination", "Crumbs", crumbs);

		TestReporter
		.writeToReportPositiveResult("All text is present on Stream Page");		
	}
	
	public void clickAddCandidateButton(){
		
		TestReporter.writeToReportTitle("Checking that Stream Create Button reffering to Add Stream Page");
		addCandidateButton.click();
		isElementExist("add Candidate Button",addCandidateButton,false);
	}

	public void checkCandExisting(String st,boolean refer) {
		  (new WebDriverWait(driver, 9000)).until(ExpectedConditions.visibilityOf(title));
		
		  waiting(5000);
		  
		  TestReporter.writeToReportTitle("Check if new candidate was added");
		  String []textOFLastEl = st.split(";");
		  String []textForEachElement = tableRow.get(0).getText().split(" ");
		  boolean flag=true;
		 
		  for(int i=0;i<2;i++){
		  if(!textForEachElement[i+1].equals(textOFLastEl[i]) && !textForEachElement[i+2].equals(textOFLastEl[i+1])){
		   flag=false;
		   break;
		  }
		  }
		  if(refer){
		  Assert.assertTrue(flag,"Wrong data in new cand");
		  TestReporter.writeToReportPositiveResult("candidate was added");
		  }else{
		  Assert.assertFalse(flag,"Wrong data in new cand");
		  }
		  
		}
	
	public void deleteAddedCand() {
		
		clickElement(getCheckbox(0), "check-box of last cand");
		clickElement(deleteButton,"deleteButton");
		 isElementExist("delCandPopAp", delCandPopAp, true);
		 clickElement( delDepPopAp, "deleteCandPopApButton");

	}
	
   public void deleteAddedCand(String mailName, String phoneNumber) {
		
		clickElement(getCheckbox(0), "check-box of last cand");
		clickElement(deleteButton,"deleteButton");
		 isElementExist("delCandPopAp", delCandPopAp, true);
		 clickElement( delDepPopAp, "deleteCandPopApButton");

	}
	
	public void checkElementsPresent(){
		
		TestReporter.writeToReportStep("Checking the presence of all elements on Stream Page");
		
		isElementExist( "Stream Assign Test Button", assignTestButton, true);
		isElementExist( "Stream Bun Button", bunButton, true);
		isElementExist( "Stream Delete Button", deleteButton, true);
		isElementExist( "Stream exportCandidateButton", exportCandidateButton, true);
		
		isElementExist( "Stream all Candidate Tab", allCandidateTab, true);
		isElementExist( "Stream notTestedCandidate", notTestedCandidate, true);
		isElementExist( "Stream assigned To Test Tab", assignedToTestTab, true);
		isElementExist( "Stream confirmed Tab", confirmedTab, true);
		isElementExist( "Stream test Complete Tab", testCompletedTab, true);
		isElementExist( "Stream not Actual Tab", notActualTab, true);
		isElementExist( "Stream banned Tab", bannedTab, true);
				
		isElementExist( "Stream secondPhoneCheckBox", secondPhoneCheckBox, true);
		isElementExist( "Stream UniversityCheckBox", UniversityCheckBox, true);
		isElementExist( "Stream assigned facultyCheckBox", facultyCheckBox, true);
		isElementExist( "Stream degreeCheckBox", degreeCheckBox, true);
		isElementExist( "Stream educationStartCheckBox", educationStartCheckBox, true);
		isElementExist( "Stream graduationYearCheckBox", graduationYearCheckBox, true);
		isElementExist( "Stream additionalEducationCheckBox", additionalEducationCheckBox, true);
		isElementExist( "Stream relevantSkillsCheckBox", relevantSkillsCheckBox, true);
		isElementExist( "Stream howKnowCheckBox", howKnowCheckBox, true);
		isElementExist( "Stream secondPhoneCheckBox", secondPhoneCheckBox, true);
		isElementExist( "Stream attemptCountCheckBox", attemptCountCheckBox, true);
		isElementExist( "Stream statusCheckBox", statusCheckBox, true);
		isElementExist( "Stream commentCheckBox", commentCheckBox, true);
		isElementExist( "Stream estimationCheckBox", estimationCheckBox, true);
		
		isElementExist( "Stream searchField", searchField, true);
		isElementExist( "Stream add Candidate Button", addCandidateButton, true);
		
		TestReporter.writeToReportPositiveResult("All Streams elements are present");
	}
	
	public void checkElementsPresentAllCandidatesTab(){
		
		TestReporter.writeToReportTitle("Checking the presence of elements on Stream Page on All Candidates Tab");
		
		isElementExist( "Stream choose Candidate Button", chooseCandidateButton, true);
		isElementExist( "Stream import Candidate Button", importCandidateButton, true);
	}
	
	public void checkElementsPresentTestCompletedTab(){
		
		TestReporter.writeToReportTitle("Checking the presence of elements on Stream Page on Test Completed Tab");
	
		isElementExist( "Stream sendPossitiveResultsButton Button", sendPossitiveResultsButton, true);
		isElementExist( "Stream sendNegativeResultsButton Button", sendNegativeResultsButton, true);
		
		isElementExist( "Stream estimationCheckBox", sendResultCheckBox, true);	
	}

	public void clickViewCand() {
		
		TestReporter.writeToReportTitle("Checking that double click on selected candidate reffering to Candidate View Page");
		
		Actions action = new Actions(driver);
		
        (new WebDriverWait(driver, 6000)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(STREAM_TABLE_ROW_VIEW)));
		action.moveToElement(driver.findElement(By.xpath(STREAM_TABLE_ROW_VIEW))).doubleClick().build().perform();

		isElementExist("add Candidate Button",addCandidateButton,false);
	}

	public void checkTableAccordingToCandidadate(String field) {
		
		TestReporter.writeToReportTitle("Check table fields according to fields of new candidate");

		String []fields = field.split(";");		
		List<WebElement> row;
		Boolean flag = false;
		
		for (WebElement ckeckBox : allCheckBoxes){
			clickElement(ckeckBox,"ckeckBox");
			
	        (new WebDriverWait(driver, 1000)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(STREAM_TABLE_ROW)));
			row = driver.findElements(By.xpath(STREAM_TABLE_ROW + "[1]/td"));
					
			for (String currentField : fields){
				for (WebElement el : row){			
					if (el.getText().replaceAll("-", ".").equals(currentField))
						flag = true;
				}
			
				Assert.assertTrue(flag);
				flag = false;					
			}			
					
			clickElement(ckeckBox,"click on " + ckeckBox);			
		}
	}

	public void selectCandidatesForTest() {		
		
		waiting(2000);
		clickElement(checkboxForAll, "Select cabdidates to assigning to test");	
		
        (new WebDriverWait(driver, 6000)).until(ExpectedConditions.visibilityOf(assignTestButton));
		clickElement(assignTestButton, "Click assignTestButton");	
	}

	public void clickNotTestedTab() {
		
		clickElement(notTestedCandidate, "click notTestedCandidate");
		waiting(1000);
	}

	public void checkCandidates(String field, String i) {
		
		TestReporter.writeToReportTitle("Checking not testing Candidates");
				
		String []fields = field.split(";");		
		List<WebElement> row;
		Boolean flag = false;
		   
		waiting(1000);
		row = driver.findElements(By.xpath(STREAM_TABLE_ROW + "[" + i + "]/td"));
		for (String currentField : fields){	
			for (WebElement el : row){		
				if (el.getText().replaceAll("-", ".").equals(currentField))
					flag = true;
			}
		
			Assert.assertTrue(flag);
			flag = false;					
		}			
	}

	public void clickAssignedToTest() {
		
		clickElement(assignedToTestTab, "click assignedToTestTab");		
	}

	public void deleteAllCand(String mess) {
	
		waiting(2000);
		
        while(tableRow.size()>1){
		clickElementJS(STREAM_CHECKBOX_FOR_ALL,"CheckboxForAll");
		clickElementJS( STREAM_DELETE_BUTTON,"deleteButton");
	    isElementExist("delCandPopAp", delCandPopAp, true);
	    clickElementJS( DEL_DEP_POP_AP_BUTTON, "deleteCandPopApButton");
	    System.out.println("2 "+tableRow.size());
		}
		
	   (new WebDriverWait(driver, 4000)).until(ExpectedConditions.visibilityOfAllElements(tableRow));
	   Assert.assertEquals(tableRow.size(), 1,"Not all candidates was deleted");
	   checkElementText(mess,"Table Row",tableRow.get(0));
	
		
	}

	public void clickConfirmedTab() {
		
		clickElement(confirmedTab, "click confirmedTab");				
	}

	public void clickNotActaualTab() {
		
		clickElement(notActualTab, "click notActualTab");			
	}

	public void clickBannedTab() {
		
		clickElement(bannedTab, "click bannedTab");	
	}
	
	public void checkMarker(String mailName, String phoneNumber, String streamDepartmentName) {

		for(WebElement e:all_candidates_in_stream){
			try{
			waiting(MIDDLE_TIME);
			mailNameActual = e.findElement(By.xpath("./td[8]")).getText();
			phoneNumberActual = e.findElement(By.xpath("./td[6]")).getText();
			if(mailName.equals(mailNameActual) & phoneNumber.equals(phoneNumberActual)){
				icon = e.findElement(By.xpath("./td[3]/img"));
				String imgContent = icon.getAttribute("title");
				Actions actions = new Actions(driver);
				actions.moveToElement(icon).build().perform();
				isElementExist(imgContent, icon, true);
				Assert.assertEquals(imgContent.contains(streamDepartmentName.replaceAll("-", ":")), true);
				Assert.assertEquals(imgContent.contains("not tested"), true);

			}
			}
			catch(StaleElementReferenceException ex){
				
			}
		}
		
	}
	
	public void performSearch(String word,WebElement field){
		 TestReporter.writeToReportTitle("Search for ["+word+"]");
		 if(field==null){
		 searchField.clear();
		 searchField.sendKeys(word+ org.openqa.selenium.Keys.ENTER);
		 }else{
			 field.clear();
			 field.sendKeys(word+ org.openqa.selenium.Keys.ENTER); 
		 }
	
	}

	public void searchResultCheck(String word){
		waiting(3000);
		Boolean flag = false;
			for (WebElement currentRow : tableRow){
				List<WebElement> el = currentRow.findElements(By.xpath(".//td"));
				
				for (WebElement el2 : el){			
					if (el2.getText().contains(word)){
						flag = true;
				break;}
				}
				
				
				Assert.assertTrue(flag);
				flag = false;	
			}
	}
}
