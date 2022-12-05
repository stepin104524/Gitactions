package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_power;
import com.dometic.MTC.qa.util.Baseclass;
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
    }

    @Then("I Verify Stop button in power main screen")
    public void iVerifyStopButtonInPowerMainScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Stop button in power main screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.L2Powerpagepower_stop_button_access_id));
    }

    @Then("I Verify BATTERIES header text")
    public void iVerifyBATTERIESHeaderText() throws Throwable {
        asserttextAccessibility(Constant_power.BATTERIES_header_text,Constant_power.BATTERIES_header_text_access_id);
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
}
