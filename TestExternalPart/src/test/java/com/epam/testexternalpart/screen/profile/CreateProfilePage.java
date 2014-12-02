package com.epam.testexternalpart.screen.profile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	private static final String PROFILE_FORM_ALL_TITTLES = "//fieldset//label[@class='col-lg-2 control-label']";
	
	
	@FindBy(xpath = PROFILE_FORM_ALL_TITTLES)
	private List <WebElement> allTittles;
	
	
	
	
	public CreateProfilePage(WebDriver driver) {
		//driver=driver;
		PageFactory.initElements(driver, this);
	}



	public void checkAllTittles(String text){
		String []textForEachElement=text.split(";");
		for(int i=0;i<textForEachElement.length;i++){
		checkElementText(textForEachElement[i], textForEachElement[i], allTittles.get(i));
		}
	}
	
}
