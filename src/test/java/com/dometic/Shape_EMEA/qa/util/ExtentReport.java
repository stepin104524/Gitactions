package com.dometic.Shape_EMEA.qa.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import cucumber.api.Result;
import cucumber.api.Scenario;

import java.io.File;
import java.io.IOException;

public class ExtentReport {
    ExtentHtmlReporter extentHtmlReporter;
    ExtentReports extentReports;
    ExtentTest test;
    File file;

    public void generateReport(String fileLoc) {
        file=new File(fileLoc);
        extentHtmlReporter = new ExtentHtmlReporter(fileLoc);
        extentHtmlReporter.config().setDocumentTitle("Dometic_LMC_ERIBA Android Application Automation Testing");
        extentHtmlReporter.config().setReportName("Dometic_LMC_ERIBA Android Application Test Report");
        extentHtmlReporter.config().setTheme(Theme.DARK);
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentHtmlReporter);
        extentReports.setSystemInfo("DeviceName", "PixelXL");
        extentReports.setSystemInfo("PlatformName", "Android");
        extentReports.setSystemInfo("PlatformVersion", "11");


    }

    //    public ExtentTest generateNodecreate(){
//        Scenario scenario = null;
//        String scenarioName = scenario.getName();
//
//        return test;
//}
    public void generateTestReport(Scenario scenario) throws IOException {
        String scenarioName = scenario.getName();
        test = extentReports.createTest(scenarioName);
        test.createNode(scenarioName);
        Result.Type status = scenario.getStatus();
        switch (status) {
            case PASSED:
                test.log(Status.PASS, scenario.getName());
                break;
            case FAILED:
                test.log(Status.FAIL, "Test Case Failed is" + scenario.getName());
                test.fail("Failure Screenshot").log(Status.INFO, "Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(file.getAbsolutePath()).build());

//                extentReports.createTest(scenarioName).pass("Scenario_Failed");
//                break;
            default:
//                test=extentReports.createTest(scenarioName);
//                test.createNode(scenarioName);
                test.log(Status.SKIP, "Test Case Failed is" + scenario.getName());
//                extentReports.createTest(scenarioName).pass("Scenario_Skipped");
                break;
        }

    }

    public void tearDown() {
        //  extentReports.flush();
    }
}
