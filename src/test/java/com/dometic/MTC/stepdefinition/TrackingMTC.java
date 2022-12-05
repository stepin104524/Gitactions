package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_Batteries_MTC;
import com.dometic.MTC.qa.Pages.Constant_BilgePump_MTC;
import com.dometic.MTC.qa.Pages.Constant_Security;
import com.dometic.MTC.qa.Pages.Constant_Tracking_MTC;
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

public class TrackingMTC extends Baseclass {
    public static List<String> radiusFromCenter, alertLatency;
    public static Double radiuscenterYardValue, radiuscenterYardUpdatedValue, radiuscenterValue, radiuscenterUpdatedValue;
    public static int tracking_current_carousel_value_number, iteration_count;
    public static String tracking_current_carousel_value;
    @Then("I Tap on Tracking tile")
    public void iTapOnTrackingTile() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tracking tile");
        Taponbutton(Constant_Tracking_MTC.mtc_Tracking_Tile_Xpath);
        Thread.sleep(2000);
    }

    @Then("I Verify Tracking Header title")
    public void iVerifyTrackingHeaderTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Tracking Header title");
        asserttextValidationAccessibility(Constant_Tracking_MTC.mtc_Tracking, Constant_Tracking_MTC.mtc_Tracking_Title_Access_ID);
    }


    @Then("I Verify Boat Location text is displayed")
    public void iVerifyBoatLocationTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Boat Location text is displayed");
        asserttextValidationAccessibility(Constant_Tracking_MTC.mtc_Tracking_Boat_Location, Constant_Tracking_MTC.mtc_Tracking_Boat_Location_Access_ID);
    }

    @Then("I Verify Latitude text is displayed")
    public void iVerifyLatitudeTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Latitude text is displayed");
        asserttextValidationAccessibility(Constant_Tracking_MTC.mtc_Tracking_latitude, Constant_Tracking_MTC.mtc_Tracking_latitude_Access_ID);
    }

    @Then("I Verify Longitude text is displayed")
    public void iVerifyLongitudeTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Longitude text is displayed");
        asserttextValidationAccessibility(Constant_Tracking_MTC.mtc_Tracking_longitude, Constant_Tracking_MTC.mtc_Tracking_longitude_Access_ID);
    }

    @Then("I Verify Geo Fencing text is displayed")
    public void iVerifyGeoFencingTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Geo Fencing text is displayed");
        asserttextValidationAccessibility(Constant_Tracking_MTC.mtc_Tracking_geofencing_cardTitle, Constant_Tracking_MTC.mtc_Tracking_geofencing_cardTitle_Access_ID);
    }

    @Then("I Verify Geo Fencing-toggle status is displayed")
    public void iVerifyGeoFencingToggleStatusIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Geo Fencing-toggle status is displayed");
        String gioFencingToggleStatus = driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Toggle_Status_Access_ID).getText();
        if (gioFencingToggleStatus.equalsIgnoreCase("OFF")) {
            System.out.println("Text comparison is Successful");
        } else if (gioFencingToggleStatus.equalsIgnoreCase("ON")) {
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Verify Geo Fencing-toggle is displayed")
    public void iVerifyGeoFencingToggleIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Geo Fencing-toggle is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Tracking_MTC.mtc_Tracking_Toggle_Access_ID));
    }

    @Then("I Tap on Gio Fencing toggle if it's already in OFF state")
    public void iTapOnGioFencingToggleIfItSAlreadyInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Gio Fencing toggle if it's already in OFF state");
