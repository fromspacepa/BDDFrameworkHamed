@register @endtoend #Using only @register tag will run the registerPage test case.
#Using @register and @endtoend tags will run multiple test cases. In here it is running both login and register page test cases.
Feature: Test Environment Retail-Page
#Background keyword is used for steps that is common for all scenarios in this feature file
#if the scenario is different form our first scenario and doesn't share the same steps as we
#defined in background keyword, then we need to create a separate feature file.
Background: 
    Given user is on test environment homepage
    When user click on myaccount button
#Here instead of Scenario Outline and Example keyword, we are using cucumber datatable
#We enter our test data right after the steps where it says (user enter information)
#We can use list of list OR list of map to access the data from cucumber datatable
#If we use list of list, then we don't need title(s): 
#(By titles I mean: firstName, lastName and so on that is typed below in the same line.) 
#We just type in the values separted by vertical pipes:
#(By values I mean: John, Colunga, and so on that is typed below in the same line, following the line of firstName, lastName.)
#If we use list of map, then we first type the titles and then values in the next line
  Scenario: Register with Test Environment Webpage
  	And user click on register button
  	And user fill registration form with information below
  	|firstName|lastName|email|telephone|password|confirmPassword|
  	|John|Colunga|johncolunga2399@gmail.com|4024443434|johncolunga2399|johncolunga2399|
  	And user click on agree to terms checkbox
  	And user click on continue button
