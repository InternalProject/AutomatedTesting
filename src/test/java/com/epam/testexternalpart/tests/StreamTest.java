package com.epam.testexternalpart.tests;

import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;

public class StreamTest extends BaseTest {

	@Test(dataProvider = "testData")
	public void testAddNewValidStream(String name) {
		//pageDepartment.clickElement(pageDepartment.addStreamButton, "add stream button");
		TestReporter.writeToReportHeader("Check the possibility of adding new stream with valid name");
		pageDepartment.clickElement(pageDepartment.addStreamButton, "AddStreamButton");
		pageAddStream.fillAddStreamInput(name);
		pageDepartment.deleteAddedStream(name);
	}
	
	@Test (dataProvider = "testData")
	public void testAddNewInValidStream(String name) {
		TestReporter.writeToReportHeader("Check the possibility of adding with invalid name");
		pageDepartment.clickElement(pageDepartment.addStreamButton,"AddStreamButton");
		pageAddStream.fillAddStreamInput(name);
		pageAddStream.chekStreamPageOpen();
	}
	
	@Test (dataProvider = "testData")
	public void testEditStream(String name) {
		TestReporter.writeToReportHeader("Check the possibility of editingh stream");
		pageDepartment.clickElement(pageDepartment.addStreamButton,"addStreamButton");
		pageAddStream.fillAddStreamInput(name);
		pageAddStream.chekStreamPageOpen();
	}
}
