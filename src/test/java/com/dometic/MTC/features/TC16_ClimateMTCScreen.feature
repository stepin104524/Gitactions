Feature: Verifying application Climate Screen in Dometic Marine application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Climate screen UI
    Then I Tap on Climate in Landing screen
    Then I Wait short period for Page to Load
    Then I Verify climate text displayed in the top of the app
    #Then I verified inside text is displayed in Ac climate screen
    #Then I verified outside text is displayed in Ac climate screen
    Then I Tap on All climate toggle if already it's OFF state
    Then I Wait short period for Page to Load
    Then I verify power text climate main screen
    Then I verify fan speed text climate main screen
    Then I verify Auto-fan speed text climate main screen
    Then I Tap on Auto-fan speed navigation in climate main screen
    Then I verify the AutoSpeed text inside the Auto-fan mode
    Then I verify the AutoCont text inside the Auto-fan mode
    Then I Scroll up the page
    Then I verify the climate mode text in climate main screen
    Then I verify the Eco modifier text in climate main screen
    Then I verify the Sleep modifier text in climate main screen
    Then I verify the Scheduler text in climate main screen
    Then I Wait short period for Page to Load
    Then I Tap on Auto-fan speed info icon climate main screen
    Then I Wait short period for Page to Load
    Then I tap on Device back button
    Then I Wait short period for Page to Load
    Then I tap on Eco modifier tool tip in climate main screen
    Then I Wait short period for Page to Load
    Then I tap on Device back button
    Then I Wait short period for Page to Load
    Then I Tap on the Sleep modifier tool tip in climate main screen
    Then I Wait short period for Page to Load
    Then I tap on Device back button
    Then I Wait short period for Page to Load
#    Then I Scroll Right to Left of the screen
#    Then I Scroll Right to Left of the screen
#    Then I Wait short period for Page to Load
#    Then I Tap on Apply button in climate screen
#    Then I Wait for Page to Load
#    Then I verified Power text is displayed Ac climate screen
#    Then I verified Fan speed text is displayed Ac climate screen
#    Then I verified Climate Mode text is displayed Ac climate screen
#    Then I verified Climate AGS text is displayed Ac climate screen
#    Then I verified Air Conditioner text is displayed Ac climate screen
#    Then I verified Scheduler text is displayed Ac climate screen
#    Then I Tap on Fan speed in climate screen
#    Then I scroll up the screen in AC Fan Speed
#    Then I Wait short period for Page to Load
#    Then I Tap on Apply button in AC Fan Speed
#    Then I Wait short period for Page to Load
#    Then I Wait short period for Page to Load
#    Then I Tap on Climate mode in climate screen
#    Then I Wait short period for Page to Load
#    Then I scroll up the screen in Climate Mode
#    Then I Tap on Apply button in AC Climate Mode
#    Then I Wait short period for Page to Load
#    Then I Tap on Scheduled At in climate screen
#    Then I Wait short period for Page to Load
#    Then I Scroll up the hours in Scheduled At
#    Then I Scroll up the minutes in Scheduled At
#    Then I Tap on apply button in Scheduled At
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Climate screen scroll up to Minimum temperature functionality
#    Then I Tap on Climate in Landing screen
#    Then I Wait short period for Page to Load
#    Then I scroll minimum temperature in Climate
#    Then I Wait short period for Page to Load
#    Then I Tap on Apply button  in climate
#    Then I Wait for Page to Load
#    Then I Tap on Back Button
#    Then I Wait short period for Page to Load
#    Then I validated minimum applied temperature is displayed in Landing screen

  @Regression1
  Scenario: Verifying application Climate screen scroll up to Maximum temperature functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Climate in Landing screen
#    Then I Wait short period for Page to Load
#    Then I scroll maximum temperature in Climate
#    Then I Wait short period for Page to Load
#    Then I Tap on Apply button  in climate
#    Then I Wait for Page to Load
#    Then I Tap on Back Button
#    Then I Wait short period for Page to Load
#    Then I validated maximum applied temperature is displayed in Landing screen
#    Then I Wait short period for Page to Load