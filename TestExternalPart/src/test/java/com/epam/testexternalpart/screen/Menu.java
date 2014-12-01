package com.epam.testexternalpart.screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;
import com.epam.testexternalpart.core.WebDriverFactory;

public class Menu extends Components{
	
	private static final String HOME_BUTTON = "//ul[@class='nav navbar-nav']/li/a[@href='#'][text()='Home']";
	private static final String PROFILE_BUTTON = "//ul[@class='nav navbar-nav']/li/a[@href='#'][text()='Profile']";
	private static final String DEPARTMENT_BUTTON = "//a[contains(@href,'departments')]";
	private static final String HELP_BUTTON = "//ul[@class='nav navbar-nav']/li/a[@href='#'][text()='Help']";
	private static final String LOGOUT_BUTTON = "//ul[@class='nav navbar-nav']/li[6]/a";
	private static final String GLOBAL_SEARCH_FIELD = "//div[@class='form-group has-feedback']/input";
	
	
	@FindBy(xpath = HOME_BUTTON)
	private WebElement homeButton;
	
	@FindBy(xpath = PROFILE_BUTTON)
	private WebElement profileButton;
	
	@FindBy(xpath = DEPARTMENT_BUTTON)
	private WebElement departmentButton;
	
	@FindBy(xpath = LOGOUT_BUTTON)
	private WebElement LogOutButton;
	
	@FindBy(xpath = HELP_BUTTON)
	private WebElement helpButton;
	
	@FindBy(xpath = GLOBAL_SEARCH_FIELD)
	private WebElement globalSearchField;
	
	public Menu(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void allTabsArePresent(){
		TestReporter.writeToReportStep("Chaking all menu fields");
		isElementExist( "Department Button", departmentButton, true);
		isElementExist( "homeButton", homeButton, true);
		isElementExist( "profileButton", profileButton, true);
		isElementExist( "helpButton", helpButton, true);
		isElementExist( "LogOutButton", LogOutButton, true);
		isElementExist( "globalSearchField", globalSearchField, true);

		TestReporter.writeToReportPositiveResult("All fields are present");

	}

	
}
