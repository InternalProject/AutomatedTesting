package com.epam.testexternalpart.screen.stream.assigningTest.emails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.testexternalpart.core.WebDriverFactory;
import com.epam.testexternalpart.screen.Components;

public class AnswerFromYandex extends Components{

	final static String yandex = "https://mail.yandex.ua/";
	final static String login = "vasya.pupkin379";
	final static String password = "pupkin379";
	
	//private static final String INPUT_BOX_ROW = "//span[@class='b-messages__from']/span/span[text() ='auto_epm-farm_kppp@epam.com']";
	private static final String INPUT_BOX_ROW = "//span[@class='b-messages__from__participants']/span[text()='Rostyslav_Biletskyi@epam.com']";

	private static final String CONFIRMED_ANSWER = "//div[@class='b-message-body__content']/p/a[3]";
	private static final String NOT_ACTUAL_ANSWER = "//div[@class='b-message-body__content']/p/a[4]";
	private static final String NEW_TIME_ANSWER = "//div[@class='b-message-body__content']/p/a[5]";
	
	@FindBy(xpath=INPUT_BOX_ROW)
	private WebElement inputBoxRow;
	
	@FindBy(xpath=NOT_ACTUAL_ANSWER)
	private WebElement notActualAnswer;
	
	@FindBy(xpath = "//input[@id='b-mail-domik-username11']")
	private WebElement loginField;
	
	@FindBy(xpath = "//input[@id='b-mail-domik-password11']")
	private WebElement passwordField;	
		
	@FindBy(xpath = "//input[@class='b-mail-button__button']")
	private WebElement logginButton;
	
	public AnswerFromYandex(){
		this.driver = WebDriverFactory.initDriver("chrome");
		driver.get(yandex);	
		PageFactory.initElements(driver, this);			
	}
	
	public void logOn(){
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		loginField.sendKeys(login);
		passwordField.sendKeys(password);
		clickElement(logginButton,"logginButton");
	}
	
	public void enterIntoUnreadMessage(){
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		clickElement(inputBoxRow,"inputBoxRow");		
	}
	
	public void responseNotActualAnswer(){
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		clickElement(notActualAnswer,"not Actual Answer");
		waiting(2000);
		
		driver.close();
		driver.quit();
	}
	
}
