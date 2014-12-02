package com.epam.testexternalpart.screen.departments;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.epam.testexternalpart.screen.Components;

public class Departments extends Components{
	
	WebDriver driver;
	
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
	
	private static final String DEPARTMENT_JAVA_TAB = "//ul[@id='depTab']/li[1]/a";
	private static final String DEPARTMENT_NET_TAB = "//ul[@id='depTab']/li[2]/a";
	private static final String DEPARTMENT_FRONT_AND_TAB = "//ul[@id='depTab']/li[3]/a";
	private static final String DEPARTMENT_AUTOTEST_TAB = "//ul[@id='depTab']/li[4]/a";
	private static final String DEPARTMENT_SOFTTEST_TAB = "//ul[@id='depTab']/li[5]/a";
	private static final String DEPARTMENT_EDIT_BUTONS = "//div[@id='actions']a[1]";
	private static final String DEPARTMENT_TITTLE_TEXT = "//h1[text()='Candidate Automation System']";
	
	public Departments(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = DEPARTMENT_JAVA_TAB)
	private WebElement javaTab;
	
	@FindBy(xpath = DEPARTMENT_NET_TAB)
	private WebElement netTab;
	
	@FindBy(xpath = DEPARTMENT_FRONT_AND_TAB)
	private WebElement frontandTab;
	
	@FindBy(xpath = DEPARTMENT_AUTOTEST_TAB)
	private WebElement autotestTab;
	
	@FindBy(xpath = DEPARTMENT_SOFTTEST_TAB)
	private WebElement softtestTab;

	@FindBy(xpath = DEPARTMENT_CREATE_BUTTON)
	private WebElement createDepartmentButton;
	
	@FindBy(xpath = DEPARTMENT_EDIT_BUTTON)
	private WebElement editDepartmentButton;
	
	@FindBy(xpath = DEPARTMENT_DELETE_BUTTON)
	private WebElement deleteDepartmentButton;
	
	@FindBy(xpath = DEPARTMENT_ADD_STREAM_BUTTON)
	private WebElement addStreamButton;

	@FindBy(xpath = DEPARTMENT_TABLE)
	private WebElement table;
	
	@FindBy(xpath = DEPARTMENT_TABLE_NUMBER_COLUMN)
	private WebElement tableNumberColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_STREAM_COLUMN)
	private WebElement tableStreamColumn;
	
	
	@FindBy(xpath = DEPARTMENT_TABLE_DEPARTMENT_COLUMN)
	private WebElement tableDepartmentColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_DATE_START_COLUMN)
	private WebElement tableDateStartColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_DATE_END_COLUMN)
	private WebElement tableDateEndColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_STATUS_COLUMN)
	private WebElement tableStatusColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_ACTIONS_COLUMN)
	private WebElement tableActionsColumn;
	
	@FindBy(xpath = DEPARTMENT_TABLE_ALL_EDIT_BUTTON)
	private List <WebElement> allEditButtons;
	
	@FindBy(xpath = DEPARTMENT_TABLE_ALL_DELETE_BUTTON)
	private List <WebElement> allDeleteButtons;
	
	public void clickCreateDepartmentButton(){
		 Reporter.log("<br><b>"+"Checking that Department Create Button reffering to Create Department Page"+"</b><br>");
		 createDepartmentButton.click();

	}
	
	public void allTabsArePresent(){
		Reporter.log("<br><b>"+"Checking the presence of Department's elements"+"</b><br>");

		
		isElementExist( "Department Create Button", createDepartmentButton, true);
		isElementExist( "Department Edit Button", editDepartmentButton, true);
		isElementExist( "Department Delete Button", deleteDepartmentButton, true);
		isElementExist("Department Front And TAB ", frontandTab, true);
		
		Reporter.log("<br><br><b>"+"All Departments elements are present"+"</b><br>");
	}
	
	
}
