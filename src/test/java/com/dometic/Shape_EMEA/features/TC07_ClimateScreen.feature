Feature: Verifying application Setting Screen in Dometic Shape EMEA application

  @First @sanity @Regression
  Scenario: Verifying Climate page UI
    Then I Tap on Hamburger Menu Button
    Then I Tap on Home option in Settings screen
    Then I Wait short period for Page to Load
    Then I tap on the onboarded Shape EMEA device
    Then I Wait short period for Page to Load
    Then I Tap On Climate Tile In Landing Screen For Shape EMEA User
    Then I Wait short period for Page to Load
    Then I verify Climate header text
    Then I verify back button in Climate screen
    Then I verify Inside text in Climate screen
    Then I verify Inside temperature in Climate screen
    Then I verify Inside temperature unit in Climate screen
    Then I verify if Fan speed is displayed under temperature
    Then I verify Power text in Climate screen
    Then I verify Power toggle in Climate screen
    Then I Tap on the Power toggle in Climate screen if its in OFF state
    Then I verify Climate mode text in Climate screen
    Then I verify Climate mode selected option in Climate screen
    Then I verify Fan speed text in Climate screen
    Then I verify Fan speed selected option in Climate screen
    Then I verify Sleep text in Climate screen
    Then I verify Sleep toggle in Climate screen
    Then I verify Lights text in Climate screen
    Then I verify Internal text in Climate screen
    Then I verify Internal toggle in Climate screen
    Then I verify Internal brightness text in Climate screen
    Then I verify if internal brightness option is displayed
    Then I scroll the screen
    Then I verify Timer text in Climate screen
    Then I verify Auto On text in Climate screen
    Then I verify Auto Off text in Climate screen
    Then I verify status text in Climate screen
    Then I verify Status toggle in Climate screen
    Then I verify Scheduled At text in Climate screen
    Then I Tap On Back Button In Climate Screen

  @First @sanity @Regression
  Scenario:  Verifying Application Climate screen Carousel Boundary Minimum Values(Celcius) Functionality
    Then I Tap on Hamburger Menu Button
    Then I Tap on App Settings Label
    Then I Change The Temperature From Fahrenheit To Celcius
    Then I Tap on Back Button in App Settings Screen
    Then I Tap On Climate Tile In Landing Screen For Shape EMEA User
    Then I Scroll The Celcius Temperature Upto Minimum Value
    Then I Tap On Apply Button In Climate For Minimum Carousel Value
    Then I Tap On Back Button In Climate Screen
    Then I Validated The Applied Minimum Value Is Displayed

  @sanity @Regression
  Scenario:  Verifying Application Climate screen Carousel Boundary Maximum Values(Celcius) Functionality
    Then I Tap On Climate Tile In Landing Screen For Shape EMEA User
    Then I Scroll The Celcius Temperature Upto Maximum Value
    Then I Tap On Apply Button In Climate For Maximum Carousel Value
    Then I Tap On Back Button In Climate Screen
    Then I Validated The Applied Maximum Value Is Displayed

  @sanity @Regression
  Scenario:  Verifying Application Climate screen Carousel Boundary Random Values(Celcius) Functionality
    Then I Tap On Climate Tile In Landing Screen For Shape EMEA User
    Then I Scroll The Celcius Temperature For Random Value
    Then I Tap On Apply Button In Climate For Maximum Carousel Value
    Then I Tap On Back Button In Climate Screen
    Then I Validated The Applied Celcius Value Is Displayed

  @sanity @Regression
  Scenario:  Verifying Application Climate screen Carousel Boundary Minimum Values(Fahrenheit) Functionality
    Then I Tap on Hamburger Menu Button
    Then I Tap on App Settings Label
    Then I Change The Temperature From Celcius To Fahrenheit
    Then I Tap on Back Button in App Settings Screen
    Then I Tap On Climate Tile In Landing Screen For Shape EMEA User
    Then I Scroll The Fahrenheit Temperature Upto Minimum Value
    Then I Tap On Apply Button In Climate For Minimum Carousel Value
    Then I Tap On Back Button In Climate Screen
    Then I Validated The Applied Minimum Value(Fahrenheit) Is Displayed

  @sanity @Regression
  Scenario:  Verifying Application Climate screen Carousel Boundary Maximum Values(Fahrenheit) Functionality
    Then I Tap On Climate Tile In Landing Screen For Shape EMEA User
    Then I Scroll The Fahrenheit Temperature Upto Maximum Value
    Then I Tap On Apply Button In Climate For Maximum Carousel Value
    Then I Tap On Back Button In Climate Screen
    Then I Validated The Applied Maximum Value(Fahrenheit) Is Displayed

  @sanity @Regression
  Scenario:  Verifying Application Climate screen Carousel Boundary Random Values(Fahrenheit) Functionality
    Then I Tap On Climate Tile In Landing Screen For Shape EMEA User
    Then I Scroll The Fahrenheit Temperature For Random Value
    Then I Tap On Apply Button In Climate For Maximum Carousel Value
    Then I Tap On Back Button In Climate Screen
    Then I Validated The Applied Fahrenheit Value Is Displayed
    Then I Tap on Hamburger Menu Button
    Then I Tap on App Settings Label
    Then I Change The Temperature From Fahrenheit To Celcius
    Then I Tap on Back Button in App Settings Screen