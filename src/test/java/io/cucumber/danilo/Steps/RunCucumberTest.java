package io.cucumber.danilo.Steps;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/io/cucumber/danilo/",
        glue = "io.cucumber.danilo.Steps"
    )
public class RunCucumberTest {}

