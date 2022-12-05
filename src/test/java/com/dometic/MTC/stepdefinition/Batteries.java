package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_climate_ac;
import com.dometic.L1.qa.Pages.Constant_climate_heater;
import com.dometic.MTC.qa.Pages.Constant_Batteries_MTC;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Batteries extends Baseclass {
    public static List<String> alertBatteryVoltageBelow, alertSetLatency, warningsBatteryVoltageBelow, warningsSetLatency;
    public static String current_carousel_value;
    public static Float current_carousel_value_number;
    public static Double iteration_count;

    @Then("I Tap on Batteries tile on landing screen")
    public void iTapOnBatteriesTileOnLandingScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Batteries tile on landing screen");
        Taponbutton(Constant_Batteries_MTC.mtc_Batteries_xpath);
        Thread.sleep(2000);
    }

    @Then("I verify Batteries header text")
    public void iVerifyBatteriesHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Batteries header text");
        asserttextValidationAccessibility(Constant_Batteries_MTC.mtc_Batteries, Constant_Batteries_MTC.mtc_Climate_Title_Access_ID);
    }

    @Then("I verify Battery status")
    public void iVerifyBatteryStatus() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Battery status");
        if (driver.findElementsByAccessibilityId(Constant_Batteries_MTC.mtc_Batteries_Status_Access_ID).size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Batteries_MTC.mtc_Batteries_Status_Access_ID));
        }
    }

    @Then("I verify Voltage Graph text")
    public void iVerifyVoltageGraphText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Voltage Graph text");
        asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_VoltageGraph_text, Constant_Batteries_MTC.mtc_Batteries_VoltageGraph_xpath);
    }

    @Then("I Tap on Voltage Graph down arrow")
    public void iTapOnVoltageGraphDownArrow() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Voltage Graph down arrow");
        Taponbutton(Constant_Batteries_MTC.mtc_Batteries_VoltageGraph_xpath);
    }

    @Then("I verify Voltage text")
    public void iVerifyVoltageText() throws Throwable {
//        asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_VoltageText_text, Constant_Batteries_MTC.mtc_Batteries_VoltageText_xpath);
    }

    @Then("I verify History text")
    public void iVerifyHistoryText() throws Throwable {
//        asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_HistoryText_text, Constant_Batteries_MTC.mtc_Batteries_HistoryText_xpath);
    }

    @Then("I verify Day text")
    public void iVerifyDayText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Day text");
        asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_DAYText_text, Constant_Batteries_MTC.mtc_Batteries_DAYText_xpath);
        System.out.println("Day text is verified");
    }

    @Then("I verify WEEK text")
    public void iVerifyWEEKText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify WEEK text");
        asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_WEEKText_text, Constant_Batteries_MTC.mtc_Batteries_WEEKText_xpath);
        System.out.println("Week text is verified");
    }

    @Then("I verify MONTH text")
    public void iVerifyMONTHText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify MONTH text");
        asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_MONTHText_text, Constant_Batteries_MTC.mtc_Batteries_MONTHText_xpath);
        System.out.println("Month text is verified");
    }

    @Then("I verify Alerts text")
    public void iVerifyAlertsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts text");
        asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_AlertsText, Constant_Batteries_MTC.mtc_Batteries_AlertsText_xpath);
    }

    @Then("I Tap on Alert toggle if it's already in OFF state")
    public void iTapOnAlertToggleIfItSAlreadyInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Alert toggle if it's already in OFF state");
//        if (driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Status_Text_xpath)).getText().equalsIgnoreCase(Constant_Batteries_MTC.mtc_Climate_Tile_Power_toggle_Status)) {}
        if(driver.findElementsByAccessibilityId(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText_Aceess_Id).size()==0){
            Taponbutton(Constant_Batteries_MTC.mtc_Batteries_Alerts_toggle_xpath);
            Thread.sleep(10000);
        }
//        if (driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Status_Text_xpath)).getText().equalsIgnoreCase("OFF")) {
//
//        }
    }

    @Then("I verify Alert-Battery Voltage Below Text")
    public void iVerifyAlertBatteryVoltageBelowTextText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alert-Battery Voltage Below Text");
        if(driver.findElementsByAccessibilityId(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText_Aceess_Id).size()!=0){
            asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText, Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText_xpath);
        }
    }

    @Then("I Tap on Alert-Battery Voltage Below")
    public void iTapOnAlertBatteryVoltageBelow() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Alert-Battery Voltage Below");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Status_On_Text_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText_xpath);
            Thread.sleep(2000);
        }
    }

    @Then("I verify Alert-Set Latency Text")
    public void iVerifyAlertSetLatencyTextText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alert-Set Latency Text");
