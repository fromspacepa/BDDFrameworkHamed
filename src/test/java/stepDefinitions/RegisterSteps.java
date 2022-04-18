package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pageObjects.RegisterPage;

public class RegisterSteps extends Base{
	
	RegisterPage register = new RegisterPage();

	
	@And("user click on register button")
	public void user_click_on_register_button() {
		register.clickOnRegister();
	}

	@And("user fill registration form with information below")
	public void user_fill_registration_form_with_information_below(DataTable dataTable) {
		//At this table we storing data in a list of map
		//list is going to define the row
		//and map will define the columns
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		register.enterFirstName(data.get(0).get("firstName"));
		register.enterLastName(data.get(0).get("lastName"));
		register.enterEmail(data.get(0).get("email"));
		register.enterTelephone(data.get(0).get("telephone"));
		register.enterPassword(data.get(0).get("password"));
		register.enterconfirmPassword(data.get(0).get("confirmPassword"));
		
	}

	@And("user click on agree to terms checkbox")
	public void user_click_on_agree_to_terms_checkbox() {

	}

	@And("user click on continue button")
	public void user_click_on_continue_button() {

	}

		}
