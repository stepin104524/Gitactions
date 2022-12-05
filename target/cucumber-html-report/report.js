$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/dometic/Shape_EMEA/features/TC01_LaunchScreen.feature");
formatter.feature({
  "name": "Verifying application Splash screen in Dometic Shape EMEA application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Launching the application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Basestepdefinition.iLaunchTheApplicationOn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/com/dometic/Shape_EMEA/features/TC02_SplashScreen.feature");
formatter.feature({
  "name": "Verifying application Splash screen in Dometic Shape EMEA application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying application Splash screen Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on Allow button in Permission popup in Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.tap_on_Allow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Welcome Text is displaying in Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginScreen.assert_Welcome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify Page title is displayed in Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginScreen.Login_Page_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/com/dometic/Shape_EMEA/features/TC06_DashboardScreen.feature");
formatter.feature({
  "name": "Verifying application DashBoard Screen in Dometic Shape EMEA application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying application Login Functionality with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter Valid Email in Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginScreen.iEnterValidEmailInLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Valid Password in Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginScreen.iEnterValidPasswordInLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on an Login button in Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginScreen.iTapOnAnLoginButtonInLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify successfully navigated to Dash Board screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginScreen.iVerifySuccessfullyNavigatedToOnBoardingScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying application DashBoard screen functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I entered into Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "OnboardingScreen.iEnteredIntoHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on Dashboard Tile",
  "keyword": "Then "
});
formatter.match({
  "location": "OnboardingScreen.iTapOnMarineTile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait until Landing screen is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "OnboardingScreen.iWaitUntilLandingScreenIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/com/dometic/Shape_EMEA/features/TC07_ClimateScreen.feature");
formatter.feature({
  "name": "Verifying application Setting Screen in Dometic Shape EMEA application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying Climate page UI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on Hamburger Menu Button",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnHamburgerMenuButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on Home option in Settings screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnHomeOptionInSettingsScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the onboarded Shape EMEA device",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnTheOnboardedShapeEMEADevice()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Climate Tile In Landing Screen For Shape EMEA User",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnClimateTileInLandingScreenForShapeEMEAUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Climate header text",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyClimateHeaderText()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify back button in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyBackButtonInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Inside text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyInsideTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Inside temperature in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyInsideTemperatureInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Inside temperature unit in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyInsideTemperatureUnitInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if Fan speed is displayed under temperature",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyIfFanSpeedIsDisplayedUnderTemperature()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Power text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyPowerTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Power toggle in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyPowerToggleInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on the Power toggle in Climate screen if its in OFF state",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnThePowerToggleInClimateScreenIfItsInOFFState()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Climate mode text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyClimateModeTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Climate mode selected option in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyClimateModeSelectedOptionInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Fan speed text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyFanSpeedTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Fan speed selected option in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyFanSpeedSelectedOptionInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Sleep text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifySleepTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Sleep toggle in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifySleepToggleInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Lights text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyLightsTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Internal text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyInternalTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Internal toggle in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyInternalToggleInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Internal brightness text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyInternalBrightnessTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if internal brightness option is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyIfInternalBrightnessOptionIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scroll the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iScrollTheScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Timer text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyTimerTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Auto On text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyAutoOnTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Auto Off text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyAutoOffTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify status text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyStatusTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Status toggle in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyStatusToggleInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Scheduled At text in Climate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iVerifyScheduledAtTextInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Back Button In Climate Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnBackButtonInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Application Climate screen Carousel Boundary Minimum Values(Celcius) Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on Hamburger Menu Button",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnHamburgerMenuButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on App Settings Label",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnAppSettingsLabel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Change The Temperature From Fahrenheit To Celcius",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iChangeTheTemperatureFromFahrenheitToCelcius()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on Back Button in App Settings Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnBackButtonInAppSettingsScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Climate Tile In Landing Screen For Shape EMEA User",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnClimateTileInLandingScreenForShapeEMEAUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Scroll The Celcius Temperature Upto Minimum Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iScrollTheCelciusTemperatureUptoMinimumValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Apply Button In Climate For Minimum Carousel Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnApplyButtonInClimateForMinimumCarouselValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Back Button In Climate Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnBackButtonInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validated The Applied Minimum Value Is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iValidatedTheAppliedMinimumValueIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Application Climate screen Carousel Boundary Maximum Values(Celcius) Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Climate Tile In Landing Screen For Shape EMEA User",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnClimateTileInLandingScreenForShapeEMEAUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Scroll The Celcius Temperature Upto Maximum Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iScrollTheCelciusTemperatureUptoMaximumValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Apply Button In Climate For Maximum Carousel Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnApplyButtonInClimateForMaximumCarouselValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Back Button In Climate Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnBackButtonInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validated The Applied Maximum Value Is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iValidatedTheAppliedMaximumValueIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Application Climate screen Carousel Boundary Random Values(Celcius) Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Climate Tile In Landing Screen For Shape EMEA User",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnClimateTileInLandingScreenForShapeEMEAUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Scroll The Celcius Temperature For Random Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iScrollTheCelciusTemperatureForRandomValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Apply Button In Climate For Maximum Carousel Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnApplyButtonInClimateForMaximumCarouselValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Back Button In Climate Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnBackButtonInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validated The Applied Celcius Value Is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iValidatedTheAppliedValueIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Application Climate screen Carousel Boundary Minimum Values(Fahrenheit) Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on Hamburger Menu Button",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnHamburgerMenuButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on App Settings Label",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnAppSettingsLabel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Change The Temperature From Celcius To Fahrenheit",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iChangeTheTemperatureFromCelciusToFahrenheit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on Back Button in App Settings Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnBackButtonInAppSettingsScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Climate Tile In Landing Screen For Shape EMEA User",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnClimateTileInLandingScreenForShapeEMEAUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Scroll The Fahrenheit Temperature Upto Minimum Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iScrollTheFahrenheitTemperatureUptoMinimumValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Apply Button In Climate For Minimum Carousel Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnApplyButtonInClimateForMinimumCarouselValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Back Button In Climate Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnBackButtonInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validated The Applied Minimum Value(Fahrenheit) Is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iValidatedTheAppliedMinimumValueFahrenheitIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Application Climate screen Carousel Boundary Maximum Values(Fahrenheit) Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Climate Tile In Landing Screen For Shape EMEA User",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnClimateTileInLandingScreenForShapeEMEAUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Scroll The Fahrenheit Temperature Upto Maximum Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iScrollTheFahrenheitTemperatureUptoMaximumValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Apply Button In Climate For Maximum Carousel Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnApplyButtonInClimateForMaximumCarouselValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Back Button In Climate Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnBackButtonInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validated The Applied Maximum Value(Fahrenheit) Is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iValidatedTheAppliedMaximumValueFahrenheitIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Application Climate screen Carousel Boundary Random Values(Fahrenheit) Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Climate Tile In Landing Screen For Shape EMEA User",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnClimateTileInLandingScreenForShapeEMEAUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Scroll The Fahrenheit Temperature For Random Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iScrollTheFahrenheitTemperatureForRandomValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Apply Button In Climate For Maximum Carousel Value",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnApplyButtonInClimateForMaximumCarouselValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap On Back Button In Climate Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnBackButtonInClimateScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validated The Applied Fahrenheit Value Is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iValidatedTheAppliedFahrenheitValueIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on Hamburger Menu Button",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnHamburgerMenuButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on App Settings Label",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnAppSettingsLabel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Change The Temperature From Fahrenheit To Celcius",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iChangeTheTemperatureFromFahrenheitToCelcius()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on Back Button in App Settings Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ClimateScreen.iTapOnBackButtonInAppSettingsScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/com/dometic/Shape_EMEA/features/TC08_Settings.feature");
formatter.feature({
  "name": "Verifying application Setting Screen in Dometic Shape EMEA application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying application Settings screen UI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I verify the hamburger menu in landing screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyTheHamburgerMenuInLandingScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on the hamburger menu in landing screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheHamburgerMenuInLandingScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the settings screen back button",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyTheSettingsScreenBackButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if user profile photo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyIfUserProfilePhotoIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if username is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyIfUsernameIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if user email is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyIfUserEmailIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify View Edit Account text in Settings page",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyViewEditAccountTextInSettingsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Home text in Settings page",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyHomeTextInSettingsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Notification Settings text in Settings page",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyNotificationSettingsTextInSettingsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Device Management text in Settings page",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyDeviceManagementTextInSettingsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify App Settings text in Settings page",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyAppSettingsTextInSettingsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Logout text in Settings page",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyLogoutTextInSettingsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Version text in Settings page",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iVerifyVersionTextInSettingsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying application Settings screen Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on Home option in Settings screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnHomeOptionInSettingsScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on the hamburger menu in landing screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheHamburgerMenuInLandingScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the View edit account option",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheViewEditAccountOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the back button in Account settings",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheBackButtonInAccountSettings()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on the hamburger menu in landing screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheHamburgerMenuInLandingScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the Notification Settings option",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheNotificationSettingsOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the back button in Manage notifications",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheBackButtonInManageNotifications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on the hamburger menu in landing screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheHamburgerMenuInLandingScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the Device Management option",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheDeviceManagementOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the back button in Device Management",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheBackButtonInDeviceManagement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on the hamburger menu in landing screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheHamburgerMenuInLandingScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the App Settings option",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheAppSettingsOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the back button in app settings",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheBackButtonInAppSettings()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Tap on the hamburger menu in landing screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheHamburgerMenuInLandingScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Wait short period for Page to Load",
  "keyword": "Then "
});
formatter.match({
  "location": "Basestepdefinition.I_Wait_short_for_Page_to_Load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the Logout option",
  "keyword": "Then "
});
formatter.match({
  "location": "Settings.iTapOnTheLogoutOption()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});