Feature: Verifying application Tracking(Gio Fencing) Screen in Dometic Marine application

  @First1 @sanity1
  Scenario: Verifying application Tracking(Gio Fencing) screen UI implementation
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Tracking tile
    Then I Verify Tracking Header title
    Then I Verify Boat Location text is displayed
    Then I Verify Latitude text is displayed
    Then I Verify Longitude text is displayed
    Then I Verify Geo Fencing text is displayed
#    Then I Verify Geo Fencing-toggle status is displayed
    Then I Verify Geo Fencing-toggle is displayed
    Then I Tap on Gio Fencing toggle if it's already in OFF state
    Then I Scroll up the page
    Then I Verify Radius from center text is displayed
    Then I Verify Radius from center expandIcon is displayed
    Then I Verify Alert Latency text is displayed
    Then I Verify Alert Latency expandIcon is displayed
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying application Tracking screen(Gio Fencing) Carousel boundary maximum values Functionality
#    Then I Tap on Tracking tile
#    Then I Tap on Radius from center
#    Then I Wait short period for Page to Load
#    Then I scroll to the maximum carousel value in Radius from center
#    Then I Verify Apply button in Radius from center
#    Then I Tap on Apply button in Radius from center
#    Then I Wait for Page to Load
#    Then I validated applied minutes is displayed in Radius from center
#    Then I Tap on Back Button
#    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying application Tracking screen(Gio Fencing) Carousel boundary minimum values Functionality
#    Then I Tap on Tracking tile
#    Then I Tap on Radius from center
#    Then I Wait short period for Page to Load
#    Then I scroll to the minimum carousel value in Radius from center
#    Then I Verify Apply button in Radius from center
#    Then I Tap on Apply button in Radius from center
#    Then I Wait for Page to Load
#    Then I validated applied minutes is displayed in Radius from center
#    Then I Tap on Back Button
#    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying application Tracking(Gio Fencing) screen Functionality
    Then I Tap on Tracking tile
    Then I Tap on Radius from center
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Scroll up the screen in Radius from center
    Then I Verify Apply button in Radius from center
    Then I Tap on Apply button in Radius from center
    Then I Wait for Page to Load
    Then I validated applied minutes is displayed in Radius from center
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying application Updating unit functionality(Metric to Imperial and Meter to Yard) Functionality
    Then I Tap on Tracking tile
    Then I get the value from Radius from center container
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I Tap on Units in App Settings page
    Then I Tap on Imperial Unit in Units Page
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Tracking tile
    Then I validated Yard value from radius from center container
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying application Updating unit functionality(Imperial to Metric and Yard to Meter) Functionality
    Then I Tap on Tracking tile
    Then I get the yard value from Radius from center container
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I Tap on Units in App Settings page
    Then I Tap on Metric Unit in Units Page
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Tracking tile
    Then I validated Meter value from radius from center container
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying application Tracking screen(Alert Latency)Carousel boundary maximum values Functionality
    Then I Tap on Tracking tile
    Then I Wait short period for Page to Load
    Then I Tap On Alert Latency
    Then I Wait short period for Page to Load
    Then I scroll to the maximum carousel value in Alert Latency
    Then I Verify Apply button in Alert Latency
    Then I Tap on Apply button in Alert Latency
    Then I Wait for Page to Load
    Then I validated applied minutes is displayed in Alert Latency
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tracking screen(Alert Latency)Carousel boundary minimum values Functionality
    Then I Tap on Tracking tile
    Then I Tap On Alert Latency
    Then I Wait short period for Page to Load
    Then I scroll to the minimum carousel value in Alert Latency
    Then I Verify Apply button in Alert Latency
    Then I Tap on Apply button in Alert Latency
    Then I Wait for Page to Load
    Then I validated applied minutes is displayed in Alert Latency
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tracking(Alert Latency) screen Functionality
    Then I Tap on Tracking tile
    Then I Tap On Alert Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Scroll up the screen in Alert Latency
    Then I Verify Apply button in Alert Latency
    Then I Tap on Apply button in Alert Latency
    Then I Wait for Page to Load
    Then I validated applied minutes is displayed in Alert Latency
    Then I Tap on Back Button