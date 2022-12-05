package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_Security;
import com.dometic.MTC.qa.Pages.Constant_Tank_MTC;
import com.dometic.MTC.qa.Pages.Constant_Tracking_MTC;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Security extends Baseclass {
    public static List<String> gioFencingRadiusFromCenter, gioFencingAlertLatency,doorWindowAlertLatency,theftAlertLatency;
    public static Double radiuscenterYardValue,radiuscenterYardUpdatedValue,radiuscenterValue,radiuscenterUpdatedValue;
    public static String security_current_carousel_value;
    public static int security_current_carousel_value_number, iteration_count;
    @Then("I Tap on Security Tile on landing screen")
    public void iTapOnSecurityTileOnLandingScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Security Tile on landing screen");
        TaponbuttonaccessabilityID(Constant_Security.security_titleView_Access_ID);
        Thread.sleep(3000);
    }

    @Then("I verify Security Header text is displayed")
    public void iVerifySecurityHeaderTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Security Header text is displayed");
        asserttextValidationAccessibility(Constant_Security.security_Header_Text, Constant_Security.security_Header_Text_Access_ID);
    }

    @Then("I verify Security Arm Icon is displayed")
    public void iVerifySecurityArmIconIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Security Arm Icon is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Security.security_ArmIcon_Access_ID));
    }

    @Then("I verify Security current status is displayed")
    public void iVerifySecurityCurrentStatusIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Security current status is displayed");
        String securityCurrentStatus = driver.findElementByAccessibilityId(Constant_Security.security_CurrentStatus_Access_ID).getText();
        if (securityCurrentStatus.equalsIgnoreCase("Armed")) {
            System.out.println("Text comparison is Successful");
        } else if (securityCurrentStatus.equalsIgnoreCase("Disarmed")) {
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I verify Arm button is displayed")
    public void iVerifyArmButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Arm button is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Security.security_ArmButton_Access_ID));
    }

    @Then("I verify Arm button label is displayed")
    public void iVerifyArmButtonLabelIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Arm button label is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Security.security_ArmButtonInfoLabel_Access_ID));
    }

    @Then("I Verify Geo Fencing text is displayed in Security screen")
    public void iVerifyGeoFencingTextIsDisplayedInSecurityScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Geo Fencing text is displayed in Security screen");
        asserttextValidationAccessibility(Constant_Security.security_geofencing_cardTitle, Constant_Security.security_geofencing_cardTitle_Access_ID);
    }

    @Then("I Verify Geo Fencing-toggle status is displayed in Security screen")
    public void iVerifyGeoFencingToggleStatusIsDisplayedInSecurityScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Geo Fencing-toggle status is displayed in Security screen");
        String gioFencingToggleStatus = driver.findElementByAccessibilityId(Constant_Security.security_geofencing_switchStateText_Access_ID).getText();
        if (gioFencingToggleStatus.equalsIgnoreCase("OFF")) {
            System.out.println("Text comparison is Successful");
        } else if (gioFencingToggleStatus.equalsIgnoreCase("ON")) {
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Verify Geo Fencing-toggle is displayed in Security screen")
    public void iVerifyGeoFencingToggleIsDisplayedInSecurityScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Geo Fencing-toggle is displayed in Security screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Security.security_geofencing_switchComponent_Access_ID));
    }

    @Then("I Verify Geo Fencing Radius from center text is displayed in Security screen")
    public void iVerifyGeoFencingRadiusFromCenterTextIsDisplayedInSecurityScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Geo Fencing Radius from center text is displayed in Security screen");
        asserttextValidationAccessibility(Constant_Security.security_geofencingRadius_cardTitle, Constant_Security.security_geofencingRadius_cardTitle_Access_ID);
    }

    @Then("I Verify Geo Fencing Radius from center Expand Icon is displayed in Security screen")
    public void iVerifyGeoFencingRadiusFromCenterExpandIconIsDisplayedInSecurityScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Geo Fencing Radius from center Expand Icon is displayed in Security screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Security.security_geofencingRadius_expandIcon_Access_ID));
    }

    @Then("I Verify Geo Fencing Alert Latency text is displayed in Security screen")
    public void iVerifyGeoFencingAlertLatencyTextIsDisplayedInSecurityScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on hamburger menu in landing screen");
        asserttextValidationAccessibility(Constant_Security.security_geofencingLatency_cardTitle, Constant_Security.security_geofencingLatency_cardTitle_Access_ID);
    }

    @Then("I Verify Geo Fencing Alert Latency Expand Icon is displayed in Security screen")
    public void iVerifyGeoFencingAlertLatencyExpandIconIsDisplayedInSecurityScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Geo Fencing Alert Latency Expand Icon is displayed in Security screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Security.security_geofencingLatency_expandIcon_Access_ID));
    }

    @Then("I Verify Theft Alert text is displayed in Security screen")
    public void iVerifyTheftAlertTextIsDisplayedInSecurityScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Theft Alert text is displayed in Security screen");
        asserttextValidationAccessibility(Constant_Security.security_theftAlert_cardTitle, Constant_Security.security_theftAlert_cardTitle_Access_ID);
    }

    @Then("I Verify Theft Alert-toggle status is displayed in Security screen")
    public void iVerifyTheftAlertToggleStatusIsDisplayedInSecurityScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Theft Alert-toggle status is displayed in Security screen");
        String theftAlertToggleStatus = driver.findElementByAccessibilityId(Constant_Security.security_theftAlert_switchStateText_Access_ID).getText();
        if (theftAlertToggleStatus.equalsIgnoreCase("OFF")) {
            System.out.println("Text comparison is Successful");
        } else if (theftAlertToggleStatus.equalsIgnoreCase("ON")) {
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Verify Theft Alert-toggle is displayed in Security screen")
    public void iVerifyTheftAlertToggleIsDisplayedInSecurityScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Theft Alert-toggle is displayed in Security screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Security.security_theftAlert_switchComponent_Access_ID));
    }

    @Then("I Verify Theft Alert Alert Latency text is displayed in Security screen")
    public void iVerifyTheftAlertAlertLatencyTextIsDisplayedInSecurityScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Theft Alert Alert Latency text is displayed in Security screen");
        asserttextValidationAccessibility(Constant_Security.security_theftAlertLatency_cardTitle, Constant_Security.security_theftAlertLatency_cardTitle_Access_ID);
    }

    @Then("I Verify Theft Alert Alert Latency Expand Icon is displayed in Security screen")
    public void iVerifyTheftAlertAlertLatencyExpandIconIsDisplayedInSecurityScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Theft Alert Alert Latency Expand Icon is displayed in Security screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Security.security_theftAlertLatency_expandIcon_Access_ID));
    }

    @Then("I Verify Door Window Alert text is displayed in Security screen")
    public void iVerifyDoorWindowAlertTextIsDisplayedInSecurityScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Door Window Alert text is displayed in Security screen");
        asserttextValidationAccessibility(Constant_Security.security_doorAlert_cardTitle, Constant_Security.security_doorAlert_cardTitle_Access_ID);
    }

    @Then("I Verify Door Window Alert-toggle status is displayed in Security screen")
    public void iVerifyDoorWindowAlertToggleStatusIsDisplayedInSecurityScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Door Window Alert-toggle status is displayed in Security screen");
        String doorAlertToggleStatus = driver.findElementByAccessibilityId(Constant_Security.security_doorAlert_switchStateText_Access_ID).getText();
        if (doorAlertToggleStatus.equalsIgnoreCase("OFF")) {
            System.out.println("Text comparison is Successful");
        } else if (doorAlertToggleStatus.equalsIgnoreCase("ON")) {
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Verify Door Window Alert-toggle is displayed in Security screen")
    public void iVerifyDoorWindowAlertToggleIsDisplayedInSecurityScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Door Window Alert-toggle is displayed in Security screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Security.security_doorAlert_switchComponent_Access_ID));
    }

    @Then("I Verify Door Window Alert Alert Latency text is displayed in Security screen")
    public void iVerifyDoorWindowAlertAlertLatencyTextIsDisplayedInSecurityScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Door Window Alert text is displayed in Security screen");
        asserttextValidationAccessibility(Constant_Security.security_door_alertLatency_cardTitle, Constant_Security.security_door_alertLatency_cardTitle_Access_ID);
    }

    @Then("I Verify Door Window Alert Alert Latency Expand Icon is displayed in Security screen")
    public void iVerifyDoorWindowAlertAlertLatencyExpandIconIsDisplayedInSecurityScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Door Window Alert Alert Latency Expand Icon is displayed in Security screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Security.security_door_alertLatency_expandIcon_Access_ID));
    }

    @Then("I Tap on Gio Fencing Radius from center toggle if it's already in OFF state")
    public void iTapOnGioFencingRadiusFromCenterToggleIfItSAlreadyInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Gio Fencing Radius from center toggle if it's already in OFF state");
