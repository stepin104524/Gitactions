package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_Batteries_MTC;
import com.dometic.MTC.qa.Pages.Constant_BilgePump_MTC;
import com.dometic.MTC.qa.Pages.Constant_Tank;
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

public class TankMTC extends Baseclass {
    public static List<String> alertTankLevelAbove, alertSetLatency, warningsTankLevelAbove, warningsSetLatency;
    public static String tank_current_carousel_value;
    public static int tank_current_carousel_value_number, iteration_count;

    @Then("Then I Tap on Tank Fuel tile in Landing Screen")
    public void thenITapOnTankFuelTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Fuel_xpath));
        while (elements.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(125, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(400, 1000));
            action.release().perform();
        }
        if (elements.size() != 0) {
            Taponbutton(Constant_Tank.MTC_Tank_Fuel_xpath);
        }
    }

    @Then("Then I Tap on Tank Oil tile in Landing Screen")
    public void thenITapOnTankOilTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Oil_xpath));
        while (elements.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if (elements.size() != 0) {
            Taponbutton(Constant_Tank.MTC_Tank_Oil_xpath);
        }
    }

    @Then("Then I Tap on Tank Fresh tile in Landing Screen")
    public void thenITapOnTankFreshTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Fresh_xpath));
        while (elements.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if (elements.size() != 0) {
            Taponbutton(Constant_Tank.MTC_Tank_Fresh_xpath);
        }
    }

    @Then("Then I Tap on Tank Grey tile in Landing Screen")
    public void thenITapOnTankGreyTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Grey_xpath));
        while (elements.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if (elements.size() != 0) {
            Taponbutton(Constant_Tank.MTC_Tank_Grey_xpath);
        }
    }

    @Then("Then I Tap on Tank Black tile in Landing Screen")
    public void thenITapOnTankBlackTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Black_xpath));
        while (elements.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if (elements.size() != 0) {
            Taponbutton(Constant_Tank.MTC_Tank_Black_xpath);
        }
    }

    @Then("Then I Tap on Tank Live tile in Landing Screen")
    public void thenITapOnTankLiveTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Live_xpath));
        while (elements.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if (elements.size() != 0) {
            Taponbutton(Constant_Tank.MTC_Tank_Live_xpath);
        }
    }

    @Then("Then I Tap on Tank Bait tile in Landing Screen")
    public void thenITapOnTankBaitTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Bait_xpath));
        while (elements.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if (elements.size() != 0) {
            Taponbutton(Constant_Tank.MTC_Tank_Bait_xpath);
        }
    }

    @Then("I verify the Fuel Level text in the Tank screen")
    public void iVerifyTheFuelLevelTextInTheTankScreen() throws Throwable {
        asserttext(Constant_Tank.FUEL_LEVEL, Constant_Tank.FUEL_LEVEL_text_xpath);
    }

    @Then("I Tap on  the OIL option in the Tank screen")
    public void iTapOnTheOILOptionInTheTankScreen() {
        Taponbutton(Constant_Tank.MTC_Tank_Oil_xpath);
    }

    @Then("I verify the OIL Level text in the Tank screen")
    public void iVerifyTheOILLevelTextInTheTankScreen() throws Throwable {
        asserttext(Constant_Tank.oil_LEVEL_text, Constant_Tank.OIL_LEVEL_text_xpath);
    }

    @Then("I swipe the tank option from left to right")
    public void iSwipeTheTankOptionFromLeftToRight() {

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(925, 1300)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(150, 1300));
        action.release().perform();
    }

    @Then("I tap on the Live option in the Tank screen")
    public void iTapOnTheLiveOptionInTheTankScreen() {
        Taponbutton(Constant_Tank.MTC_Tank_Live_xpath);
    }

    @Then("I verify the Live well Level text in the Tank screen")
    public void iVerifyTheLiveWellLevelTextInTheTankScreen() throws Throwable {
        asserttext(Constant_Tank.Live_LEVEL_text, Constant_Tank.Live_LEVEL_text_xpath);
    }

    @Then("I Tap on the BAIT text option in the Tank screen")
    public void iTapOnTheBAITTextOptionInTheTankScreen() {
        Taponbutton(Constant_Tank.MTC_Tank_Bait_xpath);
    }

    @Then("I verify the BAIT WELL LEVEL text in the Tank screen")
    public void iVerifyTheBAITWELLLEVELTextInTheTankScreen() throws Throwable {
        asserttext(Constant_Tank.Bait_LEVEL_text, Constant_Tank.Bait_LEVEL_text_xpath);
    }

    @Then("I Tap on Tank tile on landing screen")
    public void iTapOnTankTileOnLandingScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tank tile on landing screen");
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Tile_Xpath);
        Thread.sleep(2000);
    }

    @Then("I verify Tank header text")
    public void iVerifyTankHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank header text");
        asserttextValidationAccessibility(Constant_Tank_MTC.mtc_Tank, Constant_Tank_MTC.mtc_Tank_Title_Access_ID);
    }

    @Then("I Tap on Alert-Tank Level Above")
    public void iTapOnAlertTankLevelAbove() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Alert-Tank Level Above");
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_xpath);
    }

    @Then("I verify Warnings-Tank Level Above Text")
    public void iVerifyWarningsTankLevelAboveText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warnings-Tank Level Above Text");
        String text = driver.findElementByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Warning_Tank_Level_Above_Access_ID).getText();
        if (text.equalsIgnoreCase("Tank Level Above")) {
            asserttextValidationAccessibility(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above, Constant_Tank_MTC.mtc_Tank_Warning_Tank_Level_Above_Access_ID);
        } else if (text.equalsIgnoreCase("Tank Level below")) {
            asserttextValidationAccessibility(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Below, Constant_Tank_MTC.mtc_Tank_Warning_Tank_Level_Above_Access_ID);
        }
    }

    @Then("I Tap on Warnings-Tank Level Above")
    public void iTapOnWarningsTankLevelAbove() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Warnings-Tank Level Above");
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Warnings_Tank_Level_Above_xpath);
    }

    @Then("I verify Alert text")
    public void iVerifyAlertText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alert text");
        asserttextValidation(Constant_Tank_MTC.mtc_Tank_AlertsText, Constant_Tank_MTC.mtc_Tank_AlertsText_xpath);
    }

    @Then("I verify Warning text")
    public void iVerifyWarningText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warning text");
        asserttextValidation(Constant_Tank_MTC.mtc_Tank_WarningsText, Constant_Tank_MTC.mtc_Tank_WarningsText_xpath);
    }

    @Then("I verify Alert-Tank Level Above Text")
    public void iVerifyAlertTankLevelAboveText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alert-Tank Level Above Text");
