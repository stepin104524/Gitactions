package com.dometic.Shape_EMEA.androidrunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features="@target/rerun.txt",
        glue={"com.dometic.Shape_EMEA.stepdefinition"},
        tags = {"@sanity"},
        plugin = {"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        )

public class ReRunTest extends AbstractTestNGCucumberTests{


}



