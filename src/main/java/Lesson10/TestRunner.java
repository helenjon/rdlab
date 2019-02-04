package Lesson10;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "Lesson10.stepdefinition",
        monochrome = true,
        format = {"pretty", "html:target/cucumber"},
        tags = {"@Smoketest"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}