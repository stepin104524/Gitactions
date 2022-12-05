Feature: Verifying application Landing Screen in Dometic USLTV application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Landing Screen functionality
    Then I Tap on LATER Button
    Then I Tap on cancel button in Upgrade Firmware

#--------------------------------------------------------------------------------
  @First @sanity @Regression
  Scenario: Verifying application landing screen UI
#    Then I Tap on AMTH tile in Home screen
    Then I Wait for Page to Load
    Then I verify the climate tile text in the landing screen
    Then I verify the climate tile warning icon
    Then I verify the climate tile card unit text
    Then I verify the climate tile main card
    Then I verify the Climate tile page control
    Then I verify the Power tile text in the landing screen
    Then I verify the power tile main card text
    Then I verify the power tile card unit text
    Then I verify the power tile House Battery text
    Then I verify the tanks tile text in landing screen
    Then I verify the tanks tile page control
    Then I verify the Bottom Layout All text
    Then I verify the Bottom layout All tab bar item
    Then I verify the Bottom layout climate text
    Then I verify the Bottom layout climate tab bar item
    Then I verify the Bottom layout Devices text
    Then I Bottom layout Devices tab bar item
    Then I verify the Bottom layout Tanks text
    Then I verify the Bottom layout Tanks tab bar item
    Then I tap on Hamburger
    Then I tap on Home icon in settings screen page

#--------------------------------------------------------------------------------


  @sanity1
  Scenario: Verifying application Bottom Layout screen functionality
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on climate option in the Bottom  layout of Landing screen
    Then I Validated Corresponding Climate tile is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Devices tile is displayed
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Tank tile is displayed
    Then I Tap on Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(Tile View-All Devices) functionality
    Then I Wait short period for Page to Load
    Then I Tap on View option button in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Tile View Options
    Then I Tap on All Devices
    Then I Tap on Cancel Button
    Then I Wait short period for Page to Load
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on climate option in the Bottom  layout of Landing screen
    Then I Validated Corresponding Climate tile is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Devices tile is displayed
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Tank tile is displayed
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(Tile View-Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button
    Then I Wait short period for Page to Load
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on climate option in the Bottom  layout of Landing screen
    Then I Validated Corresponding Climate tile is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Devices tile is displayed
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Tank tile is displayed
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(Tile View-Non Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Non Connected Devices
    Then I Tap on Cancel Button
    Then I Wait short period for Page to Load
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Tap on Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(List View-All Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on List View Options
    Then I Tap on All Devices
    Then I Tap on Cancel Button
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on climate option in the Bottom  layout of Landing screen
    Then I Validated Corresponding Climate tile is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Devices tile is displayed
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Tank tile is displayed
    Then I Tap on Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(List View-Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on climate option in the Bottom  layout of Landing screen
    Then I Validated Corresponding Climate tile is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Devices tile is displayed
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Tank tile is displayed
    Then I Tap on Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(List View-Non Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Non Connected Devices
    Then I Tap on Cancel Button
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Tap on Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All option in the Bottom layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on View option button in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Tile View Options
    Then I Tap on All Devices
    Then I Tap on Cancel Button
    Then I Wait short period for Page to Load



  @sanity
  Scenario: Verifying application Bottom Layout UI and functionality
    Then I Tap on AMTH tile in Home screen
    Then I Wait for Page to Load
    Then I Verify all icon in the Bottom layout of Landing screen
    Then I Verify the All icon text in the Bottom layout of Landing screen
    Then I verify climate icon in the Bottom layout of Landing screen
    Then I Verify the climate icon text in the Bottom  layout of Landing screen
    Then I verify devices icon in the Bottom layout of Landing screen
    Then I Verify the Device icon text in the Bottom  layout of Landing screen
    Then I verify tanks icon in the Bottom layout of Landing screen
    Then I Verify the Tanks icon text in the Bottom  layout of Landing screen
    Then I verify scenes icon in the Bottom layout of Landing screen
    Then I Verify the Scene icon text in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on climate option in the Bottom  layout of Landing screen
    Then I Validated Corresponding Climate tile is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Devices tile is displayed
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Tank tile is displayed
#    Then I Tap on Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All option in the Bottom layout of Landing screen
    Then I Wait for Page to Load
    Then I tap on Hamburger
    Then I tap on Home icon in settings screen page