//        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Status_On_Text_xpath));
//        if (elements.size() != 0) {}
        if(driver.findElementsByAccessibilityId(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText_Aceess_Id).size()!=0){
            asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_Set_LatencyText, Constant_Batteries_MTC.mtc_Batteries_Set_LatencyText_xpath);
        }
    }

    @Then("I Tap on Alert-Set Latency")
    public void iTapOnAlertSetLatency() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Alert-Set Latency");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Status_On_Text_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_Batteries_MTC.mtc_Batteries_Set_LatencyText_xpath);
            Thread.sleep(2000);
        }
    }

    @Then("I verify Warnings text")
    public void iVerifyWarningsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warnings text");
        asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_WarningsText, Constant_Batteries_MTC.mtc_Batteries_WarningsText_xpath);
    }

    @Then("I Tap on Warnings toggle if it's already in OFF state")
    public void iTapOnWarningsToggleIfItSAlreadyInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Warnings toggle if it's already in OFF state");
//        if (driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Status_Text_xpath)).getText().equalsIgnoreCase(Constant_Batteries_MTC.mtc_Climate_Tile_Power_toggle_Status)) {
//            System.out.println(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Status_Text_xpath)).getText());
//        if (driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Status_Text_xpath)).getText().equalsIgnoreCase("OFF")) {}
        if(driver.findElementsByAccessibilityId(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_BelowText_Aceess_Id).size()==0){
            Taponbutton(Constant_Batteries_MTC.mtc_Batteries_Warnings_toggle_xpath);
            Thread.sleep(10000);
        }

//        }
    }

    @Then("I verify Warnings-Battery Voltage Below Text")
    public void iVerifyWarningsBatteryVoltageBelowTextText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warnings-Battery Voltage Below Text");
//        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Status_On_Text_xpath));
//        if (elements.size() != 0) {}
        if(driver.findElementsByAccessibilityId(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_BelowText_Aceess_Id).size()!=0){
            asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText, Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_BelowText_xpath);
        }
    }

    @Then("I Tap on Warnings-Battery Voltage Below")
    public void iTapOnWarningsBatteryVoltageBelow() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Warnings-Battery Voltage Below");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Status_On_Text_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_BelowText_xpath);
            Thread.sleep(2000);
        }
    }

    @Then("I verify Warnings-Set Latency Text")
    public void iVerifyWarningsSetLatencyTextText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warnings-Set Latency Text");
