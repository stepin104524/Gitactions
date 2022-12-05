Feature: Verifying application Setting Screen in Dometic Shape EMEA application

  @First @sanity @Regression
  Scenario: Verifying application Settings screen UI
    Then I verify the hamburger menu in landing screen
    Then I Tap on the hamburger menu in landing screen
    Then I verify the settings screen back button
    Then I verify if user profile photo is displayed
    Then I verify if username is displayed
    Then I verify if user email is displayed
    Then I verify View Edit Account text in Settings page
    Then I verify Home text in Settings page
    Then I verify Notification Settings text in Settings page
    Then I verify Device Management text in Settings page
    Then I verify App Settings text in Settings page
    Then I verify Logout text in Settings page
    Then I verify Version text in Settings page
    Then I Wait short period for Page to Load


  @Regression
  Scenario: Verifying application Settings screen Functionality
    Then I Tap on Home option in Settings screen
    Then I Wait short period for Page to Load
    Then I Tap on the hamburger menu in landing screen
    Then I tap on the View edit account option
    Then I Wait short period for Page to Load
    Then I tap on the back button in Account settings
    Then I Tap on the hamburger menu in landing screen
    Then I tap on the Notification Settings option
    Then I Wait short period for Page to Load
    Then I tap on the back button in Manage notifications
    Then I Tap on the hamburger menu in landing screen
    Then I tap on the Device Management option
    Then I Wait short period for Page to Load
    Then I tap on the back button in Device Management
    Then I Wait short period for Page to Load
    Then I Tap on the hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I tap on the App Settings option
    Then I Wait short period for Page to Load
    Then I tap on the back button in app settings
    Then I Wait short period for Page to Load
    Then I Tap on the hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I tap on the Logout option



