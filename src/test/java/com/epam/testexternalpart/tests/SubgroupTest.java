package com.epam.testexternalpart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;
import com.epam.testexternalpart.core.TestReporter;

public class SubgroupTest extends BaseTest {

	@Test
	public void checkCreateSubgroupTest() {
		menuComp.clickElement(menuComp.settingsButton,"Click on settingsButton");
		menuComp.clickElement(menuComp.subgroupsButton,"Click on subgroupsButton");
		 Actions actions = new Actions(driver);
		System.out.println(" Size:  "+pageAllSubgroup.table_tbody.size());
		if(pageAllSubgroup.table_tbody.size()==1){
			pageAllSubgroup.isElementExist("Table is empty.", pageAllSubgroup.empty_table_tbody, true);
			pageAllSubgroup.checkElementText("No matching records found",  "No matching records found",  pageAllSubgroup.empty_table_tbody);
		}
		else{
		pageAllSubgroup.waiting(pageAllSubgroup.MIDDLE_TIME);
		 WebElement e= driver.findElement(By.xpath("//table[@id='tableSubgroups']//tbody//tr[1]"));
		pageAllSubgroup.waiting(pageAllSubgroup.MIDDLE_TIME);
		 actions.moveToElement(e).doubleClick().build().perform();
		pageAllSubgroup.waiting(pageAllSubgroup.MIDDLE_TIME);
		TestReporter.writeToReportPositiveResult("Check each subgroup on Separtment Page is exist");
		pageConcreteSubgroup.clickElement(pageConcreteSubgroup.drop_down_list_sign, "Choose test");
		pageConcreteSubgroup.clickElement(pageConcreteSubgroup.drop_down_list_sign, "Choose test");
		pageAllSubgroup.waiting(pageAllSubgroup.MIDDLE_TIME);
		pageConcreteSubgroup.clickElement(pageConcreteSubgroup.assign_button, "Click 'Assign' button");
		pageAllSubgroup.waiting(pageAllSubgroup.SHORT_TIME);
		pageConcreteSubgroup.isElementExist("modal-dialog", pageConcreteSubgroup.modal_dialog, true);
		pageConcreteSubgroup.clickElement(pageConcreteSubgroup.modal_dialog_radio_save_to_hard_drive, "Choose store location");
		}
	}

}
