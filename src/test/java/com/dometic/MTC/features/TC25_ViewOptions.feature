Feature: Verifying application View Options Screen in Dometic Marine application

  @First1 @sanity1
  Scenario: Verifying application ViewOption(Tile View-All Devices) functionality
    Then I validate View option button in landing screen
    Then I Tap on View option button in landing screen
    Then I Validate the cancel button
    Then I Tap on Tile View Options
    Then I Tap on All Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption(Tile View-Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption(Tile View-Non Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Non Connected Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption(List View-All Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on List View Options
    Then I Tap on All Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption(List View-Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption(List View-Non Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Non Connected Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption functionality after Logout
    Then I Tap on View option button in landing screen
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button
    Then I Tap on hamburger menu in landing screen
#    Then I Wait short period for Page to Load
    Then I Tap on Logout
#    Then I Tap on Logout in Settings
    Then I enter Valid Email in Login Page
    Then I enter Valid Password in Login Page
    Then I Tap on Login Button in Login Page
    Then I entered into On boarding screen
    Then  I Wait short period for Page to Load
    Then I Tap on Yes button
    Then I Entered into Landing Page
    Then  I Wait short period for Page to Load
    Then I Tap on View option button in landing screen
    Then I Tap on Tile View Options
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button

