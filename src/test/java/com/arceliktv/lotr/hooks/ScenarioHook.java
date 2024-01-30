package com.arceliktv.lotr.hooks;

import com.arceliktv.lotr.yto.report.ReportManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//import static Tests.BaseTest.appVersion;
//import static Tests.BaseTest.testDevice;


public class ScenarioHook {

    public static String scenarioName;
    private final ReportManager reportManager = ReportManager.getInstance();

    @Before
    public void beforeScenario(Scenario scenario) {
        scenarioName = scenario.getName();

        if (StringUtils.isEmpty(System.getProperty("key"))) {
            //ExtentTest extentTest = reportManager.createNewExtentTest(scenario.getName());
            //reportManager.setCategory(appVersion);
            //reportManager.setDevice(testDevice);

            String ANSI_CYAN = "\u001B[36m";
            String ANSI_RESET = "\u001B[0m";

            System.out.println(ANSI_CYAN + "Running > " + scenario.getName() + ANSI_RESET);

            System.out.println("Recording start....");
            //((CanRecordScreen) getTLDriver()).startRecordingScreen();
        }
    }


    @After
    public void afterScenario(Scenario scenario) {
        if (StringUtils.isEmpty(System.getProperty("key"))) {
            String ANSI_RED = "\u001B[31m";
            String ANSI_GREEN = "\u001B[32m";
            String ANSI_RESET = "\u001B[0m";
            //String media = ((CanRecordScreen) getTLDriver()).stopRecordingScreen();

            if (scenario.isFailed()) {

                System.out.println(ANSI_RED + "Result : " + scenario.getStatus() + ANSI_RESET);
                String folder_name = "target/videos";
                String timeStamp;
                timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
                new File(folder_name).mkdir();
                String scenario_name = scenario.getName();
                String[] first_word = scenario_name.split("_");
                String file_name = first_word[0];
                File videoShotName = new File(folder_name + "/" + file_name + "_" + timeStamp + ".mp4");

                try {
                    FileOutputStream stream = new FileOutputStream(videoShotName);
                    //stream.write(Base64.decodeBase64(media));
                    stream.close();
                    System.out.println("Video recorded ...");
                } catch (Exception e) {
                    System.out.println("Video recorded failed");
                }
            } else {
                System.out.println(ANSI_GREEN + "Result : " + scenario.getStatus() + ANSI_RESET);
            }
            //getTLDriver().resetApp();
        }
    }
}
