package com.dometic.Shape_EMEA.androidrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

@CucumberOptions(
        features = "src/test/java/com/dometic/Shape_EMEA/features/",
        glue = {"com.dometic.Shape_EMEA.stepdefinition"},
        tags = {"@First,@sanity,@Regression"},
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json", "junit:target/cucumber-reports/cucumber.xml", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/rerun.txt"}
)

@Listeners({com.dometic.Shape_EMEA.androidrunner.NGTestListener.class})
public class Shape_EMEA_runner {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "features")
    public void feature(PickleEventWrapper eventWrapper, CucumberFeatureWrapper cucumberFeature) throws Throwable {
        testNGCucumberRunner.runScenario(eventWrapper.getPickleEvent());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }

}
