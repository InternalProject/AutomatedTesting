package com.epam.testexternalpart.screen.profile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.epam.testexternalpart.screen.Components;

public class EditProfilePage extends Components{
	public static final String PROFILE_TITLE = "//h1";
	public static final String ALL_LABELS="//fieldset//label[@class='col-lg-2 control-label']";
	public static final String SAVE_BUTTON = "//div[@class='col-lg-10 col-lg-offset-2']/button";
	public static final String CANCEL_BUTTON = "//div[@class='col-lg-10 col-lg-offset-2']/a";
	public static final String ALL_INPUTS = "//input[@class='form-control' or @id='birthDate' or @id='fillDate' or @id='banned']";
	public static final String ALL_TEXTAREA = "//textarea";
	public static final String SELECT_ELEMENT = "//select[@id='streamId']";
	
	@FindBy(xpath = ALL_TEXTAREA)
	private List <WebElement> all_textarea;
	
	@FindBy(xpath = ALL_INPUTS)
	private List <WebElement> all_inputs;
	
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
	
	public EditProfilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void allTabsArePresent(){
		Reporter.log("<br><b>"+"Checking the presence of  ViewProfilePage elements"+"</b><br>");
		isElementExist( "Edit Profile select element", select_element, true);
		isElementExist( "Edit Profile Cancel Button", cancel_button, true);
		isElementExist( "Edit Profile Save Button", save_button, true);
		isElementExist( "Edit Profile Title", profile_title, true);
		Reporter.log("<br><br><b>"+"All  ViewProfilePage elements are present"+"</b><br>");
	}

	public void checkAllTittles(String text){
		String []textForEachElement=text.split(";");
		for(int i=0;i<textForEachElement.length;i++){
		checkElementText(textForEachElement[i], textForEachElement[i], all_tittles.get(i));
		}
	}
	
	public boolean checkAllInputesAmount(int amount){
		if(all_inputs.size()==amount)
		return true;
		return false;
	}
	
	public boolean checkAllTextareaAmount(int amount){
		if(all_textarea.size()==amount)
		return true;
		return false;
	}
}
