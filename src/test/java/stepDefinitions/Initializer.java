package stepDefinitions;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

	//Note to be noted: In this "Initializer.java" class, we will keep our @Before (beforeHooks) and
	//@After (afterHooks) annotations test methods.
public class Initializer extends Base { 
	//In this class we will write or define our beforeHooks and afterHooks methods and they are coming 
	//from Cucumber.
	//@Before (beforeHooks) will run before each scenario.
	//@After (afterHooks) will run after each scenario.
	
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario"+ scenario.getName() + "Started");
		browser();//this line will launch our browser.
		openBrowser();//this line will launch the URL for us.
	}
	  
	@After
	public void afterHooks(Scenario scenario) {
		tearDown();
		logger.info("Scenario" + scenario.getName() + " " + scenario.getStatus());
		
	}

} 
