Feature: Verifying application Tank Screen in Dometic Marine application

  @First1 @sanity1
  Scenario: Verifying the update UI in TANK Screen
    Then I Tap on Tank Fresh Water in Landing screen
    Then I verify the Fuel Level text in the Tank screen
    Then I Wait short period for Page to Load
    Then I Tap on  the OIL option in the Tank screen
    Then I verify the OIL Level text in the Tank screen
    Then I swipe the tank option from left to right
    Then I Wait short period for Page to Load
    Then I tap on the Live option in the Tank screen
    Then I verify the Live well Level text in the Tank screen
    Then I Wait short period for Page to Load
    Then I Tap on the BAIT text option in the Tank screen
    Then I verify the BAIT WELL LEVEL text in the Tank screen

  @sanity1
  Scenario: Verifying application Tank Screen(Tank Fuel tile) functionality
    Then Then I Tap on Tank Fuel tile in Landing Screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank Screen(Tank Oil tile) functionality
    Then Then I Tap on Tank Oil tile in Landing Screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank Screen(Tank Fresh tile) functionality
    Then Then I Tap on Tank Fresh tile in Landing Screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank Screen(Tank Grey tile) functionality
    Then Then I Tap on Tank Grey tile in Landing Screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank Screen(Tank Black tile) functionality
    Then Then I Tap on Tank Black tile in Landing Screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank Screen(Tank Live tile) functionality
    Then Then I Tap on Tank Live tile in Landing Screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank Screen(Tank Bait tile) functionality
    Then Then I Tap on Tank Bait tile in Landing Screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
