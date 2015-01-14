package com.epam.testexternalpart.screen.profile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.testexternalpart.core.CheckerData;
import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.screen.Components;

public class CreateProfilePage extends Components implements CheckerData{
	
	private static final String PROFILE_TITTLE = "//div[@class='container']//h1";
	private static final String PROFILE_FORM = "//div[@class='well bs-component']";
	private static final String PROFILE_FORM_FIRST_NAME_INPUT = "//fieldset//input[@id='firstName']";
	private static final String PROFILE_FORM_LAST_NAME_INPUT = "//fieldset//input[@id='lastName']";
	private static final String PROFILE_FORM_MIDDLE_NAME_INPUT = "//fieldset//input[@id='middleName']";
	private static final String PROFILE_FORM_BIRTHDATE_INPUT = "//fieldset//input[@id='birthDate']";
	private static final String PROFILE_FORM_EMAIL_INPUT = "//fieldset//input[@id='email']";
	private static final String PROFILE_FORM_PHONE_INPUT = "//fieldset//input[@id='phone']";
	private static final String PROFILE_FORM_PHONESECONDARY_INPUT = "//fieldset//input[@id='phoneSecondary']";
	private static final String PROFILE_FORM_UNIVERSITY_NAME_INPUT = "//fieldset//input[@id='universityName']";
	private static final String PROFILE_FORM_FACULTY_NAME_INPUT = "//fieldset//input[@id='facultyName']";
	private static final String PROFILE_FORM_DEGREE_INPUT = "//fieldset//input[@id='degree']";
	private static final String PROFILE_FORM_EDUCATIONSTART_INPUT = "//fieldset//input[@id='educationStart']";
	private static final String PROFILE_FORM_GRADUATIONYEAR_INPUT = "//fieldset//input[@id='graduationYear']";
	private static final String PROFILE_FORM_ADDITIONALEDUCATION_INPUT = "//fieldset//textarea[@id='additionalEducation']";
	private static final String PROFILE_FORM_RELEVANTSKILLS_INPUT = "//fieldset//textarea[@id='relevantSkills']";
	private static final String PROFILE_FORM_LANGUAGE_INPUT = "//fieldset//textarea[@id='language']";
	private static final String PROFILE_FORM_REFERRER_INPUT = "//fieldset//textarea[@id='referrer']";
	private static final String PROFILE_FORM_ATTEMPTCOUNT_INPUT = "//fieldset//input[@id='attemptCount'][@value='0']";
	private static final String PROFILE_FORM_STREAMID_INPUT = "//fieldset//select[@id='streamId']";
	private static final String PROFILE_FORM_STATUS_INPUT = "//fieldset//select[@id='statusId']";
	private static final String PROFILE_FORM_FILLDATE_INPUT = "//fieldset//input[@id='fillDate'][@disabled='']";
	private static final String PROFILE_FORM_COMMENT_INPUT = "//textarea[@id='comment']";
	private static final String PROFILE_FORM_BUTTON_CREATE= "//fieldset//button[@class='btn btn-primary']";
	public static final String CRUMBS = "//div[@id='crumds']]";

	public static final String MANDATORY_FIELDS = "//fieldset/div[position()<7]//input";	
	private static final String PROFILE_FORM_ALL_TITTLES = "//fieldset//label[@class='col-lg-2 control-label']";	
	public static final String ERROR_MESS="//div [@class='col-lg-10']//span";
	private static final String ALL_INPUTS = "//div[@class='col-lg-10']/textarea | //div[@class='col-lg-10']/input | //div[@class='col-lg-10']/textarea | //div[@class='col-lg-10']/select";
	
	@FindBy(xpath = ALL_INPUTS)
	private List <WebElement> allInputs;
	
	@FindBy(xpath = ERROR_MESS)
	private List <WebElement> errorMess;

	@FindBy(xpath = CRUMBS)
	public WebElement crumbs;
	
	@FindBy(xpath = PROFILE_FORM)
	private WebElement profileForm;
	
	@FindBy(xpath = PROFILE_FORM_FIRST_NAME_INPUT)
	private WebElement firstNameInput;
	
	@FindBy(xpath = PROFILE_FORM_LAST_NAME_INPUT)
	private WebElement lastNameInput;
	
	@FindBy(xpath = PROFILE_FORM_MIDDLE_NAME_INPUT)
	private WebElement middleNameInput;
	
	@FindBy(xpath = PROFILE_FORM_BIRTHDATE_INPUT)
	private WebElement birthDateInput;
	
	@FindBy(xpath = PROFILE_FORM_EMAIL_INPUT)
	private WebElement emailInput;
	
	@FindBy(xpath = PROFILE_FORM_PHONE_INPUT)
	private WebElement phoneInput;
	
	@FindBy(xpath = PROFILE_FORM_PHONESECONDARY_INPUT)
	private WebElement phoneSecondaryInput;
	
	@FindBy(xpath = PROFILE_FORM_UNIVERSITY_NAME_INPUT)
	private WebElement universityNameInput;
	
	@FindBy(xpath = PROFILE_FORM_FACULTY_NAME_INPUT)
	private WebElement facultyNameInput;
	
	@FindBy(xpath = PROFILE_FORM_DEGREE_INPUT)
	private WebElement degreeInput;
	
	@FindBy(xpath = PROFILE_FORM_EDUCATIONSTART_INPUT)
	private WebElement educationStartinput;
	
	@FindBy(xpath = PROFILE_FORM_GRADUATIONYEAR_INPUT)
	private WebElement graduationYearInput;
	
	@FindBy(xpath = PROFILE_FORM_ADDITIONALEDUCATION_INPUT)
	private WebElement additionalEducationInput;
	
