package com.epam.testexternalpart.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.epam.testexternalpart.core.BaseTest;

public class PlaceForTestingTest extends BaseTest {

	@Test(dataProvider = "testData")
	void addNewPlaceForTesting(String universityName, String buildingName, String location, String room) {
		menuComp.clickElement(menuComp.placeForTestingButton, "Click on placeForTestingButton");
		pagePlaceForTesting.clickElement(pagePlaceForTesting.add_new_testing_place, "Click add_testing_place");
		pagePlaceForTesting.fillInput(universityName, buildingName, location, room);
		pagePlaceForTesting.clickElement(pagePlaceForTesting.add_testing_place_popup, "Click add_testing_place_popup");
		pagePlaceForTesting.checkAddingNewPlace(universityName, buildingName, location, room);
		//pagePlaceForTesting.deleteNewPlace(universityName, buildingName, location, room);		
	} 
	
	@Test(dataProvider = "testData")
	void editNewPlaceForTesting(String universityName, String buildingName, String location, String room, String editUniversityName, String editBuildingName, String editLocation, String editRoom) {
		menuComp.clickElement(menuComp.placeForTestingButton, "Click on placeForTestingButton");
		pagePlaceForTesting.editNewPlace(universityName, buildingName, location, room, editUniversityName, editBuildingName, editLocation, editRoom);	
	} 
	
	@Test(dataProvider = "testData")
	void deleteNewPlaceForTesting(String universityName, String buildingName, String location, String room) {
		menuComp.clickElement(menuComp.placeForTestingButton, "Click on placeForTestingButton");
		pagePlaceForTesting.deleteNewPlace(universityName, buildingName, location, room);		
	} 
}