//        String gioFencingToggleStatus = driver.findElementByAccessibilityId(Constant_Security.security_geofencing_switchStateText_Access_ID).getText();
//        if (gioFencingToggleStatus.equalsIgnoreCase("OFF")) {}
        if(driver.findElementsByAccessibilityId(Constant_Security.security_geofencingRadius_cardTitle_Access_ID).size()==0){
            TaponbuttonaccessabilityID(Constant_Security.security_geofencing_switchComponent_Access_ID);
            Thread.sleep(10000);
        }
    }

    @Then("I Tap on Door Window Alert toggle if it's already in OFF state")
    public void iTapOnDoorWindowAlertToggleIfItSAlreadyInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Door Window Alert toggle if it's already in OFF state");
//        String gioFencingToggleStatus = driver.findElementByAccessibilityId(Constant_Security.security_doorAlert_switchStateText_Access_ID).getText();
//        if (gioFencingToggleStatus.equalsIgnoreCase("OFF")) {}
        if(driver.findElementsByAccessibilityId(Constant_Security.security_door_alertLatency_cardTitle_Access_ID).size()==0){
            TaponbuttonaccessabilityID(Constant_Security.security_doorAlert_switchComponent_Access_ID);
            Thread.sleep(10000);
        }
    }

    @Then("I Tap on Theft Alert toggle if it's already in OFF state")
    public void iTapOnTheftAlertToggleIfItSAlreadyInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Theft Alert toggle if it's already in OFF state");