//        String validation=Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above || Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Below;
        String text = driver.findElementByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Alert_Tank_Level_Above_Access_ID).getText();
        if (text.equalsIgnoreCase("Tank Level Above")) {
            asserttextValidationAccessibility(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above, Constant_Tank_MTC.mtc_Tank_Alert_Tank_Level_Above_Access_ID);
        } else if (text.equalsIgnoreCase("Tank Level below")) {
            asserttextValidationAccessibility(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Below, Constant_Tank_MTC.mtc_Tank_Alert_Tank_Level_Above_Access_ID);
        }
    }

    @Then("I scroll up the screen in Alert-Tank Level Above")
    public void iScrollUpTheScreenInAlertTankLevelAbove() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Tank Level Above");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1050)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 900)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Alert-Tank Level Above")
    public void iVerifyApplyButtonInAlertTankLevelAbove() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Alert-Tank Level Above");
        /** Globally declared Tank Level Above Values **/
        alertTankLevelAbove = new ArrayList<>();
        alertTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_FirstValue_xpath)).getText());
        alertTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_SecondValue_xpath)).getText());
        alertTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Alert-Tank Level Above")
    public void iTapOnApplyButtonInAlertTankLevelAbove() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Alert-Tank Level Above");
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Alerts_Apply_xpath);
    }

    @Then("I Validate Applied percentage in Tank Level Above is displayed")
    public void iValidateAppliedPercentageInTankLevelAboveIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied percentage in Tank Level Above is displayed");
        if (alertTankLevelAbove.get(0).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertTankLevelAbove.get(1).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertTankLevelAbove.get(2).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Alert-Set Latency\\(Tank screen)")
    public void iScrollUpTheScreenInAlertSetLatencyTankScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Set Latency(Tank screen)");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1200)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1050)).release().perform();
        System.out.println("Scrolling up the Page");

    }

    @Then("I Verify Apply button in Alert-Set Latency\\(Tank screen)")
    public void iVerifyApplyButtonInAlertSetLatencyTankScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Alert-Set Latency(Tank screen)");
        /** Globally declared Set Latency Values **/
        alertSetLatency = new ArrayList<>();
        alertSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_FirstValue_xpath)).getText());
        alertSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_SecondValue_xpath)).getText());
        alertSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_ThirdValue_xpath)).getText());

    }

    @Then("I Tap on Apply button in Alert-Set Latency\\(Tank screen)")
    public void iTapOnApplyButtonInAlertSetLatencyTankScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Alert-Set Latency(Tank screen)");
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Alerts_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Alert-Set Latency\\(Tank screen) is displayed")
    public void iValidateAppliedMinutesInAlertSetLatencyTankScreenIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied minutes in Alert-Set Latency(Tank screen) is displayed");
        if (alertSetLatency.get(0).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertSetLatency.get(1).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertSetLatency.get(2).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Tank Level Above")
    public void iScrollUpTheScreenInWarningsTankLevelAbove() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Warnings-Tank Level Above");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1575)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1450)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Tank Level Above")
    public void iVerifyApplyButtonInWarningsTankLevelAbove() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Warnings-Tank Level Above");
        /** Globally declared Warnings-Tank Level Above Values **/
        warningsTankLevelAbove = new ArrayList<>();
        warningsTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_FirstValue_xpath)).getText());
        warningsTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_SecondValue_xpath)).getText());
        warningsTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Tank Level Above")
    public void iTapOnApplyButtonInWarningsTankLevelAbove() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Warnings-Tank Level Above");
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Alerts_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Tank Level Above is displayed")
    public void iValidateAppliedMinutesInWarningsTankLevelAboveIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied minutes in Warnings-Tank Level Above is displayed");
        if (warningsTankLevelAbove.get(0).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsTankLevelAbove.get(1).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsTankLevelAbove.get(2).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Set Latency\\(Tank screen)")
    public void iScrollUpTheScreenInWarningsSetLatencyTankScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Warnings-Set Latency(Tank screen)");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1715)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1575)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Set Latency\\(Tank screen)")
    public void iVerifyApplyButtonInWarningsSetLatencyTankScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Warnings-Set Latency(Tank screen)");
        /** Globally declared Warnings-Set Latency Values **/
        warningsSetLatency = new ArrayList<>();
        warningsSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_FirstValue_xpath)).getText());
        warningsSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_Below_SecondValue_xpath)).getText());
        warningsSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Set Latency\\(Tank screen)")
    public void iTapOnApplyButtonInWarningsSetLatencyTankScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Warnings-Set Latency(Tank screen)");
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Alerts_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Set Latency\\(Tank screen) is displayed")
    public void iValidateAppliedMinutesInWarningsSetLatencyTankScreenIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Applied minutes in Warnings-Set Latency(Tank screen) is displayed");
        if (warningsSetLatency.get(0).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsSetLatency.get(1).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsSetLatency.get(2).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I Tap on Tank Alert toggle if it's already in OFF state")
    public void iTapOnTankAlertToggleIfItSAlreadyInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tank Alert toggle if it's already in OFF state");
//        if (driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Alerts_Status_Text_xpath)).getText().equalsIgnoreCase("OFF")) {}
        if(driver.findElementsByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Alert_Tank_Level_Above_Access_ID).size()==0){
            Taponbutton(Constant_Tank_MTC.mtc_Tank_Alerts_toggle_xpath);
            Thread.sleep(10000);
        }
    }

    @Then("I Tap on Tank Warnings toggle if it's already in OFF state")
    public void iTapOnTankWarningsToggleIfItSAlreadyInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tank Warnings toggle if it's already in OFF state");