//        String gioFencingToggleStatus = driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Toggle_Status_Access_ID).getText();
//        if (gioFencingToggleStatus.equalsIgnoreCase("OFF")) {}
        if(driver.findElementsByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Radius_cardTitle_Access_ID).size()==0){
            TaponbuttonaccessabilityID(Constant_Tracking_MTC.mtc_Tracking_Toggle_Access_ID);
            Thread.sleep(10000);
        }
    }

    @Then("I Verify Radius from center text is displayed")
    public void iVerifyRadiusFromCenterTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Radius from center text is displayed");
        asserttextValidationAccessibility(Constant_Tracking_MTC.mtc_Tracking_Radius_cardTitle, Constant_Tracking_MTC.mtc_Tracking_Radius_cardTitle_Access_ID);
    }

    @Then("I Verify Radius from center expandIcon is displayed")
    public void iVerifyRadiusFromCenterExpandIconIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Radius from center expandIcon is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Tracking_MTC.mtc_Tracking_Radius_expandIcon_Access_ID));
    }

    @Then("I Verify Alert Latency text is displayed")
    public void iVerifyAlertLatencyTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Alert Latency text is displayed");
        asserttextValidationAccessibility(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_cardTitle, Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_cardTitle_Access_ID);
    }

    @Then("I Verify Alert Latency expandIcon is displayed")
    public void iVerifyAlertLatencyExpandIconIsDisplayed() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Alert Latency expandIcon is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_expandIcon_Access_ID));
        Thread.sleep(2000);
    }

    @Then("I Tap on Radius from center")
    public void iTapOnRadiusFromCenter() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Radius from center");
        TaponbuttonaccessabilityID(Constant_Tracking_MTC.mtc_Tracking_Radius_cardTitle_Access_ID);
    }

    @Then("I Scroll up the screen in Radius from center")
    public void iScrollUpTheScreenInRadiusFromCenter() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the screen in Radius from center");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1575)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1450)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Radius from center")
    public void iVerifyApplyButtonInRadiusFromCenter() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Radius from center");
        radiusFromCenter = new ArrayList<>();
        radiusFromCenter.add(driver.findElement(By.xpath(Constant_Tracking_MTC.mtc_Tracking_Radius_First_Value_Xpath)).getText());
        radiusFromCenter.add(driver.findElement(By.xpath(Constant_Tracking_MTC.mtc_Tracking_Radius_Second_Value_Xpath)).getText());
        radiusFromCenter.add(driver.findElement(By.xpath(Constant_Tracking_MTC.mtc_Tracking_Radius_Third_Value_Xpath)).getText());
    }

    @Then("I Tap on Apply button in Radius from center")
    public void iTapOnApplyButtonInRadiusFromCenter() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Radius from center");
        TaponbuttonaccessabilityID(Constant_Tracking_MTC.mtc_Tracking_Radius_Apply_Button_Access_ID);
    }

    @Then("I validated applied minutes is displayed in Radius from center")
    public void iValidatedAppliedMinutesIsDisplayedInRadiusFromCenter() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated applied minutes is displayed in Radius from center");
        if (radiusFromCenter.get(0).contains(driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Radius_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (radiusFromCenter.get(1).contains(driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Radius_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (radiusFromCenter.get(2).contains(driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Radius_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I Tap On Alert Latency")
    public void iTapOnAlertLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap On Alert Latency");
        TaponbuttonaccessabilityID(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_cardTitle_Access_ID);
    }

    @Then("I Scroll up the screen in Alert Latency")
    public void iScrollUpTheScreenInAlertLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the screen in Alert Latency");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1725)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1600)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Alert Latency")
    public void iVerifyApplyButtonInAlertLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Apply button in Alert Latency");
        alertLatency = new ArrayList<>();
        alertLatency.add(driver.findElement(By.xpath(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_First_Value_Xpath)).getText());
        alertLatency.add(driver.findElement(By.xpath(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_Second_Value_Xpath)).getText());
        alertLatency.add(driver.findElement(By.xpath(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_Third_Value_Xpath)).getText());

    }

    @Then("I Tap on Apply button in Alert Latency")
    public void iTapOnApplyButtonInAlertLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Alert Latency");
        TaponbuttonaccessabilityID(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_Apply_Button_Access_ID);
    }

    @Then("I validated applied minutes is displayed in Alert Latency")
    public void iValidatedAppliedMinutesIsDisplayedInAlertLatency() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated applied minutes is displayed in Alert Latency");
        if (alertLatency.get(0).contains(driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertLatency.get(1).contains(driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertLatency.get(2).contains(driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I get the value from Radius from center container")
    public void iGetTheValueFromRadiusFromCenterContainer() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I get the value from Radius from center container");
        radiuscenterValue = Double.parseDouble(driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Radius_cardSubText_Access_ID).getText());
    }

    @Then("I validated Yard value from radius from center container")
    public void iValidatedYardValueFromRadiusFromCenterContainer() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated Yard value from radius from center container");
        radiuscenterUpdatedValue = Double.parseDouble(driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Radius_cardSubText_Access_ID).getText());
        double updatedValue = radiuscenterValue * 1.09;
        System.out.println(updatedValue);
        System.out.println(radiuscenterUpdatedValue);
        if (updatedValue == radiuscenterUpdatedValue) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I get the yard value from Radius from center container")
    public void iGetTheYardValueFromRadiusFromCenterContainer() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated Yard value from radius from center container");
        radiuscenterYardValue = Double.parseDouble(driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Radius_cardSubText_Access_ID).getText());
    }

    @Then("I validated Meter value from radius from center container")
    public void iValidatedMeterValueFromRadiusFromCenterContainer() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated Yard value from radius from center container");
        radiuscenterYardUpdatedValue = Double.parseDouble(driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Radius_cardSubText_Access_ID).getText());
        double updatedValue = radiuscenterYardValue * 0.91;
        System.out.println(updatedValue);
        System.out.println(radiuscenterYardUpdatedValue);
        if (updatedValue == radiuscenterYardUpdatedValue) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll to the maximum carousel value in Radius from center")
    public void iScrollToTheMaximumCarouselValueInRadiusFromCenter() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum carousel value in Radius from center");
        TouchAction action = new TouchAction(driver);
        tracking_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Radius_cardSubText_Access_ID).getText();
        tracking_current_carousel_value_number = Integer.parseInt(tracking_current_carousel_value);
        iteration_count =  ((1000 - tracking_current_carousel_value_number ))/10;
