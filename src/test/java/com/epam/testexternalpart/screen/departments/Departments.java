package com.epam.testexternalpart.screen.departments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.screen.Components;
import com.epam.testexternalpart.screen.stream.AddStreamPage;

public class Departments extends Components {

	public static String streamName;
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

	private static final String DEPARTMENT_ACTIVE_TAB = "//li[@class='active']/a";
	private static final String DEPARTMENT_ALL_DEP = "//ul[@id='depTab']/li/a";
	private static final String DEPARTMENT_JAVA_TAB = "//ul[@id='depTab']/li[1]/a";
	private static final String DEPARTMENT_NET_TAB = "//ul[@id='depTab']/li[2]/a";
	private static final String DEPARTMENT_FRONT_AND_TAB = "//ul[@id='depTab']/li[3]/a";
	private static final String DEPARTMENT_AUTOTEST_TAB = "//ul[@id='depTab']/li[4]/a";
	private static final String DEPARTMENT_SOFTTEST_TAB = "//ul[@id='depTab']/li[5]/a";
	private static final String DEPARTMENT_TITTLE_TEXT = "//h1[text()='Candidate Automation System']";
	public int depNumb;
	private static final String POP_AP_DEL="//div [@class='modal-dialog']";
	private static final String DEPARTMENT_DELETE_BUTTON_ON_POPAP = "//div[@class='modal-footer']/a";
	private static final String DEPARTMENT_CRUMBS = "//div[@id='crumds']";
	private static final String DEPARTMENT_TABLE_ROW = "//table[@id='manualTable']/tbody/tr[1]/td/a";
	private static final String TABLE_EL="//tbody//tr[%s]//td[%s]";
	public static final String DELETE_ADDED_STREAM_FIRST_PART = "//tr[td[text()='";
	public static final String DELETE_ADDED_STREAM_SECOND_PART = "']]//a[@class='btn btn-sm disabled-click btn-warning']";
	public static final String POPUP = "//div[@class='modal-content disabled-click']";
	
	public static final String SELECT_ADDED_STREAM_FIRST_PART = "//tr[td[text()='";
		
	public static final String SECOND_STREAM = "//tbody/tr[2]";
	public static final String FIRST_STREAM = "//tbody/tr[1]";
	public static final String FIRST_STREAM_NAME = "//tbody/tr[1]/td[2]";
	
	@FindBy(xpath = FIRST_STREAM_NAME)
	public WebElement first_stream_name;
	
	@FindBy(xpath = SECOND_STREAM)
	public WebElement second_stream;
	
	@FindBy(xpath = FIRST_STREAM)
	public WebElement first_stream;
	
	@FindBy(xpath = POPUP)
	public WebElement popup;
	
	@FindBy(xpath = POP_AP_DEL)
	public WebElement delDepPopAp;
	
	@FindBy(xpath = DEPARTMENT_DELETE_BUTTON_ON_POPAP)
	public WebElement delDepPopApButton;

	
	public Departments(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = DEPARTMENT_TABLE_ROW)
	public WebElement departmentTableRow;

	@FindBy(xpath = DEPARTMENT_TITTLE_TEXT)
	public WebElement departmentTitle;

	@FindBy(xpath = DEPARTMENT_CRUMBS)
	public WebElement departmentCrumbs;

	@FindBy(xpath = DEPARTMENT_ALL_DEP)
	public List<WebElement> allDep;

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
	public List<WebElement> allEditButtons;

	@FindBy(xpath = DEPARTMENT_TABLE_ALL_DELETE_BUTTON)
	public List<WebElement> allDeleteButtons;
	
	
	public void clickCreateDepartmentButton() {

		TestReporter
				.writeToReportTitle("Checking that Department Create Button reffering to Create Department Page");
		createDepartmentButton.click();
		isElementExist("javaTab", javaTab, false);

	}

	public WebElement getlastDep() {
		depNumb = allDep.size();
		return allDep.get(allDep.size() - 1);
	}

