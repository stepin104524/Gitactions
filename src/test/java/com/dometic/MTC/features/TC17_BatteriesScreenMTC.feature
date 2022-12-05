Feature: Verifying application Batteries Screen in Dometic Marine application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Batteries(Port Engine) screen UI implementation
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I verify Batteries header text
    Then I verify Battery status
    Then I verify Voltage Graph text
    Then I Tap on Voltage Graph down arrow
    Then I verify Voltage text
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I verify Hour text
    Then I verify Day text
    Then I verify WEEK text
#    Then I verify MONTH text
    Then I Tap on Day in voltage Graph
    Then I Tap on week in voltage Graph
#    Then I Tap on year in voltage Graph
#    Then I Wait short period for Page to Load
    Then I verify Alerts text
    Then I Tap on Alert toggle if it's already in OFF state
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I verify Alert-Battery Voltage Below Text
    Then I Tap on Alert-Battery Voltage Below
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I verify the apply button
    Then I Tap on Alert-Battery Voltage Below
    Then I verify Alert-Set Latency Text
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I Tap on Alert-Set Latency
    Then I verify Warnings text
    Then I Tap on Warnings toggle if it's already in OFF state
    Then I verify Warnings-Battery Voltage Below Text
    Then I Tap on Warnings-Battery Voltage Below
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Battery Voltage Below
    Then I verify Warnings-Set Latency Text
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in Battery screen

  @sanity1
  Scenario: Verifying application Batteries screen(Port Engine Alert-Battery Voltage Below) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll up the page
#    Then I Tap on Alert-Battery Voltage Below
#    Then I scroll up to maximum value in Alert-Battery Voltage Below carousel
#    Then I Verify Apply button in Alert-Battery Voltage Below
#    Then I Tap on Apply button in Alert-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied voltage is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port Engine Alert-Battery Voltage Below) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll up the page
#    Then I Tap on Alert-Battery Voltage Below
#    Then I scroll up to minimum value in Alert-Battery Voltage Below carousel
#    Then I Verify Apply button in Alert-Battery Voltage Below
#    Then I Tap on Apply button in Alert-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied voltage is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Port Engine Alert-Battery Voltage Below) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Alert-Battery Voltage Below
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Battery Voltage Below
    Then I Verify Apply button in Alert-Battery Voltage Below
    Then I Tap on Apply button in Alert-Battery Voltage Below
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied voltage is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port Engine Alert-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I scroll to the maximum carousel value in Alert-Set Latency
#    Then I Verify Apply button in Alert-Set Latency
#    Then I Tap on Apply button in Alert-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port Engine Alert-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I scroll to the minimum carousel value in Alert-Set Latency
#    Then I Verify Apply button in Alert-Set Latency
#    Then I Tap on Apply button in Alert-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Port Engine Alert-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Set Latency
    Then I Verify Apply button in Alert-Set Latency
    Then I Tap on Apply button in Alert-Set Latency
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Alert-Set Latency is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button


  @sanity1
  Scenario: Verifying application Batteries screen(Port Engine Warnings-Battery Voltage Below) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Battery Voltage Below
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Battery Voltage Below
#    Then I Verify Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Battery Voltage Below is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port Engine Warnings-Battery Voltage Below) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Battery Voltage Below
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value in Warnings-Battery Voltage Below
#    Then I Verify Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Battery Voltage Below is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Port Engine Warnings-Battery Voltage Below) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Battery Voltage Below
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Battery Voltage Below
    Then I Verify Apply button in Warnings-Battery Voltage Below
    Then I Tap on Apply button in Warnings-Battery Voltage Below
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Battery Voltage Below is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port Engine Warnings-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Set Latency
#    Then I Verify Apply button in Warnings-Set Latency
#    Then I Tap on Apply button in Warnings-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port Engine Warnings-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value in Warnings-Set Latency
#    Then I Verify Apply button in Warnings-Set Latency
#    Then I Tap on Apply button in Warnings-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Port Engine Warnings-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Set Latency
    Then I Verify Apply button in Warnings-Set Latency
    Then I Tap on Apply button in Warnings-Set Latency
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Set Latency is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Batteries(Stbd Engine) screen UI implementation
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Scroll the screen till the 2nd instance
    Then I verify Batteries header text
    Then I verify Battery status
    Then I verify Voltage Graph text
    Then I Tap on Voltage Graph down arrow
    Then I verify Voltage text
    Then I verify History text
    Then I Scroll up the page
    Then I verify Hour text
    Then I verify Day text
    Then I verify WEEK text
#    Then I verify MONTH text
    Then I Tap on Day in voltage Graph
    Then I Tap on week in voltage Graph
