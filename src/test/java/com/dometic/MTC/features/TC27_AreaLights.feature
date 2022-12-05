Feature: Verifying application Area Lights Screen in Dometic Marine application

  @First1 @sanity1
  Scenario: Verifying application Area Lights Screen UI Implementation
    Then I enter Valid Email
    Then I enter Valid Password
    Then I Tap on an Login button
    Then I Wait short period for Page to Load
    Then I entered into Home Page
    Then I Wait short period for Page to Load
    Then I Tap on Area Lights Tile
    Then I Wait short period for Page to Load
    Then I Wait until Landing screen is displayed
    Then I verify Area light header in landing page
    Then I verify hamburger option in landing screen
    Then I verify the clock icon in landing screen
    Then I verify the first time in landing screen
    Then I verify the second time in landing screen
    Then I verify battery percentage is displayed
    Then I verify battery icon
    Then I verify if the top slider is displayed
    Then I verify if the ON-OFF button is displayed
    Then I verify if the bottom slider is displayed
    Then I verify if first color icon is displayed
    Then I verify if second color icon is displayed
    Then I verify if third color icon is displayed
    Then I verify if the bottom layout is displayed

  @sanity1
  Scenario: Verifying application Bottom layout UI and functionality
    Then I Wait short period for Page to Load
    Then I verify if the bottom layout is displayed
    Then I verify if Home icon is displayed
    Then I verify Home text in bottom layout
    Then I verify if Color icon is displayed
    Then I verify Color text in bottom layout
    Then I verify if Schedule icon is displayed
    Then I verify Schedule text in bottom layout
    Then I verify if Battery icon is displayed
    Then I verify Battery text in bottom layout
    Then I verify if Modes icon is displayed
    Then I verify Modes text in bottom layout
    Then I Tap on Home in Area light bottom layout
    Then I Tap on Colors in Area light bottom layout
    Then I Tap on Schedule in Area light bottom layout
    Then I Tap on Battery in Area light bottom layout
    Then I Tap on Modes in Area light bottom layout

  @sanity1
  Scenario: Verifying application Three color UI pattern functionality
    Then I Tap on Home in Area light bottom layout
    Then I Tap on three color button
    Then I verify the clock icon in landing screen
    Then I verify the first time in landing screen
    Then I verify the second time in landing screen
    Then I verify battery percentage is displayed
    Then I verify battery icon
    Then I verify if the top slider is displayed
    Then I verify if the ON-OFF button is displayed
    Then I verify if the bottom slider is displayed
    Then I Tap on two color button
    Then I verify the clock icon in landing screen
    Then I verify the first time in landing screen
    Then I verify the second time in landing screen
    Then I verify battery percentage is displayed
    Then I verify battery icon
    Then I verify if the top slider is displayed
    Then I verify if the ON-OFF button is displayed
    Then I verify if the bottom slider is displayed
    Then I tap on the modifier icon
    Then I verify the clock icon in landing screen
    Then I verify the first time in landing screen
    Then I verify the second time in landing screen
    Then I verify battery percentage is displayed
    Then I verify battery icon
    Then I verify if the top slider is displayed
    Then I verify if the ON-OFF button is displayed
    Then I verify if bottom first icon is displayed
    Then I verify if bottom second icon is displayed
    Then I verify if bottom third icon is displayed
    Then I verify if bottom fourth icon is displayed
    Then I verify if bottom fifth icon is displayed
    Then I verify if bottom sixth icon is displayed

  @sanity1
  Scenario: Verifying application Two color pattern UI functionality
    Then I Tap on Colors in Area light bottom layout
    Then I verify if two color top slider is displayed
    Then I verify if two color top slider selector is displayed
    Then I verify if two color circle is displayed
    Then I verify if two color circle selector is displayed
    Then I verify if multi color icon is displayed
    Then I verify if black and white icon is displayed
    Then I tap on black and white icon
    Then I verify black and white slider is displayed
    Then I verify black and white slider selector is displayed
    Then I verify black and white circle is displayed
    Then I verify black and white circle selector is displayed

  @First1 @sanity1
  Scenario: Verifying application Settings screen(logout) functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Logout in Settings screen