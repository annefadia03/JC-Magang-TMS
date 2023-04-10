package com.juaracoding.tms;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/Login.feature",
//                    "src/main/resources/features/tambahdivisi.feature"},
                    "src/main/resources/features/MgtDivisi.feature"},

        glue = {"com.juaracoding.tms"},
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
    )
    public class RunnerTest extends AbstractTestNGCucumberTests {
}
