package com.epam.testexternalpart.screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.testexternalpart.core.TestReporter;

public class Menu extends Components{
	
	private static final String LOGO = "//div[@id = 'profile-card']";
	private static final String HOME_BUTTON = "//ul[@class='nav navbar-nav']/li/a[@href='/KhExternalPreProdPortal/'][text()='Home']";
	private static final String PROFILE_BUTTON = "//div[@id='profile-card']";
	private static final String DEPARTMENT_BUTTON = "//a[@href='/KhExternalPreProdPortal/departments']";
	private static final String ALL_CANDIDATES_BUTTON = "//a[@href='/KhExternalPreProdPortal/candidates']";
	private static final String PLACES_FOR_TESTING_BUTTON =  "//a[@href='/KhExternalPreProdPortal/places']";
	private static final String SUBGROUP_BUTTON = "//a[@href='/KhExternalPreProdPortal/allSubgroups']";
	private static final String SEARCH_INPUT = "//input[@id='globalSearch']";
	private static final String USER = "//div[@id='profile-card']";
	
	@FindBy(xpath = LOGO)
	private WebElement logo;
	
	@FindBy(xpath = HOME_BUTTON)
	private WebElement homeButton;
	
	@FindBy(xpath = PROFILE_BUTTON)
	private WebElement profileButton;
	
	@FindBy(xpath = DEPARTMENT_BUTTON)
	private WebElement departmentButton;
	
	@FindBy(xpath = ALL_CANDIDATES_BUTTON)
	public WebElement allCandidatesButton;
	
	@FindBy(xpath = PLACES_FOR_TESTING_BUTTON)
	public WebElement placeForTestingButton;
	
	@FindBy(xpath = SUBGROUP_BUTTON)
	private WebElement subgroupsButton;
	
	@FindBy(xpath = SEARCH_INPUT)
	public WebElement searchInput;
	
	@FindBy(xpath = USER)
	private WebElement userButton;
	
	public Menu(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	public void checkElementsPresent() {
		TestReporter.writeToReportTitle("Checking the presence of Menu's elements");

		isElementExist( "logo", logo, true);
		isElementExist( "homeButton", homeButton, true);
		isElementExist( "profileButton", profileButton, true);
		isElementExist( "Department Button", departmentButton, true);
		isElementExist( "all Candidates Button", allCandidatesButton, true);
		isElementExist( "placeForTestingButton", placeForTestingButton, true);
		isElementExist( "subgroupsButton", subgroupsButton, true);
		isElementExist( "searchInput", searchInput, true);
		isElementExist( "suserButton", userButton, true);
		
		TestReporter.writeToReportPositiveResult("All Menu's elements are present");
		
	}

	
}
