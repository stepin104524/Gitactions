Feature: Verifying application Tank Fresh Water Screen in Dometic USLTV application

  @First @sanity @Regression
  Scenario: Verifying application Tanks tile UI
    Then I Tap on AMTH tile in Home screen
    Then I Wait short period for Page to Load
    Then I verify the tanks tile text in landing screen
    Then I tap on the tanks tile in landing screen
    Then I verify the back button in tanks screen
    Then I verify the tanks circle carousel tank icon
    Then I verify the tanks circle carousel tank unit
    Then I verify the Battery level text
    Then I verify the Battery level value
    Then I verify the Bluetooth signal text
    Then I verify the Bluetooth signal value
    Then I verify the MAC address text
    Then I verify the MAC address value
    Then I verify the Software version text
    Then I verify the Software version value
    Then I tap on the back button in tanks screen
    Then I tap on Hamburger
    Then I tap on Home icon in settings screen page

#--------------------------------------------------------------------------------

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Tank Fresh Water screen UI
    Then I Tap on Tank Fresh Water in Landing screen
    Then I Wait short period for Page to Load
    Then I Verify the fresh water level text
#    Then I verify the water pump text
    Then I verify the fresh text on button
#    Then I verify the black text on button
    Then I verify the predictive data in Fresh water text
    Then I Tap on the predictive data in the Tank main screen
#    Then I Scroll up the page
#    Then I verify the filling text in predicitve data
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Tank Fresh Water screen functionality
    Then I Tap on Tank Fresh Water in Landing screen
    Then I Wait short period for Page to Load
    Then I verify Tank-progressIndicator in Tank Fresh Water
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Validated Tank-progressIndicator(Fresh Water) percentage is displayed in Landing screen