package com.epam.testexternalpart.screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 
	WebDriver loginDriver;
	public LoginPage(WebDriver driver){
		loginDriver=driver;
		PageFactory.initElements(loginDriver, this);
	}
	
	public static final String LOGIN_INPUT = "//input[@id='exampleInputEmail1']";
	public static final String PASS_INPUT="//input[@id='exampleInputPassword1']";
	public static final String BUTTON_LOGIN="//button[@id='login_button']";
	
	@FindBy(xpath=LOGIN_INPUT)
	public WebElement login_input;
	
	@FindBy(xpath=PASS_INPUT)
	public WebElement pass_input;
	
	@FindBy(xpath=BUTTON_LOGIN)
	public WebElement button_login;
	
	public void signIn(String login, String pass){
		login_input.sendKeys(login);
		pass_input.sendKeys(pass);
		button_login.click();
	}
}
