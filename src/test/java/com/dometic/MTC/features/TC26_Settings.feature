Feature: Verifying application Settings Screen in Dometic Marine application

  @First1 @sanity1
  Scenario: Verifying application Settings screen(logout) functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Logout in Settings screen

  @sanity1
  Scenario: Verify Zone Management UI validation
    Then I Wait short period for Page to Load
    Then I verify Zone Management text is displayed
    Then I Tap on Zone Management in Settings
    Then I Wait short period for Page to Load
    Then I Verify ALL ZONES in Zone Management
    Then I verify Edit text in Zone Management
    Then I verify Limited to 4 Zones only text in Zone Management
    Then I verify Add ZoneIcon in Zone Management

  @sanity1
  Scenario: Verify Zone Management Functionality with Empty Zone name
    Then I Wait short period for Page to Load
    Then I Tap on Edit in ALL ZONES
    Then I Wait short period for Page to Load
    Then I Tap on Rename in ALL ZONES
    Then I Tap on the Zone name
    Then I clear the previous zone name
    Then I save the Zone
    Then I verify Zone Name can not be empty message is displayed

  @sanity1
  Scenario: Verify Zone Management Functionality with more then 10 character
    Then I Wait short period for Page to Load
    Then I Enter the zone name more then the limit
    Then I verify "10/10" character message is displayed

  @sanity1
  Scenario: Verify Zone Management Functionality with Zone name
    Then I Wait short period for Page to Load
    Then I Tap on the Zone name
    Then I clear the previous zone name
    Then I Enter the Zone name
    Then I Tap on Save

  @sanity1
  Scenario: Verify Zone Management Delete Zone Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Edit in ALL ZONES
    Then I Wait short period for Page to Load
    Then I Tap on the Delete Zone Icon
    Then I Wait short period for Page to Load
    Then I Tap on YES, DELETE IT Button

  @sanity1
  Scenario: Verify Zone Management Add Zone Functionality
    Then I Wait short period for Page to Load
    Then I Tap on the Add Zone Icon
    Then I Select the zone
    Then I Enter the New Zone name
    Then I SAVE the Zone
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verify Spanish Language Functionality
    Then I Wait short period for Page to Load
    Then I verify Languages text is displayed
    Then I navigate to update language section in Settings
    Then I update language to Spanish in settings
    And I verify on Language text updated with Spanish translation
    And I verify on Temperature text updated with Spanish translation
    And I verify on logout text updated with Spanish translation
#    Then I Tap on Back Button
    Then I Wait short period for Page to Load
#    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify French Language Functionality
    Then I verify Languages text is displayed
    Then I navigate to update language section in Settings
    Then I update language to French in settings
    And I verify on Language text updated with French translation
    And I verify on Temperature text updated with French translation
    And I verify on logout text updated with French translation
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify Temperature Functionality
    Then I Verify Temperature unit text is displayed
    Then I update Temperature Unit in Settings
    Then I Tap on Back button from Settings
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify Version Functionality
    Then I verify Version is displayed

  @sanity1
  Scenario: Verify application Logout Functionality
    Then I verify Log out is displayed
#    Then I navigate to update language section in Settings
#    Then I update language to Spanish in settings
    Then I Wait short period for Page to Load
    Then I Tap on Logout in Settings