//        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Status_On_Text_xpath));
//        if (elements.size() != 0) {}
        if(driver.findElementsByAccessibilityId(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_BelowText_Aceess_Id).size()!=0){
            asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_Set_LatencyText, Constant_Batteries_MTC.mtc_Batteries_Warnings_Set_LatencyText_xpath);
        }
    }

    @Then("I Tap on Warnings-Set Latency")
    public void iTapOnWarningsSetLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Warnings-Set Latency");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Status_On_Text_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_Batteries_MTC.mtc_Batteries_Warnings_Set_LatencyText_xpath);
        }
    }

    @Then("I Scroll the page")
    public void iScrollThePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the page");
        Basestepdefinition.verticalSwipe(0.6, 0.2, 0.5);
    }

    @Then("I verify the apply button")
    public void iVerifyTheApplyButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the apply button");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_BelowText_Apply_xpath));
        if (elements.size() != 0) {
            iselementdisplayed(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_BelowText_Apply_xpath);
        }
    }

    @Then("I Tap on week in voltage Graph")
    public void iTapOnWeekInVoltageGraph() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on week in voltage Graph");
        Taponbutton(Constant_Batteries_MTC.mtc_Batteries_WEEKText_xpath);
        Thread.sleep(2000);
    }

    @Then("I Tap on year in voltage Graph")
    public void iTapOnYearInVoltageGraph() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on year in voltage Graph");
        Taponbutton(Constant_Batteries_MTC.mtc_Batteries_MONTHText_xpath);
    }

    @Then("I Verify Apply button in Alert-Battery Voltage Below")
    public void iVerifyApplyButtonInAlertBatteryVoltageBelow() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Alert-Battery Voltage Below");
        /** Globally declared BatteryVoltageBelow Values **/
        alertBatteryVoltageBelow = new ArrayList<>();
        alertBatteryVoltageBelow.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_Below_FirstValue_xpath)).getText());
        alertBatteryVoltageBelow.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_Below_SecondValue_xpath)).getText());
        alertBatteryVoltageBelow.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_Below_ThirdValue_xpath)).getText());
    }

    @Then("I scroll up the screen in Alert-Battery Voltage Below")
    public void iScrollUpTheScreenInAlertBatteryVoltageBelow() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Battery Voltage Below");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(500, 1050)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 925)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Tap on Apply button in Alert-Battery Voltage Below")
    public void iTapOnApplyButtonInAlertBatteryVoltageBelow() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Alert-Battery Voltage Below");
        Taponbutton(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_BelowText_Apply_xpath);
    }

    @Then("I Validate Applied voltage is displayed")
    public void iValidateAppliedVoltageIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied voltage is displayed");
        if (alertBatteryVoltageBelow.get(0).contains(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertBatteryVoltageBelow.get(1).contains(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertBatteryVoltageBelow.get(2).contains(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I Verify Apply button in Alert-Set Latency")
    public void iVerifyApplyButtonInAlertSetLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Alert-Set Latency");
        /** Globally declared SetLatency Values **/
        alertSetLatency = new ArrayList<>();
        alertSetLatency.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Set_Latency_FirstValue_xpath)).getText());
        alertSetLatency.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Set_Latency_SecondValue_xpath)).getText());
        alertSetLatency.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Set_Latency_ThirdValue_xpath)).getText());
    }

    @Then("I scroll up the screen in Alert-Set Latency")
    public void iScrollUpTheScreenInAlertSetLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Set Latency");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1200)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1075)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Tap on Apply button in Alert-Set Latency")
    public void iTapOnApplyButtonInAlertSetLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Alert-Set Latency");
        Taponbutton(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_BelowText_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Alert-Set Latency is displayed")
    public void iValidateAppliedMinutesInAlertSetLatencyIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied minutes in Alert-Set Latency is displayed");
        String text = driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Set_Latency_Updated_Value_xpath)).getText();
        if (alertSetLatency.get(0).equalsIgnoreCase(text)) {
            System.out.println("Text comparison is Successful");
        } else if (alertSetLatency.get(1).equalsIgnoreCase(text)) {
            System.out.println("Text comparison is Successful");
        } else if (alertSetLatency.get(2).equalsIgnoreCase(text)) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Battery Voltage Below")
    public void iScrollUpTheScreenInWarningsBatteryVoltageBelow() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Battery Voltage Below");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1575)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1450)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Battery Voltage Below")
    public void iVerifyApplyButtonInWarningsBatteryVoltageBelow() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Warnings-Battery Voltage Below");
        warningsBatteryVoltageBelow = new ArrayList<>();
        warningsBatteryVoltageBelow.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_Below_FirstValue_xpath)).getText());
        warningsBatteryVoltageBelow.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_Below_SecondValue_xpath)).getText());
        warningsBatteryVoltageBelow.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_Below_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Battery Voltage Below")
    public void iTapOnApplyButtonInWarningsBatteryVoltageBelow() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Warnings-Battery Voltage Below");
        Taponbutton(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_BelowText_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Battery Voltage Below is displayed")
    public void iValidateAppliedMinutesInWarningsBatteryVoltageBelowIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied minutes in Warnings-Battery Voltage Below is displayed");
        String text = driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_Below_Updated_Value_xpath)).getText();
        if (warningsBatteryVoltageBelow.get(0).equalsIgnoreCase(text)) {
            System.out.println("Text comparison is Successful");
        } else if (warningsBatteryVoltageBelow.get(1).equalsIgnoreCase(text)) {
            System.out.println("Text comparison is Successful");
        } else if (warningsBatteryVoltageBelow.get(2).equalsIgnoreCase(text)) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Set Latency")
    public void iScrollUpTheScreenInWarningsSetLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Warnings-Set Latency");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1725)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1600)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Set Latency")
    public void iVerifyApplyButtonInWarningsSetLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Warnings-Set Latency");
        warningsSetLatency = new ArrayList<>();
        warningsSetLatency.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Set_Latency_FirstValue_xpath)).getText());
        warningsSetLatency.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Set_Latency_Below_SecondValue_xpath)).getText());
        warningsSetLatency.add(driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Set_Latency_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Set Latency")
    public void iTapOnApplyButtonInWarningsSetLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Warnings-Set Latency");
        Taponbutton(Constant_Batteries_MTC.mtc_Batteries_Warnings_Battery_Voltage_BelowText_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Set Latency is displayed")
    public void iValidateAppliedMinutesInWarningsSetLatencyIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied minutes in Warnings-Set Latency is displayed");
        String text = driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Set_Latency_Updated_Value_xpath)).getText();
        if (warningsSetLatency.get(0).equalsIgnoreCase(text)) {
            System.out.println("Text comparison is Successful");
        } else if (warningsSetLatency.get(1).equalsIgnoreCase(text)) {
            System.out.println("Text comparison is Successful");
        } else if (warningsSetLatency.get(2).equalsIgnoreCase(text)) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I Tap on Ok button")
    public void iTapOnOkButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Ok button");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_title_template_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_Batteries_MTC.mtc_Batteries_button1_xpath);
        }
    }

    @Then("I scroll up to the maximum value Alert-Battery Voltage Below")
    public void iScrollUpToTheMaximumValueAlertBatteryVoltageBelow() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up to the maximum value Alert-Battery Voltage Below");
