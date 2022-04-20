package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPage extends Base{

	public DesktopsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement desktops;


}
