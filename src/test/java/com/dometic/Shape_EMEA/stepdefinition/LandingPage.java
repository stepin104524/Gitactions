package com.dometic.Shape_EMEA.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.Shape_EMEA.qa.Pages.*;
import com.dometic.Shape_EMEA.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LandingPage extends Baseclass {
    public static String freshWater, blackWater, mainContentText;
    public static List<String> Waterheater;

    @Then("I Tap on LATER Button")
    public void iTapOnLATERButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on LATER Button");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Firmware_popup_xpath));
        if (elements.size() != 0) {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_Firmware_popup_xpath)));
            Taponbutton(Constant_landingscreen.LandingPage_LATER_button_xpath);
        }
    }

    @Then("I Tap on cancel button in Upgrade Firmware")
    public void iTapOnCancelButtonInUpgradeFirmware() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on cancel button in Upgrade Firmware");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Firmware_popup_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_landingscreen.LandingPage_LATER_button_xpath);
        }
        List<AndroidElement> elements3 = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        if (elements3.size() != 0) {
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        }
    }

    @Then("I Tap on Climate in Landing screen")
    public void iTapOnClimateInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Climate in Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_L21stclimate_tile_xpath);
    }

    @Then("I Scroll Right to Left of the screen")
    public void iSCrollRightToLeftOfTheScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll Right to Left of the screen");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(900, 650)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(550, 650));
        action.release().perform();
    }


    @Then("I Scroll up the minutes in Scheduled At")
    public void iScrollUpTheMinutesInScheduledAt() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the minutes in Scheduled At");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(700, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(700, 1450));
        action.release().perform();
    }


    @Then("I Tap on the Power in Landing screen")
    public void iTapOnThePowerInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Power in Landing screen");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_L2power_text_xpath)));
        Taponbutton(Constant_landingscreen.LandingPage_L2power_text_xpath);
    }

    @Then("I Tap on Light in Landing screen")
    public void iTapOnLightInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Light in Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_L2light_tile_xpath);
    }

    @Then("I Scroll left to right in Accent Light")
    public void iScrollLeftToRightInAccentLight() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll left to right in Accent Light");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(130, 1040)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(520, 1040));
        action.release().perform();
    }

    @Then("I Scroll left to right in Bedroom Ceiling")
    public void iScrollLeftToRightInBedroomCeiling() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll left to right in Bedroom Ceiling");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(130, 1850)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(520, 1850));
        action.release().perform();
    }

    @Then("I Tap on AGS in Landing Screen")
    public void iTapOnAGSInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on AGS in Landing Screen");
        Taponbutton(Constant_landingscreen.LandingPage_L2AGS_text_xpath);
    }

    @Then("I Scroll up the hours in Quiet Time Start")
    public void iScrollUpTheHoursInQuietTimeStart() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the hours in Quiet Time Start");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(300, 1250)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(300, 1000));
        action.release().perform();
    }

    @Then("I Scroll up the minutes in Quiet Time Start")
    public void iScrollUpTheMinutesInQuietTimeStart() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the minutes in Quiet Time Start");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(700, 1250)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(700, 1000));
        action.release().perform();
    }

    @Then("I Tap on Fuses in Landing Screen")
    public void iTapOnFusesInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Fuses in Landing Screen");
        Taponbutton(Constant_landingscreen.LandingPage_L2Fuses_text_xpath);
    }


    @Then("I Tap on Mechanical in Landing screen")
    public void iTapOnMechanicalInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Mechanical in Landing screen");
