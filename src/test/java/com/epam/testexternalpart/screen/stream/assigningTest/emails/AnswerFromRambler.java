package com.epam.testexternalpart.screen.stream.assigningTest.emails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.testexternalpart.screen.Components;

public class AnswerFromRambler extends Components{
	
	final static String site = "https://rambler.ru/";
	final static String login = "pupkin379";
	final static String password = "pupkin379";
	
	private static final String BUTTON_INPUT = "//a[@href='https://mail.rambler.ru/?utm_source=nhp']/span";
	private static final String LOGIN = "//input[@id='login']";
	private static final String PASSWORD = "//input[@id='password']";
	private static final String BUTTON_INPUT_OK = "//button [@name='profile.send']";
	
	private static final String INPUT_BOX_ROW = "//div[@class='tableRow messageUnread']/a[@title=' (Rostyslav_Biletskyi@epam.com); ']";
	//private static final String INPUT_BOX_ROW = "//div[@class='tableRow messageUnread']/a[text() ='auto_epm-farm_kppp@epam.com']";
	private static final String INPUT_BOX = "//div[@class='ScrollBarWrap']/a[1]";
	
	private static final String CONFIRMED_ANSWER = "//div[@class='messageBody isPlainText']/a[2]";
	private static final String NOT_ACTUAL_ANSWER = "//div[@class='messageBody isPlainText']/a[3]";
	private static final String NEW_TIME_ANSWER = "//div[@class='messageBody isPlainText']/a[4]";
	
	@FindBy(xpath=BUTTON_INPUT)
	private WebElement buttonInput;
	
	@FindBy(xpath=INPUT_BOX)
	private WebElement inputBox;
	
	@FindBy(xpath=INPUT_BOX_ROW)
	private WebElement inputBoxRow;
	
	@FindBy(xpath=NEW_TIME_ANSWER)
	private WebElement newTimeAnswer;
	
	@FindBy(xpath=LOGIN)
	private WebElement loginField;
	
	@FindBy(xpath=PASSWORD)
	private WebElement passwordField;	
	
	@FindBy(xpath=BUTTON_INPUT_OK)
	private WebElement buttonSubmit;
			
	public AnswerFromRambler(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);				
	}
	
	public void logOn(){
		
		driver.get(site);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		buttonInput.click();
		loginField.sendKeys(login);
		passwordField.sendKeys(password);
		buttonSubmit.click();
	}
	
	public void enterIntoUnreadMessage(){
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		clickElement(inputBoxRow, "click inputBoxRow");
	}
	
	public void responseNewTimeAnswer(){
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		clickElement(newTimeAnswer, "click newTimeAnswer");
	}
	
}
