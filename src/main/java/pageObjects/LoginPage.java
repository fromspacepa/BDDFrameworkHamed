 package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPage extends Base{ // Note to be noted: In this "LoginPageObjects.java" class, we will store our locators/webElements for login feature.

	
	//>>>In this class we are storing our "PageObjects/Attributes/Locators":
	//Note: PageObjects, Attributes, and Locators are all the same; These names are all the same and used for the same WebElements. 
	//We will need to implement the "PageFactory.initElements" to initialize our "PageObjects/Attributes/Locators"
	//Note: "PageFactory.initElements" is coming/importing from Selenium.
	//Once we get all the "Locators" for our elements, we use the "@FindBy" annotation (importing from Selenium) to store our "PageObjects";
	//We then can write a "get method" to access our PagObjects in the "stepDefinition Class".
	//We will store our elements as "private WebElement" so that we can only access elements through get method.
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValidate;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement userNameField;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButtonMain;
	
	public void validateHomePage() {
		String text = textToValidate.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		}else {
			logger.info("Text does not match!");
		}
	}
	public void clickOnMyAccountButton() {//<<<Here "clickOnMyAccountButton" is the get method; In Selenium we use it as: getClickOnMyAccountButton.
		myAccountButton.click();
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public void enterUserName() {
		userNameField.sendKeys("johncolunga2399@gmail.com");
	}
	public void enterPassword() {
		passwordField.sendKeys("johncolunga2399");
	}
	//Below two methods are for Examples keyword practice:
	public void enterUserNameWithParam(String username) {
			userNameField.sendKeys(username);
	}
	public void enterPasswordWithParam(String password) {
			passwordField.sendKeys(password);
	}
	public void clickOnLoginButtonMain() {
		loginButtonMain.click();
	}
}