//        System.out.println("I scroll to the maximum carousel value in Radius from center"+iteration_count);
        for (int i = 0; i < iteration_count ; i++) {
            action.press(PointOption.point(530, 1575)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1450)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Radius from center")
    public void iScrollToTheMinimumCarouselValueInRadiusFromCenter() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum carousel value in Radius from center");
        TouchAction action = new TouchAction(driver);
        tracking_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Radius_cardSubText_Access_ID).getText();
        tracking_current_carousel_value_number = Integer.parseInt(tracking_current_carousel_value);
        iteration_count =  (tracking_current_carousel_value_number- 1 );
//        System.out.println("I scroll to the minimum carousel value in Radius from center"+iteration_count);
        for (int i = 0; i < iteration_count ; i++) {
            action.press(PointOption.point(530, 1450)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1575)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Alert Latency")
    public void iScrollToTheMaximumCarouselValueInAlertLatency() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the maximum carousel value in Alert Latency");
        TouchAction action = new TouchAction(driver);
        tracking_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_cardSubText_Access_ID).getText();
        tracking_current_carousel_value_number = Integer.parseInt(tracking_current_carousel_value);
        iteration_count =  (300 - tracking_current_carousel_value_number );
//        System.out.println("I scroll to the maximum carousel value in Alert Latency"+iteration_count);
        for (int i = 0; i < iteration_count ; i++) {
            action.press(PointOption.point(530, 1725)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1600)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Alert Latency")
    public void iScrollToTheMinimumCarouselValueInAlertLatency() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll to the minimum carousel value in Alert Latency");
        TouchAction action = new TouchAction(driver);
        tracking_current_carousel_value = driver.findElementByAccessibilityId(Constant_Tracking_MTC.mtc_Tracking_Alert_Latency_cardSubText_Access_ID).getText();
        tracking_current_carousel_value_number = Integer.parseInt(tracking_current_carousel_value);
        iteration_count =  ((tracking_current_carousel_value_number - 1 ));
//        System.out.println("I scroll to the minimum carousel value in Alert Latency"+iteration_count);
        for (int i = 0; i < iteration_count ; i++) {
            action.press(PointOption.point(530, 1600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1725)).release().perform();
            Thread.sleep(1000);
        }
    }
}
