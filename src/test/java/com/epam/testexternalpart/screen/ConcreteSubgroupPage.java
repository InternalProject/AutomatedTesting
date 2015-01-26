package com.epam.testexternalpart.screen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConcreteSubgroupPage extends Components{
	
	public static final String DROP_DOWN_LIST_SIGN ="//select[@id='tests']";
	public static final String TITTLE = "//h1";
	public static final String TABLE = "//table[@id='table']";
	public static final String TABLE_THEAD = "//table[@id='table']//thead";
	public static final String TABLE_TBODY = "//table[@id='table']//tbody//tr";
	public static final String CRUMBS = "//div[@id='crumds']//a";
	public static final String ASSIGN_BUTTON= "//a[@id='assign']";
	public static final String MODAL_DIALOG= "//div[@class='modal_dialog']";
	public static final String MODAL_DIALOG_RADIO_SAVE_TO_HARD_DRIVE= "//div[@class='modal-body']/input[2]";
	public static final String MODAL_DIALOG_RADIO_EMAIL= "//div[@class='modal-body']/input[1]";
	public static final String GENERATE_BUTTON ="//button[@id='generate']";
	public static final String CLOSE_BUTTON = "//div[@class='profilePageActionButtons']/button[1]";
	
	@FindBy(xpath = MODAL_DIALOG_RADIO_SAVE_TO_HARD_DRIVE)
	public WebElement modal_dialog_radio_save_to_hard_drive;
	
	@FindBy(xpath = MODAL_DIALOG_RADIO_EMAIL)
	public WebElement modal_dialog_radio_email;
	
	@FindBy(xpath = GENERATE_BUTTON)
	public WebElement generate_button;
	
	@FindBy(xpath = CLOSE_BUTTON)
	public WebElement close_button;
	
	@FindBy(xpath = MODAL_DIALOG)
	public WebElement modal_dialog;
	
	@FindBy(xpath = ASSIGN_BUTTON)
	public WebElement assign_button;
	
	@FindBy(xpath = DROP_DOWN_LIST_SIGN)
	public WebElement drop_down_list_sign;
	
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
	
	public ConcreteSubgroupPage(WebDriver driver){
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
