package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = "src/test/java/features", glue = {
		"" }, monochrome = true, dryRun = false)

public class Runner {

}
