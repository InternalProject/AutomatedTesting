package com.epam.testexternalpart.screen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.testexternalpart.core.CheckerData;
import com.epam.testexternalpart.core.TestReporter;

public class AllSubgroupPage extends Components implements CheckerData{
	
	 public final int SHORT_TIME=1000;
	  public final int MIDDLE_TIME=5000;
	  public final int LONG_TIME=10000;
	
	public static final String TITTLE = "//h1";
	public static final String TABLE = "//table[@id='tableSubgroups']";
	public static final String TABLE_THEAD = "//table[@id='tableSubgroups']//thead//div[1]";
	public static final String TABLE_TBODY = "//table[@id='tableSubgroups']//tbody//tr";
	public static final String CHOOSE_BUTTON= "//div[@class='bootstrap-filestyle input-group']";
	public static final String IMPORT_BUTTON= "//input[@class='btn btn-primary']";
	public By pagination= By.className("fixed_rows");
	public By hr = By.cssSelector("tbody>tr:nth-child(1)");

	public static final String CRUMBS= "//div[@id='crumds']";

	@FindBy(xpath = TITTLE)
	public WebElement tittle;
	
	@FindBy(xpath = TABLE_TBODY)
	public List <WebElement> table_tbody;
	
	@FindBy(xpath = TABLE)
	public WebElement table;
	
	
	@FindBy(xpath = TABLE_THEAD)
	public WebElement table_thead;
	
	@FindBy(xpath = IMPORT_BUTTON)
	public WebElement import_button;
	
	@FindBy(xpath = CHOOSE_BUTTON)
	public WebElement choose_button;
	
	@FindBy(xpath = CRUMBS)
	public WebElement crumbs;
	
	public AllSubgroupPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}
    
	public void checkElementsPresent() {
		
		TestReporter.writeToReportStep("Check the presence of all elements on Subgroup Page");

		isElementExist("Subgroup table ", table, true);
		isElementExist("Import_button ", import_button, true);
		isElementExist("Table thead ", table_thead, true);
		isElementExist("Choose button ", choose_button, true);
		isElementExist("Pagination exists", driver.findElement(pagination), true);
		isElementExist("hr", driver.findElement(hr), true);
	//	System.out.println(driver.findElement(hr).getText()+"   $$$$$$$");

		
		TestReporter.writeToReportPositiveResult("All elements are present on Subgroup Page");	

	}

	public void clickOnSubgroups() {
		Actions actions = new Actions(driver);
		//for(WebElement e: table_tbody){
		actions.moveToElement(driver.findElement(By.xpath("//table[@id='tableSubgroups']//tbody//tr[1]"))).doubleClick().build().perform();
		//}
	}

	public void checkTextPresent(){
		
		TestReporter.writeToReportStep("Check the presence of all text on Subgroup Page");

		checkElementText("All Subgroups", "All Subgroups title", tittle);
		checkElementPartialText("Subgroups pagination", "Crumbs", crumbs);
		
		TestReporter
		.writeToReportPositiveResult("All text on Subgroup Page is present");		
	}

}
