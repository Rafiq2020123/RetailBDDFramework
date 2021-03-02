package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class NoCommercePageOB extends Base {

	public NoCommercePageOB() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id =\"Email\"]")
	private WebElement clearEmail;

	@FindBy(xpath = "//input[@id =\"Email\"]")
	private WebElement emailAddress;

	@FindBy(xpath = "//input[@value ='admin']")
	private WebElement clearPass;

	@FindBy(xpath = "//input[@value ='admin']")
	private WebElement password;

	@FindBy(xpath = "//input[@type ='submit']")
	private WebElement loginButton;

	
	public void clearEmail() {
		clearEmail.clear();

	}

	public void enterEmailAddress(String email) {

		WebDriverUtility.enterValue(emailAddress, email);

	}

	public void clearPass() {
		clearPass.clear();
	
		
		
	}

	public void enterPassword(String pass) {

		WebDriverUtility.enterValue(password, pass);
	}

	public void clickingOnLoginButton() {

		WebDriverUtility.clickElementWithJS(loginButton);
	}

	public String getPageTitle() {

		String title = driver.getTitle();
		return title;
	}

}
