package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.NoCommercePageOB;
import utilities.WebDriverUtility;

public class NoCommerceLoginSD extends Base {

	NoCommercePageOB noComerceObg = new NoCommercePageOB();

	@Given("^User opens the nocommerce website$")
	public void user_opens_the_nocommerce_website() throws Throwable {

		Base.initializeDriver();
		logger.info("NoCommerce page is opened");
		WebDriverUtility.wait(2000);

	}

	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
		noComerceObg.clearEmail();
		noComerceObg.clearPass();
		noComerceObg.enterEmailAddress("admin@yourstore.com");
		logger.info("User enters userName");
		WebDriverUtility.wait(2000);

	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
	
		noComerceObg.enterPassword("admin");
		logger.info("User enters password");
		WebDriverUtility.wait(2000);
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		noComerceObg.clickingOnLoginButton();
		logger.info("User clicks on login button");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@Then("^userd should be able to log into the application$")
	public void userd_should_be_able_to_log_into_the_application() throws Throwable {

		String expectedTitle = "Dashboard / nopCommerce administration";
		String actualTitle = noComerceObg.getPageTitle();

		Assert.assertEquals(expectedTitle, actualTitle);

		logger.info("User should be logged in");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();

		
		
		
		
		
	}

	
	 
}