//        Basestepdefinition.verticalSwipe(0.7,0.3,0.5);
        Taponbutton(Constant_landingscreen.LandingPage_L2Mechanical_text_xpath);
    }

    @Then("I Tap on Tank Fresh Water in Landing screen")
    public void iTapOnTankFreshWaterInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tank Fresh Water in Landing screen");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        Taponbutton(Constant_landingscreen.LandingPage_L2Tank_Fresh_text_xpath);
    }

    @Then("I Tap on Tank Black Water in Landing screen")
    public void iTapOnTankBlackWaterInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tank Black Water in Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_L2Tank_Black_text_xpath);
    }

    @Then("I scroll up the screen in AC Fan Speed")
    public void iScrollUpTheScreenInACFanSpeed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in AC Fan Speed");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(500, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 1450));
        action.release().perform();
    }

    @Then("I scroll up the screen in Climate Mode")
    public void iScrollUpTheScreenInClimateMode() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Climate Mode");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(500, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 1500));
        action.release().perform();
    }

    @Then("I Scroll the screen upto water heater truma")
    public void iScrollTheScreenUptoWaterHeaterTruma() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the screen upto water heater truma");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(1000, 1800)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 1800));
        action.release().perform();
    }

    @Then("I Verify the All option in the Bottom layout of Landing screen")
    public void iVerifyTheAllOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the All option in the Bottom layout of Landing screen");
        System.out.println("Text comparison is Successful!!!");
        iselementdisplayed(Constant_landingscreen.LandingPage_BottomLayout_All_xpath);
    }

    @Then("I Verify the Device option in the Bottom  layout of Landing screen")
    public void iVerifyTheDeviceOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Device option in the Bottom  layout of Landing screen");
        iselementdisplayed(Constant_landingscreen.LandingPage_BottomLayout_Device_xpath);
    }

    @Then("I Verify the Tanks option in the Bottom  layout of Landing screen")
    public void iVerifyTheTanksOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Tanks option in the Bottom  layout of Landing screen");
        iselementdisplayed(Constant_landingscreen.LandingPage_BottomLayout_TanksText_xpath);
    }

    @Then("I Verify the climate option in the Bottom  layout of Landing screen")
    public void iVerifyTheClimateOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the climate option in the Bottom  layout of Landing screen");
        iselementdisplayed(Constant_landingscreen.LandingPage_BottomLayout_Climate_xpath);
    }

    @Then("I Verify the Scene option in the Bottom  layout of Landing screen")
    public void iVerifyTheSceneOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Scene option in the Bottom  layout of Landing screen");
        iselementdisplayed(Constant_landingscreen.LandingPage_BottomLayout_Scene_xpath);
    }

    @Then("I Tap on climate option in the Bottom  layout of Landing screen")
    public void iTapOnClimateOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on climate option in the Bottom  layout of Landing screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_BottomLayout_Climate_text_xpath));
        if (elements.size() != 0) {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_BottomLayout_Climate_text_xpath)));
            Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_Climate_text_xpath);
        } else {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_BottomLayout_Climate2tile_text_xpath)));
            Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_Climate2tile_text_xpath);
        }

    }

    @Then("I Validated Corresponding Climate tile is displayed")
    public void iValidatedCorrespondingClimateTileIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated Corresponding Climate tile is displayed");
        String bottomLayout = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_BottomLayout_Climate_text_xpath)).getText();
        String climateTile = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_Climate_text_xpath)).getText();
        if (bottomLayout.equalsIgnoreCase(climateTile)) {
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Tap on Device option in the Bottom  layout of Landing screen")
    public void iTapOnDeviceOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Device option in the Bottom  layout of Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_Device_xpath);
    }

    @Then("I Tap on Tanks option in the Bottom  layout of Landing screen")
    public void iTapOnTanksOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tanks option in the Bottom  layout of Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_TanksText_xpath);
    }

    @Then("I Validate Corresponding Tank tile is displayed")
    public void iValidateCorrespondingTankTileIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Corresponding Tank tile is displayed");
        String bottomLayoutTank = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_BottomLayout_TanksText_xpath)).getText();
        String TankTile = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_Tank_text_xpath)).getText();
        if (TankTile.contains(bottomLayoutTank)) {
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Tap on Scene option in the Bottom  layout of Landing screen")
    public void iTapOnSceneOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Scene option in the Bottom  layout of Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_Scene_xpath);
    }

    @Then("I Tap on All option in the Bottom layout of Landing screen")
    public void iTapOnAllOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on All option in the Bottom layout of Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_All_xpath);
    }

    @Then("I scroll up the Truma heater carousel")
    public void iScrollUpTheTrumaHeaterCarousel() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the Truma heater carousel");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(550, 1350)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(550, 1100)).release().perform();
        System.out.println("Truma carousel is scrolled");
    }


    @Then("I Tap on the access this location pop up")
    public void iTapOnTheAccessThisLocationPopUp() throws InterruptedException {
        List<AndroidElement> elements1 = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_allow_access_Landing_popup_xpath));
        if (elements1.size() != 0) {
            List<AndroidElement> id3 = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_Keep_While_the_app_is_in_use));
            if (id3.size() != 0) {
                Taponbutton(Constant_OnboardingPage.Onboarding_Keep_While_the_app_is_in_use);
            }
            List<AndroidElement> id2 = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_Keep_Only_this_time));
            if (id2.size() != 0) {
                Taponbutton(Constant_OnboardingPage.Onboarding_Keep_Only_this_time);
            }
            List<AndroidElement> id = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_allow_all_time_access_Landing_popup_xpath));
            if (id.size() != 0) {
                Taponbutton(Constant_OnboardingPage.Onboarding_allow_all_time_access_Landing_popup_xpath);
            }
            List<AndroidElement> id1 = driver.findElements(By.xpath(Constant_OnboardingPage.Onboardingpermission_no_upgrade_one_time_and_dont_ask_again_button_xpath));
            if (id1.size() != 0) {
                Taponbutton(Constant_OnboardingPage.Onboardingpermission_no_upgrade_one_time_and_dont_ask_again_button_xpath);
            }
        }
    }

    @Then("I Verify climate text displayed in the top of the app")
    public void iVerifyClimateTextPlacedInTheTopOfTheApp() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify climate text displayed in the top of the app");
        asserttextAccessibility("CLIMATE", com.dometic.L1.qa.Pages.Constant_climate_ac.CAC_M_Climate_Text_access_id);
    }


}
