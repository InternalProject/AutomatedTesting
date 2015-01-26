package com.epam.testexternalpart.screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Components{
 
	WebDriver loginDriver;

	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	public static final String LOGIN_INPUT = "//input[@id='exampleInputEmail1']";
	public static final String PASS_INPUT="//input[@id='exampleInputPassword1']";
	public static final String BUTTON_LOGIN="//a[@id='login_button']";
	
	public static final String INTERNAL_PART_BUTTON="";
	public static final String EXTERNAL_PART_BUTTON="//a[text()='External portal']";
	
	@FindBy(xpath=LOGIN_INPUT)
	public WebElement login_input;
	
	@FindBy(xpath=PASS_INPUT)
	public WebElement pass_input;
	
	@FindBy(xpath=BUTTON_LOGIN)
	public WebElement buttonLogin;
	
	@FindBy(xpath=EXTERNAL_PART_BUTTON)
	public WebElement externalPartButton;
	
	
	
	public void signIn(String login, String pass){
		
		login_input.sendKeys(login);
		pass_input.sendKeys(pass);
		clickElement(buttonLogin,"buttonLogin");
	}
	
	public void selectExternalPart(){
		waiting(SHORT_TIME);
		externalPartButton.click();
		
	}

	
}
