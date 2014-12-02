package com.epam.testexternalpart.screen.profile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.epam.testexternalpart.screen.Components;

public class CreateProfilePage extends Components{
	private static final String PROFILE_TITTLE = "//div[@class='container']//h1";
	private static final String PROFILE_FORM = "//div[@class='well bs-component']";
	private static final String PROFILE_LEGENDA = "//fieldset//legend";
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
	private static final String PROFILE_FORM_ATTEMPTCOUNT_INPUT = "//fieldset//input[@id='attemptCount']";
	private static final String PROFILE_FORM_STREAMID_INPUT = "//fieldset//select[@id='streamId']";
	private static final String PROFILE_FORM_FILLDATE_INPUT = "//fieldset//input[@id='fillDate']";
	private static final String PROFILE_FORM_BUTTON_CREATE_INPUT = "//fieldset//button[@class='btn btn-primary']";
	public static final String MANDATORY_FIELDS = "//fieldset/div[position()<7]//input";
	public static final String SELECT_ELEMENT = "//select[@id='streamId']";
	
	private static final String PROFILE_FORM_ALL_TITTLES = "//fieldset//label[@class='col-lg-2 control-label']";
	
	@FindBy(xpath = PROFILE_FORM_FIRST_NAME_INPUT)
	private WebElement first_name_input;
	
	@FindBy(xpath = MANDATORY_FIELDS)
	private List <WebElement> mandatory_fields;
	
	@FindBy(xpath = PROFILE_FORM_ALL_TITTLES)
	private List <WebElement> allTittles;
	
	@FindBy(xpath = PROFILE_FORM_BUTTON_CREATE_INPUT)
	private WebElement create_button;
	
	@FindBy(xpath = PROFILE_TITTLE)
	private WebElement title;
	
	@FindBy(xpath = SELECT_ELEMENT)
	private WebElement select_element;
	
	public CreateProfilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void checkAllTittles(String text){
		String []textForEachElement=text.split(";");
		for(int i=0;i<textForEachElement.length;i++){
		checkElementText(textForEachElement[i], textForEachElement[i], allTittles.get(i));
		}
	}
	
	public void allTabsArePresent(){
		Reporter.log("<br><b>"+"Checking the presence of  ViewProfilePage elements"+"</b><br>");
		isElementExist( "Create Profile select element", select_element, true);
		isElementExist( "Create Profile Create Button", create_button, true);
		isElementExist( "Create Profile Title", title, true);
		Reporter.log("<br><br><b>"+"All  ViewProfilePage elements are present"+"</b><br>");
	}
	
	public void createNewCandidate(String text){
		String []dataMandatoryFields=text.split(";");
		for(int i=0;i<dataMandatoryFields.length;i++){
			mandatory_fields.get(i).sendKeys(dataMandatoryFields[i]);
		}
	}
	
}
