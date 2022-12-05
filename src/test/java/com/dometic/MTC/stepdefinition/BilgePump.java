package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_Batteries_MTC;
import com.dometic.MTC.qa.Pages.Constant_BilgePump_MTC;
import com.dometic.MTC.qa.Pages.Constant_Tank_MTC;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BilgePump extends Baseclass {
    public static List<String> alertMaxCycleHour, alertMaxDailyCycle, alertContinuous, warningsMaxCycleHour, warningsMaxDailyCycle, warningsContinuous;
    public static String bilge_pump_current_carousel_value;
    public static int bilge_pump_current_carousel_value_number, iteration_count;

    @Then("I Tap on Bilge Pump tile on landing screen")
    public void iTapOnBilgePumpTileOnLandingScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Bilge Pump tile on landing screen");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_tile_xpath);
        Thread.sleep(3000);
    }

    @Then("I verify Bilge Pump header text")
    public void iVerifyBilgePumpHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Bilge Pump header text");
        asserttextValidationAccessibility(Constant_BilgePump_MTC.mtc_Bilge_Pump, Constant_BilgePump_MTC.mtc_Bilge_Pump_Title_Access_ID);
    }

    @Then("I verify Bilge Pump status")
    public void iVerifyBilgePumpStatus() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Bilge Pump status");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_status_Access_ID);
        if (elementsByAccessibilityId.size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_status_Access_ID));
        }
    }

    @Then("I verify Run Cycles text")
    public void iVerifyRunCyclesText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Run Cycles text");
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Runcycles_text, Constant_BilgePump_MTC.mtc_Bilge_Pump_RunCycles_xpath);
    }

    @Then("I Tap on Run Cycles down arrow")
    public void iTapOnRunCyclesDownArrow() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Run Cycles down arrow");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_RunCyclesGraph_arrow_xpath);
    }

    @Then("I Tap on week in Run Cycles Graph")
    public void iTapOnWeekInRunCyclesGraph() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on week in Run Cycles Graph");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_WEEKText_xpath);
    }

    @Then("I Tap on month in Run Cycles Graph")
    public void iTapOnYearInRunCyclesGraph() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on month in Run Cycles Graph");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_MONTHText_xpath);
    }

    @Then("I verify Alert-Max Cycle\\/Hour Text")
    public void iVerifyAlertMaxCycleHourText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alert-Max Cycle/Hour Text");
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour, Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_xpath);
    }

    @Then("I Tap on Alert-Max Cycle\\/Hour")
    public void iTapOnAlertMaxCycleHour() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Alert-Max Cycle/Hour");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_xpath);
    }

    @Then("I verify Alert-Max Daily Cycle Text")
    public void iVerifyAlertMaxDailyCycleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alert-Max Daily Cycle Text");
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle, Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_xpath);
    }

    @Then("I Tap on Alert-Max Daily Cycle")
    public void iTapOnAlertMaxDailyCycle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "\"I Tap on Alert-Max Daily Cycle");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_xpath);
    }

    @Then("I verify Continuous Text")
    public void iVerifyContinuousText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Continuous Text");
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous, Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_xpath);
    }

    @Then("I Tap on Continuous")
    public void iTapOnContinuous() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Continuous");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_xpath);
    }

    @Then("I verify Warnings-Max Daily Cycle Text")
    public void iVerifyWarningsMaxDailyCycleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warnings-Max Daily Cycle Text");
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour, Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_xpath);
    }

    @Then("I Tap on Warnings-Max Daily Cycle")
    public void iTapOnWarningsMaxDailyCycle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Warnings-Max Daily Cycle");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_xpath);
    }

    @Then("I Tap on Warnings-Max Cycle\\/Hour")
    public void iTapOnWarningsMaxCycleHour() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Warnings-Max Cycle/Hour");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_xpath);
    }

    @Then("I verify Alert-Max Cycle Hour Text")
    public void iVerifyAlertMaxCycleHourText1() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alert-Max Cycle Hour Text");
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour, Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_xpath);
    }

    @Then("I Tap on Alert-Max Cycle Hour")
    public void iTapOnAlertMaxCycleHour1() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Alert-Max Cycle Hour");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_xpath);
    }

    @Then("I verify Warnings-Max Cycle Hour Text")
    public void iVerifyWarningsMaxCycleHourText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warnings-Max Cycle Hour Text");
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour, Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_xpath);
    }

    @Then("I Tap on Warnings-Max Cycle Hour")
    public void iTapOnWarningsMaxCycleHour1() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Warnings-Max Cycle Hour");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_xpath);
    }

    @Then("I Tap on Warnings-Continuous")
    public void iTapOnWarningsContinuous() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Warnings-Continuous");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_xpath);
    }

    @Then("I scroll up the screen in Alert-Max Cycle Hour")
    public void iScrollUpTheScreenInAlertMaxCycleHour() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Max Cycle Hour");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(500, 750)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 625)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Alert-Max Cycle Hour")
    public void iVerifyApplyButtonInAlertMaxCycleHour() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Alert-Max Cycle Hour");
        /** Globally declared Alert-Max Cycle Hour Values **/
        alertMaxCycleHour = new ArrayList<>();
        alertMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_First_Value_Xpath)).getText());
        alertMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_SecondValue_xpath)).getText());
        alertMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Alert-Max Cycle Hour")
    public void iTapOnApplyButtonInAlertMaxCycleHour() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Alert-Max Cycle Hour");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied value in Alert-Max Cycle Hour is displayed")
    public void iValidateAppliedValueInAlertMaxCycleHourIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied value in Alert-Max Cycle Hour is displayed");
        if (alertMaxCycleHour.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertMaxCycleHour.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertMaxCycleHour.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Alert-Max Daily Cycle")
    public void iScrollUpTheScreenInAlertMaxDailyCycle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Max Daily Cycle");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 900)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 775)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Alert-Max Daily Cycle")
    public void iVerifyApplyButtonInAlertMaxDailyCycle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Alert-Max Daily Cycle");
        /** Globally declared Alert-Max Daily Cycle Values **/
        alertMaxDailyCycle = new ArrayList<>();
        alertMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_First_Value_Xpath)).getText());
        alertMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_SecondValue_xpath)).getText());
        alertMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Alert-Max Daily Cycle")
    public void iTapOnApplyButtonInAlertMMaxDailyCycle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Alert-Max Daily Cycle");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied value in Alert-Max Daily Cycle is displayed")
    public void iValidateAppliedValueInAlertMaxDailyCycleIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied value in Alert-Max Daily Cycle is displayed");
        if (alertMaxDailyCycle.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertMaxDailyCycle.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertMaxDailyCycle.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Alert-Continuous")
    public void iScrollUpTheScreenInAlertContinuous() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Max Daily Cycle");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1050)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 925)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Alert-Continuous")
    public void iVerifyApplyButtonInAlertContinuous() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Alert-Continuous");
        /** Globally declared Alert-Continuous Values **/
        alertContinuous = new ArrayList<>();
        alertContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_First_Value_Xpath)).getText());
        alertContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_SecondValue_xpath)).getText());
        alertContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_ThirdValue_xpath)).getText());

    }

    @Then("I Tap on Apply button in Alert-Continuous")
    public void iTapOnApplyButtonInAlertContinuous() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Alert-Continuous");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied value in Alert-Continuous is displayed")
    public void iValidateAppliedValueInAlertContinuousIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied value in Alert-Continuous is displayed");
        if (alertContinuous.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertContinuous.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertContinuous.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Max Cycle Hour")
    public void iScrollUpTheScreenInWarningsMaxCycleHour() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Warnings-Max Cycle Hour");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1450)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1325)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Max Cycle Hour")
    public void iVerifyApplyButtonInWarningsMaxCycleHour() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Warnings-Max Cycle Hour");
        /** Globally declared Warnings-Max Cycle Hour Values **/
        warningsMaxCycleHour = new ArrayList<>();
        warningsMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_First_Value_Xpath)).getText());
        warningsMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_SecondValue_xpath)).getText());
        warningsMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Max Cycle Hour")
    public void iTapOnApplyButtonInWarningsMaxCycleHour() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Warnings-Max Cycle Hour");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Max Cycle Hour is displayed")
    public void iValidateAppliedMinutesInWarningsMaxCycleHourIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied minutes in Warnings-Max Cycle Hour is displayed");
        if (warningsMaxCycleHour.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsMaxCycleHour.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsMaxCycleHour.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Max Daily Cycle")
    public void iScrollUpTheScreenInWarningsMaxDailyCycle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Warnings-Max Daily Cycle");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1575)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1450)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Max Daily Cycle")
    public void iVerifyApplyButtonInWarningsMaxDailyCycle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Warnings-Max Daily Cycle");
        /** Globally declared Warnings-Max Daily Cycle Values **/
        warningsMaxDailyCycle = new ArrayList<>();
        warningsMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_First_Value_Xpath)).getText());
        warningsMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_SecondValue_xpath)).getText());
        warningsMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Max Daily Cycle")
    public void iTapOnApplyButtonInWarningsMaxDailyCycle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Warnings-Max Daily Cycle");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Max Daily Cycle is displayed")
    public void iValidateAppliedMinutesInWarningsMaxDailyCycleIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied minutes in Warnings-Max Daily Cycle is displayed");
        if (warningsMaxDailyCycle.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsMaxDailyCycle.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsMaxDailyCycle.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Continuous")
    public void iScrollUpTheScreenInWarningsContinuous() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Warnings-Continuous");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1725)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1600)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Continuous")
    public void iVerifyApplyButtonInWarningsContinuous() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Warnings-Continuous");
        warningsContinuous = new ArrayList<>();
        warningsContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_First_Value_Xpath)).getText());
        warningsContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_SecondValue_xpath)).getText());
        warningsContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Continuous")
    public void iTapOnApplyButtonInWarningsContinuous() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Warnings-Continuous");
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Continuous is displayed")
    public void iValidateAppliedMinutesInWarningsContinuousIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied minutes in Warnings-Continuous is displayed");
        if (warningsContinuous.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsContinuous.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsContinuous.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I Tap on Bilge Pump Alert toggle if it's already in OFF state")
    public void iTapOnBilgePumpAlertToggleIfItSAlreadyInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Bilge Pump Alert toggle if it's already in OFF state");
//        if (driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Status_Text_xpath)).getText().equalsIgnoreCase("OFF")) {}
        if(driver.findElementsByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alert_Max_Cycle_Text_Aceess_Id).size()==0){
            Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_toggle_xpath);
            Thread.sleep(10000);
        }
    }

    @Then("I Tap on Bilge Pump Warnings toggle if it's already in OFF state")
    public void iTapOnBilgePumpWarningsToggleIfItSAlreadyInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Bilge Pump Warnings toggle if it's already in OFF state");
        if(driver.findElementsByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warning_Max_Cycle_Text_Aceess_Id).size()==0){
            Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_toggle_xpath);
            Thread.sleep(10000);
        }
    }

    @Then("I scroll to the maximum carousel value in Alert-Max Cycle Hour")
    public void iScrollToTheMaximumCarouselValueInAlertMaxCycleHour() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum value in Alert-Max Cycle Hour carousel");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Max_Cycles_Per_Hour_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((60 - bilge_pump_current_carousel_value_number));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(500, 750)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(500, 625)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Alert-Max Cycle Hour")
    public void iScrollToTheMinimumCarouselValueInAlertMaxCycleHour() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum value in Alert-Max Cycle Hour carousel");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Max_Cycles_Per_Hour_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((bilge_pump_current_carousel_value_number - 1));
        System.out.println(iteration_count);
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(500, 625)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(500, 750)).release().perform();
            System.out.println("Scrolling up the Page");
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Alert-Max Daily Cycle")
    public void iScrollToTheMaximumCarouselValueInAlertMaxDailyCycle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum value in Alert-Max Daily Cycle");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Max_Daily_Cycles_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((200 - bilge_pump_current_carousel_value_number));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(535, 900)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(535, 775)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Alert-Max Daily Cycle")
    public void iScrollToTheMinimumCarouselValueInAlertMaxDailyCycle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum value in Alert-Max Daily Cycle");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Max_Daily_Cycles_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((bilge_pump_current_carousel_value_number - 1));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(540, 775)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(540, 900)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Alert-Continuous")
    public void iScrollToTheMaximumCarouselValueInAlertContinuous() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum value in Alert-Continuous carousel");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Continuous_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((60 - bilge_pump_current_carousel_value_number));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1050)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 925)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Alert-Continuous")
    public void iScrollToTheMinimumCarouselValueInAlertContinuous() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum value in Alert-Continuous carousel");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Continuous_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((bilge_pump_current_carousel_value_number - 0));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 925)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1050)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Warnings-Max Cycle Hour")
    public void iScrollToTheMaximumCarouselValueInWarningsMaxCycleHour() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum value in Warnings-Max Cycle Hour");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((60 - bilge_pump_current_carousel_value_number));
        System.out.println(iteration_count);
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1425)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1300)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Warnings-Max Cycle Hour")
    public void iScrollToTheMinimumCarouselValueInWarningsMaxCycleHour() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum value in Warnings-Max Cycle Hour");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((bilge_pump_current_carousel_value_number - 1));
        System.out.println(iteration_count);
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1300)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1425)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Warnings-Max Daily Cycle")
    public void iScrollToTheMaximumCarouselValueInWarningsMaxDailyCycle() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum value in Warnings-Max Daily Cycle");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycles_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((200 - bilge_pump_current_carousel_value_number));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1575)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1450)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Warnings-Max Daily Cycle")
    public void iScrollToTheMinimumCarouselValueInWarningsMaxDailyCycle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum value in Warnings-Max Daily Cycle");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycles_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((bilge_pump_current_carousel_value_number - 1));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1450)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1575)).release().perform();
            System.out.println("Scrolling down the Page");
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Warnings-Continuous")
    public void iScrollToTheMaximumCarouselValueInWarningsContinuous() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum value in Warnings-Continuous");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((60 - bilge_pump_current_carousel_value_number));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1725)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1600)).release().perform();
            System.out.println("Scrolling down the Page");
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Warnings-Continuous")
    public void iScrollToTheMinimumCarouselValueInWarningsContinuous() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum value in Warnings-Continuous");
        TouchAction action = new TouchAction(driver);
        bilge_pump_current_carousel_value = driver.findElementByAccessibilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_Applied_Value_access_id).getText();
        bilge_pump_current_carousel_value_number = Integer.parseInt(bilge_pump_current_carousel_value);
        iteration_count = ((bilge_pump_current_carousel_value_number - 0));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1725)).release().perform();
            System.out.println("Scrolling up the Page");
            Thread.sleep(1000);
        }
    }

    @Then("I Scroll the screen till the {int}nd instance")
    public void iScrollTheScreenTillTheNdInstance(int arg0) throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the screen till the 2nd instance");
        for (int i = 0; i < 1; i++) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(1000, 530)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(400, 530)).release().perform();
            Thread.sleep(2000);
            break;
        }

    }

    @Then("I Scroll the screen till the {int}rd instance")
    public void iScrollTheScreenTillTheRdInstance(int arg0) throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the screen till the 3rd instance");
        for (int i = 0; i < 2; i++) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(1000, 530)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(400, 530)).release().perform();
            Thread.sleep(2000);

        }
    }

    @Then("I Verify the Bilge pump Tile text")
    public void iVerifyTheBilgePumpTileText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Bilge pump Tile text");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BilgePump_MTC.MTC_BilgePump_Batteries_accessid));
        System.out.println("Bilge pump text in Bilge pump tile is verified");
    }

    @Then("I Verify the First instance text in Bilge pump")
    public void iVerifyTheFirstInstanceTextInBilgePump() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the First instance text in Bilge pump");
        if (driver.findElementsByAccessibilityId(Constant_BilgePump_MTC.Mtc_Bilge_Pump_firstInstance_accessid).size() != 0) {
            asserttextValidationAccessibility(Constant_BilgePump_MTC.Mtc_Bilge_Pump_firstInstance_Text, Constant_BilgePump_MTC.Mtc_Bilge_Pump_firstInstance_accessid);
            System.out.println("First instance text in Bilge pump is verified");
        }
    }

    @Then("I Scroll to the second instance in the Bilge pump")
    public void iScrollToTheSecondInstanceInTheBilgePump() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll to the second instance in the Bilge pump");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(450, 1150)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(50, 1150)).release().perform();
        Thread.sleep(2000);
    }

    @Then("I Verify the Second instance text")
    public void iVerifyTheSecondInstanceText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Second instance text");
        if (driver.findElementsByAccessibilityId(Constant_BilgePump_MTC.Mtc_Bilge_Pump_SecondInstance_accessid).size() != 0) {
            asserttextValidationAccessibility(Constant_BilgePump_MTC.Mtc_Bilge_Pump_SecondInstance_text, Constant_BilgePump_MTC.Mtc_Bilge_Pump_SecondInstance_accessid);
            System.out.println("Second instance text in Bilge pump is verified");
        }
    }

    @Then("I Scroll to the Third instance in the Bilge pump")
    public void iScrollToTheThirdInstanceInTheBilgePump() throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(450, 1150)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(50, 1150)).release().perform();
        Thread.sleep(2000);
    }

    @Then("I verify the third instance text in the bilge pump")
    public void iVerifyTheThirdInstanceTextInTheBilgePump() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the third instance text in the bilge pump");
        if (driver.findElementsByAccessibilityId(Constant_BilgePump_MTC.Mtc_Bilge_Pump_ThirdInstance_accessid).size() != 0) {
            asserttextValidationAccessibility(Constant_BilgePump_MTC.Mtc_Bilge_Pump_ThirdInstance_Text, Constant_BilgePump_MTC.Mtc_Bilge_Pump_ThirdInstance_accessid);
            System.out.println("Third instance text in Bilge pump is verified");
        }
    }

    @Then("I Scrolled from Third instance to First instance in Bilge Pump Tile")
    public void iScrolledFromThirdInstanceToFirstInstanceInBilgePumpTile() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scrolled from Third instance to First instance in Bilge Pump Tile");
        for (int i = 0; i < 2; i++) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(200, 1150)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(450, 1150)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I verify Cycles text")
    public void iVerifyCyclesText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Cycles text");
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Cycles,Constant_BilgePump_MTC.mtc_Bilge_Pump_Cycles_Xpath);
    }
}
