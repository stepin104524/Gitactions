package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_BottomLayout_MTC;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BottomLayoutMTC extends Baseclass {
    @Then("I Tap on Home option in Bottom layout")
    public void iTapOnHomeOptionInBottomLayout() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Home option in Bottom layout");
        TaponbuttonaccessabilityID(Constant_BottomLayout_MTC.mtc_BottomLayout_Home_Access_Id);
        Thread.sleep(1000);
    }

    @Then("I Tap on Areas option in Bottom layout")
    public void iTapOnAreasOptionInBottomLayout() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Areas option in Bottom layout");
        TaponbuttonaccessabilityID(Constant_BottomLayout_MTC.mtc_BottomLayout_Areas_Access_Id);
        Thread.sleep(1000);
    }

    @Then("I Tap on Proride option in Bottom layout")
    public void iTapOnProrideOptionInBottomLayout() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Proride option in Bottom layout");
        TaponbuttonaccessabilityID(Constant_BottomLayout_MTC.mtc_BottomLayout_Proride_Access_Id);
        Thread.sleep(1000);
    }

    @Then("I Tap on Switching option in Bottom layout")
    public void iTapOnSwitchingOptionInBottomLayout() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Switching option in Bottom layout");
        TaponbuttonaccessabilityID(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Access_Id);
        Thread.sleep(1000);
    }

    @Then("I Tap on Modes option in Bottom layout")
    public void iTapOnModesOptionInBottomLayout() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Modes option in Bottom layout");
        TaponbuttonaccessabilityID(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Access_Id);
        Thread.sleep(1000);
    }

    @Then("I Verify Home option in Bottom layout")
    public void iVerifyHomeOptionInBottomLayout() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Home option in Bottom layout");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Home,Constant_BottomLayout_MTC.mtc_BottomLayout_Home_Access_Id);
        System.out.println("Home option in Bottom layout is verified");
    }

    @Then("I Verify Areas option in Bottom layout")
    public void iVerifyAreasOptionInBottomLayout() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Areas option in Bottom layout");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Areas,Constant_BottomLayout_MTC.mtc_BottomLayout_Areas_Access_Id);
        System.out.println("Areas option in Bottom layout is verified");
    }

    @Then("I Verify Proride option in Bottom layout")
    public void iVerifyProrideOptionInBottomLayout() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Proride option in Bottom layout");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Proride,Constant_BottomLayout_MTC.mtc_BottomLayout_Proride_Access_Id);
        System.out.println("Proride option in Bottom layout is verified");
    }

    @Then("I Verify Switching option in Bottom layout")
    public void iVerifySwitchingOptionInBottomLayout() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Switching option in Bottom layout");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching,Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Access_Id);
        System.out.println("Switching option in Bottom layout is verified");
    }

    @Then("I Verify Modes option in Bottom layout")
    public void iVerifyModesOptionInBottomLayout() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Modes option in Bottom layout");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes,Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Access_Id);
        System.out.println("Modes option in Bottom layout is verified");}

    @Then("I Validate Switching option is displayed")
    public void iValidateSwitchingOptionIsDisplayed() {
        if(driver.findElement(By.xpath(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_xpath)).getText().equalsIgnoreCase(driver.findElementByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Access_Id).getText())){
            System.out.println("Text comparison is Successful");
        }
        else{
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I Validate Modes option is displayed")
    public void iValidateModesOptionIsDisplayed() {
        if(driver.findElement(By.xpath(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_xpath)).getText().equalsIgnoreCase(driver.findElementByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Access_Id).getText())){
            System.out.println("Text comparison is Successful");
        }
        else{
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I verify AREAS header text is displayed")
    public void iVerifyAREASHeaderTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify AREAS header text is displayed");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Areas_Header,Constant_BottomLayout_MTC.mtc_BottomLayout_Areas_Title_Access_Id);
        System.out.println("AREAS header text is verified");
    }

    @Then("I verify PRORIDE header text is displayed")
    public void iVerifyPRORIDEHeaderTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify PRORIDE header text is displayed");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Proride_Header,Constant_BottomLayout_MTC.mtc_BottomLayout_Proride_Title_Access_Id);
        System.out.println("PRORIDE header text is verified");
    }

    @Then("I verify SWITCHING header text is displayed")
    public void iVerifySWITCHINGHeaderTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify SWITCHING header text is displayed");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Header,Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Title_Access_Id);
        System.out.println("SWITCHING header text is verified");
    }

    @Then("I verify All Label text is displayed")
    public void iVerifyAllLabelTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify All Label text is displayed");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_All,Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_All_Access_Id);
        System.out.println("All Label text is verified");
    }

    @Then("I verify Lights Label text is displayed")
    public void iVerifyLightsLabelTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Lights Label text is displayed");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Lights,Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Lights_Access_Id);
        System.out.println("Lights Label text is verified");
    }

    @Then("I verify Pumps Label text is displayed")
    public void iVerifyPumpsLabelTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Pumps Label text is displayed");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Pumps,Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Pumps_Access_Id);
        System.out.println("Pumps Label text is verified");
    }

    @Then("I verify Others Label text is displayed")
    public void iVerifyOthersLabelTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Others Label text is displayed");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Others,Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Others_Access_Id);
        System.out.println("Others Label text is verified");
    }

    @Then("I verify Horn symbol is displayed")
    public void iVerifyHornSymbolIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Horn symbol is displayed");
        if(driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Horn_Button_Access_Id).size()!=0){
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Horn_Button_Access_Id));
            System.out.println("Horn symbol is verified");
        }
    }

    @Then("I verify Horn label is displayed")
    public void iVerifyHornLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Horn label is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Horn_Button_Access_Id).size() != 0) {
            asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Horn_Label, Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Horn_Label_Access_Id);
            System.out.println("Horn label text is verified");
        }
    }

    @Then("I verify Power Pole symbol is displayed")
    public void iVerifyPowerPoleSymbolIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power Pole symbol is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Power_Pole_Up_Button_Access_Id).size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Power_Pole_Up_Button_Access_Id));
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Power_Pole_Down_Button_Access_Id));
            System.out.println("Power Pole symbol is verified");
        }
    }

    @Then("I verify Power Pole label is displayed")
    public void iVerifyPowerPoleLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power Pole label is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Power_Pole_Label_Access_Id).size() != 0) {
            asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Power_Pole_Label, Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Power_Pole_Label_Access_Id);
            System.out.println("Power Pole label text is verified");
        }
    }

    @Then("I verify Wiper symbol is displayed")
    public void iVerifyWiperSymbolIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Wiper symbol is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Wiper_Button_Access_Id).size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Wiper_Button_Access_Id));
            System.out.println("Wiper symbol is verified");
        }
    }

    @Then("I verify Wiper label is displayed")
    public void iVerifyWiperLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Wiper label is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Wiper_Label_Access_Id).size() != 0) {
            asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Wiper_Label, Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Wiper_Label_Access_Id);
            System.out.println("Wiper label text is verified");
        }
    }

    @Then("I verify NightMode symbol is displayed")
    public void iVerifyNightModeSymbolIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify NightMode symbol is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Night_Mode_Button_Access_Id).size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Night_Mode_Button_Access_Id));
            System.out.println("NightMode symbol is verified");
        }
    }

    @Then("I verify NightMode label is displayed")
    public void iVerifyNightModeLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Fishing Mode symbol is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Night_Mode_Label_Access_Id).size() != 0) {
            asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Night_Mode_Label, Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Night_Mode_Label_Access_Id);
            System.out.println("NightMode label text is verified");
        }
    }

    @Then("I verify Fishing Mode symbol is displayed")
    public void iVerifyFishingModeSymbolIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Home option in Bottom layout");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Fishing_Mode_Button_Access_Id).size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Fishing_Mode_Button_Access_Id));
            System.out.println("Fishing Mode symbol is verified");
        }
    }

    @Then("I verify Fishing Mode label is displayed")
    public void iVerifyFishingModeLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Fishing Mode label is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Fishing_Mode_Label_Access_Id).size() != 0) {
            asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Fishing_Mode_Label, Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Fishing_Mode_Label_Access_Id);
            System.out.println("Fishing Mode label text is verified");
        }
    }

    @Then("I verify Cruising Mode symbol is displayed")
    public void iVerifyCruisingModeSymbolIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Cruising Mode symbol is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Cruising_Mode_Button_Access_Id).size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Cruising_Mode_Button_Access_Id));
            System.out.println("Cruising Mode symbol is verified");
        }
    }

    @Then("I verify Cruising Mode label is displayed")
    public void iVerifyCruisingModeLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Cruising Mode label is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Cruising_Mode_Label_Access_Id).size() != 0) {
            asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Cruising_Mode_Label, Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Cruising_Mode_Label_Access_Id);
            System.out.println("Cruising Mode label text is verified");
        }
    }

    @Then("I verify MODES header text is displayed")
    public void iVerifyMODESHeaderTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify MODES header text is displayed");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Header,Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Title_Access_Id);
        System.out.println("MODES header text is verified");
    }

    @Then("I verify Proride Label text is displayed")
    public void iVerifyProrideLabelTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Proride Label text is displayed");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Proride,Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Proride_Access_Id);
        System.out.println("Proride Label text is verified");
    }

    @Then("I verify Switching Label text is displayed")
    public void iVerifySwitchingLabelTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Switching Label text is displayed");
        asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching,Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Switching_Access_Id);
        System.out.println("Switching Label text is verified");
    }

    @Then("I verify NightMode\\(MODES) symbol is displayed")
    public void iVerifyNightModeMODESSymbolIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify NightMode symbol is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Night_Mode_Button_Access_Id).size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Night_Mode_Button_Access_Id));
            System.out.println("NightMode symbol is verified");
        }
    }

    @Then("I verify NightMode\\(MODES) label is displayed")
    public void iVerifyNightModeMODESLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Fishing Mode symbol is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Night_Mode_Label_Access_Id).size() != 0) {
            asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Night_Mode_Label, Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Night_Mode_Label_Access_Id);
            System.out.println("NightMode label text is verified");
        }
    }

    @Then("I verify Fishing Mode\\(MODES) symbol is displayed")
    public void iVerifyFishingModeMODESSymbolIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Home option in Bottom layout");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Fishing_Mode_Button_Access_Id).size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Fishing_Mode_Button_Access_Id));
            System.out.println("Fishing Mode symbol is verified");
        }
    }

    @Then("I verify Fishing Mode\\(MODES) label is displayed")
    public void iVerifyFishingModeMODESLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Fishing Mode label is displayed");
        if (driver.findElementsByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Fishing_Mode_Label_Access_Id).size() != 0) {
            asserttextValidationAccessibility(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Fishing_Mode_Label, Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Fishing_Mode_Label_Access_Id);
            System.out.println("Fishing Mode label text is verified");
        }
    }
}
