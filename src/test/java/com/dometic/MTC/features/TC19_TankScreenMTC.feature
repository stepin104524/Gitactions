Feature: Verifying application Tank Screen in Dometic Marine application

  @First1 @sanity1
  Scenario: Verifying application Tank screen UI implementation
    Then I Tap on Tank tile on landing screen
    Then I verify Tank header text
    Then I verify Alert text
    Then I Wait short period for Page to Load
    Then I Tap on Tank Alert toggle if it's already in OFF state
    Then I Scroll up the page
    Then I verify Alert-Tank Level Above Text
    Then I Tap on Alert-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I verify the apply button
    Then I Tap on Alert-Tank Level Above
    Then I verify Alert-Set Latency Text in Tanks Screen
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I Tap on Alert-Set Latency
    Then I verify Warning text
    Then I Tap on Tank Warnings toggle if it's already in OFF state
    Then I verify Warnings-Tank Level Above Text
    Then I Tap on Warnings-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Tank Level Above
    Then I verify Warnings-Set Latency Text in Tanks Screen
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Alert-Tank Level Above) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Tap on Alert-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I scroll to the maximum carousel value in Alert-Tank Level Above
#    Then I Verify Apply button in Alert-Tank Level Above
#    Then I Tap on Apply button in Alert-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied percentage in Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Alert-Tank Level Above) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Tap on Alert-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I scroll to the minimum carousel value in Alert-Tank Level Above
#    Then I Verify Apply button in Alert-Tank Level Above
#    Then I Tap on Apply button in Alert-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied percentage in Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Alert-Tank Level Above) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Alert-Tank Level Above
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Tank Level Above
    Then I Verify Apply button in Alert-Tank Level Above
    Then I Tap on Apply button in Alert-Tank Level Above
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied percentage in Tank Level Above is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Alert-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I Wait short period for Page to Load
#    Then I scroll to the maximum carousel value in Alert-Set Latency(Tank screen)
#    Then I Verify Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Alert-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I Wait short period for Page to Load
#    Then I scroll to the minimum carousel value in Alert-Set Latency(Tank screen)
#    Then I Verify Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Alert-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Set Latency(Tank screen)
    Then I Verify Apply button in Alert-Set Latency(Tank screen)
    Then I Tap on Apply button in Alert-Set Latency(Tank screen)
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Alert-Set Latency(Tank screen) is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Warnings-Tank Level Above) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Tank Level Above
#    Then I Verify Apply button in Warnings-Tank Level Above
#    Then I Tap on Apply button in Warnings-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Warnings-Tank Level Above) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value in Warnings-Tank Level Above
#    Then I Verify Apply button in Warnings-Tank Level Above
#    Then I Tap on Apply button in Warnings-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Warnings-Tank Level Above) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Tank Level Above
    Then I Verify Apply button in Warnings-Tank Level Above
    Then I Tap on Apply button in Warnings-Tank Level Above
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Tank Level Above is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Warnings-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Set Latency(Tank screen)
#    Then I Verify Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Warnings-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value Warnings-Set Latency(Tank screen)
#    Then I Verify Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Warnings-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Set Latency(Tank screen)
    Then I Verify Apply button in Warnings-Set Latency(Tank screen)
    Then I Tap on Apply button in Warnings-Set Latency(Tank screen)
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Set Latency(Tank screen) is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @First1 @sanity1
  Scenario: Verifying application Tank screen(Grey Water) UI implementation
    Then I Tap on Ok button
    Then I Tap on Back Button
    Then I Tap on Tank tile on landing screen
    Then I Scroll the screen till grey water
    Then I verify Tank header text
    Then I verify Tank Grey Water Tank text is displayed
    Then I verify Alert text
    Then I Wait short period for Page to Load
    Then I Tap on Tank Alert toggle if it's already in OFF state
    Then I Scroll up the page
    Then I verify Alert-Tank Level Above Text
    Then I Tap on Alert-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I verify the apply button
    Then I Tap on Alert-Tank Level Above
    Then I verify Alert-Set Latency Text in Tanks Screen
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I Tap on Alert-Set Latency
    Then I verify Warning text
    Then I Tap on Tank Warnings toggle if it's already in OFF state
    Then I verify Warnings-Tank Level Above Text
    Then I Tap on Warnings-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Tank Level Above
    Then I verify Warnings-Set Latency Text in Tanks Screen
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Alert-Tank Level Above) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till grey water
#    Then I Scroll up the page
#    Then I Tap on Alert-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I scroll to the maximum carousel value in Alert-Tank Level Above
#    Then I Verify Apply button in Alert-Tank Level Above
#    Then I Tap on Apply button in Alert-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied percentage in Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Alert-Tank Level Above) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till grey water
#    Then I Scroll up the page
#    Then I Tap on Alert-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I scroll to the minimum carousel value in Alert-Tank Level Above
#    Then I Verify Apply button in Alert-Tank Level Above
#    Then I Tap on Apply button in Alert-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied percentage in Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Alert-Tank Level Above) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Scroll the screen till grey water
    Then I Scroll up the page
    Then I Tap on Alert-Tank Level Above
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Tank Level Above
    Then I Verify Apply button in Alert-Tank Level Above
    Then I Tap on Apply button in Alert-Tank Level Above
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied percentage in Tank Level Above is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Alert-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till grey water
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I Wait short period for Page to Load
#    Then I scroll to the maximum carousel value in Alert-Set Latency(Tank screen)
#    Then I Verify Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Alert-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till grey water
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I Wait short period for Page to Load
#    Then I scroll to the minimum carousel value in Alert-Set Latency(Tank screen)
#    Then I Verify Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Alert-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Scroll the screen till grey water
    Then I Scroll up the page
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Set Latency(Tank screen)
    Then I Verify Apply button in Alert-Set Latency(Tank screen)
    Then I Tap on Apply button in Alert-Set Latency(Tank screen)
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Alert-Set Latency(Tank screen) is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Warnings-Tank Level Above) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till grey water
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Tank Level Above
#    Then I Verify Apply button in Warnings-Tank Level Above
#    Then I Tap on Apply button in Warnings-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Warnings-Tank Level Above) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till grey water
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value in Warnings-Tank Level Above
#    Then I Verify Apply button in Warnings-Tank Level Above
#    Then I Tap on Apply button in Warnings-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Warnings-Tank Level Above) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Scroll the screen till grey water
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Tank Level Above
    Then I Verify Apply button in Warnings-Tank Level Above
    Then I Tap on Apply button in Warnings-Tank Level Above
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Tank Level Above is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Warnings-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till grey water
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Set Latency(Tank screen)
#    Then I Verify Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Warnings-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till grey water
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value Warnings-Set Latency(Tank screen)
#    Then I Verify Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Grey Water(Warnings-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Scroll the screen till grey water
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Set Latency(Tank screen)
    Then I Verify Apply button in Warnings-Set Latency(Tank screen)
    Then I Tap on Apply button in Warnings-Set Latency(Tank screen)
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Set Latency(Tank screen) is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @First1 @sanity1
  Scenario: Verifying application Tank screen(Black Water) UI implementation
    Then I Tap on Ok button
    Then I Tap on Back Button
    Then I Tap on Tank tile on landing screen
    Then I Scroll the screen till Black Water
    Then I verify Tank header text
    Then I verify Tank Black Water Tank text is displayed
    Then I verify Alert text
    Then I Wait short period for Page to Load
    Then I Tap on Tank Alert toggle if it's already in OFF state
    Then I Scroll up the page
    Then I verify Alert-Tank Level Above Text
    Then I Tap on Alert-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I verify the apply button
    Then I Tap on Alert-Tank Level Above
    Then I verify Alert-Set Latency Text in Tanks Screen
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I Tap on Alert-Set Latency
    Then I verify Warning text
    Then I Tap on Tank Warnings toggle if it's already in OFF state
    Then I verify Warnings-Tank Level Above Text
    Then I Tap on Warnings-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Tank Level Above
    Then I verify Warnings-Set Latency Text in Tanks Screen
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Alert-Tank Level Above) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till Black Water
#    Then I Scroll up the page
#    Then I Tap on Alert-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I scroll to the maximum carousel value in Alert-Tank Level Above
#    Then I Verify Apply button in Alert-Tank Level Above
#    Then I Tap on Apply button in Alert-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied percentage in Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Alert-Tank Level Above) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till Black Water
#    Then I Scroll up the page
#    Then I Tap on Alert-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I scroll to the minimum carousel value in Alert-Tank Level Above
#    Then I Verify Apply button in Alert-Tank Level Above
#    Then I Tap on Apply button in Alert-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied percentage in Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Alert-Tank Level Above) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Scroll the screen till Black Water
    Then I Scroll up the page
    Then I Tap on Alert-Tank Level Above
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Tank Level Above
    Then I Verify Apply button in Alert-Tank Level Above
    Then I Tap on Apply button in Alert-Tank Level Above
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied percentage in Tank Level Above is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Alert-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till Black Water
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I Wait short period for Page to Load
#    Then I scroll to the maximum carousel value in Alert-Set Latency(Tank screen)
#    Then I Verify Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Alert-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till Black Water
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I Wait short period for Page to Load
#    Then I scroll to the minimum carousel value in Alert-Set Latency(Tank screen)
#    Then I Verify Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Apply button in Alert-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Alert-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Scroll the screen till Black Water
    Then I Scroll up the page
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Set Latency(Tank screen)
    Then I Verify Apply button in Alert-Set Latency(Tank screen)
    Then I Tap on Apply button in Alert-Set Latency(Tank screen)
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Alert-Set Latency(Tank screen) is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Warnings-Tank Level Above) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till Black Water
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Tank Level Above
#    Then I Verify Apply button in Warnings-Tank Level Above
#    Then I Tap on Apply button in Warnings-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Warnings-Tank Level Above) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till Black Water
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Tank Level Above
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value in Warnings-Tank Level Above
#    Then I Verify Apply button in Warnings-Tank Level Above
#    Then I Tap on Apply button in Warnings-Tank Level Above
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Tank Level Above is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Warnings-Tank Level Above) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Scroll the screen till Black Water
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Tank Level Above
    Then I Verify Apply button in Warnings-Tank Level Above
    Then I Tap on Apply button in Warnings-Tank Level Above
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Tank Level Above is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Warnings-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till Black Water
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Set Latency(Tank screen)
#    Then I Verify Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Warnings-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Tank tile on landing screen
#    Then I Scroll the screen till Black Water
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value Warnings-Set Latency(Tank screen)
#    Then I Verify Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Apply button in Warnings-Set Latency(Tank screen)
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency(Tank screen) is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen-Black Water(Warnings-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Scroll the screen till Black Water
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Set Latency(Tank screen)
    Then I Verify Apply button in Warnings-Set Latency(Tank screen)
    Then I Tap on Apply button in Warnings-Set Latency(Tank screen)
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Set Latency(Tank screen) is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
