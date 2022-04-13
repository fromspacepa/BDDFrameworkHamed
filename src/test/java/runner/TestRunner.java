package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	//>>>Note to be noted: In this "Runner.java" class, we will write our code so that we can glue the feature files with
	//stepDefinitions and run our tests.

	//>>>In this TestRunner class we will use the following Cucumber options to setup our TestRunner class:
	//feature : Means, that we can add the path to our feature files here.
	//glue : Means, that we add the path to our stepDefinitions where we are gluing features file to steps.
	//tags : Means, by adding the tags we will specify which feature(s), scenario(s) or scenario outline should be executed.
	//dryRun : Means, if set to true, it will check and make sure we have stepDefinition methods for each step in feature file
			   //if set to false, it will execute the test case for us.
	//monochrome : Means, it will help us to print the stepDefinition methods in clean format in the console so that we can use
				   //it in our stepDefinition class.
	//plugin : Means, that with adding plugin(s) here it will generate reports. 
	
	//>>>Note to be noted: Now to run our TestRunner, we will not create a method, but we will use the following Cucumber 
	//annotation (@RunWith) so that we can specify what we want to execute and with what to:
	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "classpath:features",
	glue = "stepDefinitions",
	tags = "@loginToTestEnv",
	dryRun = false,
	monochrome = true
	) 

  	public class TestRunner {
}
