package com.epam.testexternalpart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;

public class StreamTest extends BaseTest {

	@Test(dataProvider = "testData")
	public void testAddNewValidStream(String name) {
		//pageDepartment.clickElement(pageDepartment.addStreamButton, "add stream button");
		pageDepartment.addStreamButton.click();
		pageAddStream.fillAddStreamInput(name);
		pageDepartment.deleteAddedStream(name);
	}
	
	@Test (dataProvider = "testData")
	public void testAddNewInValidStream(String name) {
		pageDepartment.addStreamButton.click();
		pageAddStream.fillAddStreamInput(name);
		Assert.assertTrue(pageAddStream.chekStreamPageOpen(), "There is not Stream Page");
	}
	
	@Test (dataProvider = "testData")
	public void testEditStream(String name) {
		pageDepartment.addStreamButton.click();
		pageAddStream.fillAddStreamInput(name);
		Assert.assertTrue(pageAddStream.chekStreamPageOpen(), "There is not Stream Page");
	}
}
