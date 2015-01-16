package com.epam.testexternalpart.screen;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubgroupPage extends Components{
	
	public static final String TITTLE = "//h1";
	public static final String TABLE = "//table[@id='table']";
	public static final String TABLE_THEAD = "//table[@id='table']//thead";
	public static final String TABLE_TBODY = "//table[@id='table']//tbody//tr";
	public static final String CRUMBS = "//div[@id='crumds']//a";
	
	@FindBy(xpath = TITTLE)
	public WebElement tittle;
	
	@FindBy(xpath = TABLE_TBODY)
	public List <WebElement> table_tbody;
	
	@FindBy(xpath = TABLE)
	public WebElement table;
	
	@FindBy(xpath = TABLE_THEAD)
	public WebElement table_thead;
	
	@FindBy(xpath = CRUMBS)
	public WebElement crumbs;
	
	public SubgroupPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void checkElementsPresent() {
		isElementExist("Tittle ", tittle, true);
		isElementExist("Subgroup table ", table, true);
		isElementExist("Table thead ", table_thead, true);
		isElementExist("Check crumb ", crumbs, true);
	}

}
