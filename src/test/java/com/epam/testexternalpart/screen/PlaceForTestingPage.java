package com.epam.testexternalpart.screen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PlaceForTestingPage extends Components{
	
	public String actualUniversityName;
	public String actualBuildingName;
	public String actualLocation;
	public String actualRoom;
	
	public static final String ADD_NEW_TESTING_PLACE = "//div[@class='btn-group']//a[1]";
	public static final String EDIT_TESTING_PLACE = "//div[@class='btn-group']//a[2]";
	public static final String DELETE_TESTING_PLACE = "//div[@class='btn-group']//a[3]";
	public static final String ADD_TESTING_PLACE_POPUP = "//div[@id='addPlace']//button[@class='btn btn-primary']";
	public static final String UNIVERSITY_POPUP = "//div[@id='addPlace']//input[@id='universityName']";
	public static final String BUILDING_POPUP = "//div[@id='addPlace']//input[@id='buildingName']";
	public static final String LOCATION_POPUP = "//div[@id='addPlace']//input[@id='mapUrl']";
	public static final String ROOM_POPUP = "//div[@id='addPlace']//input[@id='roomName']";
	private static final String ALL_PLACES ="//tbody/tr";
	private static final String CHECKBOX = "./td[@class='bs-checkbox']/input[@name='btSelectItem']";
	private static final String DELETE_BUTTON_IN_POP_UP = "//div[@id='deletePlace']//button[@id='delete_place']";
	private static final String EDIT_BUTTON_IN_POP_UP = "//div[@id='editPlace']//div[@class='profilePageActionButtons']//button[2]";
	private static final String EDIT_UNIVERSITY_IN_POP_UP = "//input[@id='universityNameEdit']";
	private static final String EDIT_BUILDING_IN_POP_UP = "//input[@id='buildingNameEdit']";
	private static final String EDIT_LOCATION_IN_POP_UP = "//input[@id='mapUrlEdit']";
	private static final String EDIT_ROOM_IN_POP_UP = "//input[@id='roomNameEdit']";
	
	public By checkbox = By.name("btSelectItem");
	public By deletePopUp = By.id("delete_place");
	
	@FindBy(xpath = EDIT_UNIVERSITY_IN_POP_UP)
	public WebElement edit_university_in_pop_up;
	
	@FindBy(xpath = EDIT_BUILDING_IN_POP_UP)
	public WebElement edit_building_in_pop_up;
	
	@FindBy(xpath = EDIT_LOCATION_IN_POP_UP)
	public WebElement edit_location_in_pop_up;
	
	@FindBy(xpath = EDIT_ROOM_IN_POP_UP)
	public WebElement edit_room_in_pop_up;
	
	@FindBy(xpath = DELETE_BUTTON_IN_POP_UP)
	public WebElement delete_button_in_pop_up;
	
	@FindBy(xpath = EDIT_BUTTON_IN_POP_UP)
	public WebElement edit_button_in_pop_up;
	
	@FindBy(xpath = ALL_PLACES)
	public List <WebElement> all_places;
	
	@FindBy(xpath = ADD_NEW_TESTING_PLACE)
	public WebElement add_new_testing_place;
	
	@FindBy(xpath = EDIT_TESTING_PLACE)
	public WebElement edit_testing_place;
	
	@FindBy(xpath = DELETE_TESTING_PLACE)
	public WebElement delete_testing_place;
	
	@FindBy(xpath = ADD_TESTING_PLACE_POPUP)
	public WebElement add_testing_place_popup;
	
	@FindBy(xpath = UNIVERSITY_POPUP)
	public WebElement university_popup;
	
	@FindBy(xpath = BUILDING_POPUP)
	public WebElement building_popup;
	
	@FindBy(xpath = LOCATION_POPUP)
	public WebElement location_popup;
	
	@FindBy(xpath = ROOM_POPUP)
	public WebElement room_popup;
	
	
	public PlaceForTestingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}


	public void fillInput(String universityName, String buildingName,
			String location, String room) {
	
		
		university_popup.sendKeys(universityName);
		building_popup.clear();
		building_popup.sendKeys(buildingName);
		location_popup.clear();
		
		
		
		location_popup.sendKeys(location);
		
		room_popup.clear();
		room_popup.sendKeys(room);
		
		
	}


	public void checkAddingNewPlace(String universityName, String buildingName, String location, String room) {
		for(WebElement e:all_places){
			try{
				actualUniversityName = e.findElement(By.xpath("./td[2]")).getText();
				System.out.println("actualUniversityName  "+ actualUniversityName);
				actualBuildingName = e.findElement(By.xpath("./td[3]")).getText();
				System.out.println("actualBuildingName  "+ actualBuildingName);
				actualLocation = e.findElement(By.xpath("./td[5]")).getText();
				System.out.println("actualLocation  "+ actualLocation);
				actualRoom = e.findElement(By.xpath("./td[4]")).getText();
				System.out.println("actualRoom  "+ actualRoom);
				System.out.println("!!!  "+ (actualUniversityName.equals(universityName) & actualBuildingName.equals(buildingName) & actualLocation.equals(location) & actualRoom.equals(room)));
				if((actualUniversityName.equals(universityName) & actualBuildingName.equals(buildingName) & actualLocation.equals(location) & actualRoom.equals(room))){
					System.out.println("111111111111111");
				}
				else
					System.out.println("222222222222222222");
				//	Assert.assertEquals(true, (actualUniversityName.equals(universityName) & actualBuildingName.equals(buildingName) & actualLocation.equals(location) & actualRoom.equals(room)),"New adding place exist.");
			}
			catch(StaleElementReferenceException ex){
				
			}
		}
		
	}


	public void deleteNewPlace(String universityName, String buildingName, String location, String room) {
		for(WebElement e:all_places){
			try{
				actualUniversityName = e.findElement(By.xpath("./td[2]")).getText();
				System.out.println("actualUniversityName  "+ actualUniversityName);
				actualBuildingName = e.findElement(By.xpath("./td[3]")).getText();
				System.out.println("actualBuildingName  "+ actualBuildingName);
				actualLocation = e.findElement(By.xpath("./td[5]")).getText();
				System.out.println("actualLocation  "+ actualLocation);
				actualRoom = e.findElement(By.xpath("./td[4]")).getText();
				System.out.println("actualRoom  "+ actualRoom);
				System.out.println("!!!  "+ (actualUniversityName.equals(universityName) & actualBuildingName.equals(buildingName) & actualLocation.equals(location) & actualRoom.equals(room)));
				if((actualUniversityName.equals(universityName) & actualBuildingName.equals(buildingName) & actualLocation.equals(location) & actualRoom.equals(room))){
					System.out.println("111111111111111");
					clickElement(e.findElement(checkbox), "Click on checkbox");
					clickElement(delete_testing_place, "Click on delete_testing_place button");
					clickElement(delete_button_in_pop_up,"Click on delete button in pop up");
				}
				//else
					//Assert.assertEquals(true, (actualUniversityName.equals(universityName) & actualBuildingName.equals(buildingName) & actualLocation.equals(location) & actualRoom.equals(room)),"New adding place exist.");
								}
			catch(StaleElementReferenceException ex){
				
			}
		}
	}


	public void editNewPlace(String universityName, String buildingName, String location, String room, String editUniversityName, String editBuildingName, String editLocation, String editRoom) {
		for(WebElement e:all_places){
			try{
				actualUniversityName = e.findElement(By.xpath("./td[2]")).getText();
				System.out.println("actualUniversityName  "+ actualUniversityName);
				actualBuildingName = e.findElement(By.xpath("./td[3]")).getText();
				System.out.println("actualBuildingName  "+ actualBuildingName);
				actualLocation = e.findElement(By.xpath("./td[5]")).getText();
				System.out.println("actualLocation  "+ actualLocation);
				actualRoom = e.findElement(By.xpath("./td[4]")).getText();
				System.out.println("actualRoom  "+ actualRoom);
				System.out.println("!!!  "+ (actualUniversityName.equals(universityName) & actualBuildingName.equals(buildingName) & actualLocation.equals(location) & actualRoom.equals(room)));
				if((actualUniversityName.equals(universityName) & actualBuildingName.equals(buildingName) & actualLocation.equals(location) & actualRoom.equals(room))){
					System.out.println("111111111111111");
					clickElement(e.findElement(checkbox), "Click on checkbox");
					clickElement(edit_testing_place, "Click on edit_testing_place button");
					//fillInput(editUniversityName,editBuildingName,editLocation,editRoom);
					//edit_university_in_pop_up.clear();
					edit_university_in_pop_up.sendKeys(editUniversityName);
					edit_building_in_pop_up.clear();
					edit_building_in_pop_up.sendKeys(editBuildingName);
					edit_location_in_pop_up.clear();
					
					
					
					edit_location_in_pop_up.sendKeys(editLocation);
					
					edit_room_in_pop_up.clear();
					edit_room_in_pop_up.sendKeys(editRoom);
					clickElement(edit_button_in_pop_up,"Click on delete button in pop up");
				}
				//else
				//Assert.assertEquals(true, (actualUniversityName.equals(universityName) & actualBuildingName.equals(buildingName) & actualLocation.equals(location) & actualRoom.equals(room)),"New adding place exist.");
			}
			catch(StaleElementReferenceException ex){
				
			}
		}
		
	}
}
