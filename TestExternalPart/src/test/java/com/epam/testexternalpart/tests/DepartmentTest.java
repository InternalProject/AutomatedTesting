package com.epam.testexternalpart.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.WebDriverFactory;
import com.epam.testexternalpart.screen.Departments;


public class DepartmentTest extends BaseTest{

	
	
	@Test
	public void testClickCreateDepartmentButton(){
		driver.get("http://epuakhaw0162:8080/KhExternalPreProdPortal/departments;jsessionid=EB817D480A1E1850E59B88F52A9733CA");
		department.allTabsArePresent();
		department.clickCreateDepartmentButton();
		
		Assert.assertEquals(1, 1, "true!!!");
	}

	@Override
	public void setUp() {
		// TODO Auto-generated method stub
		
	}

	

}
