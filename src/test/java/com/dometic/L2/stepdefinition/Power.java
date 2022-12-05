package com.dometic.L2.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L2.qa.Pages.Constant_landingscreen;
import com.dometic.L2.qa.Pages.Constant_power;
import com.dometic.L2.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Power extends Baseclass {
    public static String text;
    @Then("I verify Power-progressIndicator in Power")
    public void iVerifyPowerProgressIndicatorInPower() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power-progressIndicator in Power");
        text = driver.findElementByAccessibilityId(Constant_power.L2Powerpagepower_percentage_access_id).getText();
    }

    @Then("I Validated Power-progressIndicator Percentage is displayed in Landing screen")
    public void iValidatedPowerProgressIndicatorPercentageIsDisplayedInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated Power-progressIndicator Percentage is displayed in Landing screen");
        System.out.println(text);
        String powerMainContent = driver.findElement(By.xpath(Constant_power.L2_power_percentage_xpath)).getText();
        if(text.contains(powerMainContent)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Verify Start button in power main screen")
    public void iVerifyStartButtonInPowerMainScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Start button in power main screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.L2Powerpagepower_start_button_access_id));
        System.out.println("Start button is verified");
    }

    @Then("I Verify Stop button in power main screen")
    public void iVerifyStopButtonInPowerMainScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Stop button in power main screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.L2Powerpagepower_stop_button_access_id));
        System.out.println("Stop button is verified");
    }

    @Then("I Verify BATTERIES header text")
    public void iVerifyBATTERIESHeaderText() throws Throwable {
        asserttextValidationAccessibility(Constant_power.BATTERIES_header_text,Constant_power.BATTERIES_header_text_access_id);
        System.out.println("BATTERIES header text is verified");
    }

    @Then("I Verify the battery voltage icon")
    public void iVerifyTheBatteryVoltageIcon() {
        iselementdisplayedaccessabilityId(Constant_power.powerScreen_batteryCarousel_circle_Engine1_access_id);
        iselementdisplayedaccessabilityId(Constant_power.powerScreen_batteryCarousel_circle_STBD_access_id);
        iselementdisplayedaccessabilityId(Constant_power.powerScreen_batteryCarousel_circle_House_access_id);
    }

    @Then("I verify the Engine{int} text")
    public void iVerifyTheEngineText(int arg0) throws Throwable {
        asserttext(Constant_power.powerScreen_batteryCarousel_circle_Engine1_text,Constant_power.powerScreen_batteryCarousel_circle_Engine1_text_xpath);
    }

    @Then("I verify the STBD text")
    public void iVerifyTheSTBDText() throws Throwable {
        asserttext(Constant_power.powerScreen_batteryCarousel_circle_STBD_text,Constant_power.powerScreen_batteryCarousel_circle_STBD_text_xpath);
    }

    @Then("I verify the House text")
    public void iVerifyTheHouseText() throws Throwable {
        asserttext(Constant_power.powerScreen_batteryCarousel_circle_House_text,Constant_power.powerScreen_batteryCarousel_circle_House_text_xpath);
    }

    @Then("I verify the Measured voltage text")
    public void iVerifyTheMeasuredVoltageText() throws Throwable {
        asserttextAccessibility(Constant_power.powerScreen_Measured_Voltage_text,Constant_power.powerScreen_Measured_Voltage_access_id);
    }

    @Then("I verify the Measured voltage value")
    public void iVerifyTheMeasuredVoltageValue() {
        iselementdisplayedaccessabilityId(Constant_power.powerScreen_Measured_Voltage_cardSubText_access_id);
    }

    @Then("I verify the Status text")
    public void iVerifyTheStatusText() throws Throwable {
        asserttextAccessibility(Constant_power.powerScreen_status_text,Constant_power.powerScreen_status_access_id);
    }

    @Then("I verify the Status value")
    public void iVerifyTheStatusValue() {
        iselementdisplayedaccessabilityId(Constant_power.powerScreen_status_cardSubText_access_id);
    }

    @Then("I verify the UsageAnalysis text")
    public void iVerifyTheUsageAnalysisText() throws Throwable {
        asserttextAccessibility(Constant_power.powerScreen_usage_text,Constant_power.powerScreen_usage_access_id);
    }

    @Then("I verify the UsageAnalysis Down Arrow")
    public void iVerifyTheUsageAnalysisDownArrow() {
        iselementdisplayedaccessabilityId(Constant_power.powerScreen_usage_expandIcon_access_id);
    }

    @Then("I verify the Alert text")
    public void iVerifyTheAlertText() throws Throwable {
        asserttextAccessibility(Constant_power.powerScreen_alert_text,Constant_power.powerScreen_alert_access_id);
    }

    @Then("I verify the Alert toggle status")
    public void iVerifyTheAlertToggleStatus() {
        iselementdisplayedaccessabilityId(Constant_power.powerScreen_alert_switchText_access_id);
    }

    @Then("I verify the Alert toggle")
    public void iVerifyTheAlertToggle() {
        iselementdisplayedaccessabilityId(Constant_power.powerScreen_alert_switchComponent_access_id);
    }

    @Then("I verify the Notify Me text")
    public void iVerifyTheNotifyMeText() throws Throwable {
        asserttextAccessibility(Constant_power.powerScreen_notify_text,Constant_power.powerScreen_notify_access_id);
    }

    @Then("I verify the Notify Me toggle status")
    public void iVerifyTheNotifyMeToggleStatus() {
        iselementdisplayedaccessabilityId(Constant_power.powerScreen_notify_switchText_access_id);
    }

    @Then("I verify the Notify Me toggle")
    public void iVerifyTheNotifyMeToggle() {
        iselementdisplayedaccessabilityId(Constant_power.powerScreen_notify_switchComponent_access_id);
    }

    @Then("I verify the Battery voltage text")
    public void iVerifyTheBatteryVoltageText() throws Throwable {
        asserttextAccessibility(Constant_power.powerScreen_batteryVoltage_text,Constant_power.powerScreen_batteryVoltage_access_id);
    }

    @Then("I verify the Battery voltage value")
    public void iVerifyTheBatteryVoltageValue() {
        iselementdisplayedaccessabilityId(Constant_power.powerScreen_batteryVoltage_textButton_access_id);
    }

    @Then("I Verify the Inverter toggle button is in OFF status")
    public void iVerifyTheInverterToggleButtonIsInOFFStatus() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Inverter toggle button is in OFF status");
        if (driver.findElement(By.xpath(Constant_power.L2Power_Inverter_toggle_xpath)).getText().equalsIgnoreCase("OFF")) {
            Taponbutton(Constant_power.L2Power_Inverter_toggle_xpath);
            Thread.sleep(10000);
        }
    }

    @Then("I Verify the Generator text in Generator main page")
    public void iVerifyTheGeneratorTextInGeneratorMainPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Generator text in Generator main page");
        asserttextValidation(Constant_power.L2_Generator, Constant_power.powerScreen_Generator_xpath);
        System.out.println("Generator text is verified in the Generator main screen");
    }

    @Then("I Verify the Charger text in the Charger main Page")
    public void iVerifyTheChargerTextInTheChargerMainPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Charger text in the Charger main Page");
        asserttextValidation(Constant_power.L2_Charger, Constant_power.powerScreen_Charger_xpath);
        System.out.println("Charger text is verified in the charger main screen");
    }

    @Then("I Verify the AGS text in the AGS main Page")
    public void iVerifyTheAGSTextInTheAGSMainPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the AGS text in the AGS main Page");
        asserttextValidation(Constant_power.L2_AGS, Constant_power.powerScreen_AGS_xpath);
        System.out.println("AGS text is verified in the AGS main screen");

    }

    @Then("I Verify the Power Predictive Data text in the Predictive Data main Page")
    public void iVerifyThePowerPredictiveDataTextInThePredictiveDataMainPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Power Predictive Data text in the Predictive Data main Page");
        asserttextValidation(Constant_power.L2_PredictiveData, Constant_power.powerScreen_PredictiveData_xpath);
        System.out.println("Predictive text is verified in the Predictive main screen");
    }

    @Then("I Tap on Back button in the Power main screen")
    public void iTapOnBackButtonInThePowerMainScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back button in the Power main screen");
        TaponbuttonaccessabilityID(Constant_power.powerScreen_BackButton_accessid);
    }


    @Then("I verify the header of the POWER text")
    public void iVerifyTheHeaderOfThePOWERText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the header of the POWER text");
        asserttext(Constant_power.Power_header_text_expected,Constant_power.Power_header_text_xpath_or_operator);
        System.out.println("header of the POWER text is verified successfully");

    }

    @Then("I verify the Back button in power screen")
    public void iVerifyTheBackButtonInPowerScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Back button in power screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Power_back_button_access_id));
        System.out.println("Back button in power screen is verified successfully");

    }

    @Then("I verify the battery icon in the power screen")
    public void iVerifyTheBatteryIconInThePowerScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the battery icon in the power screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Power_Battery_icon_access_id));
        System.out.println("battery icon in the power screen is verified successfully");

    }

    @Then("I verify the battery value in the power screen")
    public void iVerifyTheBatteryValueInThePowerScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the battery value in the power screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Power_battery_value_access_id));
        System.out.println("battery value in the power screen is verified successfully");

    }

    @Then("I verify the battery carousel battery unit text")
    public void iVerifyTheBatteryCarouselBatteryUnitText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the battery carousel battery unit text");
        asserttext(Constant_power.Battery_carousel_unit_text_expected,Constant_power.Battery_carousel_unit_text_xpath_or_operator);
        System.out.println("battery carousel battery unit text is verified successfully");

    }

    @Then("I verify the HOUSE BATTERY")
    public void iVerifyTheHOUSEBATTERY() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the HOUSE BATTERY");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.House_battery_text_access_id));
        System.out.println("HOUSE BATTERY is verified successfully");

    }

    @Then("I verify House battery voltage text")
    public void iVerifyHouseBatteryVoltageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify House battery voltage text");
        asserttext(Constant_power.House_battery_voltage_text_expected,Constant_power.House_battery_voltage_text_xpath_or_operator);
        System.out.println("House battery voltage text is verified successfully");

    }

    @Then("I verify the House Battery Voltage card sub text")
    public void iVerifyTheHouseBatteryVoltageCardSubText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the House Battery Voltage card sub text");
        asserttext(Constant_power.house_battery_voltage_card_sub_text_expected,Constant_power.house_battery_voltage_card_sub_text_xpath_or_operator);
        System.out.println("House Battery Voltage card sub text is verified successfully");

    }

    @Then("I verify the predictive data text")
    public void iVerifyThePredictiveDataText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the predictive data text");
        asserttext(Constant_power.predictive_data_text_expected,Constant_power.predictive_data_text_xpath_or_operator);
        System.out.println("predictive data text is verified successfully");

    }

    @Then("I verify the predictive data card icon")
    public void iVerifyThePredictiveDataCardIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the predictive data card icon");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.predictive_data_card_icon_access_id));
        System.out.println("predictive data card icon is verified successfully");

    }

    @Then("I tap on the back button in power screen")
    public void iTapOnTheBackButtonInPowerScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button in power screen");
        TaponbuttonaccessabilityID(Constant_power.Power_back_button_access_id);
        System.out.println("back button in power screen is verified successfully");
        Thread.sleep(2000);

    }

}