#    Then I Tap on year in voltage Graph
#    Then I Wait short period for Page to Load
    Then I verify Alerts text
    Then I Tap on Alert toggle if it's already in OFF state
    Then I Scroll the page
    Then I verify Alert-Battery Voltage Below Text
    Then I Tap on Alert-Battery Voltage Below
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I verify the apply button
    Then I Tap on Alert-Battery Voltage Below
    Then I verify Alert-Set Latency Text
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I Tap on Alert-Set Latency
    Then I verify Warnings text
    Then I Tap on Warnings toggle if it's already in OFF state
    Then I verify Warnings-Battery Voltage Below Text
    Then I Tap on Warnings-Battery Voltage Below
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Battery Voltage Below
    Then I verify Warnings-Set Latency Text
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in Battery screen

  @sanity1
  Scenario: Verifying application Batteries screen(Stbd Engine Alert-Battery Voltage Below) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 2nd instance
#    Then I Scroll up the page
#    Then I Tap on Alert-Battery Voltage Below
#    Then I scroll up to maximum value in Alert-Battery Voltage Below carousel
#    Then I Verify Apply button in Alert-Battery Voltage Below
#    Then I Tap on Apply button in Alert-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied voltage is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Stbd Engine Alert-Battery Voltage Below) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 2nd instance
#    Then I Scroll up the page
#    Then I Tap on Alert-Battery Voltage Below
#    Then I scroll up to minimum value in Alert-Battery Voltage Below carousel
#    Then I Verify Apply button in Alert-Battery Voltage Below
#    Then I Tap on Apply button in Alert-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied voltage is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Stbd Engine Alert-Battery Voltage Below) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Scroll the screen till the 2nd instance
    Then I Scroll up the page
    Then I Tap on Alert-Battery Voltage Below
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Battery Voltage Below
    Then I Verify Apply button in Alert-Battery Voltage Below
    Then I Tap on Apply button in Alert-Battery Voltage Below
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied voltage is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Stbd Engine Alert-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 2nd instance
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I scroll to the maximum carousel value in Alert-Set Latency
#    Then I Verify Apply button in Alert-Set Latency
#    Then I Tap on Apply button in Alert-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Stbd Engine Alert-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 2nd instance
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I scroll to the minimum carousel value in Alert-Set Latency
#    Then I Verify Apply button in Alert-Set Latency
#    Then I Tap on Apply button in Alert-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Stbd Engine Alert-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Scroll the screen till the 2nd instance
    Then I Scroll up the page
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Set Latency
    Then I Verify Apply button in Alert-Set Latency
    Then I Tap on Apply button in Alert-Set Latency
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Alert-Set Latency is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Stbd Engine Warnings-Battery Voltage Below) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 2nd instance
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Battery Voltage Below
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Battery Voltage Below
#    Then I Verify Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Battery Voltage Below is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Stbd Engine Warnings-Battery Voltage Below) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 2nd instance
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Battery Voltage Below
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value in Warnings-Battery Voltage Below
#    Then I Verify Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Battery Voltage Below is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Stbd Engine Warnings-Battery Voltage Below) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Scroll the screen till the 2nd instance
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Battery Voltage Below
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Battery Voltage Below
    Then I Verify Apply button in Warnings-Battery Voltage Below
    Then I Tap on Apply button in Warnings-Battery Voltage Below
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Battery Voltage Below is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Stbd Engine Warnings-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 2nd instance
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Set Latency
#    Then I Verify Apply button in Warnings-Set Latency
#    Then I Tap on Apply button in Warnings-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Stbd Engine Warnings-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 2nd instance
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value in Warnings-Set Latency
#    Then I Verify Apply button in Warnings-Set Latency
#    Then I Tap on Apply button in Warnings-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Stbd Engine Warnings-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Scroll the screen till the 2nd instance
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Set Latency
    Then I Verify Apply button in Warnings-Set Latency
    Then I Tap on Apply button in Warnings-Set Latency
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Set Latency is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Batteries(Port-Center Engine) screen UI implementation
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Scroll the screen till the 3rd instance
    Then I verify Batteries header text
    Then I verify Battery status
    Then I verify Voltage Graph text
    Then I Tap on Voltage Graph down arrow
    Then I verify Voltage text
    Then I verify History text
    Then I Scroll up the page
    Then I verify Hour text
    Then I verify Day text
    Then I verify WEEK text
#    Then I verify MONTH text
    Then I Tap on Day in voltage Graph
    Then I Tap on week in voltage Graph