//        List<AndroidElement> list = driver.findElementsByAccessibilityId(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText_Maximum_Value_Access_ID);
//        System.out.println(list.size());
//        while (list.size() == 0) {
//            if (list.size() == 0) {
//                TouchAction action = new TouchAction(driver);
//                action.press(PointOption.point(530, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                        .moveTo(PointOption.point(530, 1350));
//                action.release().perform();
//                Thread.sleep(1000);
//            } else if (list.size() != 0) {
//                break;
//            }
//        }

//        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText_Maximum_Value));
//        System.out.println(elements);
//        for (int i = 0; i < 100; i++) {
//            TouchAction action = new TouchAction(driver);
//            action.press(PointOption.point(530, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                    .moveTo(PointOption.point(530, 1350));
//            action.release().perform();
//            Thread.sleep(1000);
//            if (Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText_Maximum_Value.equals("29.5")){
//                break;
//            }
//        }
        String text = driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText_Maximum_Value)).getText();
        System.out.println(text);
        while (true) {
            if (!text.equals("29.5")) {
                TouchAction action = new TouchAction(driver);
                action.press(PointOption.point(530, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(530, 1350));
                action.release().perform();
                Thread.sleep(1000);
            } else {
                break;
            }
        }
//        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Battery_Voltage_BelowText_Maximum_Value));
//        for (int i = 0; i < 100; i++) {
//            System.out.println(elements.size());
//            TouchAction action = new TouchAction(driver);
//            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                    .moveTo(PointOption.point(530, 1300)).release().perform();
//            Thread.sleep(2000);
//            if (elements.get(i).getText().equals("29.5")) {
//                System.out.println(elements.size());
//                break;
//            }
//        }

    }

    @Then("I scroll up to maximum value in Alert-Battery Voltage Below carousel")
    public void iScrollUpToMaximumValueInAlertBatteryVoltageBelowCarousel() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up to maximum value in Alert-Battery Voltage Below carousel");
        TouchAction action = new TouchAction(driver);
        current_carousel_value = driver.findElementByAccessibilityId(Constant_Batteries_MTC.mtc_Alerts_Battery_Voltage_Below_Applied_Value_access_id).getText();
        current_carousel_value_number = Float.parseFloat(current_carousel_value);
        iteration_count = ((26.0 - current_carousel_value_number) * 10);
