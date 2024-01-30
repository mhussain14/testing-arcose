package com.arceliktv.lotr.hooks;

import com.arceliktv.lotr.yto.report.ReportManager;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import javax.mail.MessagingException;
import java.io.File;
import java.io.IOException;

public class SuiteHook {

    @BeforeAll
   /* public static void beforeAll() throws IOException {
        if (StringUtils.isEmpty(System.getProperty("key"))) {
            ReportManager.getInstance().createExtentReport();
        }
    }*/

    @AfterAll
    public static void afterAll() throws MessagingException, IOException {
        if (StringUtils.isEmpty(System.getProperty("key"))) {
            try {
                FileUtils.copyFile(new File("target/YTO-qa.log"),
                        new File(ReportManager.getInstance().getReportDirectory() + "/logs/" + "YTO-qa.log"));
            } catch (Exception e) {
                //e.printStackTrace();
            }
           // ReportManager.getInstance().saveReport();

        }
    }
}
