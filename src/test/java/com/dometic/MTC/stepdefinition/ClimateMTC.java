package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_climate_ac;
import com.dometic.L1.qa.Pages.Constant_climate_heater;
import com.dometic.MTC.qa.Pages.Constant_Batteries_MTC;
import com.dometic.MTC.qa.Pages.Constant_landingscreen;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ClimateMTC extends Baseclass {
    public static String minTemp,maxTemp;
    @Then("I verify power text climate main screen")
    public void iVerifyPowerTextClimateMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify power text climate main screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Climate_Tile_AllClimate_toggle_Status_xpath));
        if (elements.size() != 0) {
            asserttextAccessibility(Constant_landingscreen.LandingPage_Climate_power_text, Constant_landingscreen.LandingPage_Climate_power_text_access_id);
        }
    }

    @Then("I verify fan speed text climate main screen")
    public void iVerifyFanSpeedTextClimateMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify fan speed text climate main screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Climate_Tile_AllClimate_toggle_Status_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_landingscreen.LandingPage_Climate_fanspeed_text, Constant_landingscreen.LandingPage_Climate_fanspeed_text_xpath);
        }
    }

    @Then("I verify Auto-fan speed text climate main screen")
    public void iVerifyAutoFanSpeedTextClimateMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Auto-fan speed text climate main screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Climate_Tile_AllClimate_toggle_Status_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_landingscreen.LandingPage_Climate_autofanspeed_text, Constant_landingscreen.LandingPage_Climate_autofanspeed_text_xpath);
        }
    }

    @Then("I Tap on Auto-fan speed navigation in climate main screen")
    public void iTapOnAutoFanSpeedNavigationInClimateMainScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Auto-fan speed navigation in climate main screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Climate_Tile_AllClimate_toggle_Status_xpath));
        if (elements.size() != 0) {
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_Climate_autofanmode_navigation_access_id);
        }
    }

    @Then("I verify the AutoSpeed text inside the Auto-fan mode")
    public void iVerifyTheAutoSpeedTextInsideTheAutoFanMode() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the AutoSpeed text inside the Auto-fan mode");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Climate_Tile_AllClimate_toggle_Status_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_landingscreen.LandingPage_Climate_autofanspeed_AutoSpeed_text, Constant_landingscreen.LandingPage_Climate_autofanspeed_AutoSpeed_text_xpath);
        }
    }

    @Then("I verify the AutoCont text inside the Auto-fan mode")
    public void iVerifyTheAutoContTextInsideTheAutoFanMode() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the AutoCont text inside the Auto-fan mode");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Climate_Tile_AllClimate_toggle_Status_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_landingscreen.LandingPage_Climate_autofanspeed_AutoCont_text, Constant_landingscreen.LandingPage_Climate_autofanspeed_AutoCont_text_xpath);
        }
    }

    @Then("I verify the climate mode text in climate main screen")
    public void iVerifyTheClimateModeTextInClimateMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the climate mode text in climate main screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Climate_climate_mode_text_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_landingscreen.LandingPage_Climate_climate_mode_text, Constant_landingscreen.LandingPage_Climate_climate_mode_text_xpath);
        }
    }

    @Then("I verify the Eco modifier text in climate main screen")
    public void iVerifyTheEcoModifierTextInClimateMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Eco modifier text in climate main screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Climate_Eco_modifier_text_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_landingscreen.LandingPage_Climate_Eco_modifier_text, Constant_landingscreen.LandingPage_Climate_Eco_modifier_text_xpath);
        }
    }

    @Then("I verify the Sleep modifier text in climate main screen")
    public void iVerifyTheSleepModifierTextInClimateMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Sleep modifier text in climate main screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Climate_sleep_modifier_text_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_landingscreen.LandingPage_Climate_sleep_modifier_text, Constant_landingscreen.LandingPage_Climate_sleep_modifier_text_xpath);
        }
    }

    @Then("I verify the Scheduler text in climate main screen")
    public void iVerifyTheSchedulerTextInClimateMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Scheduler text in climate main screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Climate_Scheduler_text_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_landingscreen.LandingPage_Climate_Scheduler_text, Constant_landingscreen.LandingPage_Climate_Scheduler_text_xpath);
        }
    }

    @Then("I Tap on Auto-fan speed info icon climate main screen")
    public void iTapOnAutoFanSpeedInfoIconClimateMainScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Auto-fan speed info icon climate main screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Climate_autofanspeed_infoicon_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_landingscreen.LandingPage_Climate_autofanspeed_infoicon_xpath);
        }
    }

    @Then("I tap on Device back button")
    public void iTapOnDeviceBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Device back button");
            driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @Then("I tap on Eco modifier tool tip in climate main screen")
    public void iTapOnEcoModifierToolTipInClimateMainScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Eco modifier tool tip in climate main screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Climate_Ecomodifier_infoicon_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_landingscreen.LandingPage_Climate_Ecomodifier_infoicon_xpath);
        }
    }

    @Then("I Tap on the Sleep modifier tool tip in climate main screen")
    public void iTapOnTheSleepModifierToolTipInClimateMainScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Sleep modifier tool tip in climate main screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Climate_sleepmodifier_infoicon_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_landingscreen.LandingPage_Climate_sleepmodifier_infoicon_xpath);
        }
    }

    @Then("I scroll minimum temperature in Climate")
    public void iScrollMinimumTemperatureInClimate() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll minimum temperature in Climate");
        try{
            List<AndroidElement> list = driver.findElements(By.xpath(Constant_landingscreen.climate_temperatureArray));
            while (list.size()!=0){
                TouchAction action = new TouchAction(driver);
                action.press(PointOption.point(550, 550)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(900, 550));
                action.release().perform();
                if (driver.findElement(By.xpath(Constant_landingscreen.climate_temperatureArray)).getText().equals("16")){
                    TouchAction action1 = new TouchAction(driver);
                    action1.press(PointOption.point(550, 550)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                            .moveTo(PointOption.point(900, 550));
                    action1.release().perform();
                    minTemp = driver.findElement(By.xpath(Constant_landingscreen.climate_applied_minmimum_temperature_xpath)).getText();
                    break;
                }
            }

        }
        catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    @Then("I Tap on Apply button  in climate")
    public void iTapOnApplyButtonInClimate() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button  in climate screen");
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(Constant_landingscreen.climate_apply_button_access_id);
        if(elements.size()!=0){
            TaponbuttonaccessabilityID(Constant_landingscreen.climate_apply_button_access_id);
        }
    }

    @Then("I validated minimum applied temperature is displayed in Landing screen")
    public void iValidatedMinimumAppliedTemperatureIsDisplayedInLandingScreen() {
        String text = driver.findElement(By.xpath(Constant_landingscreen.climate_applied_temperature_xpath)).getText();
        if(text.contains(minTemp)){
            System.out.println("Text comparison is Successful");
        }
        else{
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll maximum temperature in Climate")
    public void iScrollMaximumTemperatureInClimate() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll maximum temperature in Climate AC");
        try{
            List<AndroidElement> list = driver.findElements(By.xpath(Constant_landingscreen.climate_temperatureArray));
            while (list.size()!=0){
                TouchAction action = new TouchAction(driver);
                action.press(PointOption.point(900, 550)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(550, 550));
                action.release().perform();
                if (driver.findElement(By.xpath(Constant_landingscreen.climate_temperatureArray)).getText().equals("30")){
                    maxTemp = driver.findElement(By.xpath(Constant_landingscreen.climate_applied_maximum_temperature_xpath)).getText();
                    break;
                }
            }

        }
        catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    @Then("I validated maximum applied temperature is displayed in Landing screen")
    public void iValidatedMaximumAppliedTemperatureIsDisplayedInLandingScreen() {
        String text = driver.findElement(By.xpath(Constant_landingscreen.climate_applied_temperature_xpath)).getText();
        if(text.contains(maxTemp)){
            System.out.println("Text comparison is Successful");
        }
        else{
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }
}