//        String gioFencingToggleStatus = driver.findElementByAccessibilityId(Constant_Security.security_theftAlert_switchStateText_Access_ID).getText();
//        if (gioFencingToggleStatus.equalsIgnoreCase("OFF")) {}
        if(driver.findElementsByAccessibilityId(Constant_Security.security_theftAlertLatency_cardTitle_Access_ID).size()==0){
            TaponbuttonaccessabilityID(Constant_Security.security_theftAlert_switchComponent_Access_ID);
            Thread.sleep(10000);
        }
    }

    @Then("I Tap on Radius from center in Gio Fencing Security")
    public void iTapOnRadiusFromCenterInGioFencingSecurity() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Radius from center in Gio Fencing Security");
        TaponbuttonaccessabilityID(Constant_Security.security_geofencingRadius_cardTitle_Access_ID);
        Thread.sleep(1000);
    }

    @Then("I Scroll up the screen in Radius from center in Gio Fencing")
    public void iScrollUpTheScreenInRadiusFromCenterInGioFencing() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the screen in Radius from center in Gio Fencing");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1375)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I verify apply button is displayed in Radius from center in Gio Fencing")
    public void iVerifyApplyButtonIsDisplayedInRadiusFromCenterInGioFencing() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify apply button is displayed in Radius from center in Gio Fencing");
        /**Globally declared GioFencingRadiusFromCenter*/
        gioFencingRadiusFromCenter = new ArrayList<>();
        gioFencingRadiusFromCenter.add(driver.findElement(By.xpath(Constant_Security.security_geofencingRadius_FirstValue_Xpath)).getText());
        gioFencingRadiusFromCenter.add(driver.findElement(By.xpath(Constant_Security.security_geofencingRadius_SecondValue_Xpath)).getText());
        gioFencingRadiusFromCenter.add(driver.findElement(By.xpath(Constant_Security.security_geofencingRadius_ThirdValue_Xpath)).getText());
    }

    @Then("I Tap on Apply button in Radius from center in Gio Fencing")
    public void iTapOnApplyButtonInRadiusFromCenterInGioFencing() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Radius from center in Gio Fencing");
        TaponbuttonaccessabilityID(Constant_Security.security_geofencingRadius_Apply_Button_Access_ID);
    }

    @Then("I validated applied minutes is displayed in Radius from center in Gio Fencing")
    public void iValidatedAppliedMinutesIsDisplayedInRadiusFromCenterInGioFencing() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated applied minutes is displayed in Radius from center in Gio Fencing");
        if (gioFencingRadiusFromCenter.get(0).contains(driver.findElementByAccessibilityId(Constant_Security.security_geofencingRadius_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (gioFencingRadiusFromCenter.get(1).contains(driver.findElementByAccessibilityId(Constant_Security.security_geofencingRadius_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (gioFencingRadiusFromCenter.get(2).contains(driver.findElementByAccessibilityId(Constant_Security.security_geofencingRadius_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I Tap on Alert Latency in Gio Fencing Security")
    public void iTapOnAlertLatencyInGioFencingSecurity() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Alert Latency in Gio Fencing Security");
        TaponbuttonaccessabilityID(Constant_Security.security_geofencingLatency_cardTitle_Access_ID);
        Thread.sleep(1000);
    }

    @Then("I Scroll up the screen in Alert Latency in Gio Fencing")
    public void iScrollUpTheScreenInAlertLatencyInGioFencing() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the screen in Alert Latency in Gio Fencing");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1650)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1525)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I verify apply button is displayed in Alert Latency in Gio Fencing")
    public void iVerifyApplyButtonIsDisplayedInAlertLatencyInGioFencing() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify apply button is displayed in Alert Latency in Gio Fencing");
        /**Globally declared GioFencingAlertLatency*/
        gioFencingAlertLatency = new ArrayList<>();
        gioFencingAlertLatency.add(driver.findElement(By.xpath(Constant_Security.security_geofencingLatency_FirstValue_Xpath)).getText());
        gioFencingAlertLatency.add(driver.findElement(By.xpath(Constant_Security.security_geofencingLatency_SecondValue_Xpath)).getText());
        gioFencingAlertLatency.add(driver.findElement(By.xpath(Constant_Security.security_geofencingLatency_ThirdValue_Xpath)).getText());
    }

    @Then("I Tap on Apply button in Alert Latency in Gio Fencing")
    public void iTapOnApplyButtonInAlertLatencyInGioFencing() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Alert Latency in Gio Fencing");
        TaponbuttonaccessabilityID(Constant_Security.security_geofencingLatency_Apply_Button_Access_ID);
    }

    @Then("I validated applied minutes is displayed in Alert Latency in Gio Fencing")
    public void iValidatedAppliedMinutesIsDisplayedInAlertLatencyInGioFencing() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated applied minutes is displayed in Alert Latency in Gio Fencing");
        if (gioFencingAlertLatency.get(0).contains(driver.findElementByAccessibilityId(Constant_Security.security_geofencingLatency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (gioFencingAlertLatency.get(1).contains(driver.findElementByAccessibilityId(Constant_Security.security_geofencingLatency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (gioFencingAlertLatency.get(2).contains(driver.findElementByAccessibilityId(Constant_Security.security_geofencingLatency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I Tap on Alert Latency in Door Window Alert Security")
    public void iTapOnAlertLatencyInDoorWindowAlertSecurity() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Alert Latency in Door Window Alert Security");
        TaponbuttonaccessabilityID(Constant_Security.security_door_alertLatency_cardTitle_Access_ID);
        Thread.sleep(1000);
    }

    @Then("I Scroll up the screen in Alert Latency in Door Window Alert")
    public void iScrollUpTheScreenInAlertLatencyInDoorWindowAlert() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the screen in Alert Latency in Door/Window Alert");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1325)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1200)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I verify apply button is displayed in Alert Latency in Door Window Alert")
    public void iVerifyApplyButtonIsDisplayedInAlertLatencyInDoorWindowAlert() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify apply button is displayed in Alert Latency in Door Window Alert");
        /**Globally declared Door/Window AlertLatency*/
        doorWindowAlertLatency=new ArrayList<>();
        doorWindowAlertLatency.add(driver.findElement(By.xpath(Constant_Security.security_door_alertLatency_FirstValue_Xpath)).getText());
        doorWindowAlertLatency.add(driver.findElement(By.xpath(Constant_Security.security_door_alertLatency_SecondValue_Xpath)).getText());
        doorWindowAlertLatency.add(driver.findElement(By.xpath(Constant_Security.security_door_alertLatency_ThirdValue_Xpath)).getText());
    }

    @Then("I Tap on Apply button in Alert Latency in Door Window Alert")
    public void iTapOnApplyButtonInAlertLatencyInDoorWindowAlert() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Alert Latency in Door Window Alert");
        TaponbuttonaccessabilityID(Constant_Security.security_door_alertLatency_Apply_Button_Access_ID);
    }

    @Then("I validated applied minutes is displayed in Alert Latency in Door Window Alert")
    public void iValidatedAppliedMinutesIsDisplayedInAlertLatencyInDoorWindowAlert() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated applied minutes is displayed in Alert Latency in Door Window Alert");
        if (doorWindowAlertLatency.get(0).contains(driver.findElementByAccessibilityId(Constant_Security.security_door_alertLatency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (doorWindowAlertLatency.get(1).contains(driver.findElementByAccessibilityId(Constant_Security.security_door_alertLatency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (doorWindowAlertLatency.get(2).contains(driver.findElementByAccessibilityId(Constant_Security.security_door_alertLatency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I Tap on Alert Latency in Theft Alert Security")
    public void iTapOnAlertLatencyInTheftAlertSecurity() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Alert Latency in Theft Alert Security");
        TaponbuttonaccessabilityID(Constant_Security.security_theftAlertLatency_cardTitle_Access_ID);
        Thread.sleep(1000);
    }

    @Then("I Scroll up the screen in Alert Latency in Theft Alert")
    public void iScrollUpTheScreenInAlertLatencyInTheftAlert() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the screen in Alert Latency in Theft Alert");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1725)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1600)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I verify apply button is displayed in Alert Latency in Theft Alert")
    public void iVerifyApplyButtonIsDisplayedInAlertLatencyInTheftAlert() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify apply button is displayed in Alert Latency in Theft Alert");
        /**Globally declared Theft AlertLatency*/
        theftAlertLatency=new ArrayList<>();
        theftAlertLatency.add(driver.findElement(By.xpath(Constant_Security.security_theftAlertLatency_FirstValue_Xpath)).getText());
        theftAlertLatency.add(driver.findElement(By.xpath(Constant_Security.security_theftAlertLatency_SecondValue_Xpath)).getText());
        theftAlertLatency.add(driver.findElement(By.xpath(Constant_Security.security_theftAlertLatency_ThirdValue_Xpath)).getText());
    }

    @Then("I Tap on Apply button in Alert Latency in Theft Alert")
    public void iTapOnApplyButtonInAlertLatencyInTheftAlert() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Alert Latency in Theft Alert");
        TaponbuttonaccessabilityID(Constant_Security.security_theftAlertLatency_Apply_Button_Access_ID);
    }

    @Then("I validated applied minutes is displayed in Alert Latency in Theft Alert")
    public void iValidatedAppliedMinutesIsDisplayedInAlertLatencyInTheftAlert() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated applied minutes is displayed in Alert Latency in Theft Alert");
        if (theftAlertLatency.get(0).contains(driver.findElementByAccessibilityId(Constant_Security.security_theftAlertLatency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (theftAlertLatency.get(1).contains(driver.findElementByAccessibilityId(Constant_Security.security_theftAlertLatency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (theftAlertLatency.get(2).contains(driver.findElementByAccessibilityId(Constant_Security.security_theftAlertLatency_cardSubText_Access_ID).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I get the value from Radius from center container in Security tile")
    public void iGetTheValueFromRadiusFromCenterContainerInSecurityTile() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Security Tile on landing screen");
        radiuscenterValue = Double.parseDouble(driver.findElementByAccessibilityId(Constant_Security.security_geofencingRadius_cardSubText_Access_ID).getText());
    }

    @Then("I validated Yard value from radius from center container in Security tile")
    public void iValidatedYardValueFromRadiusFromCenterContainerInSecurityTile() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Security Tile on landing screen");
        radiuscenterUpdatedValue = Double.parseDouble(driver.findElementByAccessibilityId(Constant_Security.security_geofencingRadius_cardSubText_Access_ID).getText());
        double updatedValue = radiuscenterValue * 1.09;
        System.out.println(updatedValue);
        System.out.println(radiuscenterUpdatedValue);
        if(updatedValue==radiuscenterUpdatedValue){
            System.out.println("Text comparison is Successful");
        }
        else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I get the yard value from Radius from center container in Security tile")
    public void iGetTheYardValueFromRadiusFromCenterContainerInSecurityTile() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Security Tile on landing screen");
        radiuscenterYardValue = Double.parseDouble(driver.findElementByAccessibilityId(Constant_Security.security_geofencingRadius_cardSubText_Access_ID).getText());
    }

    @Then("I validated Meter value from radius from center container in Security tile")
    public void iValidatedMeterValueFromRadiusFromCenterContainerInSecurityTile() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Security Tile on landing screen");
        radiuscenterYardUpdatedValue = Double.parseDouble(driver.findElementByAccessibilityId(Constant_Security.security_geofencingRadius_cardSubText_Access_ID).getText());
        double updatedValue = radiuscenterYardValue * 0.91;
        System.out.println(updatedValue);
        System.out.println(radiuscenterYardUpdatedValue);
        if(updatedValue==radiuscenterYardUpdatedValue){
            System.out.println("Text comparison is Successful");
        }
        else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll to the maximum carousel value in Radius from center in Gio Fencing")
    public void iScrollToTheMaximumCarouselValueInRadiusFromCenterInGioFencing() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll to the maximum Radius from center in Gio Fencing carousel");
        TouchAction action = new TouchAction(driver);
        security_current_carousel_value = driver.findElementByAccessibilityId(Constant_Security.security_geofencingRadius_cardSubText_Access_ID).getText();
        security_current_carousel_value_number = Integer.parseInt(security_current_carousel_value);
        iteration_count =  ((1000 - security_current_carousel_value_number ))/10;
        for (int i = 0; i < iteration_count ; i++) {
            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1375)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Radius from center in Gio Fencing")
    public void iScrollToTheMinimumCarouselValueInRadiusFromCenterInGioFencing() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll to the minimum Radius from center in Gio Fencing carousel");
        TouchAction action = new TouchAction(driver);
        security_current_carousel_value = driver.findElementByAccessibilityId(Constant_Security.security_geofencingRadius_cardSubText_Access_ID).getText();
        security_current_carousel_value_number = Integer.parseInt(security_current_carousel_value);
        iteration_count =  ((security_current_carousel_value_number - 10 ))/10;
        for (int i = 0; i < iteration_count ; i++) {
            action.press(PointOption.point(530, 1375)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1500)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Alert Latency in Gio Fencing")
    public void iScrollToTheMaximumCarouselValueInAlertLatencyInGioFencing() {
        //Code required
    }

    @Then("I scroll to the minimum carousel value in Alert Latency in Gio Fencing")
    public void iScrollToTheMinimumCarouselValueInAlertLatencyInGioFencing() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll to the minimum value in Alert Latency Gio Fencing carousel");
        TouchAction action = new TouchAction(driver);
        security_current_carousel_value = driver.findElementByAccessibilityId(Constant_Security.security_geofencingLatency_cardSubText_Access_ID).getText();
        security_current_carousel_value_number = Integer.parseInt(security_current_carousel_value);
        iteration_count =  ((security_current_carousel_value_number - 1 ));
        for (int i = 0; i < iteration_count ; i++) {
            action.press(PointOption.point(530, 1525)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1650)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Alert Latency in Door Window Alert")
    public void iScrollToTheMaximumCarouselValueInAlertLatencyInDoorWindowAlert() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll to the maximum value in Alert Latency in Door Window Alert");
        TouchAction action = new TouchAction(driver);
        security_current_carousel_value = driver.findElementByAccessibilityId(Constant_Security.security_door_alertLatency_cardSubText_Access_ID).getText();
        security_current_carousel_value_number = Integer.parseInt(security_current_carousel_value);
        iteration_count =  ((300 - security_current_carousel_value_number ));
        for (int i = 0; i < iteration_count ; i++) {
            action.press(PointOption.point(530, 1325)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1200)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the minimum carousel value in Alert Latency in Door Window Alert")
    public void iScrollToTheMinimumCarouselValueInAlertLatencyInDoorWindowAlert() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll to the minimum value in Alert Latency in Door Window Alert");
        TouchAction action = new TouchAction(driver);
        security_current_carousel_value = driver.findElementByAccessibilityId(Constant_Security.security_door_alertLatency_cardSubText_Access_ID).getText();
        security_current_carousel_value_number = Integer.parseInt(security_current_carousel_value);
        iteration_count =  ((security_current_carousel_value_number - 1 ));
        for (int i = 0; i < iteration_count ; i++) {
            action.press(PointOption.point(530, 1200)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1325)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I scroll to the maximum carousel value in Alert Latency in Theft Alert")
    public void iScrollToTheMaximumCarouselValueInAlertLatencyInTheftAlert() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll to the maximum value in Alert Latency in Theft Alert");
        TouchAction action = new TouchAction(driver);
        security_current_carousel_value = driver.findElementByAccessibilityId(Constant_Security.security_theftAlertLatency_cardSubText_Access_ID).getText();
        security_current_carousel_value_number = Integer.parseInt(security_current_carousel_value);
        iteration_count =  ((300 - security_current_carousel_value_number ));
        for (int i = 0; i < iteration_count ; i++) {
            action.press(PointOption.point(530, 1725)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 1600)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("II scroll to the minimum carousel value in Alert Latency in Theft Alert")
    public void iiScrollToTheMinimumCarouselValueInAlertLatencyInTheftAlert() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll to the minimum value in Alert Latency in Theft Alert");
        TouchAction action = new TouchAction(driver);
        security_current_carousel_value = driver.findElementByAccessibilityId(Constant_Security.security_theftAlertLatency_cardSubText_Access_ID).getText();
        security_current_carousel_value_number = Integer.parseInt(security_current_carousel_value);
        iteration_count =  ((security_current_carousel_value_number - 1 ));
        for (int i = 0; i < iteration_count ; i++) {
            action.press(PointOption.point(530, 1600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(530, 17172531)).release().perform();
            Thread.sleep(1000);
        }
    }
}