	public void clickCreateStreamButton() {
		TestReporter
				.writeToReportTitle("Checking that Stream Create Button reffering to Add Stream Page");
		addStreamButton.click();
		
		isElementExist("java Tab", javaTab, false);
	}

	public void clickSelectedStream() {
		TestReporter
				.writeToReportTitle("Checking that click by selected stream reffering to Stream Page");
		
		streamName = driver.findElement(By.xpath(DEPARTMENT_ACTIVE_TAB)).getText() + 
				" - " + driver.findElement(By.xpath("//table[@id='manualTable']/tbody/tr/td[2]")).getText();
		System.out.println(streamName);
				
		clickElement(getTableEl(1,1), "First stream on first dep");
		
		isElementExist("javaTab", javaTab, false);
	}
	
	public void clickSelectedStream(String streamName){
				
		String fullStreamName = SELECT_ADDED_STREAM_FIRST_PART+streamName+"']]"; 
		WebElement selectedStrem = driver.findElement(By.xpath(fullStreamName));
		clickElement(selectedStrem, "Select stream on Department Page");
		isElementExist("javaTab", javaTab, false);				
	}
	
	public void checkDepartment(WebElement curentTab){
		
		String curentDepartment = "'" + curentTab.getText() + "'";
		TestReporter
		.writeToReportTitle("Checking adding Stream according to Department " + curentDepartment);
		curentTab.click();				
		
		addStreamButton.click();
		new AddStreamPage(driver).checkDepartment(curentDepartment);
		TestReporter
		.writeToReportPositiveResult("Stream ia viewed acoording to Department");
		
	}
	
	public void checkAddStreamPageInDepartmentJava() {
		
		checkDepartment(javaTab);
	}
	
	public void checkAddStreamPageInDepartmentNet() {
		
		checkDepartment(netTab);
	}
	
	public void checkAddStreamPageInDepartmentFrontEnd() {
		
		checkDepartment(frontandTab);
	}
	
	public void checkAddStreamPageInDepartmentAutoTest() {
		
		checkDepartment(autotestTab);
	}
	
	public void checkAddStreamPageInDepartmentSofttest() {
		
		checkDepartment(softtestTab);
	}
	
	public void allTextArePresent() {
		TestReporter
				.writeToReportTitle("Checking the presence of Department's text");

		checkElementText("Candidate Automation System", "Department title",
				departmentTitle);

		TestReporter
				.writeToReportPositiveResult("All Departments text are present");

	}

	public void allElementsArePresent() {
		TestReporter
				.writeToReportTitle("Checking the presence of Department's elements");

		isElementExist("Java Tab", javaTab, true);
		isElementExist(".Net Tab", javaTab, true);
		isElementExist("Front End Tab", javaTab, true);
		isElementExist("Automated Testing Tab", javaTab, true);
		isElementExist("Software Testing Tab", javaTab, true);

		isElementExist("Department Create Button", createDepartmentButton, true);
		isElementExist("Department Edit Button", editDepartmentButton, true);
		isElementExist("Department Delete Button", deleteDepartmentButton, true);
		isElementExist("Department Create Button", addStreamButton, true);

		TestReporter
				.writeToReportPositiveResult("All Departments elements is present");

	}

	public WebElement getTableEl(int numOfRow,int numOfCol) {
			String s =String.format(TABLE_EL, numOfRow,numOfCol);
			return driver.findElement(By.xpath(s));
	}

	public void deleteAddedStream(String name) {
		String deleteAdded = DELETE_ADDED_STREAM_FIRST_PART+name+DELETE_ADDED_STREAM_SECOND_PART; 
		WebElement del_button = driver.findElement(By.xpath(deleteAdded));
		clickElement(del_button, "Delete strem button in Department Page");
		isElementExist("Del pop up", popup, true);
		String confirmPopUp = "//tr[td[text()='"+name+"']]//div[@class='btn-toolbar disabled-click']//div[@class='modal-footer disabled-click']/a";
		WebElement confirmPopUpButton = driver.findElement(By.xpath(confirmPopUp));
		clickElement(confirmPopUpButton, "Delete confirmation");		
		
	}

}
