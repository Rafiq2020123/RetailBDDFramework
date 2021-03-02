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

public class RetailRegistration extends Base {

	
	
	// Retail Registration New test Case 
	
	
	Retail_PageObject retailpage = new Retail_PageObject();
	
	
	
	
	
	@When("^User clicks on register option$")
	public void user_clicks_on_register_option() throws Throwable {
		retailpage.clickOnRegister();
		logger.info("User clicked on registration option");
		
	}

	
	@When("^User fills out the registration form with the below informathon$")
	public void user_fills_out_the_registration_form_with_the_below_informathon(DataTable personalInfo) throws Throwable {
	    
		List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);
		retailpage.enterFirstName(dataValues.get(0).get("firstName"));
		retailpage.enterLastName(dataValues.get(0).get("lastName"));
		retailpage.enterEmail(dataValues.get(0).get("email"));
		retailpage.enterTelephone(dataValues.get(0).get("telephone"));
		retailpage.enterpassword(dataValues.get(0).get("password"));
		retailpage.enterConfirmpassword(dataValues.get(0).get("confirmPassword"));
		retailpage.yesSubscribe(dataValues.get(0).get("subscribe"));
		logger.info("User filled the information form");
		WebDriverUtility.screenShot();
	}

	@When("^User accepts the privacy and policy$")
	public void user_accepts_the_privacy_and_policy() throws Throwable {
		retailpage.checkPrivecyPolicy();
		logger.info("User checked the privecy and policy");
		WebDriverUtility.screenShot();
		
	}

	@When("^user clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable {
	   
		retailpage.clickOnContinueButton();
		logger.info("User clicked on continue button");
		WebDriverUtility.screenShot();
	}

	@Then("^User should be registerd in the retail website$")
	public void user_should_be_registerd_in_the_retail_website() throws Throwable {
	   Assert.assertTrue(retailpage.registrationOutcome());
		WebDriverUtility.screenShot();
		 logger.info("User should be registerd");
	}
}
