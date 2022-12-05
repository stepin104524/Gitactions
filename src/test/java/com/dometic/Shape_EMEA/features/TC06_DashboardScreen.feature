Feature: Verifying application DashBoard Screen in Dometic Shape EMEA application

  @First1 @sanity1
  Scenario: Verifying application DashBoard screen functionality
#    Then I entered into On boarding screen
#    Then I Wait short period for Page to Load
#    Then I Tap on Yes button
#    Then I Wait short period for Page to Load
#    Then I Tap on the MTC Thing I'd
#    Then Landing screen is displayed

  @First @sanity @Regression
  Scenario: Verifying application Login Functionality with valid credentials
    Then I enter Valid Email in Login Page
    Then I enter Valid Password in Login Page
    Then I Tap on an Login button in Login Page
    Then I verify successfully navigated to Dash Board screen

  @First @sanity @Regression
  Scenario: Verifying application DashBoard screen functionality
    Then I entered into Home Page
    Then I Tap on Dashboard Tile
    Then I Wait until Landing screen is displayed



