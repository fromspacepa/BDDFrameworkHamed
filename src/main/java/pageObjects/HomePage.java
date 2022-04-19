package pageObjects;

import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}
