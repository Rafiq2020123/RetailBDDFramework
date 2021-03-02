package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class Retail_PageObject extends Base {

	private static final String xpath = null;

	// We always need to extend the Base class in order to use its property such as
	// webelements
	// Then, We should create a constructor.
	// And inside the constructor, we should define the PageFactory.initElement
	// method in order to be able to initialize all the WebElements in this page

	public Retail_PageObject() {

		PageFactory.initElements(driver, this);

	}

	
	
	// Now we need to store UI web Elements in a private webElement using @FindBy
	// annotation of PageFactory CLass

	@FindBy(xpath = "//input[@name='search']")

	private WebElement searchbar;

	@FindBy(xpath = "//span[@class ='input-group-btn']//button[@type= 'button']")

	private WebElement SearchButton;

	@FindBy(xpath = "//img[@alt='iPhone']")
	private WebElement iphoneImage;

	
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////////

	// WebElemnets for register page

	@FindBy(how = How.CLASS_NAME, using = "dropdown open")
	WebElement click;
	@FindBy(how = How.LINK_TEXT, using = "Register")
	private WebElement register;
	@FindBy(name = "firstname")
	private WebElement firstName;
	@FindBy(id = "input-lastname")
	private WebElement lastName;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	@FindBy(id = "input-telephone")
	private WebElement phone;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(how = How.ID, using = "input-confirm")
	private WebElement confromPass;
	@FindBy(xpath = "(//input[@value='1'])[2]")
	private WebElement yesButton;
	@FindBy(xpath = "(//input[@name='newsletter'])[2]")
	private WebElement noSubscribeButton;
	@FindBy(how = How.XPATH, using = "//input[@name='agree']")
	private WebElement priveryButton;
	@FindBy(css = "input[value=Continue]")
	private WebElement continueButton;
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedMessage;

	

	// Now we need to create public methods to perform required Action on each
	// element
	// We can used the prepared methods in the Utility classes by calling them

	public void enterValueToSearchBar(String value) {

		WebDriverUtility.enterValue(searchbar, value);
	}

	
	public void clickOnTheSearchButton() {

		WebDriverUtility.clickOnElement(SearchButton);
	}

	public boolean iphoneImageDisplayed() {

		if (iphoneImage.isDisplayed()) {

			return true;
		} else

			return false;

		
		
		
		
		// Now We need to create method for each element we have found from the
		// registration part

	}

	public void clickOnRegister() {

		WebDriverUtility.clickOnElement(register);

	}

	public void enterFirstName(String firstNames) {

		WebDriverUtility.enterValue(firstName, firstNames);

	}

	public void enterLastName(String lastNames) {

		WebDriverUtility.enterValue(lastName, lastNames);
	}

	
	public void enterEmail(String emails) {

		WebDriverUtility.enterValue(email, emails);
	}

	public void enterTelephone(String phones) {

		WebDriverUtility.enterValue(phone, phones);

	}

	public void enterpassword(String passwords) {

		WebDriverUtility.enterValue(password, passwords);
	}

	public void enterConfirmpassword(String confirmPasswords) {

		WebDriverUtility.enterValue(confromPass, confirmPasswords);
	}

	public void yesSubscribe(String yesSubscribes) {

		WebDriverUtility.enterValue(yesButton, yesSubscribes);

		if (yesSubscribes.equalsIgnoreCase("yes")) {
			if (!yesButton.isSelected())
				WebDriverUtility.clickOnElement(yesButton);

		} else {
			WebDriverUtility.clickOnElement(noSubscribeButton);
		}

	}

	public void checkPrivecyPolicy() {

		if (priveryButton.isDisplayed()) {

			priveryButton.click();
		}
	}

	public void clickOnContinueButton() {

		WebDriverUtility.clickOnElement(continueButton);
	}

	
	
	public boolean registrationOutcome() {
		boolean successMessage = accountCreatedMessage.isDisplayed();
		return successMessage;
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
