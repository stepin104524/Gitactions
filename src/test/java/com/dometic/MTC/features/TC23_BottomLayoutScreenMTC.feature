Feature: Verifying application Bottom Layout Screen in Dometic Marine application

  @First1 @sanity1
  Scenario: Verifying application Bottom Layout screen UI
    Then I Wait short period for Page to Load
    Then I Verify Home option in Bottom layout
    Then I Verify Areas option in Bottom layout
    Then I Verify Proride option in Bottom layout
    Then I Verify Switching option in Bottom layout
    Then I Verify Modes option in Bottom layout

  @sanity1
  Scenario: Verifying application Bottom Layout screen(Areas Options) UI
    Then I Tap on Areas option in Bottom layout
    Then I verify AREAS header text is displayed

  @sanity1
  Scenario: Verifying application Bottom Layout screen(Proride Options) UI
    Then I Tap on Proride option in Bottom layout
    Then I verify PRORIDE header text is displayed

  @sanity1
  Scenario: Verifying application Bottom Layout screen(Switching Options) UI
    Then I Tap on Switching option in Bottom layout
    Then I verify SWITCHING header text is displayed
    Then I verify All Label text is displayed
    Then I verify Lights Label text is displayed
    Then I verify Pumps Label text is displayed
    Then I verify Others Label text is displayed
    Then I verify Horn symbol is displayed
    Then I verify Horn label is displayed
    Then I verify Power Pole symbol is displayed
    Then I verify Power Pole label is displayed
    Then I verify Wiper symbol is displayed
    Then I verify Wiper label is displayed
    Then I verify NightMode symbol is displayed
    Then I verify NightMode label is displayed
    Then I verify Fishing Mode symbol is displayed
    Then I verify Fishing Mode label is displayed
    Then I verify Cruising Mode symbol is displayed
    Then I verify Cruising Mode label is displayed

  @sanity1
  Scenario: Verifying application Bottom Layout screen(Modes Options) UI
    Then I Tap on Modes option in Bottom layout
    Then I verify MODES header text is displayed
    Then I verify All Label text is displayed
    Then I verify Proride Label text is displayed
    Then I verify Switching Label text is displayed
    Then I verify Others Label text is displayed
    Then I verify NightMode(MODES) symbol is displayed
    Then I verify NightMode(MODES) label is displayed
    Then I verify Fishing Mode(MODES) symbol is displayed
    Then I verify Fishing Mode(MODES) label is displayed
    Then I Tap on Home option in Bottom layout
