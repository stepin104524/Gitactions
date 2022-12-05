package com.dometic.Shape_EMEA.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.Shape_EMEA.qa.Pages.Constant_Climate;
import com.dometic.Shape_EMEA.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class ClimateScreen extends Baseclass {
    public SoftAssert softAssert;
    public static int targetedValue;

    @Then("I Tap On Climate Tile In Landing Screen For Shape EMEA User")
    public void iTapOnClimateTileInLandingScreenForShapeEMEAUser() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap On Climate Tile In Landing Screen For Shape EMEA User");
        TaponbuttonaccessabilityID(Constant_Climate.Climate_Tile_Access_Id);
        Thread.sleep(2000);
        System.out.println("Tapped On Climate Tile In Landing Screen");
    }

    @Then("I Scroll The Celcius Temperature Upto Minimum Value")
    public void iScrollTheCelciusTemperatureUptoMinimumValue() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll The Celcius Temperature Upto Minimum Value");
        String highlightedValue = driver.findElement(By.xpath(Constant_Climate.Climate_Tile_Temperature_In_Celcius)).getAttribute("text");
        int highlightedValueInt = Integer.parseInt(highlightedValue);
        int targetedValue = highlightedValueInt - Constant_Climate.Climate_Tile_Minimum_Temperature_Value;
        for (int i = 0; i < targetedValue; i++) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(100, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(400, 600));
            action.release().perform();
        }
        System.out.println("Scroll Till The Minimum Value");
    }

    @Then("I Tap On Apply Button In Climate For Minimum Carousel Value")
    public void iTapOnApplyButtonInClimateForMinimumCarouselValue() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap On Apply Button In Climate For Minimum Carousel Value");
        if (driver.findElementsByAccessibilityId(Constant_Climate.Climate_Tile_Temperature_Apply_button_Access_Id).size() != 0) {
            TaponbuttonaccessabilityID(Constant_Climate.Climate_Tile_Temperature_Apply_button_Access_Id);
            Thread.sleep(2000);
        }
        System.out.println("Tapped On Apply Button In Climate Screen");
    }

    @Then("I Tap On Apply Button In Climate For Maximum Carousel Value")
    public void iTapOnApplyButtonInClimateForMaximumCarouselValue() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap On Apply Button In Climate For Maximum Carousel Value");
        if (driver.findElementsByAccessibilityId(Constant_Climate.Climate_Tile_Temperature_Apply_button_Access_Id).size() != 0) {
            TaponbuttonaccessabilityID(Constant_Climate.Climate_Tile_Temperature_Apply_button_Access_Id);
            Thread.sleep(2000);
        }
        System.out.println("Tapped On Apply Button In Climate Screen");
    }

    @Then("I Tap On Back Button In Climate Screen")
    public void iTapOnBackButtonInClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap On Back Button In Climate Screen");
        TaponbuttonaccessabilityID(Constant_Climate.Climate_Tile_Temperature_Back_button_Access_Id);
        System.out.println("Tapped On Back Button In Climate Screen");
    }

    @Then("I Validated The Applied Minimum Value Is Displayed")
    public void iValidatedTheAppliedMinimumValueIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated The Applied Minimum Value Is Displayed");
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.attributeContains(driver.findElementByAccessibilityId(Constant_Climate.Climate_Tile_Temperature_Access_Id), "text", "16"));
        Thread.sleep(2000);

        asserttextValidationAccessibility(String.valueOf(Constant_Climate.Climate_Tile_Minimum_Temperature_Value), Constant_Climate.Climate_Tile_Temperature_Access_Id);

        System.out.println("Validated The Minimum Applied Value Is Displayed in Landing Page");
    }

    @Then("I Scroll The Celcius Temperature Upto Maximum Value")
    public void iScrollTheCelciusTemperatureUptoMaximumValue() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll The Celcius Temperature Upto Maximum Value");
        String highlightedValue = driver.findElement(By.xpath(Constant_Climate.Climate_Tile_Temperature_In_Celcius)).getAttribute("text");
        int highlightedValueInt = Integer.parseInt(highlightedValue);
        int targetedValue = Constant_Climate.Climate_Tile_Maximum_Temperature_Value - highlightedValueInt;
        for (int i = 0; i < targetedValue; i++) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(100, 600));
            action.release().perform();
        }
        System.out.println("Scroll The Carousel Till The Maximum Value");
    }

    @Then("I Validated The Applied Maximum Value Is Displayed")
    public void iValidatedTheAppliedMaximumValueIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated The Applied Maximum Value Is Displayed");
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.attributeContains(driver.findElementByAccessibilityId(Constant_Climate.Climate_Tile_Temperature_Access_Id), "text", "31"));
        Thread.sleep(2000);

        asserttextValidationAccessibility(String.valueOf(Constant_Climate.Climate_Tile_Maximum_Temperature_Value), Constant_Climate.Climate_Tile_Temperature_Access_Id);

        System.out.println("Validated The Maximum Applied Value Is Displayed in Landing Page");
    }

    @Then("I Tap on Hamburger Menu Button")
    public void iTapOnHamburgerMenuButton() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Hamburger Menu Button");
        TaponbuttonaccessabilityID(Constant_Climate.Climate_Tile_Hamburger_Button_Access_Id);
        Thread.sleep(2000);
        System.out.println("Tapped On Hamburger Menu Button In Landing Screen");
    }

    @Then("I Tap on App Settings Label")
    public void iTapOnAppSettingsLabel() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on App Settings Label");
        TaponbuttonaccessabilityID(Constant_Climate.Climate_Tile_App_Settings_Access_Id);
        Thread.sleep(2000);
        System.out.println("Tapped On App Settings Label In Hamburger Menu");
    }

    @Then("I Change The Temperature From Celcius To Fahrenheit")
    public void iChangeTheTemperatureFromCelciusToFahrenheit() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Change The Temperature From Celcius To Fahrenheit");
        TaponbuttonaccessabilityID(Constant_Climate.Climate_Tile_Fahrenheit_Text_Access_Id);
        Thread.sleep(2000);
        System.out.println("Tapped On Fahrenheit In App Settings Screen");
    }

    @Then("I Tap on Back Button in App Settings Screen")
    public void iTapOnBackButtonInAppSettingsScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in App Settings Screen");
        TaponbuttonaccessabilityID(Constant_Climate.Climate_Tile_App_Settings_Back_Button_Access_Id);
        Thread.sleep(2000);
        System.out.println("Tapped On Back Button In App Settings Screen");
    }

    @Then("I Scroll The Fahrenheit Temperature Upto Minimum Value")
    public void iScrollTheFahrenheitTemperatureUptoMinimumValue() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll The Fahrenheit Temperature Up to Minimum Value");

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(100, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(400, 600));
        action.release().perform();

        TouchAction action1 = new TouchAction(driver);
        action1.press(PointOption.point(400, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(100, 600));
        action1.release().perform();

        String highlightedValue = driver.findElement(By.xpath(Constant_Climate.Climate_Tile_Temperature_In_Fahrenheit)).getAttribute("text");
        int highlightedValueInt = Integer.parseInt(highlightedValue);
        int targetedValue = highlightedValueInt - Constant_Climate.Climate_Tile_Minimum_Fahrenheit_Temperature_Value;
        for (int i = 0; i < targetedValue; i++) {
            TouchAction action2 = new TouchAction(driver);
            action2.press(PointOption.point(100, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(400, 600));
            action2.release().perform();
        }
        System.out.println("Scroll The Fahrenheit Temperature Up to Minimum Value");
    }

    @Then("I Validated The Applied Minimum Value\\(Fahrenheit) Is Displayed")
    public void iValidatedTheAppliedMinimumValueFahrenheitIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated The Applied Minimum Value(Fahrenheit) Is Displayed");
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.attributeContains(driver.findElementByAccessibilityId(Constant_Climate.Climate_Tile_Temperature_Access_Id), "text", "61"));
        Thread.sleep(2000);

        asserttextValidationAccessibility(String.valueOf(Constant_Climate.Climate_Tile_Minimum_Fahrenheit_Temperature_Value), Constant_Climate.Climate_Tile_Temperature_Access_Id);

        System.out.println(driver.findElementByAccessibilityId(Constant_Climate.Climate_Tile_Temperature_Access_Id).getText());
        System.out.println(Constant_Climate.Climate_Tile_Minimum_Fahrenheit_Temperature_Value);
        System.out.println("Validated The Minimum Applied Value Is Displayed in Landing Page");
    }

    @Then("I Scroll The Fahrenheit Temperature Upto Maximum Value")
    public void iScrollTheFahrenheitTemperatureUptoMaximumValue() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll The Fahrenheit Temperature Up to Maximum Value");

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(100, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(400, 600));
        action.release().perform();

        TouchAction action1 = new TouchAction(driver);
        action1.press(PointOption.point(400, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(100, 600));
        action1.release().perform();

        String highlightedValue = driver.findElement(By.xpath(Constant_Climate.Climate_Tile_Temperature_In_Fahrenheit)).getAttribute("text");
        int highlightedValueInt = Integer.parseInt(highlightedValue);
        int targetedValue = Constant_Climate.Climate_Tile_Maximum_Fahrenheit_Temperature_Value - highlightedValueInt;
        for (int i = 0; i < targetedValue; i++) {
            TouchAction action2 = new TouchAction(driver);
            action2.press(PointOption.point(400, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(100, 600));
            action2.release().perform();
        }

        System.out.println("Scroll The Fahrenheit Temperature Up to Maximum Value");
    }

    @Then("I Validated The Applied Maximum Value\\(Fahrenheit) Is Displayed")
    public void iValidatedTheAppliedMaximumValueFahrenheitIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated The Applied Maximum Value(Fahrenheit) Is Displayed");
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.attributeContains(driver.findElementByAccessibilityId(Constant_Climate.Climate_Tile_Temperature_Access_Id), "text", "88"));
        Thread.sleep(2000);

        asserttextValidationAccessibility(String.valueOf(Constant_Climate.Climate_Tile_Maximum_Fahrenheit_Temperature_Value), Constant_Climate.Climate_Tile_Temperature_Access_Id);

        System.out.println("Validated The Maximum Applied Value Is Displayed in Landing Page");

    }

    @Then("I Change The Temperature From Fahrenheit To Celcius")
    public void iChangeTheTemperatureFromFahrenheitToCelcius() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Change The Temperature From Fahrenheit To Celcius");
        TaponbuttonaccessabilityID(Constant_Climate.Climate_Tile_Celcius_Text_Access_Id);
        Thread.sleep(2000);
        System.out.println("Tapped On Celcius In App Settings Screen");
    }


    @Then("I tap on the onboarded Shape EMEA device")
    public void iTapOnTheOnboardedShapeEMEADevice() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the onboarded Shape EMEA device");
        TaponbuttonaccessabilityID(Constant_Climate.Onboarded_device_access_id);
    }

    @Then("I verify Climate header text")
    public void iVerifyClimateHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate header text");
        asserttextValidation(Constant_Climate.Climate_header_text, Constant_Climate.Climate_header_text_xpath);
        System.out.println("Climate header text verified");
    }

    @Then("I verify back button in Climate screen")
    public void iVerifyBackButtonInClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify back button in Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Climate.Climate_Tile_Temperature_Back_button_Access_Id));
        System.out.println("Climate back button verified");
    }

    @Then("I verify Inside text in Climate screen")
    public void iVerifyInsideTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Inside text in Climate screen");
        asserttextValidation(Constant_Climate.Inside_text, Constant_Climate.Inside_text_xpath_OR_operator);
        System.out.println("Inside text verified");
    }

    @Then("I verify Inside temperature in Climate screen")
    public void iVerifyInsideTemperatureInClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Inside temperature in Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Climate.Inside_temp_access_id));
        System.out.println("Inside temperature verified");
    }

    @Then("I verify Inside temperature unit in Climate screen")
    public void iVerifyInsideTemperatureUnitInClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Inside temperature unit in Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Climate.Inside_temp_unit_access_id));
        System.out.println("Inside temperature unit verified");
    }


    @Then("I verify if Fan speed is displayed under temperature")
    public void iVerifyIfFanSpeedIsDisplayedUnderTemperature() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if Fan speed is displayed under temperature");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Climate.Fan_speed_option_under_temp_access_id));
        System.out.println("Fan speed is displayed under temperature");
    }

    @Then("I verify Power text in Climate screen")
    public void iVerifyPowerTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power text in Climate screen");
        asserttextValidation(Constant_Climate.Power_text, Constant_Climate.Power_text_xpath);
        System.out.println("Power text is verified");
    }

    @Then("I verify Power toggle in Climate screen")
    public void iVerifyPowerToggleInClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power toggle in Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Climate.Power_toggle_access_id));
        System.out.println("Power toggle is verified");
    }

    @Then("I verify Climate mode text in Climate screen")
    public void iVerifyClimateModeTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate mode text in Climate screen");
        asserttextValidation(Constant_Climate.Climate_mode_text, Constant_Climate.Climate_mode_text_xpath);
        System.out.println("Climate mode text is verified");
    }

    @Then("I verify Climate mode selected option in Climate screen")
    public void iVerifyClimateModeSelectedOptionInClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate mode selected option in Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Climate.Climate_mode_options_access_id));
        System.out.println("Climate mode selected option is verified");
    }

    @Then("I verify Fan speed text in Climate screen")
    public void iVerifyFanSpeedTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Fan speed text in Climate screen");
        asserttextValidation(Constant_Climate.Fan_speed_text, Constant_Climate.Fan_speed_text_xpath);
        System.out.println("Fan speed text is verified");
    }

    @Then("I verify Fan speed selected option in Climate screen")
    public void iVerifyFanSpeedSelectedOptionInClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Fan speed selected option in Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Climate.Fan_speed_options_access_id));
        System.out.println("Fan speed selected option is verified");
    }

    @Then("I verify Sleep text in Climate screen")
    public void iVerifySleepTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Sleep text in Climate screen");
        asserttextValidation(Constant_Climate.Sleep_text, Constant_Climate.Sleep_text_xpath);
        System.out.println("Sleep text is verified");
    }

    @Then("I verify Sleep toggle in Climate screen")
    public void iVerifySleepToggleInClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Sleep toggle in Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Climate.Sleep_toggle_access_id));
        System.out.println("Sleep toggle is verified");
    }

    @Then("I verify Lights text in Climate screen")
    public void iVerifyLightsTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Lights text in Climate screen");
        asserttextValidation(Constant_Climate.Lights_text, Constant_Climate.Lights_text_xpath);
        System.out.println("Lights text is verified");
    }

    @Then("I verify Internal text in Climate screen")
    public void iVerifyInternalTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Internal text in Climate screen");
        asserttextValidation(Constant_Climate.Internal_text, Constant_Climate.Internal_text_xpath);
        System.out.println("Internal text is verified");
    }

    @Then("I verify Internal toggle in Climate screen")
    public void iVerifyInternalToggleInClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Internal toggle in Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Climate.Internal_toggle_access_id));
        System.out.println("Internal toggle is verified");
    }

    @Then("I verify Internal brightness text in Climate screen")
    public void iVerifyInternalBrightnessTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Internal brightness text in Climate screen");
        asserttextValidation(Constant_Climate.Internal_Brightness_text, Constant_Climate.Internal_brightness_text_xpath);
        System.out.println("Internal brightness text is verified");
    }

    @Then("I verify if internal brightness option is displayed")
    public void iVerifyIfInternalBrightnessOptionIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if internal brightness option is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Climate.Internal_brightness_options_access_id));
        System.out.println("Internal brightness option is verified");
    }

    @Then("I verify Timer text in Climate screen")
    public void iVerifyTimerTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Timer text in Climate screen");
        asserttextValidation(Constant_Climate.Timer_text, Constant_Climate.Timer_text_xpath);
        System.out.println("Timer text is verified");
    }

    @Then("I verify Auto On text in Climate screen")
    public void iVerifyAutoOnTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Auto On text in Climate screen");
        asserttextValidation(Constant_Climate.Auto_ON_text, Constant_Climate.Auto_ON_text_xpath);
        System.out.println("Auto On text is verified");
    }

    @Then("I verify Auto Off text in Climate screen")
    public void iVerifyAutoOffTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Auto Off text in Climate screen");
        asserttextValidation(Constant_Climate.Auto_OFF_text, Constant_Climate.Auto_OFF_text_xpath);
        System.out.println("Auto Off text is verified");
    }

    @Then("I verify status text in Climate screen")
    public void iVerifyStatusTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify status text in Climate screen");
        asserttextValidation(Constant_Climate.Status_text, Constant_Climate.Status_text_xpath);
        System.out.println("status text is verified");
    }

    @Then("I verify Status toggle in Climate screen")
    public void iVerifyStatusToggleInClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Status toggle in Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Climate.Status_togge_access_id));
        System.out.println("status toggle is verified");
    }

    @Then("I verify Scheduled At text in Climate screen")
    public void iVerifyScheduledAtTextInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Scheduled At text in Climate screen");
        asserttextValidation(Constant_Climate.Scheduled_At_text, Constant_Climate.Scheduled_AT_text_xpath);
        System.out.println("status text is verified");
    }

    @Then("I scroll the screen")
    public void iScrollTheScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll the screen");
        Basestepdefinition.verticalSwipe(0.8, 0.3, 0.5);
        System.out.println("scroll up the screen");
    }

    @Then("I Scroll The Celcius Temperature For Random Value")
    public void iScrollTheCelciusTemperatureForRandomValue() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll The Celcius Temperature For Random Value");

        int targetedValue = Constant_Climate.Climate_Tile_Random_Temperature_Value;
        for (int i = 0; i < targetedValue; i++) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(100, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(400, 600));
            action.release().perform();
        }
        System.out.println("I Scroll The Celcius Temperature For Random Value");
    }

    @Then("I Validated The Applied Celcius Value Is Displayed")
    public void iValidatedTheAppliedValueIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated The Applied Maximum Value Is Displayed");
        int value = Constant_Climate.Climate_Tile_Maximum_Temperature_Value - Constant_Climate.Climate_Tile_Random_Temperature_Value;
        System.out.println("Value:" + value);
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.attributeContains(driver.findElementByAccessibilityId(Constant_Climate.Climate_Tile_Temperature_Access_Id), "text", String.valueOf(value)));
        Thread.sleep(2000);

        asserttextValidationAccessibility(String.valueOf(value), Constant_Climate.Climate_Tile_Temperature_Access_Id);

        System.out.println("Validated The Maximum Applied Value Is Displayed in Landing Page");
    }

    @Then("I Scroll The Fahrenheit Temperature For Random Value")
    public void iScrollTheFahrenheitTemperatureForRandomValue() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll The Fahrenheit Temperature For Random Value");


        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(100, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(400, 600));
        action.release().perform();

        TouchAction action1 = new TouchAction(driver);
        action1.press(PointOption.point(400, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(100, 600));
        action1.release().perform();

        String highlightedValue = driver.findElement(By.xpath(Constant_Climate.Climate_Tile_Temperature_In_Fahrenheit)).getAttribute("text");
        int highlightedValueInt = Integer.parseInt(highlightedValue);

        targetedValue = highlightedValueInt + Constant_Climate.Climate_Tile_Random_Temperature_Value;
        if (targetedValue < 88) {
            for (int i = 0; i < Constant_Climate.Climate_Tile_Random_Temperature_Value; i++) {
                TouchAction action2 = new TouchAction(driver);
                action2.press(PointOption.point(400, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(100, 600));
                action2.release().perform();
            }
        }

        System.out.println("I Scroll The Fahrenheit Temperature For Random Value");
    }

    @Then("I Validated The Applied Fahrenheit Value Is Displayed")
    public void iValidatedTheAppliedFahrenheitValueIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated The Applied Fahrenheit Value Is Displayed");
        System.out.println("Value:" + targetedValue);
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.attributeContains(driver.findElementByAccessibilityId(Constant_Climate.Climate_Tile_Temperature_Access_Id), "text", String.valueOf(targetedValue)));
        Thread.sleep(2000);

        asserttextValidationAccessibility(String.valueOf(targetedValue), Constant_Climate.Climate_Tile_Temperature_Access_Id);

        System.out.println("Validated The Applied Fahrenheit Value Is Displayed");
    }

    @Then("I Tap on the Power toggle in Climate screen if its in OFF state")
    public void iTapOnThePowerToggleInClimateScreenIfItsInOFFState() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Power toggle in Climate screen if its in OFF state");
        if (driver.findElements(By.xpath(Constant_Climate.Climate_mode_text_xpath)).size() == 0) {
            TaponbuttonaccessabilityID(Constant_Climate.Power_toggle_access_id);
            Thread.sleep(5000);
        }

        System.out.println("Tapped on the Power toggle in Climate screen if its in OFF state");

    }
}