//        if (driver.findElement(By.xpath(Constant_Batteries_MTC.mtc_Batteries_Warnings_Status_Text_xpath)).getText().equalsIgnoreCase("OFF")) {}
        if(driver.findElementsByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Warning_Tank_Level_Above_Access_ID).size()==0){
            Taponbutton(Constant_Tank_MTC.mtc_Tank_Warnings_toggle_xpath);
            Thread.sleep(10000);
        }
    }

    @Then("I scroll to the maximum carousel value in Alert-Tank Level Above")
    public void iScrollToTheMaximumCarouselValueInAlertTankLevelAbove() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum value in Alert-Tank Level Above carousel");
        TouchAction action = new TouchAction(driver);
        tank_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Alert_Tank_level_applied_value_Access_id).getText();
        tank_current_carousel_value_number = Integer.parseInt(tank_current_carousel_value);
        iteration_count = ((100 - tank_current_carousel_value_number) / 5);
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1050)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 900)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Alert-Tank Level Above")
    public void iScrollToTheMinimumCarouselValueInAlertTankLevelAbove() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum value in Alert-Tank Level Above carousel");
        TouchAction action = new TouchAction(driver);
        tank_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Alert_Tank_level_applied_value_Access_id).getText();
        tank_current_carousel_value_number = Integer.parseInt(tank_current_carousel_value);
        iteration_count = ((tank_current_carousel_value_number - 0) / 5);
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 900)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1050)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Alert-Set Latency\\(Tank screen)")
    public void iScrollToTheMaximumCarouselValueInAlertSetLatencyTankScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum value in Alert-Set Latency (Tank screen) carousel");
        TouchAction action = new TouchAction(driver);
        tank_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Alert_Set_Latency_access_id).getText();
        tank_current_carousel_value_number = Integer.parseInt(tank_current_carousel_value);
        iteration_count = ((60 - tank_current_carousel_value_number));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1200)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1050)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Alert-Set Latency\\(Tank screen)")
    public void iScrollToTheMinimumCarouselValueInAlertSetLatencyTankScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum value in Alert-Set Latency(Tank screen) carousel");
        TouchAction action = new TouchAction(driver);
        tank_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Alert_Set_Latency_access_id).getText();
        tank_current_carousel_value_number = Integer.parseInt(tank_current_carousel_value);
        iteration_count = ((tank_current_carousel_value_number - 0));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1050)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1200)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Warnings-Tank Level Above")
    public void iScrollToTheMaximumCarouselValueInWarningsTankLevelAbove() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum value in Warnings-Tank Level Above carousel");
        TouchAction action = new TouchAction(driver);
        tank_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Warning_Tank_Level_Applied_Value_access_id).getText();
        tank_current_carousel_value_number = Integer.parseInt(tank_current_carousel_value);
        iteration_count = ((100 - tank_current_carousel_value_number) / 5);
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1575)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1450)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Warnings-Tank Level Above")
    public void iScrollToTheMinimumCarouselValueInWarningsTankLevelAbove() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum in Warnings-Tank Level Above carousel");
        TouchAction action = new TouchAction(driver);
        tank_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Warning_Tank_Level_Applied_Value_access_id).getText();
        tank_current_carousel_value_number = Integer.parseInt(tank_current_carousel_value);
        iteration_count = ((tank_current_carousel_value_number - 0) / 5);
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1450)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1575)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Warnings-Set Latency\\(Tank screen)")
    public void iScrollToTheMaximumCarouselValueInWarningsSetLatencyTankScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum value in Warnings-Set Latency(Tank screen) carousel");
        TouchAction action = new TouchAction(driver);
        tank_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Warning_Set_Latency_Applied_Value_access_id).getText();
        tank_current_carousel_value_number = Integer.parseInt(tank_current_carousel_value);
        iteration_count = ((100 - tank_current_carousel_value_number));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1715)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1575)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value Warnings-Set Latency\\(Tank screen)")
    public void iScrollToTheMinimumCarouselValueWarningsSetLatencyTankScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum value in Warnings-Set Latency(Tank screen) carousel");
        TouchAction action = new TouchAction(driver);
        tank_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Warning_Set_Latency_Applied_Value_access_id).getText();
        tank_current_carousel_value_number = Integer.parseInt(tank_current_carousel_value);
        iteration_count = ((tank_current_carousel_value_number - 0));
        for (int i = 0; i < iteration_count; i++) {
            action.press(PointOption.point(530, 1575)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1715)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I Scroll the screen till grey water")
    public void iScrollTheScreenTillGreyWater() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the screen till grey water");
        List<AndroidElement> id = driver.findElementsByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Grey_Water_Access_Id);
        while (id.size() != 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(1000, 530)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(400, 530)).release().perform();
            Thread.sleep(2000);
            break;
        }
    }

    @Then("I verify Tank Grey Water Tank text is displayed")
    public void iVerifyTankGreyWaterTankTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank Grey Water Tank text is displayed");
        asserttextValidationAccessibility(Constant_Tank_MTC.mtc_Tank_Grey_Water_Text, Constant_Tank_MTC.mtc_Tank_Grey_Water_Access_Id);
    }

    @Then("I verify Tank Black Water Tank text is displayed")
    public void iVerifyTankBlackWaterTankTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank Black Water Tank text is displayed");
        asserttextValidationAccessibility(Constant_Tank_MTC.mtc_Tank_Black_Water_Text, Constant_Tank_MTC.mtc_Tank_Black_Water_Access_Id);
    }

    @Then("I Scroll the screen till Black Water")
    public void iScrollTheScreenTillBlackWater() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the screen till Black Water");
        List<AndroidElement> id = driver.findElementsByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Grey_Water_Access_Id);
        for (int i = 0; i < 2; i++) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(1000, 530)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(400, 530)).release().perform();
            Thread.sleep(2000);
        }
    }

    @Then("I verify the Tank Tile text")
    public void iVerifyTheTankTileText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Tank Tile text");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Tank_MTC.Mtc_Tank_tile_text_accessid));
    }

    @Then("I Verify the Fresh water Text on tank tile")
    public void iVerifyTheFreshWaterTextOnTankTile() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Fresh water Text on tank tile");
        asserttextValidationAccessibility(Constant_Tank_MTC.mtc_freshtank_Text, Constant_Tank_MTC.Mtc_Tank_fresh_accessid);
        System.out.println("Fresh water text in Tanks is verified");
    }

    @Then("I scrolled to the Grey water tank")
    public void iScrolledToTheGreyWaterTank() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scrolled to the Grey water tank");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(950, 1150)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(650, 1150)).release().perform();
        Thread.sleep(2000);
    }

    @Then("I verify the grey water text on tank tile")
    public void iVerifyTheGreyWaterTextOnTankTile() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the grey water text on tank tile");
        asserttextValidationAccessibility(Constant_Tank_MTC.mtc_greytank_text, Constant_Tank_MTC.Mtc_Tank_Pump_Grey_accessid);
        System.out.println("Grey water text in Tanks is verified");
    }

    @Then("I scrolled to the Black water tank")
    public void iScrolledToTheBlackWaterTank() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scrolled to the Black water tank");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(950, 1150)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(650, 1150)).release().perform();
        Thread.sleep(2000);
    }

    @Then("I verify the Black water text on tank tile")
    public void iVerifyTheBlackWaterTextOnTankTile() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Black water text on tank tile");
        asserttextValidationAccessibility(Constant_Tank_MTC.mtc_Black_Text, Constant_Tank_MTC.Mtc_Tank_Pump_Black_accessid);
        System.out.println("Black water text in Tanks is verified");
    }

    @Then("I Scrolled from Black water instance to Fresh water in Tank Tile")
    public void iScrolledFromBlackWaterInstanceToFreshWaterInTankTile() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scrolled from Black water instance to Fresh water in Tank Tile");
        for (int i = 0; i < 2; i++) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(750, 1150)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(950, 1150)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I verify Alert-Set Latency Text in Tanks Screen")
    public void iVerifyAlertSetLatencyTextInTanksScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alert-Set Latency Text in Tanks Screen");
        if(driver.findElementsByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Alert_Tank_Level_Above_Access_ID).size()!=0){
            asserttextValidation(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency, Constant_Batteries_MTC.mtc_Batteries_Set_LatencyText_xpath);
        }
    }

    @Then("I verify Warnings-Set Latency Text in Tanks Screen")
    public void iVerifyWarningsSetLatencyTextInTanksScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alert-Set Latency Text in Tanks Screen");
        if(driver.findElementsByAccessibilityId(Constant_Tank_MTC.mtc_Tank_Warning_Tank_Level_Above_Access_ID).size()!=0){
            asserttextValidation(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency, Constant_Batteries_MTC.mtc_Batteries_Warnings_Set_LatencyText_xpath);
        }
    }
}
