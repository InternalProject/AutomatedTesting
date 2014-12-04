package com.epam.testexternalpart.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;

public class StreamTest extends BaseTest{
	
	
	
	@Test(dataProvider="testData")
	public void testAddNewStream(String text){
		
		pageDepartment.addStreamButton.click();
		System.out.println("!!! "+pageStream.mandatory_fields.size());
			String []dataMandatoryFields=text.split(";");
			//System.out.println("!!!!!!!!!! "+dataMandatoryFields.length);
			for(int i=0;i<dataMandatoryFields.length;i++){
				pageStream.mandatory_fields.get(i).sendKeys(dataMandatoryFields[i]);
			}
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Assert.assertEquals(pageDepartment.stream_table_check.getText(), "Hogwarts", "New stream not added");
		
		}
}
		


