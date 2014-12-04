package com.epam.testexternalpart.screen.departments;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.screen.Components;

public class Departments extends Components{
	

	private static final String DEPARTMENT_CREATE_BUTTON = "//div[@class='btn-toolbar']/a[1]";
	private static final String DEPARTMENT_EDIT_BUTTON = "//div[@class='btn-toolbar']/a[2]";
	private static final String DEPARTMENT_DELETE_BUTTON = "//div[@class='btn-toolbar']/a[3]";
	private static final String DEPARTMENT_ADD_STREAM_BUTTON = "//div[@class='btn-group']/a";
	private static final String DEPARTMENT_TABLE = "//table[@id='manualTable']";
	
	private static final String DEPARTMENT_TABLE_NUMBER_COLUMN = "//table[@id='manualTable']//th[1]";
	private static final String DEPARTMENT_TABLE_STREAM_COLUMN = "//table[@id='manualTable']//th[2]";
	private static final String DEPARTMENT_TABLE_DEPARTMENT_COLUMN = "//table[@id='manualTable']//th[3]";
	private static final String DEPARTMENT_TABLE_DATE_START_COLUMN = "//table[@id='manualTable']//th[4]";
	private static final String DEPARTMENT_TABLE_DATE_END_COLUMN = "//table[@id='manualTable']//th[5]";
	private static final String DEPARTMENT_TABLE_STATUS_COLUMN = "//table[@id='manualTable']//th[6]";
	private static final String DEPARTMENT_TABLE_ACTIONS_COLUMN = "//table[@id='manualTable']//th[7]";
	
	private static final String DEPARTMENT_TABLE_ALL_EDIT_BUTTON = "//table[@id='manualTable']//tr//td[7]//a[1]";
	private static final String DEPARTMENT_TABLE_ALL_DELETE_BUTTON = "//table[@id='manualTable']//tr//td[7]//a[2]";
	
	
	private static final String DEPARTMENT_ALL_DEP = "//ul[@id='depTab']/li/a";
	private static final String DEPARTMENT_JAVA_TAB = "//ul[@id='depTab']/li[1]/a";
	private static final String DEPARTMENT_NET_TAB = "//ul[@id='depTab']/li[2]/a";
	private static final String DEPARTMENT_FRONT_AND_TAB = "//ul[@id='depTab']/li[3]/a";
	private static final String DEPARTMENT_AUTOTEST_TAB = "//ul[@id='depTab']/li[4]/a";
	private static final String DEPARTMENT_SOFTTEST_TAB = "//ul[@id='depTab']/li[5]/a";
	private static final String DEPARTMENT_EDIT_BUTONS = "//div[@id='actions']a[1]";
	private static final String DEPARTMENT_TITTLE_TEXT = "//h1[text()='Candidate Automation System']";
	public int depNumb;
	private static final String DEPARTMENT_DELETE_BUTTON_ON_POPAP = "//div[@class='modal-footer']/a";
	
	public Departments(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = DEPARTMENT_ALL_DEP)
	public List<WebElement> allDep;
	
	@FindBy(xpath = DEPARTMENT_DELETE_BUTTON_ON_POPAP)
	public WebElement delDepPopAp;
	
	@FindBy(xpath = DEPARTMENT_JAVA_TAB)
	public WebElement javaTab;
	
	@FindBy(xpath = DEPARTMENT_NET_TAB)
	public WebElement netTab;
	
	@FindBy(xpath = DEPARTMENT_FRONT_AND_TAB)
	public WebElement frontandTab;
	
	@FindBy(xpath = DEPARTMENT_AUTOTEST_TAB)
	public WebElement autotestTab;
	
	@FindBy(xpath = DEPARTMENT_SOFTTEST_TAB)
	public WebElement softtestTab;

	@FindBy(xpath = DEPARTMENT_CREATE_BUTTON)
	public WebElement createDepartmentButton;
	
	@FindBy(xpath = DEPARTMENT_EDIT_BUTTON)
	public WebElement editDepartmentButton;
	
	@FindBy(xpath = DEPARTMENT_DELETE_BUTTON)
	public WebElement deleteDepartmentButton;
	
	@FindBy(xpath = DEPARTMENT_ADD_STREAM_BUTTON)
	public WebElement addStreamButton;

	@FindBy(xpath = DEPARTMENT_TABLE)
	public WebElement table;
	
	@FindBy(xpath = DEPARTMENT_TABLE_NUMBER_COLUMN)
	public WebElement tableNumberColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_STREAM_COLUMN)
	public WebElement tableStreamColumn;
	
	
	@FindBy(xpath = DEPARTMENT_TABLE_DEPARTMENT_COLUMN)
	public WebElement tableDepartmentColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_DATE_START_COLUMN)
	public WebElement tableDateStartColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_DATE_END_COLUMN)
	public WebElement tableDateEndColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_STATUS_COLUMN)
	public WebElement tableStatusColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_ACTIONS_COLUMN)
	public WebElement tableActionsColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_ALL_EDIT_BUTTON)
	public List <WebElement> allEditButtons;
	
	@FindBy(xpath = DEPARTMENT_TABLE_ALL_DELETE_BUTTON)
	public List <WebElement> allDeleteButtons;
	
	public void clickCreateDepartmentButton(){
		
		 TestReporter.writeToReportTitle("Checking that Department Create Button reffering to Create Department Page");
		 createDepartmentButton.click();
		 isElementExist("javaTab",javaTab,false);

	}
	
	public WebElement getlastDep(){
		depNumb=allDep.size();
		return allDep.get(allDep.size()-1);
		
	}
	
	
	public void clickCreateStreamButton(){
		TestReporter.writeToReportTitle("Checking that Stream Create Button reffering to Stream Page");
		 addStreamButton.click();
		 isElementExist("javaTab",javaTab,false);
	}
	
	public void allTabsArePresent(){
		TestReporter.writeToReportTitle("Checking the presence of Department's elements");

		
		isElementExist( "Department Create Button", createDepartmentButton, true);
		isElementExist( "Department Edit Button", editDepartmentButton, true);
		isElementExist( "Department Delete Button", deleteDepartmentButton, true);
		isElementExist("Department Front And TAB ", frontandTab, true);
		
		TestReporter.writeToReportPositiveResult("All Departments elements are present");
		
	}
	
	
}