#    Then I Tap on year in voltage Graph
#    Then I Wait short period for Page to Load
    Then I verify Alerts text
    Then I Tap on Alert toggle if it's already in OFF state
    Then I Scroll the page
    Then I verify Alert-Battery Voltage Below Text
    Then I Tap on Alert-Battery Voltage Below
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I verify the apply button
    Then I Tap on Alert-Battery Voltage Below
    Then I verify Alert-Set Latency Text
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I Tap on Alert-Set Latency
    Then I verify Warnings text
    Then I Tap on Warnings toggle if it's already in OFF state
    Then I verify Warnings-Battery Voltage Below Text
    Then I Tap on Warnings-Battery Voltage Below
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Battery Voltage Below
    Then I verify Warnings-Set Latency Text
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in Battery screen

  @sanity1
  Scenario: Verifying application Batteries screen(Port-Center Engine Alert-Battery Voltage Below) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#   Then I Scroll the screen till the 3rd instance
#    Then I Scroll up the page
#    Then I Tap on Alert-Battery Voltage Below
#    Then I scroll up to maximum value in Alert-Battery Voltage Below carousel
#    Then I Verify Apply button in Alert-Battery Voltage Below
#    Then I Tap on Apply button in Alert-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied voltage is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port-Center Engine Alert-Battery Voltage Below) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 3rd instance
#    Then I Scroll up the page
#    Then I Tap on Alert-Battery Voltage Below
#    Then I scroll up to minimum value in Alert-Battery Voltage Below carousel
#    Then I Verify Apply button in Alert-Battery Voltage Below
#    Then I Tap on Apply button in Alert-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied voltage is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Port-Center Engine Alert-Battery Voltage Below) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Scroll the screen till the 3rd instance
    Then I Scroll up the page
    Then I Tap on Alert-Battery Voltage Below
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Battery Voltage Below
    Then I Verify Apply button in Alert-Battery Voltage Below
    Then I Tap on Apply button in Alert-Battery Voltage Below
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied voltage is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port-Center Engine Alert-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 3rd instance
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I scroll to the maximum carousel value in Alert-Set Latency
#    Then I Verify Apply button in Alert-Set Latency
#    Then I Tap on Apply button in Alert-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port-Center Engine Alert-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 3rd instance
#    Then I Scroll up the page
#    Then I Tap on Alert-Set Latency
#    Then I scroll to the minimum carousel value in Alert-Set Latency
#    Then I Verify Apply button in Alert-Set Latency
#    Then I Tap on Apply button in Alert-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Alert-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Port-Center Engine Alert-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Scroll the screen till the 3rd instance
    Then I Scroll up the page
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Set Latency
    Then I Verify Apply button in Alert-Set Latency
    Then I Tap on Apply button in Alert-Set Latency
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Alert-Set Latency is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button


  @sanity1
  Scenario: Verifying application Batteries screen(Port-Center Engine Warnings-Battery Voltage Below) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 3rd instance
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Battery Voltage Below
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Battery Voltage Below
#    Then I Verify Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Battery Voltage Below is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port-Center Engine Warnings-Battery Voltage Below) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 3rd instance
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Battery Voltage Below
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value in Warnings-Battery Voltage Below
#    Then I Verify Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Apply button in Warnings-Battery Voltage Below
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Battery Voltage Below is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Port-Center Engine Warnings-Battery Voltage Below) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Scroll the screen till the 3rd instance
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Battery Voltage Below
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Battery Voltage Below
    Then I Verify Apply button in Warnings-Battery Voltage Below
    Then I Tap on Apply button in Warnings-Battery Voltage Below
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Battery Voltage Below is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port-Center Engine Warnings-Set Latency) Carousel boundary maximum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 3rd instance
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the maximum carousel value in Warnings-Set Latency
#    Then I Verify Apply button in Warnings-Set Latency
#    Then I Tap on Apply button in Warnings-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Batteries screen(Port-Center Engine Warnings-Set Latency) Carousel boundary minimum values Functionality
#    Then I Wait short period for Page to Load
#    Then I Tap on Batteries tile on landing screen
#    Then I Scroll the screen till the 3rd instance
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Tap on Warnings-Set Latency
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I scroll to the minimum carousel value in Warnings-Set Latency
#    Then I Verify Apply button in Warnings-Set Latency
#    Then I Tap on Apply button in Warnings-Set Latency
#    Then I Tap on Ok button
#    Then I Wait for Page to Load
#    Then I Validate Applied minutes in Warnings-Set Latency is displayed
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Batteries screen(Port-Center Engine Warnings-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Batteries tile on landing screen
    Then I Scroll the screen till the 3rd instance
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Set Latency
    Then I Verify Apply button in Warnings-Set Latency
    Then I Tap on Apply button in Warnings-Set Latency
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Set Latency is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button