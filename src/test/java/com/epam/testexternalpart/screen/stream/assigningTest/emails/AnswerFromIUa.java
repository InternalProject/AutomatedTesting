package com.epam.testexternalpart.screen.stream.assigningTest.emails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.epam.testexternalpart.core.WebDriverFactory;
import com.epam.testexternalpart.screen.Components;
import com.epam.testexternalpart.screen.TemplatePage;
import com.gargoylesoftware.htmlunit.WebWindow;

public class AnswerFromIUa extends Components{

	final static String iUa = "http://mbox2.i.ua/read/INBOX";
	final static String login = "pupkin379";
	final static String password = "pupkin379p";
	
	//private static final String INPUT_BOX_ROW = "//tr[@class='message unread']/td[@class='from']/a/span[text() ='auto_epm-farm_kppp@epam.com']";
	private static final String INPUT_BOX_ROW = "//div[@class='row new']/a/span[text() ='Rostyslav_Biletskyi@epam.com']";
	private static final String BODY_MESSAGE= "//div[@class='message_body']";
	
	private static final String INPUT_BOX = "//ul[@id='folderInbox']/li/a/span[@class='sidebar-item-name']";
	private static final String READ_MESSAGES = "//span[text() ='Rostyslav_Biletskyi@epam.com']";
	private static final String SETTINGS_BUTTON = "//li/span[@class='icon-ho ho_settings']";
	private static final String LOGOUT_BUTTON = "//div[@id='accountSettingsPopup']/ul/li[last()]/a";
	private static final String LOGIN = "//input[@name='login']";

	
	private static final String CONFIRMED_ANSWER = "//div[@class='message_body']/pre/a[3]";
	private static final String NOT_ACTUAL_ANSWER = "//div[@class='message_body']/pre/a[4]";
	private static final String NEW_TIME_ANSWER = "//div[@class='message_body']/pre/a[5]";
	
	@FindBy(xpath=SETTINGS_BUTTON)
	private WebElement settingsButton;
	
	@FindBy(xpath=LOGOUT_BUTTON)
	private WebElement logoutButton;
	
	@FindBy(xpath=INPUT_BOX)
	private WebElement inputBox;
	
	@FindBy(xpath=INPUT_BOX_ROW)
	private WebElement inputBoxRow;
	
	@FindBy(xpath=BODY_MESSAGE)
	private WebElement bodyMessage;
		
	@FindBy(xpath=READ_MESSAGES)
	private WebElement readMessages;
	
	@FindBy(xpath=CONFIRMED_ANSWER)
	private WebElement confirmedAnswer;
	
	@FindBy(xpath=LOGIN)
	private WebElement loginField;
	
	@FindBy(name = "pass")
	private WebElement passwordField;	
	
	@FindBy(name = "domn")
	private WebElement domainList;
	
	@FindBy(xpath = "//input[@value='Войти']")
	private WebElement logginButton;
	
	public AnswerFromIUa(){
		this.driver = WebDriverFactory.initDriver("chrome");
		driver.get(iUa);
		PageFactory.initElements(driver, this);	
	}
	
	public void logOn(){	
		
		loginField.sendKeys(login);
		passwordField.sendKeys(password);
		clickElement(logginButton,"logginButton");
	}
	
	public void enterIntoUnreadMessage(){
		
		clickElement(inputBoxRow,"inputBoxRow");		
	}
	
	public void enterIntoReadMessage(){
		
        clickElement(readMessages,"readMessages");
	}
	
	public void responseConfirmedAnswer(){
		
		clickElement(confirmedAnswer,"confirmed Answer");	
		waiting(2000);
		clickElement(settingsButton, "settingsButton");
		clickElement(logoutButton, "logoutButton");
		
		waiting(2000);

		driver.close();
		driver.quit();
	}	

	public void checkDublicateAnswerMessage() {
		
		String bodyOfMessage= bodyMessage.getText();
		String []body = bodyOfMessage.trim().split("\\s+");		
		
		String []template = TemplatePage.templateAnswerDuplication.trim().split("\\s+");		
					
		for (int i = 0; i < template.length; i++){			
			Assert.assertTrue(body[i].equals(template[i]));
		}	
		
		waiting(2000);

		driver.close();
		driver.quit();
	}
	
	
}
