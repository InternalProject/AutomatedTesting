package com.epam.testexternalpart.screen.departments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.screen.Components;

public class AddDepartmentPage extends Components{
	
	WebDriver driver;
	public AddDepartmentPage(WebDriver driver) {
		super(driver);
	}
	
	public static final String NAME_INPUT = "//input[@id='departmentName']";
	public static final String EXCEL_NAME_INPUT = "//input[@id='departmentExcelName']";
	public static final String SUBMIT = "//button[@class='btn btn-primary']";
	public static final String LABEL_NAME = "//form//div[1]//label[@class='col-lg-2 control-label']";
	public static final String LABEL_EXCEL_NAME = "//form//div[2]//label[@class='col-lg-2 control-label']";	
	public static final String LABEL_ADD_DEPARTMENT = "//form[@class='form-horizontal']/legend";
	public static final String CRUMBS = "//div[@id='crumds']/a[text()='Departments page>']";
	public static final String WRONG_NAME_MESS="//span[@id='e_name']";
	
	@FindBy(xpath = WRONG_NAME_MESS)
	public WebElement wrongMess;

	
	@FindBy(xpath = CRUMBS)
	public WebElement crumbs;
	
	@FindBy(xpath = LABEL_ADD_DEPARTMENT)
	public WebElement labelAddDepartment;
	
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
	
	public void allTextArePresent(){
		
		TestReporter.writeToReportTitle("Checking the presence of AddDepartmentPage text");
			
		checkElementText("Enter department information", "Add Department title",
				labelAddDepartment);		
		checkElementText("Department name", "New Department Name",
				label_name);
		checkElementText("Department excel name", "New Department excel Name",
				label_excel_name);
		
		TestReporter
		.writeToReportPositiveResult("All text are present on AddDepartmentPage");
	}
	
	public void allElementsArePresent(){
		
		TestReporter
		.writeToReportTitle("Checking the presence of AddDepartment's elements");
		
		isElementExist( "Crumbs", crumbs, true);
		isElementExist( "AddDepartmentPage name_input", name_input, true);
		isElementExist( "AddDepartmentPage excel_name_input", excel_name_input, true);
		isElementExist( "AddDepartmentPage submit", submit, true);
		
		TestReporter
		.writeToReportPositiveResult("All AddDepartments elements is present");
	}
	
	public void addNewDepartment(String depName){
		TestReporter.writeToReportStep("Fill required fields");
		name_input.sendKeys(depName);
		excel_name_input.sendKeys("new");
		submit.click();
		isElementExist("AddDepartmentPage-label_name", label_name, false);
		
	}

	public void addNewDepartmentCor(String depName) {
		TestReporter.writeToReportStep("Fill required fields");
		name_input.clear();
		name_input.sendKeys(depName);
		excel_name_input.clear();
		excel_name_input.sendKeys("new");
		submit.click();
		isElementExist("AddDepartmentPage-label_name", label_name, false);

	}

	public void addNewDepartmentWithInvalideName(String depName) {
		TestReporter.writeToReportStep("Fill required fields");
		name_input.sendKeys(depName);
		excel_name_input.sendKeys("new");
		submit.click();
		isElementExist("AddDepartmentPage-label_name", label_name, true);
		isElementExist("Wrong Mess", wrongMess, true);

		
	}
	
	
}
