package com.epam.testexternalpart.screen.profile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.epam.testexternalpart.core.CheckerData;
import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.screen.Components;

public class ViewProfilePage extends Components implements CheckerData{
	
	public static final String CRUMBS = "//div[@id='crumds']/a[text()='Candidates pagination>']";
	private static final String PROFILE_TITTLE = "//h3";
	private static final String PROFILE_FORM = "//ul[@class='list-group']";
	private static final String PROFILE_FORM_BUTTON_EDIT = "//form//button[@class='btn btn-primary'][text()='Edit']";
	private static final String PROFILE_FORM_BUTTON_DELETE = "//div[@class='profilePageActionButtons']/a[@class='btn btn-primary']";
	private static final String PROFILE_DELETE_POPUP  = "//div[@class='modal-content']";
	private static final String PROFILE_FORM_ALL_TITTLES = "//div[@class='container']/div/dl/dt";
	private static final String PROFILE_FORM__ALL_FIELDS = "//div[@class='container']/div/dl/dd";
	private static final String PROFILE_POPUP_CLOSE = "//form/button[@class='btn btn-default']";
	
	@FindBy(xpath = CRUMBS)
	public WebElement crumbs;
	
	@FindBy(xpath = PROFILE_FORM_ALL_TITTLES)
	private List <WebElement> allTittles;
	
	@FindBy(xpath = PROFILE_FORM__ALL_FIELDS)
	private List <WebElement> allFields;
	
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
	
	public void checkElementsPresent(){
		
		TestReporter.writeToReportStep("Check the presence of all elements on View Profile Page");
			
		isElementExist( "Crumbs", crumbs, true);
		isElementExist( "Profile Delete Button", buttonDelete, true);
		isElementExist( "Profile Edit Button", buttonEdit, true);
		
		TestReporter.writeToReportPositiveResult("All elements are present on View Profile Page");
	}
	
	public void checkTextPresent(){
		
		TestReporter.writeToReportStep("Check the presence of all text on View Profile Page");
	}

	public void checkTextPresent(String text){
		
		TestReporter.writeToReportTitle("Check the presence of all text on View Profile Page");
		
		checkElementText("Candidate profile", "Profile Tittle", profileTittle);
		
		String []textForEachElement = text.split(";");
		
		for(int i=0;i<textForEachElement.length;i++){
			checkElementText(textForEachElement[i], textForEachElement[i], allTittles.get(i));
		
		TestReporter.writeToReportPositiveResult("All text is present on View Profile Page");
		}
		
	}
	
	public void checkPopUpForm(){
		buttonDelete.click();
		deletePopUpForm.click();
		closePopUpButton.click();
	}

	public void clickEditButton() {
		
		TestReporter.writeToReportTitle("Check Candidate View Page transfering to Edit Candidate");
		buttonEdit.click();

		isElementExist("Profile Tittle", profileTittle, false);			
	}

	public void checkTextAccordingToFields(String field) {
		
		TestReporter.writeToReportTitle("Check fields on  View Profile Page according to added fields of candiadte");

		String []fields = field.split(";");
		Boolean flag = false;		
		
		for (String currentField : fields){
			for (WebElement el : allFields){			
				if (el.getText().equals(currentField))
					flag = true;
			}
		
		Assert.assertTrue(flag);
		flag = false;					
		}			
	}
}
