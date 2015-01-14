package com.epam.testexternalpart.screen.departments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.testexternalpart.core.CheckerData;
import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.screen.Components;
import com.epam.testexternalpart.screen.stream.AddStreamPage;
import com.gargoylesoftware.htmlunit.WaitingRefreshHandler;

public class Departments extends Components implements CheckerData{

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
	private static final String DEPARTMENT_ALL_TABS = "//ul[@id='depTab']/li/a";	

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
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = DEPARTMENT_TABLE_ROW)
	public WebElement departmentTableRow;

	@FindBy(xpath = DEPARTMENT_TITTLE_TEXT)
	public WebElement departmentTitle;

	@FindBy(xpath = DEPARTMENT_CRUMBS)
	public WebElement departmentCrumbs;

	@FindBy(xpath = DEPARTMENT_ALL_TABS)
	public List<WebElement> allDepartmentTabs;

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
		isElementExist("javaTab", allDepartmentTabs, false);

	}

	public WebElement getlastDep() {
		
		depNumb = allDepartmentTabs.size();
		return allDepartmentTabs.get(allDepartmentTabs.size() - 1);
	}

	public void clickCreateStreamButton() {
		
		TestReporter.writeToReportTitle("Checking that Stream Create Button reffering to Add Stream Page");
		addStreamButton.click();		
		isElementExist("java Tab", allDepartmentTabs, false);
	}

	public void clickSelectedStream() {
		
		TestReporter
				.writeToReportTitle("Checking that click by selected stream reffering to Stream Page");
		
		streamName = driver.findElement(By.xpath(DEPARTMENT_ACTIVE_TAB)).getText() + 
				" - " + driver.findElement(By.xpath("//table[@id='manualTable']/tbody/tr/td[2]")).getText();
				
		clickElement(getTableEl(1,1), "First stream on first dep");
		
		isElementExist("javaTab", allDepartmentTabs, false);
	}
	
	public void clickSelectedStream(String streamName){
				
		String fullStreamName = SELECT_ADDED_STREAM_FIRST_PART+streamName+"']]"; 
		WebElement selectedStrem = driver.findElement(By.xpath(fullStreamName));
		clickElement(selectedStrem, "Select stream on Department Page");
		isElementExist("javaTab", allDepartmentTabs, false);				
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
	
	public void selectAndCheckDepartment() {
		
		TestReporter.writeToReportTitle("Checking adding Stream according to Department");
		String currentTabName;
		
		List<WebElement> allTabs = new ArrayList<WebElement>();
				
		for (int i= 0; i < allDepartmentTabs.size(); i++){
			allTabs.add(allDepartmentTabs.get(i));
		}			
			
		for (WebElement currentTab : allTabs){
			wating(2000);
			System.out.println(currentTab.getText());
			currentTabName = "'" + currentTab.getText() + "'";
			clickElement(currentTab, currentTabName + " Tab");
			clickElement(addStreamButton, "add Stream Button");
			
			new AddStreamPage(driver).checkDepartment(currentTabName);	
			allTabs = allDepartmentTabs;
		}		
	}
	
	public void checkTextPresent() {
		
		TestReporter
				.writeToReportStep("Checking the presence of all text on Department Page");

		checkElementText("Candidate Automation System", "Department title",
				departmentTitle);

		TestReporter
				.writeToReportPositiveResult("All text is present on Department Page");

	}

	public void checkElementsPresent() {
		
		TestReporter
				.writeToReportStep("Checking the presence of all elements on Department Page");

		isElementExist("allDepartmentTabs", allDepartmentTabs, true);

		isElementExist("Department Create Button", createDepartmentButton, true);
		isElementExist("Department Edit Button", editDepartmentButton, true);
		isElementExist("Department Delete Button", deleteDepartmentButton, true);
		isElementExist("Department Create Button", addStreamButton, true);

		TestReporter
				.writeToReportPositiveResult("All elements are present on Department Page");
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
