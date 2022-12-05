package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_Mechanical;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MechanicalAwning extends Baseclass {
    @Then("I verify Controller text in Mechanical screen")
    public void iVerifyControllerTextInMechanicalScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Controller text in Mechanical screen");
        WebDriverWait wait=new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_Mechanical.Mechanicalscreen_Controller_text_xpath)));
        asserttext(Constant_Mechanical.Mechanicalscreen_Controller_text,Constant_Mechanical.Mechanicalscreen_Controller_text_xpath);
    }

    @Then("I verify Open button in Mechanical screen")
    public void iVerifyOpenButtonInMechanicalScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Open button in Mechanical screen");
        Assert.assertTrue(iselementdisplayed(Constant_Mechanical.Mechanicalscreen_Open_button_xpath));
    }

    @And("I verify Open button text in Mechanical screen")
    public void iVerifyOpenButtonTextInMechanicalScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Open button text in Mechanical screen");
//        System.out.println(Constant_Mechanical.Mechanicalscreen_Open_button_text);
//        System.out.println(driver.findElement(By.xpath(Constant_Mechanical.Mechanicalscreen_Open_button_xpath)).getText());
        asserttext(Constant_Mechanical.Mechanicalscreen_Open_button_text,Constant_Mechanical.Mechanicalscreen_Open_button_xpath);
    }

    @Then("I verify Close button in Mechanical screen")
    public void iVerifyCloseButtonInMechanicalScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Close button in Mechanical screen");
        Assert.assertTrue(iselementdisplayed(Constant_Mechanical.Mechanicalscreen_Close_button_xpath));
    }

    @And("I verify Close button text in Mechanical screen")
    public void iVerifyCloseButtonTextInMechanicalScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Close button text in Mechanical screen");
        asserttext(Constant_Mechanical.Mechanicalscreen_Close_button_text,Constant_Mechanical.Mechanicalscreen_Close_button_xpath);
    }
}
