package com.epam.testexternalpart.screen.profile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.screen.Components;

public class EditProfilePage extends Components{
	public static final String PROFILE_TITLE = "//h1";
	public static final String ALL_LABELS="//fieldset//label[@class='col-lg-2 control-label']";
	public static final String SAVE_BUTTON = "//div[@class='col-lg-10 col-lg-offset-2']/button";
	public static final String CANCEL_BUTTON = "//div[@class='col-lg-10 col-lg-offset-2']/a";
	public static final String ALL_TITLES= "//select[@id='streamId']";
	public static final String ALL_INPUTS = "//input[@class='form-control' or @id='birthDate' or @id='fillDate' or @id='banned']";
	public static final String SELECT_ELEMENT = "//select[@id='streamId']";
	
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
	public static final String MANDATORY_FIELDS = "//fieldset/div[position()<7]//input";
	private static final String PROFILE_FORM__ALL_FIELDS = "//div[@class='col-lg-10']/textarea | //div[@class='col-lg-10']/input | //div[@class='col-lg-10']/textarea | //div[@class='col-lg-10']/select";
	public static final String CRUMBS = "//div[@id='crumds']/a[text()='Candidates pagination>']";

	@FindBy(xpath = CRUMBS)
	public WebElement crumbs;
	
	@FindBy(xpath = PROFILE_FORM__ALL_FIELDS)
	private List <WebElement> allFields;
	
	@FindBy(xpath = ALL_LABELS)
	private List <WebElement> all_tittles;
	
	@FindBy(xpath = SAVE_BUTTON)
	private WebElement save_button;
	
	@FindBy(xpath = CANCEL_BUTTON)
	private WebElement cancel_button;
	
	@FindBy(xpath = SELECT_ELEMENT)
	private WebElement select_element;
	
	@FindBy(xpath = PROFILE_TITLE)
	private WebElement profile_title;
	
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
	
	public EditProfilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void checkElementsPresent() {
		TestReporter.writeToReportTitle("Checking the presence of all elements on Edit Profile Page");
		
		isElementExist( "Crumbs", crumbs, true);
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
			isElementExist( "mandatory_fields", el, true);		
		
		isElementExist( "Edit Profile Save Button", save_button, true);
		isElementExist( "Edit Profile Cancel Button", cancel_button, true);
		
		TestReporter.writeToReportPositiveResult("All elements are present on Edit Profile Page");
		
	}

	public void checkAllTextPresent(String text) {
		TestReporter.writeToReportTitle("Checking the presence of titles text on Edit Profile Page");
		
		isElementExist( "Edit Profile select element", select_element, true);
		isElementExist( "Edit Profile Cancel Button", cancel_button, true);
		isElementExist( "Edit Profile Save Button", save_button, true);
		isElementExist( "Edit Profile Title", profile_title, true);
		
		String []textForEachElement=text.split(";");
		for(int i=0;i<textForEachElement.length;i++){
			checkElementText(textForEachElement[i], textForEachElement[i], all_tittles.get(i));
		}
		
		TestReporter.writeToReportPositiveResult("All Title Text is present on Edit Profile Page");
		
	}

	public void checkTextAccordingToFields(String field) {
		
		String []fields = field.split(";");
		Boolean flag = false;		
		
		for (String currentField : fields){
			for (WebElement el : allFields){				
				if (el.getAttribute("value").equals(currentField))
					flag = true;
			}
		
		Assert.assertTrue(flag);
		flag = false;					
			
		}		
	}

	public void changeStatus(String status){
		statusInput.sendKeys(status);
		clickElement(save_button,"Save button");
		clickElement(crumbs,"crumbs button");
	}
}
