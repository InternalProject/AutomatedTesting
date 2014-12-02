package com.epam.testexternalpart.screen.profile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.epam.testexternalpart.screen.Components;

public class ViewProfilePage extends Components{
	private static final String PROFILE_TITTLE = "//ul[@class='list-group']//li[1]";
	private static final String PROFILE_FORM = "//ul[@class='list-group']";
	private static final String PROFILE_FORM_BUTTON_EDIT = "//form//button[@class='btn btn-primary'][text()='Edit']";
	private static final String PROFILE_FORM_BUTTON_DELETE = "//div[@class='profilePageActionButtons']/a[@class='btn btn-primary']";
	private static final String PROFILE_DELETE_POPUP  = "//div[@class='modal-content']";
	private static final String PROFILE_FORM_ALL_TITTLES = "//ul[@class='list-group']//li//span[@class='pull-left']";
	private static final String PROFILE_POPUP_CLOSE = "//form/button[@class='btn btn-default']";
	
	@FindBy(xpath = PROFILE_FORM_ALL_TITTLES)
	private List <WebElement> allTittles;
	
	@FindBy(xpath = PROFILE_TITTLE)
	private WebElement profileTittle;
	
	@FindBy(xpath = PROFILE_FORM_BUTTON_EDIT)
	private WebElement buttonEdit;
	
	@FindBy(xpath = PROFILE_FORM_BUTTON_DELETE)
	private WebElement buttonDelete;
	
	@FindBy(xpath = PROFILE_FORM)
	private WebElement profileForm;
		
	@FindBy(xpath = PROFILE_DELETE_POPUP)
	private WebElement deletePopUpForm;
	
	@FindBy(xpath = PROFILE_POPUP_CLOSE)
	private WebElement closePopUpButton;
	
	public ViewProfilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void allTabsArePresent(){
		Reporter.log("<br><b>"+"Checking the presence of  ViewProfilePage elements"+"</b><br>");
		isElementExist( "Profile Delete Button", buttonDelete, true);
		isElementExist( "Profile Edit Button", buttonEdit, true);
		isElementExist( "Profile Tittle", profileTittle, true);
		Reporter.log("<br><br><b>"+"All  ViewProfilePage elements are present"+"</b><br>");
	}

	public void checkAllTittles(String text){
		String []textForEachElement = text.split(";");
		for(int i=0;i<textForEachElement.length;i++){
		checkElementText(textForEachElement[i], textForEachElement[i], allTittles.get(i));
		}
		
	}
	public void checkEditButton(){
		buttonEdit.click();
	}
	public void checkPopUpForm(){
		buttonDelete.click();
		deletePopUpForm.click();
		closePopUpButton.click();
	}
	
	
	
	
}
