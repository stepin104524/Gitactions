package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_AreaLight;
import com.dometic.MTC.qa.Pages.Constant_HomePage;
import com.dometic.MTC.qa.Pages.Constant_landingscreen;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class AreaLights extends Baseclass {

    @Then("I Tap on Area Lights Tile")
    public void iTapOnAreaLightsTile() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Area Lights Tile");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(Constant_HomePage.homePage_Tile_Access_Id);
        if (elements.size() != 0) {
            Taponbutton(Constant_HomePage.homePage_Area_Lights_Tile_Xpath);
            WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.Landingpage_header_connectionType_xpath)));
        }
    }

    @Then("I verify Area light header in landing page")
    public void iVerifyAreaLightHeaderInLandingPage() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Area light header in landing page");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            asserttextValidationAccessibility(Constant_AreaLight.AreaLight_header_text,Constant_AreaLight.AreaLight_Landing_page_header_access_id);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Area light header in landing page verified");
    }

    @Then("I verify hamburger option in landing screen")
    public void iVerifyHamburgerOptionInLandingScreen() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify hamburger option in landing screen");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AreaLight.AreaLight_hamburger_access_id));
        System.out.println("Hamburger option in landing screen verified");
    }

    @Then("I verify the clock icon in landing screen")
    public void iVerifyTheClockIconInLandingScreen() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the clock icon in landing screen");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_clock_icon_xpath));
        System.out.println("Clock icon in landing screen verified");
    }

    @Then("I verify the first time in landing screen")
    public void iVerifyTheFirstTimeInLandingScreen() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the first time in landing screen");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_first_time_xpath));
        System.out.println("First time in landing screen verified");
    }

    @Then("I verify the second time in landing screen")
    public void iVerifyTheSecondTimeInLandingScreen() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the second time in landing screen");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_second_time_xpath));
        System.out.println("Second time in landing screen verified");
    }

    @Then("I verify battery percentage is displayed")
    public void iVerifyBatteryPercentageIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify battery percentage is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_percentage_xpath));
        System.out.println("Battery percentage landing screen verified");
    }

    @Then("I verify battery icon")
    public void iVerifyBatteryIcon() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify battery icon");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_battery_xpath));
        System.out.println("Battery icon verified");
    }

    @Then("I verify if the top slider is displayed")
    public void iVerifyIfTheTopSliderIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the top slider is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_top_slider_xpath));
        System.out.println("Top slider verified");
    }

    @Then("I verify if the ON-OFF button is displayed")
    public void iVerifyIfTheONOFFButtonIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the ON-OFF button is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_center_button_xpath));
        System.out.println("ON-OFF button verified");
    }

    @Then("I verify if the bottom slider is displayed")
    public void iVerifyIfTheBottomSliderIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the bottom slider is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_bottom_slider_xpath));
        System.out.println("Bottom slider verified");
    }

    @Then("I verify if first color icon is displayed")
    public void iVerifyIfFirstColorIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if first color icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_landing_page_first_colour_xpath));
        System.out.println("First color icon verified");
    }

    @Then("I verify if second color icon is displayed")
    public void iVerifyIfSecondColorIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if second color icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_landing_page_second_colour_xpath));
        System.out.println("second color icon verified");
    }

    @Then("I verify if third color icon is displayed")
    public void iVerifyIfThirdColorIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if third color icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_landing_page_third_colour_xpath));
        System.out.println("third color icon verified");
    }

    @Then("I verify if the bottom layout is displayed")
    public void iVerifyIfTheBottomLayoutIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the bottom layout is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_bottom_layout_xpath));
        System.out.println("Bottom layout verified");
    }

    @Then("I verify if Home icon is displayed")
    public void iVerifyIfHomeIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if Home icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AreaLight.AreaLight_home_icon_access_id));
        System.out.println("Home icon verified");
    }

    @Then("I verify Home text in bottom layout")
    public void iVerifyHomeTextInBottomLayout() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Home text in bottom layout");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            asserttextValidationAccessibility(Constant_AreaLight.AreaLight_Home_text,Constant_AreaLight.AreaLight_home_text_access_id);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Home text in bottom layout verified");
    }

    @Then("I verify if Color icon is displayed")
    public void iVerifyIfColorIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if Color icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AreaLight.AreaLight_color_icon_access_id));
        System.out.println("Color icon verified");
    }

    @Then("I verify Color text in bottom layout")
    public void iVerifyColorTextInBottomLayout() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Color text in bottom layout");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            asserttextValidationAccessibility(Constant_AreaLight.AreaLight_Colors_text,Constant_AreaLight.AreaLight_color_text_access_id);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Color text in bottom layout verified");
    }

    @Then("I verify if Schedule icon is displayed")
    public void iVerifyIfScheduleIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if Schedule icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AreaLight.AreaLight_schedule_icon_access_id));
        System.out.println("Schedule icon verified");
    }

    @Then("I verify Schedule text in bottom layout")
    public void iVerifyScheduleTextInBottomLayout() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Schedule text in bottom layout");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            asserttextValidationAccessibility(Constant_AreaLight.AreaLight_Schedule_text,Constant_AreaLight.AreaLight_schedule_text_access_id);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Schedule text in bottom layout verified");
    }

    @Then("I verify if Battery icon is displayed")
    public void iVerifyIfBatteryIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if Battery icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AreaLight.AreaLight_battery_icon_access_id));
        System.out.println("Battery icon verified");
    }

    @Then("I verify Battery text in bottom layout")
    public void iVerifyBatteryTextInBottomLayout() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Battery text in bottom layout");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            asserttextValidationAccessibility(Constant_AreaLight.AreaLight_Battery_text,Constant_AreaLight.AreaLight_battery_text_access_id);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Battery text in bottom layout verified");
    }

    @Then("I verify if Modes icon is displayed")
    public void iVerifyIfModesIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if Modes icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AreaLight.AreaLight_modes_icon_access_id));
        System.out.println("Modes icon verified");
    }

    @Then("I verify Modes text in bottom layout")
    public void iVerifyModesTextInBottomLayout() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Modes text in bottom layout");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            asserttextValidationAccessibility(Constant_AreaLight.AreaLight_Modes_text,Constant_AreaLight.AreaLight_modes_text_access_id);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Modes text in bottom layout verified");
    }

    @Then("I Tap on Home in Area light bottom layout")
    public void iTapOnHomeInAreaLightBottomLayout() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Home in Area light bottom layout");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        TaponbuttonaccessabilityID(Constant_AreaLight.AreaLight_home_icon_access_id);
        System.out.println("clicked Home in Area light bottom layout");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I Tap on Colors in Area light bottom layout")
    public void iTapOnColorsInAreaLightBottomLayout() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Colors in Area light bottom layout");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        TaponbuttonaccessabilityID(Constant_AreaLight.AreaLight_color_icon_access_id);
        System.out.println("clicked Colors in Area light bottom layout");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I Tap on Schedule in Area light bottom layout")
    public void iTapOnScheduleInAreaLightBottomLayout() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Schedule in Area light bottom layout");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        TaponbuttonaccessabilityID(Constant_AreaLight.AreaLight_schedule_icon_access_id);
        System.out.println("clicked Schedule in Area light bottom layout");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I Tap on Battery in Area light bottom layout")
    public void iTapOnBatteryInAreaLightBottomLayout() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Battery in Area light bottom layout");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        TaponbuttonaccessabilityID(Constant_AreaLight.AreaLight_battery_icon_access_id);
        System.out.println("clicked Battery in Area light bottom layout");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I Tap on Modes in Area light bottom layout")
    public void iTapOnModesInAreaLightBottomLayout() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Modes in Area light bottom layout");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        TaponbuttonaccessabilityID(Constant_AreaLight.AreaLight_modes_icon_access_id);
        System.out.println("clicked Modes in Area light bottom layout");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I Tap on three color button")
    public void iTapOnThreeColorButton() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on three color button");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Taponbutton(Constant_AreaLight.AreaLight_Three_colour_button_xpath);
        System.out.println("Clicked three color button");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I Tap on two color button")
    public void iTapOnTwoColorButton() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on two color button");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Taponbutton(Constant_AreaLight.AreaLight_Two_colour_button_xpath);
        System.out.println("Clicked two color button");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I tap on the modifier icon")
    public void iTapOnTheModifierIcon() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the modifier icon");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Taponbutton(Constant_AreaLight.AreaLight_Modifier_button_xpath);
        System.out.println("Clicked modifier icon");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I verify if bottom first icon is displayed")
    public void iVerifyIfBottomFirstIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if bottom first icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Bottom_Icon1_xpath));
        System.out.println("bottom first icon verified");
    }

    @Then("I verify if bottom second icon is displayed")
    public void iVerifyIfBottomSecondIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if bottom second icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Bottom_Icon2_xpath));
        System.out.println("bottom second icon verified");
    }

    @Then("I verify if bottom third icon is displayed")
    public void iVerifyIfBottomThirdIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if bottom third icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Bottom_Icon3_xpath));
        System.out.println("bottom third icon verified");
    }

    @Then("I verify if bottom fourth icon is displayed")
    public void iVerifyIfBottomFourthIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if bottom fourth icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Bottom_Icon4_xpath));
        System.out.println("bottom fourth icon verified");
    }

    @Then("I verify if bottom fifth icon is displayed")
    public void iVerifyIfBottomFifthIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if bottom fifth icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Bottom_Icon5_xpath));
        System.out.println("bottom fifth icon verified");
    }

    @Then("I verify if bottom sixth icon is displayed")
    public void iVerifyIfBottomSixthIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if bottom sixth icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Bottom_Icon6_xpath));
        System.out.println("bottom sixth icon verified");
    }

    @Then("I verify if two color top slider is displayed")
    public void iVerifyIfTwoColorTopSliderIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if two color top slider is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Colors_slider));
        System.out.println(" two color top slider verified");
    }

    @Then("I verify if two color top slider selector is displayed")
    public void iVerifyIfTwoColorTopSliderSelectorIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if two color top slider selector is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Colors_slider_selector));
        System.out.println("two color top slider selector verified");
    }

    @Then("I verify if two color circle is displayed")
    public void iVerifyIfTwoColorCircleIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if two color circle is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Colors_circle));
        System.out.println("two color circle verified");
    }

    @Then("I verify if two color circle selector is displayed")
    public void iVerifyIfTwoColorCircleSelectorIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if two color circle selector is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Colors_circle_selector));
        System.out.println("two color circle selector verified");
    }

    @Then("I verify if multi color icon is displayed")
    public void iVerifyIfMultiColorIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if multi color icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Colors_three_color_button));
        System.out.println("multi color icon verified");
    }

    @Then("I verify if black and white icon is displayed")
    public void iVerifyIfBlackAndWhiteIconIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if black and white icon is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Colors_two_color_button));
        System.out.println("black and white icon verified");
    }

    @Then("I tap on black and white icon")
    public void iTapOnBlackAndWhiteIcon() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on black and white icon");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Taponbutton(Constant_AreaLight.AreaLight_Colors_two_color_button);
        System.out.println("Clicked black and white icon");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I verify black and white slider is displayed")
    public void iVerifyBlackAndWhiteSliderIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify black and white slider is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Colors_slider));
        System.out.println("black and white slider verified");
    }

    @Then("I verify black and white slider selector is displayed")
    public void iVerifyBlackAndWhiteSliderSelectorIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify black and white slider selector is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Colors_slider_selector));
        System.out.println("black and white slider selector verified");
    }

    @Then("I verify black and white circle is displayed")
    public void iVerifyBlackAndWhiteCircleIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify black and white circle is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Colors_white_circle));
        System.out.println("black and white circle verified");
    }

    @Then("I verify black and white circle selector is displayed")
    public void iVerifyBlackAndWhiteCircleSelectorIsDisplayed() {
        try {
            ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify black and white circle selector is displayed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(iselementdisplayed(Constant_AreaLight.AreaLight_Colors_white_circle_selector));
        System.out.println("black and white circle selector verified");
    }
}