	@FindBy(xpath = PROFILE_FORM_RELEVANTSKILLS_INPUT)
	private WebElement relevantSkilsInput;
	
	@FindBy(xpath = PROFILE_FORM_LANGUAGE_INPUT)
	private WebElement languageInput;
	
	@FindBy(xpath = PROFILE_FORM_REFERRER_INPUT)
	private WebElement refererInput;
	
	@FindBy(xpath = PROFILE_FORM_ATTEMPTCOUNT_INPUT)
	private WebElement attemptInput;
	
	@FindBy(xpath = PROFILE_FORM_STREAMID_INPUT)
	private WebElement streamNameInput;
	
	@FindBy(xpath = PROFILE_FORM_STATUS_INPUT)
	private WebElement statusInput;
	
	@FindBy(xpath = PROFILE_FORM_FILLDATE_INPUT)
	private WebElement filldateInput;
	
	@FindBy(xpath = PROFILE_FORM_COMMENT_INPUT)
	private WebElement commentInput;
	
	
	@FindBy(xpath = MANDATORY_FIELDS)
	private List <WebElement> mandatory_fields;
	
	@FindBy(xpath = PROFILE_FORM_ALL_TITTLES)
	private List <WebElement> allTittles;
	
	@FindBy(xpath = PROFILE_FORM_BUTTON_CREATE)
	private WebElement create_button;
	
	@FindBy(xpath = PROFILE_TITTLE)
	private WebElement title;
	
	public String mailName;
	public String phoneNumber;
	
	public CreateProfilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkTextPresent(){
		
		TestReporter.writeToReportStep("Checking the presence of all text on Add Profile Page");
	
		checkElementText("Create a new candidate", "Profile Page Title", title);
		checkElementPartialText("Add candidate profile", "Crumbs", crumbs);
	}

	public void checkTextPresent(String text){
		
		TestReporter.writeToReportTitle("Checking the presence of titles text on Add Profile Page");
				
		String []textForEachElement=text.split(";");
		
		for(int i=0;i<textForEachElement.length;i++){
			checkElementText(textForEachElement[i], textForEachElement[i], allTittles.get(i));
		}
		
		TestReporter.writeToReportPositiveResult("All Title Text is present on Add Profile Page");
	}
	
	public void checkElementsPresent(){
		
		TestReporter.writeToReportStep("Checking the presence of all elements on Add Profile Page");
		
		isElementExist( "profileForm", profileForm, true);
		isElementExist( "firstNameInput", firstNameInput, true);
		isElementExist( "lastNameInput", lastNameInput, true);
		isElementExist( "middleNameInput", middleNameInput, true);
		isElementExist( "birthDateInput", birthDateInput, true);
		isElementExist( "emailInput", emailInput, true);
		isElementExist( "phoneInput", phoneInput, true);
		isElementExist( "phoneSecondaryInput", phoneSecondaryInput, true);
		isElementExist( "universityNameInput", universityNameInput, true);
		isElementExist( "facultyNameInput", facultyNameInput, true);
		isElementExist( "degreeInput", degreeInput, true);
		isElementExist( "educationStartinput", educationStartinput, true);
		isElementExist( "graduationYearInput", graduationYearInput, true);
		isElementExist( "additionalEducationInput", additionalEducationInput, true);
		isElementExist( "relevantSkilsInput", relevantSkilsInput, true);
		isElementExist( "languageInput", languageInput, true);
		isElementExist( "refererInput", refererInput, true);
		isElementExist( "attemptInput", attemptInput, true);
		isElementExist( "streamNameInput", streamNameInput, true);
		isElementExist( "statusInput", statusInput, true);
		isElementExist( "filldateInput", filldateInput, true);		
		isElementExist( "commentInput", commentInput, true);
		
		for(WebElement el : mandatory_fields)
			isElementExist(el.getText(), el, true);		
		
		isElementExist( "Create Profile Create Button", create_button, true);
		
		TestReporter.writeToReportPositiveResult("All elements are present on Add Profile Page");
	}
	
	public void createNewCandidate(String text){
		
		TestReporter.writeToReportTitle("Creating new candidate with fields-"+text);
		
		String []dataMandatoryFields=text.split(";");
		mailName = dataMandatoryFields[4];
		phoneNumber = dataMandatoryFields[5];	
		for(int i=0;i<dataMandatoryFields.length;i++){
			mandatory_fields.get(i).sendKeys(dataMandatoryFields[i]);
		}
		
		clickElement(create_button, "Click Create Candidate Button");
		isElementExist( "Create Profile Create Button", create_button, false);
	}

	//FillRequiredFields
		public void createNewCandidateWithout(String text){
			
			String []dataMandatoryFields=text.split(";");
			
			for(int i=0;i<dataMandatoryFields.length;i++){
				mandatory_fields.get(i).sendKeys(dataMandatoryFields[i]);
				clickElement(create_button, "formButtCreate");
				isElementExist( "Error mess ¹"+i, errorMess.get(i), true);
			}
			isElementExist("formButtCreate", create_button, true);
		}

		public void createNewCandidateForView(String text){
			String []dataMandatoryFields=text.split(";");
				
			for(int i=0;i<dataMandatoryFields.length;i++){
				mandatory_fields.get(i).sendKeys(dataMandatoryFields[i]);
			}
			
			clickElement(create_button,"Create Candidate Button");
		}


		public void createTestCandidates(String fields) {
			TestReporter.writeToReportTitle("Creating new candidates for test");
            String []candidateFields=fields.split(";");
			for(int i = 0; i < candidateFields.length; i++){
				allInputs.get(i).sendKeys(candidateFields[i]);						
			}
			
			clickElement(create_button,"Create Candidate Button");
		}
}
