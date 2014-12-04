package com.epam.testexternalpart.screen.departments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.screen.Components;

public class AddDepartmentPage extends Components{
	
	WebDriver driver;
	public AddDepartmentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static final String NAME_INPUT = "//input[@id='departmentName']";
	public static final String EXCEL_NAME_INPUT = "//input[@id='departmentExcelName']";
	public static final String SUBMIT = "//button[@class='btn btn-primary']";
	public static final String LABEL_NAME = "//form//div[1]//label[@class='col-lg-2 control-label']";
	public static final String LABEL_EXCEL_NAME = "//form//div[2]//label[@class='col-lg-2 control-label']";
	
	@FindBy(xpath = NAME_INPUT)
	public WebElement name_input;
	
	@FindBy(xpath = EXCEL_NAME_INPUT)
	public WebElement excel_name_input;
	
	@FindBy(xpath = SUBMIT)
	public WebElement submit;
	
	@FindBy(xpath = LABEL_NAME)
	public WebElement label_name;
	
	@FindBy(xpath = LABEL_EXCEL_NAME)
	public WebElement label_excel_name;
	
	public void allTabsArePresent(){
		Reporter.log("<br><b>"+"Checking the presence of AddDepartmentPage elements"+"</b><br>");

		
		isElementExist( "AddDepartmentPage name_input", name_input, true);
		isElementExist( "AddDepartmentPage excel_name_input", excel_name_input, true);
		isElementExist( "AddDepartmentPage submit", submit, true);
		isElementExist("AddDepartmentPage label_name", label_name, true);
		isElementExist("AddDepartmentPage label_excel_name", label_excel_name, true);
		
		Reporter.log("<br><br><b>"+"All AddDepartmentPage elements are present"+"</b><br>");
	}
	
	public void addNewDepartment(String depName){
		TestReporter.writeToReportStep("Fill required fields");
		name_input.sendKeys(depName);
		excel_name_input.sendKeys("new");
		submit.click();
		isElementExist("AddDepartmentPage-label_name", label_name, false);
		
	}
	
	
}
