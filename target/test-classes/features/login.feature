Feature: Test Environment Retail-Page
#Background keyword is used for steps that is common for all scenarios in this feature file
#if the scenario is different form our first scenario and doesn't share the same steps as we
#defined in background keyword, then we need to create a separate feature file.
Background: 
    Given user is on test environment homepage
    When user click on myaccount button
    
  Scenario: Login to Test Environment Retail Page
    Then user click on login button
    Then user user enter username and password
    Then user click on login button to login to the page
#we can use placeholder <> to provide the title of data in the example table    
  @login
  Scenario Outline: Login to Test Environment Retail Page
    Then user click on login button
    Then user user enter username '<username>' and password '<password>'
    Then user click on login button to login to the page
    
    Examples:
    |       username      | password |
    | eagles@tekschool.us | eagles   |
    | hawks@tekschool.us  | hawks    |
    | falcons@tekschool.us| falcons  |



  