//        System.out.println("I scroll up to maximum value in Alert-Battery Voltage Below carousel"+iteration_count);
        for (float i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(540, 1050)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(540, 925)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll up to minimum value in Alert-Battery Voltage Below carousel")
    public void iScrollUpToMinimumValueInAlertBatteryVoltageBelowCarousel() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up to minimum value in Alert-Battery Voltage Below carousel");
        TouchAction action = new TouchAction(driver);
        current_carousel_value = driver.findElementByAccessibilityId(Constant_Batteries_MTC.mtc_Alerts_Battery_Voltage_Below_Applied_Value_access_id).getText();
        current_carousel_value_number = Float.parseFloat(current_carousel_value);
        iteration_count = ((current_carousel_value_number - 5.0) * 10);
//        System.out.println("I scroll up to minimum value in Alert-Battery Voltage Below carousel"+iteration_count);
        for (float i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(540, 925)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(540, 1050)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Alert-Set Latency")
    public void iScrollToTheMaximumCarouselValueInAlertSetLatency() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up to maximum value in Alert-Battery Voltage Below carousel");
        TouchAction action = new TouchAction(driver);
        current_carousel_value = driver.findElementByAccessibilityId(Constant_Batteries_MTC.mtc_Alerts_SetLatency_Applied_Value_access_id).getText();
        current_carousel_value_number = Float.parseFloat(current_carousel_value);
        iteration_count = ((60.0 - current_carousel_value_number));
//        System.out.println("I scroll to the maximum carousel value in Alert-Set Latency"+iteration_count);
        for (float i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(540, 1200)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(540, 1075)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Alert-Set Latency")
    public void iScrollToTheMinimumCarouselValueInAlertSetLatency() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum carousel value in Alert-Set Latency");
        TouchAction action = new TouchAction(driver);
        current_carousel_value = driver.findElementByAccessibilityId(Constant_Batteries_MTC.mtc_Alerts_SetLatency_Applied_Value_access_id).getText();
        current_carousel_value_number = Float.parseFloat(current_carousel_value);
        iteration_count = ((current_carousel_value_number - 0.0));
//        System.out.println("I scroll to the minimum carousel value in Alert-Set Latency"+iteration_count);
        for (float i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(540, 1075)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(540, 1200)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Warnings-Battery Voltage Below")
    public void iScrollToTheMaximumCarouselValueInWarningsBatteryVoltageBelow() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up to the maximum value in Warnings-Battery Voltage Below");
        TouchAction action = new TouchAction(driver);
        current_carousel_value = driver.findElementByAccessibilityId(Constant_Batteries_MTC.mtc_Warnings_Battery_Voltage_Below_Applied_value_access_id).getText();
        current_carousel_value_number = Float.parseFloat(current_carousel_value);
        iteration_count = ((25.9 - current_carousel_value_number) * 10);
//        System.out.println("I scroll to the maximum carousel value in Warnings-Battery Voltage Below"+iteration_count);
        for (float i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(540, 1575)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(540, 1450)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Warnings-Battery Voltage Below")
    public void iScrollToTheMinimumCarouselValueInWarningsBatteryVoltageBelow() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up to the minimum value in Warnings-Battery Voltage Below");
        TouchAction action = new TouchAction(driver);
        current_carousel_value = driver.findElementByAccessibilityId(Constant_Batteries_MTC.mtc_Warnings_Battery_Voltage_Below_Applied_value_access_id).getText();
        current_carousel_value_number = Float.parseFloat(current_carousel_value);
        iteration_count = ((current_carousel_value_number - 5.0) * 10);
//        System.out.println("I scroll to the minimum carousel value in Warnings-Battery Voltage Below"+iteration_count);
        for (float i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(540, 1450)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(540, 1575)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Warnings-Set Latency")
    public void iScrollToTheMaximumCarouselValueInWarningsSetLatency() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum value in Warnings-Set Latency carousel");
        TouchAction action = new TouchAction(driver);
        current_carousel_value = driver.findElementByAccessibilityId(Constant_Batteries_MTC.mtc_Warnings_Set_Latency_Applied_Value_access_id).getText();
        current_carousel_value_number = Float.parseFloat(current_carousel_value);
        iteration_count = ((60.0 - current_carousel_value_number));
//        System.out.println("I scroll to the maximum carousel value in Warnings-Set Latency"+iteration_count);
        for (float i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(495, 1725)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(495, 1600)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Warnings-Set Latency")
    public void iScrollToTheMinimumCarouselValueInWarningsSetLatency() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum value in Warnings-Set Latency carousel");
        TouchAction action = new TouchAction(driver);
        current_carousel_value = driver.findElementByAccessibilityId(Constant_Batteries_MTC.mtc_Warnings_Set_Latency_Applied_Value_access_id).getText();
        current_carousel_value_number = Float.parseFloat(current_carousel_value);
        iteration_count = ((current_carousel_value_number - 0.0));
//        System.out.println("I scroll to the minimum carousel value in Warnings-Set Latency"+iteration_count);
        for (float i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(500, 1600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(500, 1725)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I verify Hour text")
    public void iVerifyHourText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Hour text");
        asserttextValidation(Constant_Batteries_MTC.mtc_Batteries_HOURText, Constant_Batteries_MTC.mtc_Batteries_HOURText_xpath);
        System.out.println("Hour text is verified");
    }

    @Then("I Tap on Day in voltage Graph")
    public void iTapOnDayInVoltageGraph() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Day in voltage Graph");
        Taponbutton(Constant_Batteries_MTC.mtc_Batteries_DAYText_xpath);
        Thread.sleep(2000);
    }

    @Then("I Tap on Back Button in Battery screen")
    public void iTapOnBackButtonInBatteryScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in Battery screen");
        if (driver.findElementsByAccessibilityId(Constant_Batteries_MTC.mtc_Batteries_Back_Button_Access_ID).size() != 0) {
            driver.pressKeyCode(AndroidKeyCode.BACK);
        }
    }
}

