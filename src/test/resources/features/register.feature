Feature: Test Environment Retail-Page
#Background keyword is used for steps that is common for all scenarios in this feature file
#if the scenario is different form our first scenario and doesn't share the same steps as we
#defined in background keyword, then we need to create a separate feature file.
Background: 
    Given user is on test environment homepage
    When user click on myaccount button
    
  Scenario: Register with Test Environment Webpage
  	And user click on register button
  	And user fill registration form with information below
  	|firstName|lastName|email|telephone|password|confirmPassword|
  	|John|Colunga|johncolunga2345@gmail.com|4024443434|johncolunga2345|johncolunga2345|
  	And user click on agree to terms checkbox
  	And user click on continue button
