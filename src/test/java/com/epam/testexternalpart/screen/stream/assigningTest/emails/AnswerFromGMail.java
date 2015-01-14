package com.epam.testexternalpart.screen.stream.assigningTest.emails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.testexternalpart.screen.Components;

public class AnswerFromGMail extends Components{

	private WebDriver driver;	
	final static String site= "http://mail.google.com/mail/";
	final static String login = "student18844@gmail.com";
	final static String password = "javatest";
	
	private static final String INPUT_BOX_ROW = "//div[text() ='auto_epm-farm_kppp@epam.com']";
	
	private static final String CONFIRMED_ANSWER = "//div[@id='displayBody']/pre/a[2]";
	private static final String NOT_ACTUAL_ANSWER = "//div[@id='displayBody']/pre/a[3]";
	private static final String NEW_TIME_ANSWER = "//div[@id='displayBody']/pre/a[4]";
	
	@FindBy(xpath=INPUT_BOX_ROW)
	private WebElement inputBoxRow;
	
	@FindBy(xpath=CONFIRMED_ANSWER)
	private WebElement confirmedAnswer;
	
	@FindBy(name="login")
	private WebElement loginField;
	
	@FindBy(name = "pass")
	private WebElement passwordField;	
	
	@FindBy(name = "domn")
	private WebElement domainList;
	
	@FindBy(xpath = "//input[@value='Войти']")
	private WebElement logginButton;
	
	public AnswerFromGMail(WebDriver driver){
		super(driver);
			
	}
	
	public void logOn(){
		
		driver.get(site);	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		loginField.sendKeys(login);
		passwordField.sendKeys(password);
		clickElement(logginButton,"logginButton");
	}
	
	public void enterIntoUnreadMessage(){
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		clickElement(inputBoxRow,"inputBoxRow");		
	}
	
	public void responseConfirmedAnswer(){
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		clickElement(confirmedAnswer,"confirmed Answer");
	}
	
}
