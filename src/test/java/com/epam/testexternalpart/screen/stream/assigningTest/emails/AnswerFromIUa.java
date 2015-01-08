package com.epam.testexternalpart.screen.stream.assigningTest.emails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.epam.testexternalpart.core.WebDriverFactory;
import com.epam.testexternalpart.screen.Components;

public class AnswerFromIUa extends Components{

	final static String iUa = "http://mbox2.i.ua/read/INBOX";
	final static String login = "pupkin379";
	final static String password = "pupkin379p";
	
	String templateDublicateAnswer = "Уважаемый кандидат! "
			+ "Хотим Вам напомнить, что вы уже отвечали на письмо от EPAM Training Center. " 
			+ "К сожалению, Вы не можете изменить предыдущий ответ. "
			+ "Если у Вас возникли вопросы или Вы хотите пройти тестирование"
			+ " в другой день, Вы можете связаться с нами по указанным ниже контактам: "
			+ "Ирина Савченко "
			+ "Skype: iryna.savchenko1006 "
			+ "E-mail: Iryna_Savchenko@epam.com";
	
	//private static final String INPUT_BOX_ROW = "//tr[@class='message unread']/td[@class='from']/a/span[text() ='auto_epm-farm_kppp@epam.com']";
	private static final String INPUT_BOX_ROW = "//div[@class='row new']/a/span[text() ='Rostyslav_Biletskyi@epam.com']";
	private static final String BODY_MESSAGE= "//div[@class='message_body']";
	
	private static final String INPUT_BOX = "//ul[@id='folderInbox']/li/a/span[@class='sidebar-item-name']";
	private static final String READ_MESSAGES = "//a/span[text()='Rostyslav_Biletskyi@epam.com']";
	
	
	private static final String CONFIRMED_ANSWER = "//div[@class='message_body']/pre/a[2]";
	private static final String NOT_ACTUAL_ANSWER = "//div[@class='message_body']/pre/a[3]";
	private static final String NEW_TIME_ANSWER = "//div[@class='message_body']/pre/a[4]";
	
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
	
	@FindBy(name="login")
	private WebElement loginField;
	
	@FindBy(name = "pass")
	private WebElement passwordField;	
	
	@FindBy(name = "domn")
	private WebElement domainList;
	
	@FindBy(xpath = "//input[@value='Войти']")
	private WebElement logginButton;
	
	public AnswerFromIUa(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);			
	}
	
	public void logOn(){
		
		driver.navigate().to(iUa);
		
		loginField.sendKeys(login);
		passwordField.sendKeys(password);
		clickElement(logginButton,"logginButton");
	}
	
	public void enterIntoUnreadMessage(){
		
		clickElement(inputBoxRow,"inputBoxRow");
	}
	
	public void enterIntoReadMessage(){
		
		clickElement(readMessages, "click readMessages");
	}
	
	public void responseConfirmedAnswer(){
		
		clickElement(confirmedAnswer,"confirmed Answer");
		
	}	

	public void checkDublicateAnswerMessage() {
		
		String bodyOfMessage= bodyMessage.getText();
		String []body = bodyOfMessage.trim().split("\\s+");
		String []template = templateDublicateAnswer.trim().split("\\s+");		
		
		for (int i = 0; i < body.length; i++){			
			Assert.assertTrue(body[i].equals(template[i]));
		}		
			}
	
	
}
