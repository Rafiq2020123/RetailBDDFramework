package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Retail_PageObject;
import utilities.WebDriverUtility;

public class Retail_Page_StepDefinetion extends Base{

	private static final String String = null;
	//In this class we will write actual Java-Selenium codes associated to each Scenario 
	
	//We crate the instance of oageObject class for using its  for multiple methods 
	
	Retail_PageObject retailpage = new Retail_PageObject();
	
	
	
	
	
	//This call Regicts for storing any String values  
	@When("^User search for '(.+)'$")
	public void user_search_for_iphone(String values) throws Throwable {
	   
		retailpage.enterValueToSearchBar(values);
		
		logger.info("User enterd value in the search bar");
		WebDriverUtility.screenShot();
		
	}

	
	
	
	@When("^User click on the seach button$")
	public void user_click_on_the_seach_button() throws Throwable {
		retailpage.clickOnTheSearchButton();
		logger.info("User clicked on the search bar");
		WebDriverUtility.screenShot();
		
	}

	@Then("^User should see Iphone image$")
	public void user_should_see_Iphone_image() throws Throwable {
	   Assert.assertTrue(retailpage.iphoneImageDisplayed());
	   WebDriverUtility.screenShot();
	   logger.info("Iphone image is desplayed");
		
	}
	
	
	
	
	
	
	
	

	
	
}
